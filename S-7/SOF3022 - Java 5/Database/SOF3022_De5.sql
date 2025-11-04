CREATE DATABASE SOF3022_De5;
GO
USE SOF3022_De5;
GO

-- Bảng loại xe
CREATE TABLE loai_xe (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_loai_xe NVARCHAR(20)  ,
    ten_loai_xe NVARCHAR(255)  ,
    mo_ta NVARCHAR(255),
    hang_san_xuat NVARCHAR(255),
    nam_ra_mat INT
);
-- Bảng xe (liên kết 1-N với loại xe)
CREATE TABLE xe (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_xe NVARCHAR(20)  ,
    ten_xe NVARCHAR(255)  ,
    gia DECIMAL(18,2)  ,
    ngay_san_xuat DATE  ,
    so_cho_ngoi INT  ,
    id_loai_xe INT  ,
    FOREIGN KEY (id_loai_xe) REFERENCES loai_xe(id) ON DELETE CASCADE
);
SET IDENTITY_INSERT loai_xe ON;
INSERT INTO loai_xe (id, ma_loai_xe, ten_loai_xe, mo_ta, hang_san_xuat, nam_ra_mat)
VALUES 
    (1, 'LX001', 'SUV', 'Xe thể thao đa dụng', 'Toyota', 2015),
    (2, 'LX002', 'Sedan', 'Xe 4 chỗ phổ thông', 'Honda', 2017),
    (3, 'LX003', 'Hatchback', 'Xe nhỏ gọn', 'Hyundai', 2018),
    (4, 'LX004', 'Coupe', 'Xe thể thao', 'BMW', 2020),
    (5, 'LX005', 'Convertible', 'Xe mui trần', 'Mercedes-Benz', 2019),
    (6, 'LX006', 'Pickup', 'Xe bán tải', 'Ford', 2016),
    (7, 'LX007', 'MPV', 'Xe đa dụng', 'Kia', 2021),
    (8, 'LX008', 'Crossover', 'Xe lai giữa SUV và Sedan', 'Mazda', 2022),
    (9, 'LX009', 'Electric', 'Xe điện', 'Tesla', 2023),
    (10, 'LX010', 'Hybrid', 'Xe lai điện xăng', 'Lexus', 2023);
SET IDENTITY_INSERT loai_xe OFF;

SET IDENTITY_INSERT xe ON;
INSERT INTO xe (id, ma_xe, ten_xe, gia, ngay_san_xuat, so_cho_ngoi, id_loai_xe)
VALUES 
    (1, 'X001', 'Toyota Fortuner', 1200000000, '2022-05-10', 7, 1),
    (2, 'X002', 'Honda Civic', 850000000, '2021-06-15', 5, 2),
    (3, 'X003', 'Hyundai i10', 500000000, '2020-08-20', 5, 3),
    (4, 'X004', 'BMW M4', 3000000000, '2023-03-25', 2, 4),
    (5, 'X005', 'Mercedes C200', 2200000000, '2023-07-12', 4, 5),
    (6, 'X006', 'Ford Ranger', 900000000, '2022-11-30', 5, 6),
    (7, 'X007', 'Kia Sedona', 1300000000, '2022-09-05', 8, 7),
    (8, 'X008', 'Mazda CX-5', 950000000, '2023-01-18', 5, 8),
    (9, 'X009', 'Tesla Model S', 2500000000, '2023-05-01', 5, 9),
    (10, 'X010', 'Lexus RX450h', 2800000000, '2023-02-14', 5, 10);
SET IDENTITY_INSERT xe OFF;

Select * from loai_xe
Select * from xe