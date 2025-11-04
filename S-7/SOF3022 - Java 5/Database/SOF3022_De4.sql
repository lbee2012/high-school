CREATE DATABASE SOF3022_De4;
GO
USE SOF3022_De4;
GO
-- Bảng phiếu nhập
CREATE TABLE phieu_nhap (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_phieu_nhap NVARCHAR(20)  ,
    ngay_nhap DATETIME  ,
    nha_cung_cap NVARCHAR(255)  ,
    tong_tien DECIMAL(18,2)  ,
    ghi_chu NVARCHAR(255) 
);

-- Bảng phiếu nhập chi tiết (liên kết 1-N với phiếu nhập)
CREATE TABLE phieu_nhap_chi_tiet (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_phieu_nhap INT  ,
    ten_san_pham NVARCHAR(255)  ,
    so_luong INT DEFAULT 1,
    gia_nhap DECIMAL(18,2)  ,
    ngay_san_xuat DATE,
    FOREIGN KEY (id_phieu_nhap) REFERENCES phieu_nhap(id) ON DELETE CASCADE
);
SET IDENTITY_INSERT phieu_nhap ON;
INSERT INTO phieu_nhap (id, ma_phieu_nhap, ngay_nhap, nha_cung_cap, tong_tien, ghi_chu)
VALUES 
    (1, 'PN001', '2024-01-01', 'Samsung Việt Nam', 20000000, 'Nhập lô hàng đầu năm'),
    (2, 'PN002', '2024-01-10', 'Apple Việt Nam', 50000000, 'Nhập MacBook và iPhone'),
    (3, 'PN003', '2024-01-15', 'Sony Electronics', 15000000, 'Nhập tai nghe Sony'),
    (4, 'PN004', '2024-02-01', 'JBL Việt Nam', 12000000, 'Nhập loa Bluetooth'),
    (5, 'PN005', '2024-02-10', 'Dell Technologies', 30000000, 'Nhập Laptop Dell'),
    (6, 'PN006', '2024-03-05', 'LG Electronics', 18000000, 'Nhập màn hình LG'),
    (7, 'PN007', '2024-03-20', 'Logitech', 10000000, 'Nhập chuột và bàn phím'),
    (8, 'PN008', '2024-04-01', 'Microsoft', 25000000, 'Nhập Surface Laptop'),
    (9, 'PN009', '2024-04-15', 'Acer Vietnam', 14000000, 'Nhập Laptop Acer'),
    (10, 'PN010', '2024-05-01', 'HP Vietnam', 20000000, 'Nhập Laptop HP');
SET IDENTITY_INSERT phieu_nhap OFF;

SET IDENTITY_INSERT phieu_nhap_chi_tiet ON;
INSERT INTO phieu_nhap_chi_tiet (id, id_phieu_nhap, ten_san_pham, so_luong, gia_nhap, ngay_san_xuat)
VALUES 
    (1, 1, 'Samsung Galaxy S21', 10, 18000000, '2023-12-01'),
    (2, 2, 'iPhone 14', 15, 25000000, '2023-11-10'),
    (3, 3, 'Tai nghe Sony WH-1000XM4', 20, 5000000, '2023-10-15'),
    (4, 4, 'Loa JBL Flip 5', 30, 3000000, '2023-09-20'),
    (5, 5, 'Laptop Dell XPS 13', 10, 35000000, '2023-08-25'),
    (6, 6, 'Màn hình LG UltraFine', 15, 9000000, '2023-07-30'),
    (7, 7, 'Chuột Logitech MX Master 3', 25, 2000000, '2023-06-10'),
    (8, 8, 'Surface Laptop 4', 12, 32000000, '2023-05-05'),
    (9, 9, 'Laptop Acer Nitro 5', 20, 17000000, '2023-04-01'),
    (10, 10, 'Laptop HP Spectre x360', 8, 28000000, '2023-03-15');
SET IDENTITY_INSERT phieu_nhap_chi_tiet OFF;


SELECT * FROM phieu_nhap
SELECT * FROM phieu_nhap_chi_tiet