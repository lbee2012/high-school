CREATE DATABASE Buoi1_Bai2
USE Buoi1_Bai2

CREATE TABLE NhanVien (
    ID INT NOT NULL,
    ma NVARCHAR(100) NOT NULL,
    tuoi INT NULL,
    diaChi NVARCHAR(100) NULL,
    chucVu VARCHAR(100) NULL,

    PRIMARY KEY (ID, ma)
)
CREATE TABLE SanPham (
    ID INT NOT NULL,
    ma VARCHAR(20) NOT NULL,
    mauSac NVARCHAR(100) NULL,
    chatLieu VARCHAR(100) NULL,
    gia FLOAT NULL,
    ngayNhapHang DATETIME,

    PRIMARY KEY (ID, ma)
)
CREATE TABLE SinhVien (
    ID INT NOT NULL,
    ma VARCHAR(20) NOT NULL,
    cmnd VARCHAR(20) NOT NULL,
    ten NVARCHAR(100) NULL,
    tuoi INT NULL,
    nganhHoc NVARCHAR(100) NULL,

    PRIMARY KEY (ID, ma, cmnd)
)
CREATE TABLE BacSi (
    ID INT NOT NULL,
    ma NVARCHAR(100) NOT NULL,
    tuoi INT NULL,
    diaChi NVARCHAR(100) NULL,
    chucVu VARCHAR(100) NULL,
    loai NVARCHAR(100) NULL,

    PRIMARY KEY (ID, ma)
)
CREATE TABLE ThucVat (
    ID INT NOT NULL,
    ma VARCHAR(20) NOT NULL,
    mauSac NVARCHAR(100) NULL,
    chatLieu VARCHAR(100) NULL,
    gia FLOAT NULL,
    ngayNhapHang DATETIME

    PRIMARY KEY (ID, ma)
)
CREATE TABLE DongVat (
    ID INT NOT NULL,
    ma VARCHAR(20) NOT NULL,
    mauSac NVARCHAR(100) NULL,
    chatLieu VARCHAR(100) NULL,
    gia FLOAT NULL,
    ngayNhapHang DATETIME NULL,

    PRIMARY KEY (ID, ma)
)

INSERT INTO NhanVien VALUES
()
SELECT * FROM NhanVien

INSERT INTO SanPham VALUES
()
SELECT * FROM SanPham

INSERT INTO SinhVien VALUES
()
SELECT * FROM SinhVien

INSERT INTO BacSi VALUES
()
SELECT * FROM BacSi

INSERT INTO ThucVat VALUES
()
SELECT * FROM ThucVat

INSERT INTO DongVat VALUES
()
SELECT * FROM DongVat