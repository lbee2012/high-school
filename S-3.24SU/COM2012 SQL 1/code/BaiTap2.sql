Create Database BaiTap2;
Use BaiTap2;

Create Table SanPham (
MaSP char(10) primary key not null,
TenSP char(20) not null,
MauSac nchar(30) not null,
Gia money not null,
SoLuongCo int );
Alter table SanPham Alter column TenSP nchar(30)

Create Table CongTy(
MaCT char(10) primary key not null,
TenCT char(20) not null,
TrangThai nchar(30) not null,
ThanhPho nchar(30) not null );

Create Table CungUng(
MaCT char(10) not null,
MaSP char(10) not null,
SoLuongBan int,
Primary Key (MaCT,MaSP),
Foreign Key (MaCT) references CongTy(MaCT),
Foreign Key (MaSP) references SanPham(MaSP))

Insert Into CongTy Values
('CT05','SS',N'Hoạt động',N'Hà Nội'),
('CT06','LG',N'Đã đóng cửa',N'Hải Phòng'),
('CT07','TCL',N'Hoạt động',N'Hà Nam')
--Select * From CONGTY
Insert Into SanPham Values
('SP01',N'Máy Giặt',N'Trắng',8000000,10),
('SP02',N'Tủ Lạnh',N'Xanh',5000000,20),
('SP03',N'Điều Hòa',N'Trắng',9000000,30)
--Select * From SANPHAM
Insert Into CungUng Values
('CT05','SP02',5),
('CT05','SP03',15),
('CT06','SP01',20),
('CT07','SP03',10),
('CT07','SP01',20)
--Select * From CUNGUNG