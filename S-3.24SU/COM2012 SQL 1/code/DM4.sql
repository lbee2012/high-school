create database DM4
use DM4
--1
create table SanPham (
	MaSanPham varchar(50) not null,
	TenSanPham varchar(50) not null,
	GiaHienHanh float not null,
	SoLuongTon int not null

	primary key (MaSanPham)
)
create table HoaDon (
	MaHoaDon varchar(50) not null,
	NgayLap date not null,
	SoDienThoai varchar(50)

	primary key (MaHoaDon)
)
create table ChiTietHoaDon (
	MaSanPham varchar(50) not null,
	MaHoaDon varchar(50) not null,
	SoLuongMua int,
	GiaMua float

	primary key (MaSanPham, MaHoaDon)
	foreign key (MaSanPham) references SanPham(MaSanPham),
	foreign key (MaHoaDon) references HoaDon(MaHoaDon)
)
--2
--sdt is null or sdt = ''
--so luong ton = 0
insert into SanPham values
('SP01','Ali',100,0),
('SP02','Bli',200,22),
('SP03','Cli',300,33)

insert into HoaDon values
('HD01','2024-08-06','0947448325'),
('HD02','2024-08-07','0123456789'),
('HD03','2024-08-08','')

insert into ChiTietHoaDon values
('SP03','HD01',1,111),
('SP02','HD02',2,222),
('SP03','HD03',3,333)

select * from SanPham
select * from HoaDon
select * from ChiTietHoaDon

--3
select TenSanPham, GiaHienHanh
from SanPham

--4
select *
from HoaDon
where SoDienThoai is null or SoDienThoai = ''

--5
select * from SanPham
update SanPham
set SoLuongTon = 44
where MaSanPham = 'SP02'

select * from SanPham
--6
delete from ChiTietHoaDon
where MaSanPham in (
	select MaSanPham
	from SanPham
	where SoLuongTon = 0
)

delete from SanPham
where SoLuongTon = 0

select * from SanPham

--7
select hd.MaHoaDon, sp.TenSanPham, (ct.SoLuongMua * ct.GiaMua) as ThanhTien
from HoaDon hd
join ChiTietHoaDon ct on hd.MaHoaDon = ct.MaHoaDon
join SanPham sp on ct.MaSanPham = sp.MaSanPham

drop table SanPham
drop table HoaDon
drop table ChiTietHoaDon