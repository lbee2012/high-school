--Y4
--Tao CSDL Quan ly thu vien: QLThuVien
create database QLThuVien
use QLThuVien

--Tao bang sinh vien
create table SinhVien(
	MaSV varchar(50) not null,
	TenSV varchar(50) not null,
	NgayHetHan date not null,
	ChuyenNganh varchar(50),
	Email varchar(50) not null,
	SoDT varchar(50) not null

	primary key (MaSV)
)
--Tao bang loai sach
create table LoaiSach(
	MaLoai varchar(50) not null,
	TenLoai varchar(50) not null

	primary key (MaLoai)
)
--Tao bang sach
create table Sach(
	MaSach varchar(50) not null,
	TenSach varchar(50) not null,
	NgayNhapKho date not null,
	NXB varchar(50) not null,
	TacGia varchar(50),
	SLbansao int not null,
	GiaTien float not null,
	ViTri varchar(50) not null,
	MaLoai varchar(50) not null

	primary key (MaSach)
	foreign key (MaLoai) references LoaiSach(MaLoai)
)
--Tao bang phieu muon
create table PhieuMuon(
	MaPM varchar(50) not null,
	NgayMuon date not null,
	NgayTra date not null,
	MaSV varchar(50) not null

	primary key (MaPM)
	foreign key (MaSV) references SinhVien(MaSV)
)
--Tao bang chi tiet phieu muon
create table ChiTietPhieuMuon (
	MaPM varchar(50) not null,
	MaSach varchar(50) not null,
	GhiChu varchar(50) not null

	primary key (MaPM, MaSach)
	foreign key (MaPM) references PhieuMuon(MaPM),
	foreign key (MaSach) references Sach(MaSach)
)

--Y5 Nhap du lieu: moi bang 5 ban ghi
--Bang sinh vien
insert into SinhVien values
('SV01','Long','2026-05-01','CNTT','longbe@fpt.edu.vn','0947448325'),
('SV02','KMinh','2026-05-01','CNTT','tintin@fpt.edu.vn','0961319231'),
('SV03','Mung','2026-05-01','TKDH','mungbi@fpt.edu.vn','0965616580'),
('SV04','Dung','2026-05-01','TKDH','dungsivi@fpt.edu.vn','0397077018'),
('SV05','Ngan','2026-05-01','MKT','ngandog@fpt.edu.vn','0987654321')
--Bang loai sach
insert into LoaiSach values
('IT','Cong nghe thong tin'),
('KT','Kinh te '),
('KD','Quan tri kinh doanh'),
('VH','Van hoa pho thong'),
('TK','Mau sac')
--Bang sach
insert into Sach values
('S01','Python','2012-01-01','NXB Tin hoc','Nguoi Trai Dat',2,300000,'A1','IT'),
('S02','SQL','2013-01-01','NXB Tin hoc','Nguoi Sao Hoa',3,150000,'A2','IT'),
('S03','Ngu Van','2014-01-01','NXB Kim Dong','Nguoi Mat Trang',14,150000,'D3','VH'),
('S04','Toan Hoc','2015-01-01','NXB Tre','Nguoi Sao Diem Vuong',11,200000,'D1','VH'),
('S05','Tieng Anh','2016-01-01','NXB English','Nguoi Ngoai Hanh Tinh',10,500000,'D2','VH')
--Bang phieu muon
insert into PhieuMuon values
('PM01','2017-01-01','2017-01-20','SV01'),
('PM02','2017-01-15','2017-02-05','SV02'),
('PM03','2017-02-01','','SV03'),
('PM04','2017-02-20','2017-03-01','SV04'),
('PM05','2017-03-01','2017-04-01','SV05')
--Bang chi tiet phieu muon
insert into ChiTietPhieuMuon values
('PM01','S01', 'Chua tra'),
('PM02','S02', 'Da tra'),
('PM03','S03', 'Chua tra'),
('PM04','S04', 'Chua tra'),
('PM05','S05', 'Da tra')

--Kiem tra du lieu trong 5 bang
select * from SinhVien
select * from LoaiSach
select * from Sach
select * from PhieuMuon
select * from ChiTietPhieuMuon

--Y6 Cac cau truy van du lieu
--6.1 Liet ke tat ca thong tin cua cac dau sach gom: ten sach, ma sach, gia tien, tac gia. Thuoc loai sach co ma "IT"
select TenSach, MaSach, Giatien, Tacgia
from Sach
where MaLoai = 'IT'

--6.2 Liet ke cac phieu muon gom cac thong tin: ma phieu muon, ma sach, ngay muon, ma sinh vien. Co ngay muon trong thang 01/2017
select pm.MaPM, ctpm.MaSach, pm.NgayMuon, pm.MaSV
from PhieuMuon pm
join ChiTietPhieuMuon ctpm on pm.MaPM = ctpm.MaPM
where pm.NgayMuon between '2017-01-01' and '2017-01-31'

--6.3 Liet ke cac phieu muon chua tra sach cho thu vien theo thu tu tang dan cua ngay muon sach
select MaPM, MaSV, NgayMuon
from PhieuMuon
where NgayTra is null or NgayTra = ''
order by NgayMuon asc

--6.4 Liet ke tong so dau sach cua moi loai sach, gom: ma loai sach, ten loai sach, tong so luong sach moi loai
select ls.MaLoai, ls.TenLoai, count(s.MaSach) as TongSoSachMoiLoai
from LoaiSach ls
join Sach s on ls.MaLoai = s.MaLoai
group by ls.MaLoai, ls.TenLoai

--6.5 Dem xem co bao nhieu sinh vien da muon sach
select count(distinct MaSV) as SoLuongSinhVienDaMuonSach
from PhieuMuon

--6.6 Hien thi tat ca cac quyen sach co tieu de chua tu khoa "SQL"
select *
from Sach
where TenSach like '%SQL%';

--6.7 Hien thi thong tin muon sach gom cac thong tin: ma sinh vien, ten sinh vien, ma phieu muon, tieu de sach, ngay muon, ngay tra. Sap xep thu tu theo ngay muon sach
select sv.MaSV, sv.TenSV, pm.MaPM, s.TenSach, pm.NgayMuon, pm.NgayTra
from PhieuMuon pm
join SinhVien sv on pm.MaSV = sv.MaSV
join ChiTietPhieuMuon ctpm on pm.MaPM = ctpm.MaPM
join Sach s on ctpm.MaSach = s.MaSach
order by pm.NgayMuon asc

--6.8 Liet ke cac dau sach co luot muon lon hon 20 lan
select s.MaSach, s.TenSach, count(ctpm.MaSach) as SoLuotMuon
from ChiTietPhieuMuon ctpm
join Sach s on ctpm.MaSach = s.MaSach
group by s.MaSach, s.TenSach
having count(ctpm.MaSach) > 20;

--6.9 Viet cau lenh cap nhat lai gia tien cua cac quyen sach co ngay nhap kho truoc nam 2014, giam 30%
select * from Sach

update Sach
set GiaTien = GiaTien * 0.7
where year(NgayNhapKho) < 2014;

select * from Sach

--6.10 Viet cau lenh cap nhat lai trang thai da tra sach cho phieu muon cua sinh vien co ma sinh vien "TH03115" (vi du)
select * from ChiTietPhieuMuon

update ChiTietPhieuMuon
set GhiChu = 'Da tra'
where MaPM in (
    select MaPM
    from PhieuMuon
    where MaSV = 'SV03'
)

select * from ChiTietPhieuMuon

--6.11 Lap danh sach cac phieu muon qua han chua tra gom cac thong tin: ma phieu muon, ten sinh vien, email, danh sach cac sach da muon, ngay muon
select pm.MaPM, sv.TenSV, sv.Email, s.TenSach, pm.NgayMuon
from PhieuMuon pm
join SinhVien sv on pm.MaSV = sv.MaSV
join ChiTietPhieuMuon ctpm on pm.MaPM = ctpm.MaPM
join Sach s on ctpm.MaSach = s.MaSach
where (pm.NgayTra is null or pm.NgayTra = '') and pm.NgayMuon < getdate()

--6.12 Viet cau lenh cap nhat lai so luong ban sao tang len 5 don vi doi voi cac dau sach co so luot muon lon hon 10
select * from Sach

update Sach
set SLbansao = SLbansao + 5
where MaSach in (
    select MaSach
    from ChiTietPhieuMuon
    group by MaSach
    having count(MaSach) > 10
)

select * from Sach

--6.13 Viet cau lenh xoa cac phieu muon co ngay muon va ngay tra truoc "01/01/2010"
delete from PhieuMuon
where NgayMuon < '2010-01-01' and NgayTra < '2010-01-01'

--Y7 To chuc sao luu du phong cho co so du lieu
backup database QLThuVien 
to disk = 'C:\Users\longsuwu\Desktop\QLThuVien.bak' 
with format,
medianame = 'QLThuVienBackup',
name = 'Backup QLThuVien'

--delete table, values
drop table SinhVien
drop table LoaiSach
drop table Sach
drop table PhieuMuon
drop table ChiTietPhieuMuon