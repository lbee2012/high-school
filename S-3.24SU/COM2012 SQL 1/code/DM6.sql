create database DM6
use DM6

create table GiaoVien (
	MaGiaoVien nvarchar(50) not null,
	TenGiaoVien nvarchar(50) not null,
	Email nvarchar(50),
	SoDienThoai nvarchar(50) not null

	primary key (MaGiaoVien)
)
create table CuocThi (
	MaNhom nvarchar(50) not null,
	TenDeTai nvarchar(50) not null,
	SoLuongThanhVien int,
	ChuDe nvarchar(50) not null

	primary key (MaNhom)
)
create table HuongDan (
	MaGiaoVien nvarchar(50) not null,
	MaNhom nvarchar(50) not null,
	NgayNop date not null,
	GhiChu nvarchar(50)

	primary key (MaGiaoVien, MaNhom)
	foreign key (MaGiaoVien) references GiaoVien(MaGiaoVien),
	foreign key (MaNhom) references CuocThi(MaNhom)
)
--2
insert into GiaoVien values
('GV01',N'Hoàng Quý Long','longhqth03115@fpt.edu.vn','0947448325'),
('GV02',N'Nguyễn Khánh Minh','minhnkth03032@fpt.edu.vn','0961319231'),
('GV03',N'Ali','','')

insert into CuocThi values
('N01','LoL',3,'LandingPage'),
('N02','Tre',3,'LandingPage'),
('N03','Ali',3,'Shit')

insert into HuongDan values
('GV01','N01','2024-08-03','Top 6'),
('GV02','N02','2024-08-03','Top 1'),
('GV03','N03','2024-08-08','An Xong Roi')

--3
select TenGiaoVien, Email, SoDienThoai
from GiaoVien

--4
select TenDeTai, MaNhom, SoLuongThanhVien
from CuocThi
where ChuDe = 'LandingPage'

--5
select hd.MaGiaoVien, gv.TenGiaoVien, count(ct.MaNhom) as SoLuongNhomDangHuongDan
from GiaoVien gv
join HuongDan hd on gv.MaGiaoVien = hd.MaGiaoVien
join CuocThi ct on hd.MaNhom = ct.MaNhom
where ct.ChuDe = 'LandingPage'
group by hd.MaGiaoVien, gv.TenGiaoVien

--6
select hd.NgayNop, count(distinct ct.MaNhom) as SoLuongNhom, sum(ct.SoLuongThanhVien) as TongSoThanhVien
from HuongDan hd
join CuocThi ct on hd.MaNhom = ct.MaNhom
where datename(weekday, NgayNop) in ('Saturday','Sunday')
group by NgayNop

--7
--7.1
update GiaoVien
set SoDienThoai = '0123456789'
where MaGiaoVien = 'GV02'

--7.2
delete from GiaoVien
where Email is null or Email = ''