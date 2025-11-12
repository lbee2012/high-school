use BAITAP1

--1
select TEN_DUAN 
from DU_AN 
where year(NGAY_BATDAU) = 2017;

--2
select NV.Ten_NV, PB.Ten_PB 
from NHAN_VIEN NV
inner join PHonG_BAN PB on NV.PHG = PB.Ma_PB
where PB.Ten_PB LIKE 'P%';

--3
select NV.Ten_NV, DA.TEN_DUAN, DA.NGAY_BATDAU 
from NHAN_VIEN NV
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN
where year(DA.NGAY_BATDAU) > 2017;

--4
select NV.Ten_NV, DA.TEN_DUAN 
from NHAN_VIEN NV
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN
where DA.TEN_DUAN LIKE 'T%';

--5
select NV.Ten_NV, count(QLDA.Ma_DUAN) as So_Du_An
from NHAN_VIEN NV
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
GROUP BY NV.Ten_NV;

--6
select NV.Ten_NV, PB.Ten_PB, DA.TEN_DUAN
from NHAN_VIEN NV
inner join PHonG_BAN PB on NV.PHG = PB.Ma_PB
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN;

--7
select NV.Ho_NV, NV.Ten_NV, NV.Luong, DA.TEN_DUAN
from NHAN_VIEN NV
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN;

--8
select NV.Ten_NV, NV.Luong, DA.TEN_DUAN
from NHAN_VIEN NV
inner join PHonG_BAN PB on NV.PHG = PB.Ma_PB
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN
where PB.Ten_PB = N'Thiet Ke';

--9
select NV.Ho_NV, NV.Ten_NV, NV.Luong, DA.TEN_DUAN
from NHAN_VIEN NV
inner join PHonG_BAN PB on NV.PHG = PB.Ma_PB
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN
where PB.Ten_PB = N'Thiet Ke' AND DA.NGAY_BATDAU = '2016-01-01';

--10
select NV.Ho_NV, NV.Ten_NV, NV.Luong, DA.TEN_DUAN
from NHAN_VIEN NV
inner join QUANLY_DUAN QLDA on NV.ID_NhanVien = QLDA.Ma_NHANVIEN
inner join DU_AN DA on QLDA.Ma_DUAN = DA.MA_DUAN
where datediff(year, NV.NamSinh, getdate()) > 50;