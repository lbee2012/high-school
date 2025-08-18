-- Tạo database mới cho bài tập
CREATE DATABASE LuyenTapLan2
GO

USE LuyenTapLan2
GO

-- Tạo bảng danh_muc (categories)
CREATE TABLE danh_muc (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_danh_muc NVARCHAR(255) NOT NULL
);
GO

-- Tạo bảng san_pham (products)
CREATE TABLE san_pham (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_sp NVARCHAR(255) NOT NULL,
    mo_ta NVARCHAR(MAX),
    gia_ban FLOAT NOT NULL,
    so_luong INT NOT NULL,
    con_hang BIT,
    id_danh_muc INT,
    FOREIGN KEY (id_danh_muc) REFERENCES danh_muc(id)
);
GO

-- Chèn dữ liệu vào bảng danh_muc
INSERT INTO danh_muc (ten_danh_muc) VALUES
(N'Điện tử'),
(N'Thời trang'),
(N'Đồ gia dụng'),
(N'Sách');
GO

-- Chèn dữ liệu vào bảng san_pham
INSERT INTO san_pham (ten_sp, mo_ta, gia_ban, so_luong, con_hang, id_danh_muc) VALUES
(N'Điện thoại thông minh', N'Điện thoại cao cấp với camera 108MP', 999.99, 50, 1, 1),
(N'Tai nghe không dây', N'Tai nghe chống ồn, pin trâu', 149.99, 120, 1, 1),
(N'Áo phông Unisex', N'Áo phông cotton 100%, màu đen', 25.00, 200, 1, 2),
(N'Quần jean ống rộng', N'Quần jean phong cách vintage', 55.50, 0, 0, 2),
(N'Nồi cơm điện', N'Nồi cơm điện thông minh, dung tích 1.8L', 75.00, 30, 1, 3),
(N'Sách khoa học', N'Sách khám phá vũ trụ', 30.00, 80, 1, 4),
(N'Tủ lạnh mini', N'Tủ lạnh nhỏ gọn, tiện lợi', 299.99, 15, 1, 3);
GO
