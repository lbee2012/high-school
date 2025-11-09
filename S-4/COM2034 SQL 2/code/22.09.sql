create database sql2209
use sql2209
go

create table mon_hoc (
    id nvarchar(100) not null,
    ten_mon nvarchar(100),
    ma_mon nvarchar(100),
    trang_thai nvarchar(100),

    primary key (id)
)
create table nganh_hoc (
    id nvarchar(100) not null,
    ten_nganh nvarchar(100),
    ma_nganh nvarchar(100),
    trang_thai nvarchar(100),

    primary key (id)
)
create table lop (
    id nvarchar(100) not null,
    ten_lop nvarchar(100),
    ma_lop nvarchar(100),
    trang_thai nvarchar(100),
    nganh_hoc nvarchar(100),

    primary key (id),
    foreign key (nganh_hoc) references nganh_hoc(id)
)
create table sinh_vien (
    id nvarchar(100) not null,
    ho_ten nvarchar(100),
    dia_chi nvarchar(100),
    nam_sinh int,
    lop nvarchar(100),
    trang_thai nvarchar(100),

    primary key (id),
    foreign key (lop) references lop(id)
)
create table diem (
    ma_sinh_vien nvarchar(100) not null,
    mon_hoc nvarchar(100) not null,
    diem float

    primary key (ma_sinh_vien, mon_hoc),
    foreign key (ma_sinh_vien) references sinh_vien(id),
    foreign key (mon_hoc) references mon_hoc(id)
)
go

insert into mon_hoc values 
('MH01', 'Toan cao cap', 'MTH101', 'Hoat dong'),
('MH02', 'Vat ly dai cuong', 'PHY101', 'Hoat dong'),
('MH03', 'Hoa hoc dai cuong', 'CHE101', 'Hoat dong')
insert into nganh_hoc values 
('NH01', 'Cong nghe thong tin', 'CNTT01', 'Hoat dong'),
('NH02', 'Co khi', 'CK01', 'Hoat dong'),
('NH03', 'Dien tu vien thong', 'DTVT01', 'Hoat dong')
insert into lop values 
('L01', 'Lop 01', 'L01', 'Hoat dong', 'NH01'),
('L02', 'Lop 02', 'L02', 'Hoat dong', 'NH02'),
('L03', 'Lop 03', 'L03', 'Hoat dong', 'NH03')
insert into sinh_vien values 
('SV01', 'Nguyen Van A', 'Ha Noi', 2000, 'L01', 'Hoat dong'),
('SV02', 'Tran Thi B', 'Hai Phong', 1999, 'L02', 'Hoat dong'),
('SV03', 'Le Van C', 'Da Nang', 2001, 'L03', 'Hoat dong')
insert into diem values 
('SV01', 'MH01', 8.5),
('SV02', 'MH02', 7.0),
('SV03', 'MH03', 6.5)
go

select * from mon_hoc
select * from nganh_hoc
select * from lop
select * from sinh_vien
select * from diem

--1
insert into sinh_vien values
('SV04', 'Pham Van D', 'Thanh pho Ho Chi Minh', 2002, 'L01', 'Hoat dong')

--2
delete from diem
where mon_hoc = 'MH02';
delete from mon_hoc
where id = 'MH02';

--3
update sinh_vien
set trang_thai = 'Tam dung'
where id = 'SV03'

--4
select l.ten_lop, count(sv.id) as si_so
from lop l
join sinh_vien sv on l.id = sv.lop
group by l.ten_lop

--5
select nh.ten_nganh, count(sv.id) as so_luong_sinh_vien
from nganh_hoc nh
join lop l on nh.id = l.nganh_hoc
join sinh_vien sv on l.id = sv.lop
group by nh.ten_nganh

--6
select sv.id, sv.ho_ten, sv.nam_sinh, l.ten_lop
from lop l
join sinh_vien sv on l.id = sv.lop
where l.ma_lop = 'L01'

--7
select  d.ma_sinh_vien, d.diem, mh.ten_mon, mh.ma_mon
from mon_hoc mh
join diem d on mh.id = d.mon_hoc

--8
select top 1 l.ma_lop, l.ten_lop, avg(d.diem) as diem_trung_binh
from lop l
join sinh_vien sv on l.id = sv.lop
join diem d on sv.id = d.ma_sinh_vien
group by l.ma_lop
order by l.ma_lop desc

--9




