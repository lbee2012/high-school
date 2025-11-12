CREATE DATABASE BoTucSOF3012
GO
USE BoTucSOF3012
GO

CREATE TABLE nuoc_hoa (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(255),
    so_luong INT,
    gia FLOAT
);
GO
INSERT INTO nuoc_hoa (ten, so_luong, gia) VALUES (N'Chanel No.5', 10, 2500000);
GO
INSERT INTO nuoc_hoa (ten, so_luong, gia) VALUES (N'Dior Sauvage', 15, 3200000);
GO
INSERT INTO nuoc_hoa (ten, so_luong, gia) VALUES (N'Gucci Bloom', 8, 2100000);
GO
INSERT INTO nuoc_hoa (ten, so_luong, gia) VALUES (N'Lancome Idole', 12, 2800000);
GO
INSERT INTO nuoc_hoa (ten, so_luong, gia) VALUES (N'Calvin Klein CK One', 20, 1500000);
GO

