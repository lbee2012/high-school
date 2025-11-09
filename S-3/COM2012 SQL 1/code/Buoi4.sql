create database Buoi4
use Buoi4

--1
create table KhachHang (
	MaKhachHang varchar(50) not null,
	TenKhachHang varchar(50),
	SoDienThoai varchar(50),
	Email varchar(50) not null,
	DiaChi varchar(50)

	primary key (MaKhachHang)
)

create table SanPham (
	MaSanPham varchar(50) not null,
	TenSanPham varchar(50),
	Gia float,
	MoTa varchar(50)

	primary key (MaSanPham)
)

create table DonHang (
	MaDonHang varchar(50) not null,
	NgayDatHang date,
	MaKhachHang varchar(50)

	primary key (MaDonHang)
	foreign key (MaKhachHang) references KhachHang(MaKhachHang)
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
('KH01','Hoang Quy Long','0947448325','hoangflong2012@gmail.com','Ha Noi'),
('KH02','Nguyen Khanh Minh','0961319231','khanhminh3010@gmail.com','Ha Noi'),
('KH03','Pham Ha Anh','0912345678','hanhkiki2512@gmail.com','Ha Noi'),
('KH04','Ta Quang The Dan','0987654321','dansimiALI@gmail.com','Ha Noi'),
('KH05','Nguyen Tien Thanh','0999999999','teteGAY@gmail.com','Ha Noi')

insert into SanPham values
('SP01','Ti vi',100000,'Television'),
('SP02','Tu lanh',200000,'Bridge'),
('SP03','May giat',300000,'Washing machine'),
('SP04','Dieu hoa',400000,'Air conditioner'),
('SP05','Ban de',500000,'Sell now')

insert into DonHang values
('DH01','2024-07-01','KH01'),
('DH02','2024-07-02','KH02'),
('DH03','2024-07-03','KH03'),
('DH04','2024-07-04','KH04'),
('DH05','2024-07-05','KH05')

insert into ChiTietDonHang values
('DH01','SP01',1,100000),
('DH02','SP02',2,200000),
('DH03','SP03',3,300000),
('DH04','SP04',4,400000),
('DH05','SP05',5,500000)

select * from KhachHang
select * from SanPham
select * from DonHang
select * from ChiTietDonHang
--3.1
select TenKhachHang, DiaChi
from KhachHang
where DiaChi = 'Ha Noi'
--3.2
--3.3
--3.4
delete from KhachHang
where SoDienThoai is null
--3.5
select ctdh.MaDonHang, sp.TenSanPham, (ctdh.SoLuong * ctdh.GiaBan) as ThanhTien
from ChiTietDonHang ctdh 
join SanPham sp on ctdh.MaSanPham = sp.MaSanPham
--3.6
--3.7
select sum(ctdh.SoLuong) as TongSoLuongSanPhamBanDuoc
from ChiTietDonHang ctdh
join DonHang dh on ctdh.MaDonHang = dh.MaDonHang
where dh.NgayDatHang between '2024-07-01' and '2024-07-05'
--3.8
select kh.*
from KhachHang kh
join DonHang dh on kh.MaKhachHang = dh.MaKhachHang
join ChiTietDonHang ctdh on dh.MaDonHang = ctdh.MaDonHang
join SanPham sp on ctdh.MaSanPham = sp.MaSanPham
where sp.TenSanPham = 'Ban de'
--3.9
select dh.MaDonHang, (ctdh.SoLuong * ctdh.GiaBan) as TongTien
from DonHang dh
join ChiTietDonHang ctdh on dh.MaDonHang = ctdh.MaDonHang
--3.10
select kh.MaKhachHang, kh.TenKhachHang, kh.Email, kh.SoDienThoai, dh.MaDonHang, (ctdh.SoLuong * ctdh.GiaBan) as TongTienDaChiTieuChoToanBoDonHang
from KhachHang kh
join DonHang dh on kh.MaKhachHang = dh.MaKhachHang
join ChiTietDonHang ctdh on dh.MaDonHang = ctdh.MaDonHang


--2c phụ
--đầu 09
select dh.MaDonHang, kh.MaKhachHang, kh.TenKhachHang, kh.SoDienThoai, dh.NgayDatHang
from KhachHang kh inner join DonHang dh on kh.MaKhachHang = dh.MaKhachHang
where kh.SoDienThoai like '09%'
--ttin khach hang
select dh.*, kh.TenKhachHang, kh.SoDienThoai
from DonHang dh, KhachHang kh
where dh.MaKhachHang = kh.MaKhachHang


drop table KhachHang
drop table SanPham
drop table DonHang
drop table ChiTietDonHang
