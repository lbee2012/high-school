CREATE DATABASE FINAL_SOF203;
GO
USE FINAL_SOF203;
GO

CREATE TABLE PhongBan (
    Ma NVARCHAR(100) PRIMARY KEY,
    Ten NVARCHAR(50),
    TrangThai BIT,
    SoNhanVien INT,
);

INSERT INTO PhongBan (Ma, Ten, TrangThai, SoNhanVien)
VALUES 
('PB001', 'Phòng Kế Toán', 1, 15),
('PB002', 'Phòng Nhân Sự', 0, 8),
('PB003', 'Phòng IT', 0, 20),
('PB004', 'Phòng Marketing', 1, 12),
('PB005', 'Phòng Logistics', 1, 10);

SELECT * FROM PhongBan WHERE Ten NOT LIKE '%PB%'