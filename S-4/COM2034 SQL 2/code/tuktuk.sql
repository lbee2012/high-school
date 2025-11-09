-- đề của ai đó nhưng mà túc gửi
-- drop database tuktuk
-- use Dat
create database tuktuk
go
use tuktuk
go
create table NhaCungCap (
    MaNCC bigint not null primary key,
    TenNCC varchar(100) not null,
    SDT bigint not null,
    DiaChi varchar(100) not null,
)
go
create table NhapHang (
    MaNhapHang bigint not null primary key,
    NgayNhapHang date not null,
    SoLuong bigint not null,
    DonGia bigint not null,
)
go
create table ChiTietNCC (
    MaNhapHang bigint not null,
    MaNCC bigint not null,
    SoLuong bigint not null,
    DonGia bigint not null,

    primary key (MaNhapHang, MaNCC),
    foreign key (MaNhapHang) references NhapHang(MaNhapHang),
    foreign key (MaNCC) references NhaCungCap(MaNCC)
)
go
create proc AddNhaCungCap 
    @MaNCC bigint,
    @TenNCC varchar(100),
    @SDT bigint,
    @DiaChi varchar(100)
as
begin
    if (@MaNCC is null or @TenNCC is null or @SDT is null or @DiaChi is null)
        print 'Vui long nhap day du thong tin'
    else if exists (select 1 from NhaCungCap where MaNCC = @MaNCC)
        print 'Ma nha cung cap da ton tai'
    else
    begin
        insert into NhaCungCap
        values (@MaNCC, @TenNCC, @SDT, @DiaChi)
        print 'Them thanh cong'
    end
end
go
exec AddNhaCungCap 1, 'NCC1', 0987654321, 'DC1'
go
exec AddNhaCungCap 2, 'NCC2', 0987654322, 'DC2'
go
exec AddNhaCungCap 3, 'NCC3', 0987654323, 'DC3'
go


go
create proc AddNhapHang
    @MaNhapHang bigint,
    @NgayNhapHang date,
    @SoLuong bigint,
    @DonGia bigint
as
begin
    if (@MaNhapHang is null or @NgayNhapHang is null or @SoLuong is null or @DonGia is null)
        print 'Vui long nhap day du thong tin'
    else if exists (select 1 from NhapHang where MaNhapHang = @MaNhapHang)
        print 'Ma nhap hang da ton tai'
    else
    begin
        insert into NhapHang
        values (@MaNhapHang, @NgayNhapHang, @SoLuong, @DonGia)
        print 'Them thanh cong'
    end
end
go
exec AddNhapHang 1, '2024-01-01', 10, 100
go
exec AddNhapHang 2, '2024-02-02', 20, 200
go
exec AddNhapHang 3, '2024-03-03', 30, 300
go


go
create proc AddChiTietNCC
    @MaNhapHang bigint,
    @MaNCC bigint,
    @SoLuong bigint,
    @DonGia bigint
as
begin
    if (@MaNhapHang is null or @MaNCC is null or @SoLuong is null or @DonGia is null)
        print 'Vui long nhap day du thong tin'
    else if exists (select 1 from ChiTietNCC where MaNCC = @MaNCC)
        print 'Ma nha cung cap da ton tai'
    else if exists (select 1 from ChiTietNCC where MaNhapHang = @MaNhapHang)
        print 'Ma nhap hang da ton tai'
    else
    begin
        insert into ChiTietNCC
        values (@MaNhapHang, @MaNCC, @SoLuong, @DonGia)
        print 'Them thanh cong'
    end
end
go
exec AddChiTietNCC 1, 1, 10, 100
go
exec AddChiTietNCC 2, 2, 20, 200
go
exec AddChiTietNCC 3, 3, 30, 300
go

create view ThongTinNCC as
select ncc.*, ct.SoLuong, ct.DonGia, (ct.SoLuong * ct.DonGia) as ThanhTien  
from NhaCungCap ncc 
join ChiTietNCC ct on ncc.MaNCC = ct.MaNCC
go
select * from ThongTinNCC

go

create view Top2NCCNhieuNhat as
select top 2 ncc.MaNCC, ncc.TenNCC, count(ct.SoLuong) as TongSoLuongNhapHang
from NhaCungCap ncc
join ChiTietNCC ct on ncc.MaNCC = ct.MaNCC
group by ncc.MaNCC, ncc.TenNCC
order by TongSoLuongNhapHang desc
go
select * from Top2NCCNhieuNhat

go

create function dbo.SoLanNhapHang (
    @MaNhapHang int
)
returns int
as
begin
    declare @TongMatHang int
    select @TongMatHang = count(ct.MaNhapHang)
    from ChiTietNCC ct
    where MaNhapHang = @MaNhapHang
    return @TongMatHang
end
go
select dbo.SoLanNhapHang(1) as TongSoMatHang

go