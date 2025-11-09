use BAITAP1
--1. all nhan vien
select all * from NHAN_VIEN
--2. ho, ten, luong
select Ho_NV from NHAN_VIEN
--3. ten, ma phong
select Ten_NV, PHG from NHAN_VIEN
--4. ten phong, ma tp
select Ten_PB, Ma_Truong_Phong from Phong_Ban
--5. all phong ban
select all * from PHONG_BAN
--6. du an
select TEN_DUAN, NGAY_BATDAU, NGAY_KETTHUC from DU_AN
--7. top 5 nv
select top 2 * from NHAN_VIEN
--8. top 10% nv
select top 10 percent * from NHAN_VIEN
--9. luong >= 800
select Ho_NV, Ten_NV from NHAN_VIEN
where Luong > 800
--10. 800 <= Luong <= 1000
select Ten_NV from NHAN_VIEN
where Luong between 800 and 1000
--11. ttin du an bdau tu ngay 01/01/2017
select all * from DU_AN
where NGAY_BATDAU = '01/01/2017';
--12. PB co chua "sanxuat"
select Ma_PB from PHONG_BAN
where Ten_PB = 'San xuat%';
--13. ttin nv luong < 800 and "PB002"
select Ho_NV, Ten_NV, Luong from NHAN_VIEN
where Luong < 800 and PHG = '%PB002';

--noi ho va ten, luong
select Ho_NV + Ten_NV as Ho_Ten_NV, Luong
from NHAN_VIEN

--add nv4
insert into NHAN_VIEN values (4,'Nguyen', 'An','1/1/1980','12 TVB',1,3200,'PB001')

--chon nv luong 800 - 1000
--c1
--c2

--ten nv co ho bdau bang N
select Ten_NV from NHAN_VIEN
where Ho_NV like 'N'


select * from NHAN_VIEN
select max(Luong) from NHAN_VIEN
select min(Luong) from NHAN_VIEN
select avg(Luong) as TBL from NHAN_VIEN

select * from QUANLY_DUAN
select count(MA_DUAN) as SO_DUAN from QUANLY_DUAN
where NGAY_KET_THUC = '2016-12-31'

select PHG, avg(luong) as TBL from NHAN_VIEN
group by PHG
--dem nv tung phong
Select PHG,count(ID_NhanVien) sonv from NHAN_VIEN
group by PHG
-- so nv theo du an
select Ma_DUAN,count(Ma_NhanVien) sonv from QUANLY_DUAN
group by Ma_DUAN
-- ma du an co tren 2 nv
select Ma_DUAN,count(Ma_NhanVien) sonv
from QUANLY_DUAN
group by Ma_DUAN
having count(Ma_NhanVien)>=2