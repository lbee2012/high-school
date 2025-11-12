CREATE DATABASE	TutorSOF3012
GO
USE TutorSOF3012
GO
CREATE TABLE san_pham (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_san_pham NVARCHAR(255) NOT NULL,
    nha_san_xuat NVARCHAR(255) NOT NULL,
    gia FLOAT NOT NULL,
    so_luong INT NOT NULL,
    con_hang BIT 
);
GO
INSERT INTO san_pham (ten_san_pham, nha_san_xuat, gia, so_luong, con_hang) 
VALUES (N'Laptop Dell Inspiron 15', N'Dell', 16990000, 10, 1);
GO
INSERT INTO san_pham (ten_san_pham, nha_san_xuat, gia, so_luong, con_hang) 
VALUES (N'Điện thoại Samsung Galaxy S23', N'Samsung', 23990000, 5, 1);
GO
INSERT INTO san_pham (ten_san_pham, nha_san_xuat, gia, so_luong, con_hang) 
VALUES (N'Tai nghe Bluetooth Sony WH-1000XM4', N'Sony', 6490000, 0, 0);
GO
INSERT INTO san_pham (ten_san_pham, nha_san_xuat, gia, so_luong, con_hang) 
VALUES (N'Điện thoại iPhone 15', N'Apple', 29990000, 3, 1);
GO
INSERT INTO san_pham (ten_san_pham, nha_san_xuat, gia, so_luong, con_hang) 
VALUES (N'Máy ảnh Canon EOS M50', N'Canon', 18990000, 2, 1);
GO

SELECT * FROM san_pham;
GO