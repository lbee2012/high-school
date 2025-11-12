
CREATE DATABASE Dat
go
USE Dat
go
create table TaiKhoan (
    MaTaiKhoan int not null primary key,
    TenTaiKhoan varchar(100),
    MatKhau varchar(100),
    HoTen varchar(100),
    PhanQuyen varchar(100)
)
go
CREATE TABLE HoaDon (
    MaHoaDon int not null primary key,
    MaTaiKhoan int not null,
    NgayDatHang date,
    TongTien bigint,

    foreign key (MaTaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan)
)
go
create table HoaDonCT (
    MaHoaDon int not null,
    MaSanPham int not null primary key,
    SoLuong bigint,
    DonGia bigint,

    foreign key (MaHoaDon) REFERENCES HoaDon(MaHoaDon)
)
go

create procedure AddTaiKhoan 
    @MaTaiKhoan int,
    @TenTaiKhoan varchar(100),
    @MatKhau varchar(100),
    @HoTen varchar(100),
    @PhanQuyen varchar(100)
as
begin
    if (@MaTaiKhoan is null or @TenTaiKhoan is null or @PhanQuyen is null)
        print 'Vui long dien day du thong tin'
    else if exists (select 1 from TaiKhoan where MaTaiKhoan = @MaTaiKhoan)
        print 'Ma tai khoan da ton tai'
    else
    begin
        insert into TaiKhoan
        values (@MaTaiKhoan, @TenTaiKhoan, @MatKhau, @HoTen, @PhanQuyen)
        print 'In thanh cong'
    end
end
go
exec AddTaiKhoan 1, "TK1", 'Long1', 'HT1', 'PQ1'
go
exec AddTaiKhoan 2, "TK2", 'Long2', 'HT2', 'PQ2'
go
exec AddTaiKhoan 3, "TK3", 'Long3', 'HT3', 'PQ3'
go

create procedure AddHoaDon 
    @MaHoaDon int,
    @MaTaiKhoan int,
    @NgayDatHang date,
    @TongTien bigint
as
begin
    if (@MaHoaDon is null or @MaTaiKhoan is null or @NgayDatHang is null)
        print 'Vui long dien day du thong tin'
    else if exists (select 1 from HoaDon where MaHoaDon = @MaHoaDon)
        print 'Ma hoa don da ton tai'
    else
    begin
        insert into HoaDon
        values (@MaHoaDon, @MaTaiKhoan, @NgayDatHang, @TongTien)
        print 'In thanh cong'
    end
end
go
exec AddHoaDon 1, 1, '2024-01-01', 100
go
exec AddHoaDon 2, 2, '2024-01-01', 200
go
exec AddHoaDon 3, 3, '2024-01-01', 300
go


create procedure AddHoaDonCT 
    @MaHoaDon int,
    @MaSanPham int,
    @SoLuong bigint,
    @DonGia bigint
as
begin
    if (@MaHoaDon is null or @MaSanPham is null)
        print 'Vui long dien day du thong tin'
    else if exists (select 1 from HoaDonCT where MaSanPham = @MaSanPham)
        print 'Ma hoa don da ton tai'
    else
    begin
        insert into HoaDonCT
        values (@MaHoaDon, @MaSanPham, @SoLuong, @DonGia)
        print 'In thanh cong'
    end
end
go
exec AddHoaDonCT 1, 1, 10, 100
go
exec AddHoaDonCT 2, 2, 20, 200
go
exec AddHoaDonCT 3, 3, 30, 300
go


select * from TaiKhoan
select * from HoaDon
select * from HoaDonCT
GO

create view V_ChiTietHoaDon as 
select 
    ct.MaSanPham, 
    hd.MaHoaDon,
    FORMAT(hd.NgayDatHang, 'dd/mm/yyyy') as 'NgayDat', 
    ct.SoLuong,
    ct.DonGia,
    (ct.SoLuong * ct.DonGia) as 'TongTien'
from HoaDonCT ct 
join HoaDon hd on ct.MaHoaDon = hd.MaHoaDon
go
select * from V_ChiTietHoaDon
go

create view V_Top5 as
select top 5
    tk.MaTaiKhoan,
    tk.TenTaiKhoan,
    tk.HoTen,
    count(ct.MaSanPham) as 'SoLuongSanPham'
from TaiKhoan tk 
join HoaDon hd on tk.MaTaiKhoan = hd.MaTaiKhoan
join HoaDonCT ct on ct.MaHoaDon = hd.MaHoaDon
group by
    tk.MaTaiKhoan,
    tk.TenTaiKhoan,
    tk.HoTen
order by SoLuongSanPham desc
go
select * from V_Top5
go

create function dbo.MaHoaDonTinhTongSoMatHang (
    @MaHoaDon int
)
returns int
as
begin
    declare @TongMatHang int
    select @TongMatHang = count(ct.MaSanPham) 
    from HoaDonCT ct
    where MaHoaDon = @MaHoaDon
    return @TongMatHang
end
go
select dbo.MaHoaDonTinhTongSoMatHang(4) as 'TongSoMatHang'