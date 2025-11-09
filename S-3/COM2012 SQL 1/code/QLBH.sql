create database QLBH
use QLBH

drop table [HoaDonChiTiet]
drop table [HoaDon]
drop table [SanPham]
drop table [KhachHang]

create table [KhachHang]
(
    [maKhachHang] Char(5) NOT NULL,
    [hoVaTenLot] nChar(50) NULL,
    [Ten] Char(50) NULL,
    [diaChi] nChar(255) NULL,
    [Email] Char(50) NULL,
    [dienThoai] Char(13) NULL,
primary Key ([maKhachHang])
)
insert into KhachHang values
('01',N'Nguyễn Thị',N'Sao',N'Hà nội','abc@abc','091211111101'),
('07',N'Nguyễn Thị',N'Sao',N'Đà nẵng','abc@abc','091211111101'),
('02',N'Nguyễn Văn',N'Tân',N'Hà nội','csd@abc','091211111134'),
('03',N'Đỗ Thu',N'Mai',N'Hà nội','xyz@abc','098711111101')

create table [SanPham]
(
    [maSanPham] Integer NOT NULL,
    [moTa] Char(255) NULL,
    [soLuong] Integer NULL,
    [donGia] Money NULL,
    [tenSP] Char(50) NULL,
primary Key ([maSanPham])
)
insert into SanPham values
(1,'dien thoai Iphone 3 32GB',100,20000,'Iphone 7 32GB'),
(3,'dien thoai Iphone 7 32GB',100,20000,'Iphone 7 32GB'),
--(12,'dien thoai Iphone X 32GB',100,20000,'Iphone 7 32GB'),
(21,'Sach co ban',200,30000,'Toan'),
(31,'Sach ngoai ngu',30,50000,'Anh van')

create table [HoaDon]
(
    [maHoaDon] Integer NOT NULL,
    [maKhachHang] Char(5) NOT NULL,
    [ngayMuaHang] Datetime NULL,
    [trangThai] Char(30) NULL,
primary Key ([maHoaDon])
)
insert into HoaDon values
(6,'07','10-12-2016','Da thanh toan'),
(2,'01','1-10-2022','Dang giao'),
(3,'03','10-1-2022','Cho duyet')

create table [HoaDonChiTiet]
(
    [maHoaDon] Integer NOT NULL,
    [maSanPham] Integer NOT NULL,
    [soLuong] Integer NULL,
    [maHoaDonChiTiet] Integer NOT NULL,
primary Key ([maHoaDonChiTiet])
)
insert into HoaDonChiTiet values
(10,21,10,111),
(6,12,10,66),
(6,3,5,7),
(6,1,20,8),
(6,3,5,9),
(3,1,20,33)

--lab6
select * from KhachHang
select * from SanPham
select * from HoaDon
select * from HoaDonChiTiet

--bai1
--a
select H.maHoaDon, H.maKhachHang, H.ngayMuaHang, H.trangThai, HC.maSanPham, HC.soLuong
from HoaDon H
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
--b
select H.maHoaDon, H.maKhachHang, H.ngayMuaHang, H.trangThai, HC.maSanPham, HC.soLuong
from HoaDon H
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon 
where maKhachHang = '01'
--c
select H.maHoaDon, H.ngayMuaHang, S.tenSP, S.donGia, HC.soLuong, (S.donGia * HC.soLuong) as thanhTien
from HoaDon H
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
--d
select (K.hoVaTenLot + ' ' + K.Ten) as hoTen, K.Email, K.dienThoai, H.maHoaDon, H.trangThai, sum(S.donGia * HC.soLuong) as tongTien
from KhachHang K
join HoaDon H on K.maKhachHang = H.maKhachHang
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
where H.trangThai not like 'Da thanh toan'
group by K.hoVaTenLot, K.Ten, K.Email, K.dienThoai, H.maHoaDon, H.trangThai
--e
select H.maHoaDon, H.ngayMuaHang, sum(S.donGia * HC.soLuong) as tongTien
from HoaDon H
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
group by H.maHoaDon, H.ngayMuaHang
having sum(S.donGia * HC.soLuong) >= 500000
order by tongTien desc

select * from KhachHang
select * from SanPham
select * from HoaDon
select * from HoaDonChiTiet

--bai2
--a
select K.maKhachHang, (K.hoVaTenLot + ' ' + K.Ten) as hoTen
from KhachHang K
left join HoaDon H on K.maKhachHang = H.maKhachHang
and H.ngayMuaHang >= '2016-01-01'
where H.ngayMuaHang is null
--b
select S.maSanPham, S.tenSP, HC.soLuong
from HoaDon H
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
where H.ngayMuaHang >= '2016-12-01'
and H.ngayMuaHang < '2017-01-01'
group by S.maSanPham, S.tenSP, HC.soLuong
order by HC.soLuong desc
--c
select top 5 K.maKhachHang, (K.hoVaTenLot + ' ' + K.Ten) as hoTen, sum(S.donGia * HC.soLuong) as tongTien
from KhachHang K
join HoaDon H on K.maKhachHang = H.maKhachHang
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
where H.ngayMuaHang >= '2016-01-01'
and H.ngayMuaHang < '2017-01-01'
group by K.maKhachHang, K.hoVaTenLot, K.Ten
order by tongTien desc
--d
select S.tenSP, HC.soLuong
from KhachHang K
join HoaDon H on K.maKhachHang = H.maKhachHang
join HoaDonChiTiet HC on H.maHoaDon = HC.maHoaDon
join SanPham S on HC.maSanPham = S.maSanPham
where K.diaChi = N'Đà nẵng'
and S.tenSP = N'Iphone 7 32GB'
and H.ngayMuaHang >= '2016-12-01'
and H.ngayMuaHang < '2017-01-01'
--e

--lab7
select * from KhachHang
select * from SanPham
select * from HoaDon
select * from HoaDonChiTiet

--bai1
insert into KhachHang values
('KH001',N'Nguyễn Thị',N'Nga',N'15 Quang Trung TP Đà Nẵng','ngant@gamil.com','0912345670'),
('KH002',N'Trần Công',N'Thành',N'234 Lê Lợi Quảng Nam','thanhtc@gmail.com','16109423443'),
('KH003',N'Lê Hoàng',N'Nam',N'23 Trần Phú TP Huế','namlt@yahoo.com','0989354556'),
('KH004',N'Vũ Ngọc',N'Hiền',N'37 Nguyễn Thị Thập TP Đà Nẵng','hienvn@gmail.com','0894545435')

insert into SanPham values
(1,'Samsung Galaxy J7 Pro là một chiếc smartphone phù hợp với những người yêu thích một sản phẩm pin tốt, thích hệ điều hành mới cùng những tính năng đi kèm độc quyền',800,6600000,'Samsung Galaxy J7 Pro'),
(2,'iPhone 6 là một trong những smartphone được yêu thích nhất. Lắng nghe nhu cầu về thiết kế, khả năng lưu trữ và giá cả, iPhone 6 32GB được chính thức phân phối chính hãng tại Việt Nam hứa hẹn sẽ là một sản phẩm rất "Hot"',500,8990000,'iphone 6 32GB'),
(3,'Dell Inspiron 3467 i3 7100U/4GB/1TB/Win10/(M20NR21)',507,11290000,'Laptop Dell Inspiron 3467'),
(4,'Pin sạc dự phòng Polymer 5.000mAh eSaver JP85',600,200000,'Pin sạc dự phòng'),
(5,'Nokia 3100 phù hợp với SINH VIÊN',700000,50000,'Nokia 3100')

insert into HoaDon ([maKhachHang], [maHoaDon], [ngayMuaHang], [trangThai]) values
('KH001',120954,'03-23-2016',N'Đã thanh toán'),
('KH002',120955,'03-23-2016',N'Đã thanh toán'),
('KH003',120956,'03-23-2016',N'chưa thanh toán'),
('KH004',125957,'03-23-2016',N'chưa thanh toán')

insert into HoaDonChiTiet ([MaHoaDonChiTiet], [maHoaDon], [maSanPham], [soLuong]) values
(1,120954,3,40),
(2,120954,1,20),
(3,120955,2,100),
(4,120956,4,6),
(5,120956,2,60),
(6,120956,1,10),
(7,120956,2,50)

select * from KhachHang
select * from SanPham
select * from HoaDon
select * from HoaDonChiTiet

--lab8
--bai1
--a
create unique index idx_kh_dienthoai
on KhachHang(dienThoai);

--b
create unique index idx_kh_email
on KhachHang(Email);

--bai2
--a

--b

--SQL Server:

--backup:
backup database QLBH
to disk = 'C:\User\QLBH.bak'
with format;

--export:
select *
into QLBHExport
from KhachHang;