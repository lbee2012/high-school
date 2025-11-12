create database n2909
use n2909

-- Bảng NhanVien
CREATE TABLE NhanVien (
    ID INT PRIMARY KEY,
    HoTen VARCHAR(255),
    Email VARCHAR(255),
    Luong DECIMAL(10, 2),
    NgayBatDau DATE
);

-- Bảng KhachHang
CREATE TABLE KhachHang (
    ID INT PRIMARY KEY,
    HoTen VARCHAR(255),
    SoDienThoai VARCHAR(20),
    DiaChi TEXT,
    NgayDangKy DATE
);

-- Bảng SanPham
CREATE TABLE SanPham (
    ID INT PRIMARY KEY,
    TenSanPham VARCHAR(255),
    MoTaSanPham TEXT,
    Gia DECIMAL(10, 2)
);

-- Dữ liệu mẫu cho bảng NhanVien
INSERT INTO NhanVien (ID, HoTen, Email, Luong, NgayBatDau) VALUES 
(1, 'Nguyen Van A', 'nguyenvana@gmail.com', 1000.00, '2023-01-01'),
(2, 'Tran Thi B', 'tranthib@yahoo.com', 1200.00, '2022-05-15'),
(3, 'Le Van C', 'levanc@oldmail.com', 1100.00, '2023-03-10'),
(4, 'Pham Thi D', 'phamthid@oldmail.com', 1050.00, '2021-11-20'),
(5, 'Hoang Van E', 'hoangvane@gmail.com', 1250.00, '2022-07-05');

-- Dữ liệu mẫu cho bảng KhachHang
INSERT INTO KhachHang (ID, HoTen, SoDienThoai, DiaChi, NgayDangKy) VALUES 
(1, 'Nguyen Van F', '0901234567', '123 Phan Chu Trinh, Ha Noi', '2023-09-01'),
(2, 'Tran Thi G', '0912233445', '456 Tran Hung Dao, Ho Chi Minh', '2022-12-10'),
(3, 'Le Van H', '0909876543', '789 Ly Tu Trong, Da Nang', '2023-05-20'),
(4, 'Pham Thi I', '0932456789', '12 Hai Ba Trung, Hue', '2023-08-15'),
(5, 'Hoang Van J', '0923456789', '34 Nguyen Trai, Hai Phong', '2022-11-25');

-- Dữ liệu mẫu cho bảng SanPham
INSERT INTO SanPham (ID, TenSanPham, MoTaSanPham, Gia) VALUES 
(1, 'Ban', 'Ban gia re, chất lượng cao', 500.00),
(2, 'Ghe', 'Ghế gỗ bền đẹp', 300.00),
(3, 'Tu', 'Tủ gỗ tự nhiên', 700.00),
(4, 'Giường', 'Giường sắt chắc chắn', 900.00),
(5, 'Tủ lạnh', 'Tủ lạnh 2 cửa, tiết kiệm điện', 1500.00);

select * from NhanVien
select * from KhachHang
select * from SanPham

--1
select HoTen,
left(HoTen, charindex(' ', HoTen) - 1) as Ho,
right(HoTen, len(HoTen) - charindex(' ', HoTen)) as Ten
from NhanVien

--2
select concat(HoTen, ' <' + Email + '>') as HoTenEmail
from NhanVien

--3
select ID, TenSanPham, len(MoTaSanPham) as SoKyTuMoTa
from SanPham


--7
select substring(Email, charindex('@', Email) + 1, len(email))
as TenMienEmail
from NhanVien

--8
select format(NgayBatDau, 'dd-MM-yyyy') as NgayBatDauFormatted
from NhanVien

--9


--10
select *
from KhachHang where len(SoDienThoai) > 10

drop table NhanVien
drop table KhachHang
drop table SanPham

-- create view san_pham_view
-- as
-- select ma_san_pham as 'id', ten_san_pham as 'ten', gia_ban as 'gia' from san_pham sp

-- select id, ten, gia from san_pham_view

--1
create view NhanVienLuongView as
select HoTen, Email, Luong
from NhanVien nv

select * from NhanVienLuongView

--2
create view KhachHangHaNoiView as
select HoTen, SoDienThoai, DiaChi
from KhachHang kh 
where DiaChi like '%Ha Noi%'

select * from KhachHangHaNoiView

--3
select * from NhanVienLuongView

--4
create view SanPhamGiaCaoView as
select TenSanPham, Gia
from SanPham sp
where Gia > 700

select * from SanPhamGiaCaoView

--5
create view TongKhachHangView as
select count(id) as TongSoLuotDangKy
from KhachHang kh

select * from TongKhachHangView

--6
create view CapNhatLuongNhanVienView as
select ID, HoTen, Luong
from NhanVien nv

update CapNhatLuongNhanVienView
set Luong = '1300'
where ID = '3'

select * from CapNhatLuongNhanVienView

--7
create view NhanVienKhachHangView as
select nv.HoTen as HoTenNhanVien, nv.Email, kh.HoTen as HoTenKhachHang, kh.DiaChi
from NhanVien nv left join KhachHang kh on nv.ID = kh.ID

select * from NhanVienKhachHangView

--8
create view TongDoanhThuSanPhamView as
select sp.Gia * hd.SoLuotMua as TongDoanhThu
from SanPham sp join HoaDon hd on sp.ID = hd.ID

select * from TongDoanhThuSanPhamView

--9
create view KhachHangSanPhamPhoBienView as
select top 1 count(hd.SoLuotMua), kh.HoTen
from KhachHang kh join SanPham sp on kh.ID = sp.ID
join HoaDon hd on sp.ID = hd.ID

select * from KhachHangSanPhamPhoBienView

--10
create view NhanVienKhachHangTuongTacView as
select 
from NhanVien nv join KhachHang kh on nv.ID = kh.ID
join TuongTac tt on kh.ID = tt.ID

drop view NhanVienLuongView
drop view KhachHangHaNoiView
drop view SanPhamGiaCaoView
drop view TongKhachHangView
drop view CapNhatLuongNhanVienView
drop view NhanVienKhachHangView
drop view TongDoanhThuSanPhamView