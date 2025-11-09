CREATE DATABASE Buoi1_Bai1

GO
USE Buoi1_Bai1

GO
CREATE TABLE DongSP (
    ma VARCHAR(50) PRIMARY KEY NOT NULL,
    ten NVARCHAR(100) NULL
)

GO
CREATE TABLE ChucVu (
    ma VARCHAR(50) PRIMARY KEY NOT NULL,
    ten NVARCHAR(100) NULL,
    trangThai INT NULL DEFAULT 0
)

GO
CREATE TABLE CuaHang (
    ma VARCHAR(50) PRIMARY KEY NOT NULL,
    ten NVARCHAR(100) NULL,
    diaChi NVARCHAR(100) NULL,
    thanhPho NVARCHAR(100) NULL,
    quocGia NVARCHAR(100) NULL
)

GO
INSERT INTO DongSP VALUES
('DSP01',N'Dòng sản phẩm 1'),
('DSP02',N'Dòng sản phẩm 2'),
('DSP03',N'Dòng sản phẩm 3')

SELECT * FROM DongSP

GO
INSERT INTO ChucVu(ma,ten) VALUES
('CV01',N'Chức vụ 1'),
('CV03',N'Chức vụ 3')
INSERT INTO ChucVu VALUES
('CV02',N'Chức vụ 2',1)

SELECT * FROM ChucVu

GO
INSERT INTO CuaHang (ten,ma,diaChi) VALUES
(N'Cửa hàng 1','CH01',N'Hà Nội 1'),
(N'Cửa hàng 2','CH02',N'Hà Nội 2'),
(N'Cửa hàng 3','CH03',N'Hà Nội 3')

SELECT * FROM CuaHang