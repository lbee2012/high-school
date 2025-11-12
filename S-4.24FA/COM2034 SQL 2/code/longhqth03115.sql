--1
create database lab5678
use lab5678
--san pham
create table san_pham (
	id nvarchar(100) not null,
    ten_san_pham nvarchar(100),
    ma_san_pham nvarchar(100),
    trang_thai nvarchar(100),

    primary key (id)
)
--san pham chi tiet
create table san_pham_chi_tiet (
    id nvarchar(100) not null,
    ten_san_pham_chi_tiet nvarchar(100),
    mau_sac nvarchar(100),
    size nvarchar(100),
    so_luong int,
    san_pham nvarchar(100),
    gia_ban float,

    primary key (id),
    foreign key (san_pham) references san_pham(id)
)
--khach hang
create table khach_hang (
    id nvarchar(100) not null,
    ten_khach_hang nvarchar(100),
    sdt nvarchar(100),
    trang_thai nvarchar(100),

    primary key (id)
)
--hoa don
create table hoa_don (
    id nvarchar(100) not null,
    ma_hoa_don nvarchar(100),
    khach_hang nvarchar(100),
    trang_thai nvarchar(100),
    ngay_tao date,

    primary key (id),
    foreign key (khach_hang) references khach_hang(id)
)
--hoa don chi tiet
create table hoa_don_chi_tiet (
    id_san_pham_chi_tiet nvarchar(100) not null,
    id_hoa_don nvarchar(100) not null,
    so_luong int,
    gia_ban float,

    primary key (id_san_pham_chi_tiet, id_hoa_don),
    foreign key (id_san_pham_chi_tiet) references san_pham_chi_tiet(id),
    foreign key (id_hoa_don) references hoa_don(id),
)
go
--2 insert moi bang 5 ban ghi
insert into san_pham values
('01','Chuot','G102','Het hang'),
('02','Chuot','G203','Con hang'),
('03','Chuot','G304','Con hang'),
('04','Ban phim','G601','Het hang'),
('05','Ban phim','G901','Con hang')
insert into san_pham_chi_tiet values
('01','Chuot Logitech','Den','Be',0,'01',350000),
('02','Chuot Logitech','Tim','Be',6,'02',400000),
('03','Chuot Logitech','Trang','Be',3,'03',750000),
('04','Ban phim Logitech','Den','Be',0,'04',600000),
('05','Ban phim Logitech','Den','Be',10,'05',2500000)
insert into khach_hang values
('10','Hoang Quoc Long','0947448325','Buon'),
('02','Nguyen Khanh Minh','0961319231','Buon'),
('03','Pham Ha Anh','0987654321','Vui'),
('04','Ta Quang The Dan','0123456789','Vui'),
('05','Duong Gia Minh','0965616580','Khong cam xuc Ho Quang Hieu')
insert into hoa_don values
('01','HD01','10','Chua thanh toan','2024-01-01'),
('02','HD02','02','Chua thanh toan','2024-01-02'),
('03','HD03','03','Da thanh toan','2024-01-01'),
('04','HD04','04','Da thanh toan','2024-01-02'),
('05','HD05','05','Khong ro','2024-01-03')
insert into hoa_don_chi_tiet values
('01','01',0,0),
('02','02',2,800000),
('03','03',1,750000),
('04','04',0,0),
('05','05',4,10000000)
go
select * from san_pham
select * from san_pham_chi_tiet
select * from khach_hang
select * from hoa_don
select * from hoa_don_chi_tiet
go
--3 cap nhat ten kh co id = 10
update khach_hang
set ten_khach_hang = 'Hoang Quy Long'
where id = '10'

--4 hien thi thong tin hoa don + ten kh
select kh.id, kh.ten_khach_hang, hd.ma_hoa_don, hd.ngay_tao, hd.trang_thai
from hoa_don hd
join khach_hang kh on hd.khach_hang = kh.id

--5 hien thi hoa don co gia tri lon nhat trong ngay bat ki


--6 hien thi thong tin san pham ban duoc nhieu nhat
select top 1 count(hdct.so_luong) as so_luong_ban_duoc 
from san_pham sp
join san_pham_chi_tiet spct on sp.id = spct.san_pham
join hoa_don_chi_tiet hdct on spct.id = hdct.id_san_pham_chi_tiet

--7 hien thi so luong cua tung san pham
select sp.id, spct.ten_san_pham_chi_tiet, sp.ma_san_pham, (spct.so_luong - hdct.so_luong) as so_luong_ton
from san_pham sp
join san_pham_chi_tiet spct on sp.id = spct.san_pham
join hoa_don_chi_tiet hdct on spct.id = hdct.id_san_pham_chi_tiet

drop table san_pham
drop table san_pham_chi_tiet
drop table khach_hang
drop table hoa_don
drop table hoa_don_chi_tiet