USE LuyenTapLan2

-- Tạo bảng nha_hang
CREATE TABLE nha_hang (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten_nha_hang NVARCHAR(100)
);
GO

-- Tạo bảng mon_an với cột giá
CREATE TABLE mon_an (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten_mon_an NVARCHAR(100),
    loai_mon NVARCHAR(50),
    gia INT,
    con_phuc_vu BIT,
    nha_hang_id INT FOREIGN KEY REFERENCES nha_hang(id)
);
GO

-- Thêm dữ liệu vào nha_hang
INSERT INTO nha_hang (ten_nha_hang) VALUES
(N'Nhà hàng Quán Ăn Ngon'),
(N'Nhà hàng Vị Quê'),
(N'Nhà hàng Sen Tây Hồ'),
(N'Nhà hàng Lẩu Phan'),
(N'Nhà hàng Pizza 4P''s');
GO

-- Thêm dữ liệu vào mon_an (có giá)
INSERT INTO mon_an (ten_mon_an, loai_mon, gia, con_phuc_vu, nha_hang_id) VALUES
(N'Phở bò', N'Món nước', 50000, 1, 1),
(N'Bún chả', N'Món nướng', 45000, 1, 1),
(N'Cơm rang dưa bò', N'Cơm', 40000, 1, 2),
(N'Lẩu hải sản', N'Lẩu', 250000, 1, 2),
(N'Bánh đa cua', N'Món nước', 40000, 0, 3),
(N'Nem rán', N'Món chiên', 35000, 1, 3),
(N'Lẩu gà lá é', N'Lẩu', 220000, 1, 4),
(N'Sườn nướng BBQ', N'Món nướng', 120000, 1, 4),
(N'Pizza Margherita', N'Bánh Pizza', 180000, 1, 5),
(N'Mỳ Ý Carbonara', N'Mỳ Ý', 95000, 1, 5);
GO