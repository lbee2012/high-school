create database n1310
use n1310
go
create table SanPham (
    MaSanPham int primary key,
    TenSanPham varchar(100),
    SoLuong int,
    GiaBan decimal(10,2)
)
create table GioHang (
    MaGioHang int primary key,
    NguoiMua varchar(100),
    NgayMua date
)
create table ChiTietGioHang (
    MaGioHang int,
    MaSanPham int,
    SoLuongMua int,
    foreign key (MaGioHang) references GioHang(MaGioHang),
    foreign key (MaSanPham) references SanPham(MaSanPham)
)
go
insert into SanPham values
(1, 'Dien Thoai', 50, 10000000),
(2, 'Laptop', 30, 20000000),
(3, 'Tai Nghe', 100, 500000)
insert into GioHang values
(1, 'Nguyen Van A', '2024-10-10'),
(2, 'Le Thi B', '2024-10-11'),
(3, 'Tran Van C', '2024-10-12')
insert into ChiTietGioHang values
(1, 1, 3), 
(2, 2, 2), 
(3, 3, 5)
go
select * from SanPham
select * from GioHang
select * from ChiTietGioHang