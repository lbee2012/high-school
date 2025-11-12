create database ThiThu2_TH03115
use ThiThu2_TH03115
--1
create table NgoaiNgu (
	MaNN nvarchar(50) not null,
	TenNN nvarchar(50),
	Muc int,
	NoiCap nvarchar(50)

	primary key (MaNN)
)
create table SinhVien (
	MaSV nvarchar(50) not null,
	TenSV nvarchar(50) not null,
	TaiKhoan nvarchar(50),
	SoDT nvarchar(50)

	primary key (MaSV)
)
create table QuaTrinh (
	MaNN nvarchar(50) not null,
	MaSV nvarchar(50) not null,
	NgayCap date not null,
	TienDV float

	primary key (MaNN, MaSV)
	foreign key (MaNN) references NgoaiNgu(MaNN),
	foreign key (MaSV) references SinhVien(MaSV)
)
--2
insert into NgoaiNgu values
('01',N'Anh',7,'BC'),
('02',N'Pháp',2,'HN'),
('03',N'Hàn Quốc',4,'HN')

insert into SinhVien values
('1',N'Ma Mai','maima','0912378888'),
('2',N'Đỗ Vân','vandtt','1248990000'),
('3',N'Nguyễn Hòa','hoamn','3289000000'),
('4',N'Ma Lan','lanma','2487900988')

insert into QuaTrinh values
('01','1','2020-02-16',3000000),
('02','2','2020-01-17',1000000),
('03','3','2020-01-18',2000000),
('02','4','2024-02-03',3200000)

select * from NgoaiNgu
select * from SinhVien
select * from QuaTrinh
--3
select MaNN, TenNN, NoiCap
from NgoaiNgu
--4
select *
from SinhVien
where SoDT like '%88'
--5
select nn.TenNN, qt.MaSV, qt.NgayCap
from NgoaiNgu nn 
join QuaTrinh qt on nn.MaNN = qt.MaNN
where nn.NoiCap = 'BC'
--6
select nn.TenNN, count(distinct sv.MaSV) as SoLuongSinhVien
from NgoaiNgu nn 
join QuaTrinh qt on nn.MaNN = qt.MaNN
join SinhVien sv on qt.MaSV = sv.MaSV
where sv.TenSV like N'Ma%'
group by nn.TenNN
--7
--7.1
select * from NgoaiNgu

update NgoaiNgu
set NoiCap = 'HCM'
where MaNN = '02'

select * from NgoaiNgu

--7.2
select * from NgoaiNgu
select * from QuaTrinh

delete from QuaTrinh
where MaNN in (
	select MaNN from NgoaiNgu
	where NoiCap = 'BC'
)

delete from NgoaiNgu
where NoiCap = 'BC'

select * from NgoaiNgu
select * from QuaTrinh

--drop
drop table NgoaiNgu
drop table SinhVien
drop table QuaTrinh