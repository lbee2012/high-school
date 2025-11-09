create database DM1
use DM1
--1
create table GiangVien (
	MaGiangVien varchar(50) not null,
	TenGiangVien varchar(50) not null,
	TenTaiKhoan varchar(50),
	SoDienThoai varchar(50) not null

	primary key (MaGiangVien)
)
create table ChungChi (
	MaChungChi varchar(50) not null,
	TenChungChi varchar(50) not null,
	BenCap varchar(50),
	LinhVuc varchar(50) not null

	primary key (MaChungChi)
)
create table LichSuHocTap (
	MaGiangVien varchar(50) not null,
	MaChungChi varchar(50) not null,
	NgayCap date not null,
	GhiChu varchar(50)
	
	primary key (MaGiangVien, MaChungChi)
	foreign key (MaGiangVien) references GiangVien(MaGiangVien),
	foreign key (MaChungChi) references ChungChi(MaChungChi)
)
--2
--sdt duoi 29
--ben cap: coursera
--linh vuc: Xu ly du lieu
insert into GiangVien values
('GV01','Hoang Quy Long','longhq2012','0947448325'),
('GV02','Tran Quoc Sang','sangqt69','0123456789'),
('GV03','Tran Anh Tuan','atuantr33','0987654329')

insert into ChungChi values
('CC01','IELTS','BC','Ngoai ngu'),
('CC02','SQL','Coursera','Xu ly du lieu'),
('CC03','Javascript','Coursera','Phat trien phan mem')

insert into LichSuHocTap values
('GV01','CC01','2025-04-25','Anni 1Y'),
('GV02','CC02','2026-05-01','Graduation'),
('GV03','CC03','2024-09-01','Done')

select * from GiangVien
select * from ChungChi
select * from LichSuHocTap

--3
select MaChungChi, TenChungChi, LinhVuc
from ChungChi

--4
select *
from GiangVien
where SoDienThoai like '%29'

--5
select * from ChungChi
update ChungChi
set BenCap = 'IDP'
where MaChungChi = 'CC01'

select * from ChungChi

--6
delete from ChungChi
where LinhVuc = 'Xu ly du lieu'

select * from ChungChi

--7
select cc.MaChungChi, gv.TenGiangVien, ls.NgayCap, cc.BenCap
from ChungChi cc
join LichSuHocTap ls on cc.MaChungChi = ls.MaChungChi
join GiangVien gv on ls.MaGiangVien = gv.MaGiangVien
where BenCap = 'Coursera'

drop table GiangVien
drop table ChungChi
drop table LichSuHocTap