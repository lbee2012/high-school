Create Database LamThem;
Use LamThem;

Create Table Phong (
MaPH Int Primary Key,
TenPhong nvarchar(50),
DonGia int
)
Create Table KhachHang (
MaKH nvarchar(10) primary key,
TenKH nvarchar(50),
MaPH int,
NgayThue date,
NgayTra date
)

Create Table DichVu (
MaPH int,
MaKH int,
Ngay date,
TienDV int,
TenDV nvarchar(50),
Primary Key(MaPH, MaKH, Ngay)
);
Insert Into Phong (MaPH, TenPhong, DonGia) Values
(1, 'Loại 1', 500000),
(2, 'Loại 2', 700000),
(3, 'Loại 3', 1000000)

Insert Into KhachHang (MaKH, TenKH, MaPH, NgayThue, NgayTra) Values
(1, 'Mai', 1, '2022-02-15', '2022-02-17'),
(2, 'Vân', 2, '2022-01-12', '2022-01-18'),
(3, 'Hòa', 2, '2022-03-22', NULL);

Insert Into DichVu (MaPH, MaKH, Ngay, TienDV, TenDV) Values
(1, 1, '2020-02-16', 30000, 'Bim bim'),
(2, 2, '2020-01-17', 100000, N'Thuê xe'),
(2, 2, '2020-01-18', 20000, N'Giặt');

Insert Into DichVu(MaPH, MaKH, Ngay, TienDV, TenDV) Values
(3, 3, '2023-07-11', 50000, N'Nước uống');

Select * From Phong
Select * From KhachHang
Select * From DichVu

Delete From KhachHang
Where NgayThue < '2022-01-01'