CREATE DATABASE d1021;
GO
USE d1021;
GO
CREATE TABLE san_pham (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_san_pham NVARCHAR(100),
    so_luong INT
);
GO

CREATE TABLE don_hang (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_khach_hang NVARCHAR(100),
    id_san_pham INT,
    so_luong_dat INT,
    trang_thai BIT -- 0: chua thanh toan, 1: da thanh toan
    FOREIGN KEY (id_san_pham) REFERENCES san_pham(id)
);
GO

INSERT INTO san_pham (ten_san_pham, so_luong) 
VALUES 
(N'Laptop Dell XPS', 10),
(N'Chuột Logitech G502', 50),
(N'Bàn phím cơ Razer', 30);
GO

INSERT INTO don_hang (ten_khach_hang, id_san_pham, so_luong_dat, trang_thai) 
VALUES 
(N'Nguyễn Văn A', 1, 1, 1),
(N'Trần Thị B', 2, 2, 0),
(N'Lê Quốc C', 3, 1, 1),
(N'Phạm Hồng D', 1, 3, 1),
(N'Hoàng Minh E', 2, 1, 0),
(N'Vũ Thanh F', 3, 2, 1),
(N'Ngô Tuấn G', 1, 1, 0),
(N'Đinh Thảo H', 2, 3, 1),
(N'Bùi Quốc I', 3, 1, 0),
(N'Phan Ngọc J', 1, 2, 1);
GO

SELECT * FROM san_pham
SELECT * FROM don_hang