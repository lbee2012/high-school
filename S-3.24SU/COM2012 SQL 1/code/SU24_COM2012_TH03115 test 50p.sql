create database SU24_COM2012_TH03115
go
use SU24_COM2012_TH03115
--1
go
create table SanPham (
	MaSanPham nvarchar(20) not null primary key,
	TenSanPham nvarchar(50) not null,
	GiaHienHanh float not null,
	SoLuongTon int not null
)
go
create table HoaDon (
	MaHoaDon nvarchar(20) not null primary key,
	NgayLap datetime not null,
	SoDienThoai nvarchar(10)
)
go
create table HoaDonChiTiet (
	MaSanPham nvarchar(20) not null,
	MaHoaDon nvarchar(20) not null,
	SoLuongMua int,
	GiaMua float,

	primary key (MaSanPham, MaHoaDon),
    foreign key (MaSanPham) references SanPham(MaSanPham),
    foreign key (MaHoaDon) references HoaDon(MaHoaDon)
)
--2
go
insert into SanPham values
('SP01',N'Tivi',2000,2),
('SP02',N'Tủ lạnh',2500,1),
('SP03',N'Điều hòa',1000,3)
go
insert into HoaDon values
('HD01','2024-01-01','0947448325'),
('HD02','2024-02-02','0915462739'),
('HD03','2024-03-03','0914368325')
go
insert into HoaDonChiTiet values
('SP01','HD01',1,2500),
('SP02','HD02',0,2000),
('SP03','HD03',2,4000)
go
--3
select TenSanPham, GiaHienHanh from SanPham
where GiaHienHanh >= 500
--4


go
select * from SanPham
select * from HoaDon
select * from HoaDonChiTiet
go
drop table SanPham
drop table HoaDon
drop table HoaDonChiTiet
