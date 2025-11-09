CREATE DATABASE LuyenTapLan1
GO

USE LuyenTapLan1
GO

CREATE TABLE phan_loai (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_phan_loai NVARCHAR(255) NOT NULL
);
GO
CREATE TABLE san_pham (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_phan_loai INT,
    ten_sp NVARCHAR(255) NOT NULL,
    mo_ta NVARCHAR(255),
    gia_ban FLOAT NOT NULL,
    so_luong_ton INT NOT NULL,
    con_hang BIT,
    FOREIGN KEY (id_phan_loai) REFERENCES phan_loai(id)
);
GO

INSERT INTO phan_loai (ten_phan_loai) VALUES
(N'Điện tử'),
(N'Quần áo'),
(N'Đồ gia dụng'),
(N'Sách');
GO

-- Insert data into san_pham (updated column name)
INSERT INTO san_pham (id_phan_loai, ten_sp, mo_ta, gia_ban, so_luong_ton, con_hang) VALUES
(1, N'Điện thoại thông minh X', N'Điện thoại cao cấp với camera 108MP', 999.99, 50, 1),
(1, N'Tai nghe không dây Y', N'Tai nghe chống ồn, pin trâu', 149.99, 120, 1),
(2, N'Áo phông nam', N'Áo phông cotton 100%, màu đen', 25.00, 200, 1),
(2, N'Quần jean nữ', N'Quần jean ống rộng, phong cách vintage', 55.50, 0, 0),
(3, N'Nồi cơm điện Z', N'Nồi cơm điện thông minh, dung tích 1.8L', 75.00, 30, 1),
(4, N'Lập trình cơ bản', N'Sách hướng dẫn lập trình cho người mới bắt đầu', 30.00, 80, 1);
GO

SELECT * FROM phan_loai
SELECT * FROM san_pham