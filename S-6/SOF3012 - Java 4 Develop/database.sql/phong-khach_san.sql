USE BoTucSOF3012
GO

-- Tạo bảng khach_san
CREATE TABLE khach_san (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten_khach_san NVARCHAR(100),
    dia_chi NVARCHAR(200)
);
GO

-- Tạo bảng phong
CREATE TABLE phong (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten_phong NVARCHAR(100),
    gia INT,
    con_trong BIT,
    khach_san_id INT FOREIGN KEY REFERENCES khach_san(id)
);
GO

-- Thêm dữ liệu vào khach_san
INSERT INTO khach_san (ten_khach_san, dia_chi) VALUES
(N'Khách sạn Mặt Trời', N'123 Trần Hưng Đạo, Hà Nội'),
(N'Khách sạn Biển Xanh', N'456 Nguyễn Văn Linh, Đà Nẵng'),
(N'Khách sạn Núi Rừng', N'789 Phan Chu Trinh, Đà Lạt'),
(N'Khách sạn Sông Hồng', N'101 Lê Lợi, Huế'),
(N'Khách sạn Thành Đô', N'202 Lý Thường Kiệt, TP.HCM');
GO

-- Thêm dữ liệu vào phong
INSERT INTO phong (ten_phong, gia, con_trong, khach_san_id) VALUES
(N'Phòng Đơn', 500000, 1, 1),
(N'Phòng Đôi', 700000, 1, 1),
(N'Phòng Gia Đình', 1000000, 0, 2),
(N'Suite Hướng Biển', 1500000, 1, 2),
(N'Phòng Đơn', 550000, 0, 3),
(N'Phòng Đôi', 750000, 1, 3),
(N'Phòng VIP', 2000000, 0, 4),
(N'Phòng Tiêu Chuẩn', 600000, 1, 4),
(N'Phòng Đơn', 580000, 1, 5),
(N'Phòng Đôi', 780000, 0, 5);
GO

SELECT * FROM phong
SELECT * FROM khach_san
