create database test0210
use test0210

-- Tạo bảng KhachHang
CREATE TABLE KhachHang (
    MaKhachHang INT PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    SoDienThoai VARCHAR(15),
    Email VARCHAR(100),
    DiaChi VARCHAR(255)
);

-- Tạo bảng SanPham
CREATE TABLE SanPham (
    MaSanPham INT PRIMARY KEY,
    TenSanPham VARCHAR(100) NOT NULL,
    Gia FLOAT NOT NULL,
    SoLuongTonKho INT DEFAULT 0,
    MoTa VARCHAR(100)
);

-- Tạo bảng HoaDon
CREATE TABLE HoaDon (
    MaHoaDon INT PRIMARY KEY,
    MaKhachHang INT NOT NULL,
    NgayLap DATE NOT NULL,
    TongTien FLOAT NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang)
);

-- Tạo bảng ChiTietHoaDon
CREATE TABLE ChiTietHoaDon (
    MaHoaDon INT NOT NULL,
    MaSanPham INT NOT NULL,
    SoLuong INT NOT NULL,
    GiaBan FLOAT NOT NULL,
    ThanhTien FLOAT,
    PRIMARY KEY (MaHoaDon, MaSanPham),
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaSanPham) REFERENCES SanPham(MaSanPham)
);

-- Insert dữ liệu của 4 bảng
insert into KhachHang values
(1,'Nguyen Van A','0987654321','nguyenvanA@gmail.com','123 Hai Ba Trung'),
(2,'Nguyen Van B','0987654322','nguyenvanB@gmail.com','223 Hai Ba Trung'),
(3,'Nguyen Van C','0987654323','nguyenvanC@gmail.com','323 Hai Ba Trung'),
(4,'Nguyen Van D','0987654324','nguyenvanD@gmail.com','423 Hai Ba Trung'),
(5,'Nguyen Van E','0987654325','nguyenvanE@gmail.com','523 Hai Ba Trung')
insert into SanPham values
(1,'Chuot A',100,1,'Ngon A'),
(2,'Chuot B',200,2,'Ngon B'),
(3,'Chuot C',300,3,'Ngon C'),
(4,'Chuot D',400,4,'Ngon D'),
(5,'Chuot E',500,5,'Ngon E')
insert into HoaDon values
(1,1,'2024-09-01',100),
(2,2,'2024-09-02',200),
(3,3,'2024-09-03',300),
(4,4,'2024-09-04',400),
(5,5,'2024-09-05',500)
insert into ChiTietHoaDon values
(1,1,1,100,100),
(2,2,2,200,400),
(3,3,3,300,900),
(4,4,4,400,1600),
(5,5,5,500,2500)

select * from KhachHang
select * from SanPham
select * from HoaDon
select * from ChiTietHoaDon

--1
create view TenSanPhamVaTongTien as
select
    sp.TenSanPham,
    cthd.SoLuong,
    cthd.GiaBan,
    (cthd.SoLuong * cthd.GiaBan) as TongTien
from SanPham sp
join ChiTietHoaDon cthd on sp.MaSanPham = cthd.MaSanPham

--2
create view HoaDonVaKhachHang as
select
    kh.MaKhachHang,
    kh.HoTen,
    kh.SoDienThoai,
    kh.Email,
    hd.MaHoaDon,
    hd.NgayLap,
    hd.TongTien
from HoaDon hd
join KhachHang kh on hd.MaKhachHang = kh.MaKhachHang

--3
create view SanPhamTonKhoConItHon10 as
select *
from SanPham sp
where SoLuongTonKho < 10

--4
create view TongDoanhThu as
select
    kh.MaKhachHang,
    kh.HoTen,
    sp.TenSanPham,
    cthd.GiaBan, 
    cthd.SoLuong as 'SoLuotMua',
    (cthd.SoLuong * cthd.GiaBan) as TongTien,
    hd.NgayLap as 'NgayMua'
from KhachHang kh
join HoaDon hd on kh.MaKhachHang = hd.MaKhachHang
join ChiTietHoaDon cthd on hd.MaHoaDon = cthd.MaHoaDon
join SanPham sp on cthd.MaSanPham = sp.MaSanPham

--5
create view HoaDonTrongThangHienTai as
select
    kh.HoTen,
    hd.NgayLap as 'NgayTaoHoaDon',
    sp.TenSanPham, (cthd.SoLuong * cthd.GiaBan)as TongTienTrenHoaDon
from KhachHang kh
join HoaDon hd on kh.MaKhachHang = hd.MaKhachHang
join ChiTietHoaDon cthd on hd.MaHoaDon = cthd.MaHoaDon
join SanPham sp on cthd.MaSanPham = sp.MaSanPham
where hd.NgayLap(month) like '09'


select * from TenSanPhamVaTongTien
select * from HoaDonVaKhachHang
select * from SanPhamTonKhoConItHon10
select * from TongDoanhThu
select * from HoaDonTrongThangHienTai

drop view TenSanPhamVaTongTien
drop view HoaDonVaKhachHang
drop view SanPhamTonKhoConItHon10
drop view TongDoanhThu
drop view HoaDonTrongThangHienTai

drop table KhachHang
drop table SanPham
drop table HoaDon
drop table ChiTietHoaDon