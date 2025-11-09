create database Buoi5
use Buoi5
--1
create table CaSi (
	MaCaSi varchar(50) not null,
	TenCaSi varchar(50),
	NgaySinh date,
	QuocTich varchar(50)

	primary key (MaCaSi)
)
create table BaiHat (
	MaBaiHat varchar(50) not null,
	TenBaiHat varchar(50),
	ThoiLuong float
	
	primary key (MaBaiHat)
)
create table Album (
	MaAlbum varchar(50) not null,
	TenAlbum varchar(50),
	NamPhatHanh date

	primary key (MaAlbum)
)
create table TheLoai (
	MaTheLoai varchar(50) not null,
	TenTheLoai varchar(50)

	primary key (MaTheLoai)
)
create table ThamGia (
	MaBaiHat varchar(50) not null,
	MaCaSi varchar(50)

	primary key (MaBaiHat)
)
create table BaiHat_TheLoai (
	MaBaiHat varchar(50) not null,
	MaTheLoai varchar(50) not null

	primary key (MaBaiHat, MaTheLoai)
	foreign key (MaBaiHat) references BaiHat(MaBaiHat),
	foreign key (MaTheLoai) references TheLoai(MaTheLoai),
)
create table CaSi_Album (
	MaCaSi varchar(50) not null,
	MaAlbum varchar(50) not null

	primary key (MaCaSi, MaAlbum)
	foreign key (MaCaSi) references CaSi(MaCaSi),
	foreign key (MaAlbum) references Album(MaAlbum)
)
create table SanBay (
	MaSanBay varchar(50) not null,
	TenSanBay varchar(50),
	DiaDiem varchar(50)

	primary key (MaSanBay)
)
create table TiepVienHangKhong (
	MaTiepVien varchar(50) not null,
	TenTiepVien varchar(50),
	MaSanBay varchar(50) not null

	primary key (MaTiepVien, MaSanBay)
	foreign key (MaSanBay) references SanBay(MaSanBay)
)
--2
insert into CaSi values
('CS01','Long','2007-12-20','Viet Nam'),
('CS02','Nong','2007-12-20','Viet Nam'),
('CS03','Ong','2007-12-20','Viet Nam')

insert into BaiHat values
('BH01','Ali',10),
('BH02','Bli',20),
('BH03','Cli',30)

insert into Album values
('AB01','Ngot1','2012-01-01'),
('AB02','Ngot2','2012-02-01'),
('AB03','Ngot3','2012-03-01')

insert into TheLoai values
('TL01','Pop'),
('TL02','Rock'),
('TL03','Indie')

insert into ThamGia values
('BH01','CS01'),
('BH02','CS02'),
('BH03','CS03')

insert into BaiHat_TheLoai values
('BH01','TL01'),
('BH02','TL02'),
('BH03','TL03')

insert into CaSi_Album values
('CS01','AB01'),
('CS02','AB02'),
('CS03','AB03')

insert into SanBay values
('SB01','Noi Bai','Ha Noi'),
('SB02','Cam Ranh','Nha Trang'),
('SB03','Phu Quoc','Phu Quoc')

insert into TiepVienHangKhong values
('TV01','Ong','SB01'),
('TV02','Nong','SB02'),
('TV03','Long','SB03')

select * from CaSi
select * from BaiHat
select * from Album
select * from TheLoai
select * from ThamGia
select * from BaiHat_TheLoai
select * from CaSi_Album
select * from SanBay
select * from TiepVienHangKhong
--3
--3.1
select * from CaSi
--3.2
select bh.*, tl.TenTheLoai from 
BaiHat bh join BaiHat_TheLoai bhtl on bh.MaBaiHat = bhtl.MaBaiHat 
join TheLoai tl on bhtl.MaTheLoai = tl.MaTheLoai
where tl.TenTheLoai = 'Pop'
--3.3
update CaSi
set 
TenCaSi = 'KMinh',
NgaySinh = '2007-10-30',
QuocTich = 'Viet Nam'
where MaCaSi = 'CS01'
--3.4