--use tuktuk drop database th031159
create database th031159
go
use th031159
go



create table GiangVien (
    MaGiangVien int not null primary key,
    TenGiangVien nvarchar(100) not null,
    Email nvarchar(100),
    SoDienThoai nvarchar(100) not null,
)
go
create table NhomDATN (
    MaNhom int not null primary key,
    TenDeTai nvarchar(100) not null,
    SoLuongThanhVien int not null,
    HocKy int not null,
)
go
create table PhanCongHuongDan (
    MaGiangVien int not null,
    MaNhom int not null,
    NgayNop date not null,
    GhiChu nvarchar(100),

    primary key (MaGiangVien, MaNhom),
    foreign key (MaGiangVien) references GiangVien(MaGiangVien),
    foreign key (MaNhom) references NhomDATN(MaNhom)
)
go



create proc AddGiangVien 
    @MaGiangVien int,
    @TenGiangVien nvarchar(100),
    @Email nvarchar(100),
    @SoDienThoai nvarchar(100)
as
begin
    if (@MaGiangVien is null or @TenGiangVien is null or @SoDienThoai is null)
        print 'Vui long khong de trong thong tin'
    else if exists (select 1 from GiangVien where MaGiangVien = @MaGiangVien)
        print 'Ma giang vien da ton tai'
    else
    begin
        insert into GiangVien
        values (@MaGiangVien, @TenGiangVien, @Email, @SoDienThoai)
    end
end
go
exec AddGiangVien 1, 'GV1', 'gv1@fpt.edu.vn', '0999999991'
go
exec AddGiangVien 2, 'GV2', 'gv2@fpt.edu.vn', '0999999992'
go
exec AddGiangVien 3, 'GV3', 'gv3@fpt.edu.vn', '0999999993'
go



create proc AddNhomDATN 
    @MaNhom int,
    @TenDeTai nvarchar(100),
    @SoLuongThanhVien int,
    @HocKy int
as
begin
    if (@MaNhom is null or @TenDeTai is null or @SoLuongThanhVien is null or @HocKy is null)
        print 'Vui long khong de trong thong tin'
    else if exists (select 1 from NhomDATN where MaNhom = @MaNhom)
        print 'Ma nhom DATN da ton tai'
    else
    begin
        insert into NhomDATN
        values (@MaNhom, @TenDeTai, @SoLuongThanhVien, @HocKy)
    end
end
go
exec AddNhomDATN 1, 'DT1', 10, 1
go
exec AddNhomDATN 2, 'DT2', 20, 2
go
exec AddNhomDATN 3, 'DT3', 30, 3
go


create proc AddPhanCongHuongDan 
    @MaGiangVien int,
    @MaNhom int,
    @NgayNop date,
    @GhiChu nvarchar(100)
as
begin
    if (@MaGiangVien is null or @MaNhom is null or @NgayNop is null)
        print 'Vui long khong de trong thong tin'
    else if exists (select 1 from PhanCongHuongDan where MaGiangVien = @MaGiangVien)
        print 'Ma giang vien da ton tai'
    else if exists (select 1 from PhanCongHuongDan where MaNhom = @MaNhom)
        print 'Ma nhom DATN da ton tai'
    else
    begin
        insert into PhanCongHuongDan
        values (@MaGiangVien, @MaNhom, @NgayNop, @GhiChu)
    end
end
go
exec AddPhanCongHuongDan 1, 1, '2024-01-01', 'mot'
go
exec AddPhanCongHuongDan 2, 2, '2024-02-02', 'hai'
go
exec AddPhanCongHuongDan 3, 3, '2024-03-03', 'ba'
go



select * from GiangVien
select * from NhomDATN
select * from PhanCongHuongDan
go



create view V_NhomDATN as
select 
    n.MaNhom, 
    n.TenDeTai, 
    n.SoLuongThanhVien, 
    ((n.SoLuongThanhVien * 4) + 1) as LuongChucNang
from NhomDATN n
go
select * from V_NhomDATN
go



create view V_TopHuongDan as
select top 2
    pc.MaGiangVien, 
    pc.NgayNop, 
    n.HocKy,
    count(pc.MaNhom) as SoLuongNhomHuongDan
from GiangVien gv
join PhanCongHuongDan pc on gv.MaGiangVien = pc.MaGiangVien
join NhomDATN n on pc.MaNhom = n.MaNhom
group by pc.MaGiangVien, pc.NgayNop, n.HocKy
order by SoLuongNhomHuongDan asc
go
select * from V_TopHuongDan
go



create function TraVeTenNguoiDungEmail (
    @Email nvarchar(100)
)
returns nvarchar(100)
as
begin
    declare @TenNguoiDung nvarchar(100)
    select @TenNguoiDung = Email 
    from GiangVien
    return substring(@Email, charindex('@', @Email) - 14, len(@Email))
end
go
select dbo.TraVeTenNguoiDungEmail('gv1@fpt.edu.vn')
go
select dbo.TraVeTenNguoiDungEmail('gv2@fpt.edu.vn')
go
select dbo.TraVeTenNguoiDungEmail('gv3@fpt.edu.vn')
go
drop function TraVeTenNguoiDungEmail



-- create proc






-- DECLARE
-- select
-- from
-- WHERE
-- return