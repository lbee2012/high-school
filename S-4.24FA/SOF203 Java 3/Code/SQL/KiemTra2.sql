CREATE DATABASE KiemTra2
GO
USE KiemTra2
GO

CREATE TABLE HocSinh (
    MaHocSinh VARCHAR(10) PRIMARY KEY,
    HoTen NVARCHAR(100) NOT NULL,
    GioiTinh BIT,
    Lop VARCHAR(20) NOT NULL
);
GO

INSERT INTO HocSinh (MaHocSinh, HoTen, GioiTinh, Lop) VALUES 
('HS001', 'Nguyen Van A', 1, '10A1'),
('HS002', 'Tran Thi B', 0, '10A2'),
('HS003', 'Le Van C', 1, '10A1'),
('HS004', 'Pham Thi D', 0, '11B1'),
('HS005', 'Do Van E', 1, '11B2'),
('HS006', 'Hoang Thi F', 0, '12C1'),
('HS007', 'Vo Van G', 1, '12C2'),
('HS008', 'Dang Thi H', 0, '10A3'),
('HS009', 'Nguyen Van I', 1, '11B3'),
('HS010', 'Tran Thi J', 0, '12C3');
GO

SELECT * FROM HocSinh

-- Hiển thị thông tin học sinh lên table 4đ
-- Add thành công 2đ
-- Xoá thành công 1đ
-- Hiển thị trên table 1 là Nam, 0 là Nữ
-- Tìm kiếm học sinh theo tên 2đ

SELECT * FROM HocSinh WHERE HoTen LIKE ?

REMOVE FROM HocSinh WHERE MaHocSinh = ?
