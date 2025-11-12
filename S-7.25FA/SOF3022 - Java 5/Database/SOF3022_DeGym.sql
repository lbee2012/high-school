CREATE DATABASE SOF3022_DeGym;
GO
USE SOF3022_DeGym;
GO

-- 1) Bảng GOI_TAP (1)
CREATE TABLE goi_tap (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_goi NVARCHAR(20)   NOT NULL,
    ten_goi NVARCHAR(100) NOT NULL,
    thoi_han_thang INT    NOT NULL,           -- gợi ý thời hạn chuẩn của gói
    gia_thang DECIMAL(18,2) NOT NULL          -- giá / tháng
);

-- 2) Bảng DANG_KY (N)
CREATE TABLE dang_ky (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_goi_tap INT         NOT NULL,
    khach_hang NVARCHAR(100) NOT NULL,
    sdt NVARCHAR(15)       NOT NULL,
    ngay_bat_dau DATE      NOT NULL,
    so_thang INT           NOT NULL DEFAULT 1,
    tong_tien DECIMAL(18,2) NOT NULL,         -- TÍNH TRONG SERVICE = gia_thang * so_thang
    FOREIGN KEY (id_goi_tap) REFERENCES goi_tap(id) ON DELETE CASCADE
);

-- Seed GOI_TAP
INSERT INTO goi_tap (ma_goi, ten_goi, thoi_han_thang, gia_thang) VALUES
('G01', N'Basic Gym',        1,   300000),
('G02', N'Standard Gym',     3,   270000),
('G03', N'Premium Gym',      6,   250000),
('G04', N'Yoga Combo',       1,   350000),
('G05', N'PT 1-1 (Lite)',    1,   800000),
('G06', N'CrossFit',         3,   400000),
('G07', N'Swim + Gym',       1,   420000),
('G08', N'VIP All Access',  12,   230000);

-- Seed DANG_KY (mẫu)
INSERT INTO dang_ky (id_goi_tap, khach_hang, sdt, ngay_bat_dau, so_thang, tong_tien) VALUES
(1, N'Nguyễn Minh Long',  N'0912345678', '2025-10-01', 1,  300000),
(2, N'Trần Thu Trang',    N'0987654321', '2025-10-02', 3,  810000),
(3, N'Lê Văn Hải',        N'0909090909', '2025-10-03', 6, 1500000),
(4, N'Phạm Đức Bình',     N'0933333333', '2025-10-04', 2,  700000),
(5, N'Hoàng Ngọc Anh',    N'0977777777', '2025-10-05', 1,  800000),
(6, N'Vũ Quang Huy',      N'0966666666', '2025-10-06', 3, 1200000),
(7, N'Đỗ Thị Linh',       N'0955555555', '2025-10-07', 1,  420000),
(8, N'Bùi Hữu Tài',       N'0944444444', '2025-10-08',12, 2760000),
(3, N'Ngô Thanh Tâm',     N'0932123123', '2025-10-09', 3,  750000),
(2, N'Phan Minh Châu',    N'0921231231', '2025-10-10', 6, 1620000);
