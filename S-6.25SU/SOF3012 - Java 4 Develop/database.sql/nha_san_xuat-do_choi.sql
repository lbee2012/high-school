USE ThiLan2
GO

-- Tạo bảng nha_san_xuat (Nhà sản xuất)
CREATE TABLE nha_san_xuat (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_nsx NVARCHAR(255) NOT NULL,
    quoc_gia NVARCHAR(255)
);
GO

-- Tạo bảng do_choi (Đồ chơi)
CREATE TABLE do_choi (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_do_choi NVARCHAR(255) NOT NULL,
    gia_ban INT,
    so_luong INT,
    trang_thai BIT, -- 0: Hết hàng, 1: Còn hàng
    id_nsx INT,
    FOREIGN KEY (id_nsx) REFERENCES nha_san_xuat(id)
);
GO

-- Chèn dữ liệu mẫu vào bảng nha_san_xuat
INSERT INTO nha_san_xuat (ten_nsx, quoc_gia) VALUES
(N'Lego', N'Đan Mạch'),
(N'Mattel', N'Mỹ'),
(N'Hasbro', N'Mỹ'),
(N'Bandai', N'Nhật Bản');
GO

-- Chèn dữ liệu mẫu vào bảng do_choi
INSERT INTO do_choi (ten_do_choi, gia_ban, so_luong, trang_thai, id_nsx) VALUES
(N'Bộ xếp hình Cướp biển', 500000, 20, 1, 1),
(N'Búp bê Barbie', 250000, 50, 1, 2),
(N'Tàu siêu tốc', 100000, 0, 0, 3),
(N'Robot Gundam', 750000, 15, 1, 4),
(N'Xe đua địa hình', 300000, 35, 1, 2);
GO