create database BAITAP1;
Use BAITAP1;

select * from PHONG_BAN
select * from NHAN_VIEN
select * from DU_AN
select * from QUANLY_DUAN

select Ten_PB, Ten_NV from PHONG_BAN, NHAN_VIEN
where PHONG_BAN.Ma_PB = NHAN_VIEN.PHG

select DU_AN.TEN_DUAN, NHAN_VIEN.Ho_NV, NHAN_VIEN.Ten_NV, QUANLY_DUAN.NGAY_THAM_GIA, QUANLY_DUAN.NGAY_KET_THUC
from DU_AN, NHAN_VIEN, QUANLY_DUAN
where(DU_AN.MA_DUAN = QUANLY_DUAN.MA_DUAN) and (NHAN_VIEN.ID_NhanVien = QUANLY_DUAN.MA_NHANVIEN)
order by Ten_NV, NGAY_KET_THUC


--baitap
--1
select TEN_DUAN from DU_AN
where NGAY_BATDAU = '2017'

--2
select Ten_PB, Ten_NV from PHONG_BAN P, NHAN_VIEN N
where (P.Ma_PB = N.PHG) and P.Ten_PB like 'P%'

--3

--4
select Ten_NV, TEN_DUAN from NHAN_VIEN N, DU_AN D, QUANLY_DUAN QL
where TEN_DUAN like 'T%'


select * from PHONG_BAN
select * from NHAN_VIEN
select * from DU_AN
select * from QUANLY_DUAN

--baitap
--1
select Ten_NV, Ten_PB, TEN_DUAN from NHAN_VIEN N, PHONG_BAN P, DU_AN D, QUANLY_DUAN Q
where (N.ID_NhanVien = Q.MA_NHANVIEN) and (Q.MA_DUAN = D.MA_DUAN) and (N.PHG = P.Ma_PB)
--2
select Ho_NV, Ten_NV, Luong, TEN_DUAN from NHAN_VIEN N, DU_AN D, QUANLY_DUAN Q
where (D.MA_DUAN = Q.MA_DUAN) and (Q.MA_NHANVIEN = N.ID_NhanVien)
--3
--4
--5

--vd inner join
select Ten_PB, Ten_NV from PHONG_BAN P, NHAN_VIEN N
where P.Ma_PB = N.PHG

select Ten_PB, Ten_NV from PHONG_BAN P inner join NHAN_VIEN N on P.Ma_PB = N.PHG
--31.7
SELECT * FROM NHAN_VIEN
SELECT * FROM PHONG_BAN
--left
SELECT B.ID_NhanVien, B.Ho_NV, B.Ten_NV, A.Ten_PB
FROM PHONG_BAN A LEFT JOIN NHAN_VIEN B ON A.Ma_PB = B.PHG;
--right
SELECT B.ID_NhanVien, B.Ho_NV, B.Ten_NV, A.Ten_PB, A.Ma_PB, B.PHG
FROM PHONG_BAN A RIGHT JOIN NHAN_VIEN B ON A.Ma_PB = B.PHG
--full
SELECT B.ID_NhanVien, B.Ho_NV, B.Ten_NV, A.Ten_PB, A.Ma_PB, B.PHG
FROM PHONG_BAN A FULL JOIN NHAN_VIEN B ON A.Ma_PB = B.PHG
--in
SELECT * FROM NHAN_VIEN
where PHG.IN (select Ma_PB from PHONG_BAN where Ten_PB like 'San xuat%')
--any
select * FROM NHAN_VIEN
where LUONG > ANY (select Luong FROM NHAN_VIEN where PHG like 'PB002')
--exists
select * from NHAN_VIEN
where Exists (select * from PHONG_BAN where NHAN_VIEN.PHG = PHONG_BAN.Ma_PB)
