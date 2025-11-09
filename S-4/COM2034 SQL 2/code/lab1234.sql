create database lab1234
use lab1234

--1 2 3
create table khach_hang (
	ma_khach_hang nvarchar(100) not null,
	ten_khach_hang nvarchar(100),
	nam_sinh date,
	dia_chi nvarchar(100),
	gioi_tinh nvarchar(100),

	primary key (ma_khach_hang)
)
create table hoa_don (
	ma_hoa_don nvarchar(100) not null,
	khach_hang nvarchar(100),
	dia_chi nvarchar(100),
	trang_thai nvarchar(100),
    tong_tien float,
    khuyen_mai float,

	primary key (ma_hoa_don),
    foreign key (khach_hang) references khach_hang(ma_khach_hang)
)
create table san_pham (
    ma_san_pham nvarchar(100) not null,
    ten_san_pham nvarchar(100),
    gia_ban float,
    danh_muc nvarchar(100),
    trang_thai nvarchar(100),

    primary key (ma_san_pham)
)
create table hoa_don_chi_tiet (
    id nvarchar(100) not null,
    hoa_don nvarchar(100),
    san_pham nvarchar(100),
    so_luong int,
    gia_ban float,

    primary key (id),
    foreign key (hoa_don) references hoa_don(ma_hoa_don),
    foreign key (san_pham) references san_pham(ma_san_pham)
)

insert into khach_hang values
('KH001', 'Nguyen Van A', '1985-01-15', 'Ha Noi', 'Nam'),
('KH002', 'Tran Thi B', '1990-05-20', 'Ho Chi Minh', 'Nu'),
('KH003', 'Le Van C', '1988-03-10', 'Da Nang', 'Nam'),
('KH004', 'Pham Thi D', '1995-07-12', 'Hai Phong', 'Nu'),
('KH005', 'Do Van E', '1982-02-25', 'Ha Noi', 'Nam'),
('KH006', 'Nguyen Thi F', '1993-08-30', 'Ho Chi Minh', 'Nu'),
('KH007', 'Bui Van G', '1991-11-22', 'Da Nang', 'Nam'),
('KH008', 'Hoang Thi H', '1989-12-05', 'Hai Phong', 'Nu'),
('KH009', 'Phan Van I', '1986-09-09', 'Ha Noi', 'Nam'),
('KH010', 'Vu Thi J', '1992-04-18', 'Ho Chi Minh', 'Nu')

insert into hoa_don values 
('HD001', 'KH001', 'Ha Noi', 'Da Thanh Toan', 1000000, 100000),
('HD002', 'KH002', 'Ho Chi Minh', 'Chua Thanh Toan', 2000000, 150000),
('HD003', 'KH003', 'Da Nang', 'Da Thanh Toan', 1500000, 50000),
('HD004', 'KH004', 'Hai Phong', 'Chua Thanh Toan', 3000000, 200000),
('HD005', 'KH005', 'Ha Noi', 'Da Thanh Toan', 1200000, 100000),
('HD006', 'KH006', 'Ho Chi Minh', 'Da Thanh Toan', 1700000, 50000),
('HD007', 'KH007', 'Da Nang', 'Chua Thanh Toan', 2500000, 150000),
('HD008', 'KH008', 'Hai Phong', 'Da Thanh Toan', 2200000, 200000),
('HD009', 'KH009', 'Ha Noi', 'Chua Thanh Toan', 1300000, 100000),
('HD010', 'KH010', 'Ho Chi Minh', 'Da Thanh Toan', 1400000, 50000)

insert into san_pham values 
('SP001', 'San Pham A', 200000, 'Dien Tu', 'Con Hang'),
('SP002', 'San Pham B', 300000, 'Dien Tu', 'Con Hang'),
('SP003', 'San Pham C', 250000, 'Gia Dung', 'Het Hang'),
('SP004', 'San Pham D', 150000, 'Thoi Trang', 'Con Hang'),
('SP005', 'San Pham E', 500000, 'Dien Tu', 'Con Hang'),
('SP006', 'San Pham F', 450000, 'Gia Dung', 'Het Hang'),
('SP007', 'San Pham G', 600000, 'Thoi Trang', 'Con Hang'),
('SP008', 'San Pham H', 700000, 'Dien Tu', 'Con Hang'),
('SP009', 'San Pham I', 350000, 'Gia Dung', 'Con Hang'),
('SP010', 'San Pham J', 800000, 'Thoi Trang', 'Con Hang')

insert into hoa_don_chi_tiet values 
('CT001', 'HD001', 'SP001', 2, 200000),
('CT002', 'HD002', 'SP002', 3, 300000),
('CT003', 'HD003', 'SP003', 1, 250000),
('CT004', 'HD004', 'SP004', 2, 150000),
('CT005', 'HD005', 'SP005', 1, 500000),
('CT006', 'HD006', 'SP006', 4, 450000),
('CT007', 'HD007', 'SP007', 1, 600000),
('CT008', 'HD008', 'SP008', 2, 700000),
('CT009', 'HD009', 'SP009', 3, 350000),
('CT010', 'HD010', 'SP010', 1, 800000)

--4
alter table hoa_don
add ngay_tao date
set ngay_tao 

--5
alter table san_pham
drop column trang_thai

--6
alter table san_pham
alter column gia_ban float

--7 8 9 10
--1
select top 1 sp.ten_san_pham, sum(hdct.so_luong) as so_luong_ban_duoc
from san_pham sp
join hoa_don_chi_tiet hdct on sp.ma_san_pham = hdct.san_pham
group by sp.ten_san_pham
order by so_luong_ban_duoc desc

--2
select top 1 ma_hoa_don, tong_tien, ngay_tao
from hoa_don
where ngay_tao = '2024-01-01'
order by tong_tien desc

--3
select kh.ma_khach_hang, kh.ten_khach_hang, sp.ten_san_pham, sp.danh_muc, hdct.gia_ban
from khach_hang kh
join hoa_don hd on kh.ma_khach_hang = hd.khach_hang
join hoa_don_chi_tiet hdct on hd.ma_hoa_don = hdct.hoa_don
join san_pham sp on hdct.san_pham = sp.ma_san_pham

--4
select ngay_tao, sum(tong_tien) as doanh_thu
from hoa_don
group by ngay_tao
order by ngay_tao

drop table khach_hang
drop table hoa_don
drop table san_pham
drop table hoa_don_chi_tiet