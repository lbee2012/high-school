create database QLHS
use QLHS

create table SV (
MaSV nchar(10) primary key not null,
Ho nchar(10) not null,
Ten nchar(25) not null,
TenLop nchar(10) not null
)

insert into SV values
('345', N'Bùi', N'Lan', 'CN02'),
('873', N'Vũ', N'Nam', 'CN01'),
('693', N'Trần', N'Minh', 'CN02'),
--2
('212', N'Hoàng', N'Long', 'CN01'),
('310', N'Khánh', N'Minh', 'CN01');

--kcj
select * from SV
delete from SV

--3
update SV
set TenLop = 'CN02'
where MaSV = '873'
--4
delete from SV
where Ho = N'Bùi'
--5
alter table SV
add DIEM int


alter table SV
add constraint KT_Diem CHECK (DIEM between 0 and 10)
--6
alter table SV
alter column TenLop nchar(20)
--7
--a
select * from SV
where TenLop = 'CN02'
--b
select * from SV
--c
select Ho, Ten from SV
where TenLop = 'CN02'
--d
select count(*) as SoSV from SV
group by TenLop
--e
select TenLop from SV
group by TenLop
having count(*) >= 2