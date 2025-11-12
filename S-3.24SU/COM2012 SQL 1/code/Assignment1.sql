--tạo
create database TH03115_COM2012_ASS1;
use TH03115_COM2012_ASS1;
--bảng
create table SINHVIEN (
MASV nchar(10) not null,
HO nchar(10) not null,
TEN nchar (20) not null,
NAMSINH date not null,
GT smallint not null,
QUE nchar(20) null,
MALOP nchar(10) not null,
MAMH nchar(10) not null,
TENMH nchar(20) not null,
DIEM float not null
primary key (MASV, MAMH)
)
--10 bản
insert into SINHVIEN values
('TH03115', N'Hoàng', N'Quý Long', '2007-12-20', 1, N'Nam Định', N'SD1803', N'COM2012', N'Python', 9.5),
('TH03032', N'Nguyễn', N'Khánh Minh', '2007-10-30', 1, N'Bắc Ninh', N'SD1803', N'COM2012', N'C++', 9.0),
('TH02882', N'Tạ', N'Quang Thế Đan', '2007-01-01', 1, N'Bắc Giang', N'SD1804', N'COM2012', N'SQL', 8.5),
('TH03066', N'Phạm', N'Hà Anh', '2007-12-25', 0, N'Thái Bình', N'SD1804', N'COM2012', N'Python', 8.0),
('TH02567', N'Nguyễn', N'Tiến Thành', '2007-03-04', 1, N'Hải Phòng', N'SD1805', N'COM2012', N'Java Script', 8.5),
('TH02862', N'Trần', N'Hải Nam', '2007-12-20', 1, N'America', N'SD1805', N'COM2012', N'Java Script', 9.5),
('TH00027', N'Phạm', N'Quỳnh Trang', '2007-12-20', 0, N'Thái Nguyên', N'SD1807', N'COM2012', N'C++', 8.0),
('TH03937', N'Vũ', N'Thành Hải Phong', '2007-12-20', 1, N'Sơn La', N'SD1807', N'COM2012', N'SQL', 8.5),
('TH05678', N'Đỗ', N'Trọng Kiên', '2007-11-11', 1, N'Los Angles', N'SD1808', N'COM2012', N'Java', 9.0),
('TH06789', N'Đỗ', N'Trung Kiên', '2007-11-11', 1, N'California', N'SD1808', N'COM2012', N'Java', 9.0);

--a
select * from SINHVIEN
--b
select HO, TEN, TENMH, DIEM from SINHVIEN
--c
select TEN, MALOP from SINHVIEN
--d
select top 3 * from SINHVIEN
--e
select HO, TEN, TENMH from SINHVIEN
where DIEM between 7 and 9
--f
select MAMH from SINHVIEN
where MAMH like 'COM%'
--g
select TEN, MALOP, year(getdate()) - year(NAMSINH) as TUOI from SINHVIEN
--h
select distinct TENMH from SINHVIEN
where DIEM >= 9
--i
select * from SINHVIEN
where MALOP = N'SD1808' and MAMH = N'COM2012' and DIEM >= 8
--j
select distinct TENMH, count(*) as SOSV from SINHVIEN
group by TENMH 

DELETE FROM SINHVIEN;