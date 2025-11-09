create database n1110
use n1110
go
create table SanPham (
    MaSanPham int,
    TenSanPham varchar(100),
    SoLuong int,
    GiaBan float,

    primary key (MaSanPham)
)
create table GioHang (
    MaGioHang int,
    NguoiMua varchar(100),
    NgayMua date,

    primary key (MaGioHang)
)
create table ChiTietGioHang (
    MaGioHang int,
    MaSanPham int,
    SoLuongMua int,
    foreign key (MaGioHang) references GioHang(MaGioHang),
    foreign key (MaSanPham) references SanPham(MaSanPham)
)
go

insert into SanPham values
(1, 'Dien Thoai', 50, 10000000),
(2, 'Laptop', 30, 20000000),
(3, 'Tai Nghe', 80, 500000)
insert into GioHang values
(1, 'Nguyen Van A', '2024-10-10'),
(2, 'Le Thi B', '2024-10-11'),
(3, 'Tran Van C', '2024-10-12')
insert into ChiTietGioHang values
(1, 1, 3),
(2, 2, 2),
(3, 3, 5)

go
select * from SanPham
select * from GioHang
select * from ChiTietGioHang

drop table SanPham
drop table GioHang
drop table ChiTietGioHang

go
--1
create proc InsertSanPham
    @MaSanPham int,
    @TenSanPham varchar(100),
    @SoLuong int,
    @GiaBan float
as
begin
    if exists (select 1 from SanPham where MaSanPham = @MaSanPham)
    begin
        print 'San pham da ton tai'
    end
    else
    begin
        insert into SanPham values (@MaSanPham, @TenSanPham, @SoLuong, @GiaBan)
        print 'Them san pham thanh cong'
    end
end

go
exec InsertSanPham 1, 'Dien thoai', 50, 10000000
exec InsertSanPham 4, 'May tinh bang', 20, 15000000
exec InsertSanPham 5, 'Dong ho dien tu', 40, 3000000
go

select * from SanPham

--2
create proc InsertGioHang
    @MaGioHang int,
    @NguoiMua varchar(100),
    @NgayMua date
as
begin
    insert into GioHang values (@MaGioHang, @NguoiMua, @NgayMua)
    print 'Them gio hang thanh cong'
end

go
exec InsertGioHang 4, 'Pham Thi D', '2024-10-13'
exec InsertGioHang 5, 'Nguyen Van E', '2024-10-14'
exec InsertGioHang 6, 'Tran Thi F', '2024-10-15'
go

--3
create proc InsertChiTietGioHang
    @MaGioHang int,
    @MaSanPham int,
    @SoLuongMua int
as
begin
    declare @SoLuongSanPham int

    select @SoLuongSanPham = SoLuong from SanPham where MaSanPham = @MaSanPham

    if @SoLuongMua > @SoLuongSanPham
    begin
        print 'So luong mua vuot qua so luong san pham dang co, vui long nhap lai so luong mua'
    end
    else
    begin
        insert into ChiTietGioHang values (@MaGioHang, @MaSanPham, @SoLuongMua)

        update SanPham set SoLuong = SoLuong - @SoLuongMua where MaSanPham = @MaSanPham

        print 'Them chi tiet gio hang va cap nhat so luong thanh cong'
    end
end

go
exec InsertChiTietGioHang 1, 1, 9
exec InsertChiTietGioHang 2, 2, 4
exec InsertChiTietGioHang 3, 3, 7
go

--4
create view SanPhamMuaNhieuNhat as
select top 1 sp.MaSanPham, sp.TenSanPham, sum(ct.SoLuongMua) as TongSoLuongMua
from SanPham sp
join ChiTietGioHang ct on sp.MaSanPham = ct.MaSanPham
group by sp.MaSanPham, sp.TenSanPham
order by TongSoLuongMua desc

go
select top 1 * from SanPhamMuaNhieuNhat
go

--5
create function SoLuongDaBan(@MaSanPham int)
returns int
as
begin
    declare @SoLuongBan int

    select @SoLuongBan = sum(SoLuongMua) from ChiTietGioHang where MaSanPham = @MaSanPham

    return isnull(@SoLuongBan, 0)
end

go
select dbo.SoLuongDaBan(1)
select dbo.SoLuongDaBan(2)
select dbo.SoLuongDaBan(3)
go

--6
create view ThongTinSanPham as
select sp.TenSanPham, ct.SoLuongMua, sp.GiaBan, (ct.SoLuongMua * sp.GiaBan) as ThanhTien
from SanPham sp
join ChiTietGioHang ct on sp.MaSanPham = ct.MaSanPham

go
select * from ThongTinSanPham
go

--7
create view Top2SanPhamSoLuongNhieu as
select top 2 MaSanPham, TenSanPham, SoLuong
from SanPham
order by SoLuong desc

go
select * from Top2SanPhamSoLuongNhieu
go

drop proc InsertSanPham
drop proc InsertGioHang
drop proc InsertChiTietGioHang
drop view SanPhamMuaNhieuNhat
drop function SoLuongDaBan
drop view ThongTinSanPham
drop view Top2SanPhamSoLuongNhieu
