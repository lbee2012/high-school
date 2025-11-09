create database Buoi4_SanPham
use Buoi4_SanPham

create table NhaCungCap (
	MaNCC varchar(50) not null,
	TenNCC varchar(50),
	DiaChi varchar(50),
	Email varchar(50),
	SoDienThoai varchar(50)

	primary key (MaNCC)
)
create table LoaiSanPham (
	MaLoai varchar(50) not null,
	TenLoai varchar(50)

	primary key (MaLoai)
)
create table SanPham (
	MaSP varchar(50) not null,
	TenSP varchar(50),
	GiaNhap float,
	GiaBan float,
	MaNCC varchar(50),
	MaLoai varchar(50)

	primary key (MaSP)
	foreign key (MaNCC) references NhaCungCap(MaNCC),
	foreign key (MaLoai) references LoaiSanPham(MaLoai)
)
create table NhapHang (
	MaPhieuNhap varchar(50) not null,
	NgayNhap date,
	MaNCC varchar(50)

	primary key (MaPhieuNhap)
	foreign key (MaNCC) references NhaCungCap(MaNCC)
)
create table ChiTietNhapHang (
	MaPhieuNhap varchar(50) not null,
	MaSP varchar(50) not null,
	SoLuong int,
	DonGia float

	primary key (MaPhieuNhap, MaSP)
	foreign key (MaPhieuNhap) references NhapHang(MaPhieuNhap),
	foreign key (MaSP) references SanPham(MaSP)
)
--2
insert into NhaCungCap values
('NCC01','EnCiCi','HN','EnCiCi@gmail.com','0987654321'),
('NCC02','NoCoCo','HN','NoCoCo@gmail.com','0123456789'),
('NCC03','AliShit','HN','','')
insert into LoaiSanPham values
('ML01','Do gia dung'),
('ML02','Do dien tu'),
('ML03','Do cut')
insert into SanPham values
('SP01','Dieu hoa',100,100,'NCC01','ML01'),
('SP02','Dien thoai',200,200,'NCC02','ML02'),
('SP03','Cut chinh',300,300,'NCC03','ML03')
insert into NhapHang values
('PN01','2024-01-01','NCC01'),
('PN02','2024-01-02','NCC02'),
('PN03','2024-01-03','NCC03')
insert into ChiTietNhapHang values
('PN01','SP01',1,100),
('PN02','SP02',2,200),
('PN03','SP03',3,300)

select * from NhaCungCap
select * from LoaiSanPham
select * from SanPham
select * from NhapHang
select * from ChiTietNhapHang

--3
--3.1
select ncc.TenNCC, lsp.TenLoai, sp.*
from LoaiSanPham lsp
join SanPham sp on lsp.MaLoai = sp.MaLoai
join NhaCungCap ncc on sp.MaNCC = ncc.MaNCC

where lsp.TenLoai = 'Do cut'
--3.2
select *
from NhaCungCap
where Email is null or Email = ''
--3.3
update NhaCungCap
set DiaChi = 'TP.HCM'
where MaNCC = 'NCC03'
--3.4
--chatgpt
DELETE FROM SanPham
WHERE MaSP IN (
    SELECT MaSP
    FROM ChiTietNhapHang
    GROUP BY MaSP
    HAVING SUM(SoLuong) = 0
);
----------
delete from SanPham
where MaSP in (
	select MaSP from ChiTietNhapHang
	group by MaSP
	having sum(SoLuong) = 0
)
--3.5
select ctnh.MaPhieuNhap, sp.TenSP, (ctnh.SoLuong * ctnh.DonGia) as ThanhTien
from ChiTietNhapHang ctnh
join SanPham sp on ctnh.MaSP = sp.MaSP

drop table NhaCungCap
drop table LoaiSanPham
drop table SanPham
drop table NhapHang
drop table ChiTietNhapHang
