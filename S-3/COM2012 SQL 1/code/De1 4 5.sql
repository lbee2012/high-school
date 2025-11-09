create database Buoi4_BanHang
use Buoi4_BanHang
--1
create table KhachHang (
	MaKhachHang varchar(50) not null,
	TenKhachHang varchar(50),
	SoDienThoai varchar(50),
	Email varchar(50),
	DiaChi varchar(50)

	primary key (MaKhachHang)
)
create table SanPham (
	MaSanPham varchar(50) not null,
	TenSanPham varchar(50),
	GiaBan float,
	MoTa varchar(50)

	primary key (MaSanPham)
)
create table DonHang (
	MaDonHang varchar(50) not null,
	NgayDatHang date,
	MaKhachHang varchar(50)

	primary key (MaDonHang)
)
create table ChiTietDonHang (
	MaDonHang varchar(50) not null,
	MaSanPham varchar(50) not null,
	SoLuong int,
	GiaBan float

	primary key (MaDonHang, MaSanPham)
	foreign key (MaDonHang) references DonHang(MaDonHang),
	foreign key (MaSanPham) references SanPham(MaSanPham)
)
--2
insert into KhachHang values
('KH01','A','0123456789','A@gmail.com','Ha Noi'),
('KH02','B','0123456798','B@gmail.com','Ha Noi'),
('KH03','C','','','Ha Noi'),
('KH04','D','0123459876','D@gmail.com','Ha Noi'),
('KH05','E','0123498765','E@gmail.com','Ha Noi')

insert into SanPham values
('SP01','Ashit',100,'Cut cho'),
('SP02','Bshit',100,'Cut meo'),
('SP03','Cshit',100,'Cut ga'),
('SP04','Dshit',100,'Cut vit'),
('SP05','Eshit',100,'Cut nguoi')

insert into DonHang values
('DH01','2024-12-31','KH01'),
('DH02','2024-12-30','KH02'),
('DH03','2024-12-29','KH03'),
('DH04','2024-12-28','KH04'),
('DH05','2024-12-27','KH05')

insert into ChiTietDonHang values
('DH01','SP01',1,100),
('DH02','SP02',2,200),
('DH03','SP03',3,300),
('DH04','SP04',4,400),
('DH05','SP05',5,500)

select * from KhachHang
select * from SanPham
select * from DonHang
select * from ChiTietDonHang

--de1
--3
--3.1
select TenKhachHang, DiaChi
from KhachHang
where DiaChi = 'Ha Noi'
--3.2
select *
from KhachHang
where SoDienThoai is null or SoDienThoai = ''
--3.3
update KhachHang
set DiaChi = 'TP.HCM'
where MaKhachHang = 'KH03'
--3.4
delete from KhachHang
where Email is null or Email = ''
--3.5
select ctdh.MaDonHang, sp.TenSanPham, (ctdh.SoLuong * ctdh.GiaBan) as ThanhTien
from SanPham sp
join ChiTietDonHang ctdh on sp.MaSanPham = ctdh.MaSanPham

--de4
--3
--3.1

--3.2
--3.3
--3.4
--3.5

drop table KhachHang
drop table SanPham
drop table DonHang
drop table ChiTietDonHang