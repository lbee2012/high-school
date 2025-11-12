create database DM2
use DM2
--1
create table GiangVien (
	MaGiangVien nvarchar(50) not null,
	TenGiangVien nvarchar(50) not null,
	TenTaiKhoan nvarchar(50) not null,
	SoDienThoai nvarchar(50) not null,

	primary key (MaGiangVien)
)
create table ChungChiTheoNganh (
	MaChungChi nvarchar(50) not null,
	TenChungChi nvarchar(50) not null,
	BenCap nvarchar(50) not null,
	LinhVuc nvarchar(50) not null,

	primary key (MaChungChi)
)
create table LichSuHocTapCuaGiangVien (
	MaGiangVien nvarchar(50) not null,
	MaChungChi nvarchar(50) not null,
	NgayCap date not null,
	GhiChu nvarchar(50) not null,

	primary key (MaGiangVien,MaChungChi),
	foreign key (MaGiangVien) references GiangVien(MaGiangVien),
	foreign key (MaChungChi) references ChungChiTheoNganh(MaChungChi)
)
--2
insert into GiangVien values
('GV001',N'Hoàng Quý Long','longhq2012','0947448325'),
('GV002',N'Nguyễn Khánh Minh','minhnk3010','0961319231'),
('GV003',N'Trần Quốc Sang','sangtran69','1038564729')
insert into ChungChiTheoNganh values
('CC001',N'Hackathon','FPT University',N'Tự động hóa'),
('CC002',N'Landing Page','FPT Polytechnic',N'Xử lý dữ liệu'),
('CC003',N'Streamer','Coursera',N'Truyền hình trực tiếp')
insert into LichSuHocTapCuaGiangVien values
('GV001','CC001','2024-12-20',N'Giải nhất'),
('GV002','CC002','2024-10-30',N'Giải khuyến khích'),
('GV003','CC003','2024-06-09',N'Top1 trending')

select * from GiangVien
select * from ChungChiTheoNganh
select * from LichSuHocTapCuaGiangVien
--3
select MaChungChi, TenChungChi, LinhVuc
from ChungChiTheoNganh
--4
select TenGiangVien, TenTaiKhoan, MaGiangVien
from GiangVien
where SoDienThoai like '%29'
--5
select * from ChungChiTheoNganh

update ChungChiTheoNganh
set BenCap = 'FPT Education'
where MaChungChi = 'CC001'

select * from ChungChiTheoNganh
--6
select * from ChungChiTheoNganh
select * from LichSuHocTapCuaGiangVien

delete from LichSuHocTapCuaGiangVien
where MaChungChi in (select MaChungChi from ChungChiTheoNganh where LinhVuc = N'Xử lý dữ liệu')
delete from ChungChiTheoNganh
where LinhVuc = N'Xử lý dữ liệu'

select * from ChungChiTheoNganh
select * from LichSuHocTapCuaGiangVien
--7
select cc.TenChungChi, gv.MaGiangVien, ls.NgayCap
from GiangVien gv
join LichSuHocTapCuaGiangVien ls on gv.MaGiangVien = ls.MaGiangVien
join ChungChiTheoNganh cc on ls.MaChungChi = cc.MaChungChi
where cc.BenCap = 'Coursera'
--8
select cc.TenChungChi, gv.TenGiangVien, count(gv.MaGiangVien) as SoLuongGiangVien
from GiangVien gv
join LichSuHocTapCuaGiangVien ls on gv.MaGiangVien = ls.MaGiangVien
join ChungChiTheoNganh cc on ls.MaChungChi = cc.MaChungChi
where gv.TenGiangVien like N'Trần%'
group by cc.TenChungChi, gv.TenGiangVien

drop table GiangVien
drop table ChungChiTheoNganh
drop table LichSuHocTapCuaGiangVien