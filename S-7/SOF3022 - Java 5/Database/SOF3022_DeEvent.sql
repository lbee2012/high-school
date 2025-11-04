CREATE DATABASE SOF3022_DeEvent;
GO
USE SOF3022_DeEvent;
GO

-- Bảng SU KIEN (1) ----------------------------
CREATE TABLE su_kien (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_su_kien NVARCHAR(20)  NOT NULL,
    ten_su_kien NVARCHAR(255) NOT NULL,
    ngay_to_chuc DATETIME     NOT NULL,
    dia_diem NVARCHAR(255)    NOT NULL,
    so_cho_toi_da INT         NOT NULL,
    mo_ta NVARCHAR(500)       NULL
);

-- Bảng VE (N) --------------------------------
CREATE TABLE ve (
    id INT IDENTITY(1,1) PRIMARY KEY,
    id_su_kien INT           NOT NULL,
    khach_hang NVARCHAR(100) NOT NULL,
    so_luong INT             NOT NULL DEFAULT 1,
    gia_ve DECIMAL(18,2)     NOT NULL,
    ngay_mua DATE            NOT NULL,
    FOREIGN KEY (id_su_kien) REFERENCES su_kien(id) ON DELETE CASCADE
);

-- Seed dữ liệu Sự kiện -----------------------
INSERT INTO su_kien (ma_su_kien, ten_su_kien, ngay_to_chuc, dia_diem, so_cho_toi_da, mo_ta) VALUES
('EV001', N'Tech Fair 2025',      '2025-11-15 09:00:00', N'TP.HCM - SECC',               200, N'Sự kiện công nghệ thường niên'),
('EV002', N'Java Summit',         '2025-12-05 08:30:00', N'Hà Nội - ICE',                150, N'Hội nghị Java & JVM'),
('EV003', N'UX/UI Day',           '2025-11-28 13:30:00', N'Đà Nẵng - Ariyana',           120, N'Workshop trải nghiệm người dùng'),
('EV004', N'Cloud & DevOps',      '2025-12-12 09:00:00', N'Hà Nội - JW Marriott',        180, N'CI/CD, K8s, IaC'),
('EV005', N'AI for Business',     '2025-12-20 09:00:00', N'TP.HCM - GEM Center',         250, N'Ứng dụng AI thực chiến'),
('EV006', N'CyberSec Meetup',     '2026-01-10 18:30:00', N'Hải Phòng - Nhà hát TP',      100, N'Bảo mật hệ thống'),
('EV007', N'Data Science Camp',   '2025-11-22 08:00:00', N'Huế - Trường ĐH KHTN',        140, N'Khóa chuyên sâu 1 ngày'),
('EV008', N'Product Management',  '2026-01-05 09:00:00', N'Hà Nội - Keangnam',           130, N'Quy trình phát triển sản phẩm'),
('EV009', N'Mobile Dev Conference','2025-12-18 09:00:00',N'Đà Nẵng - Furama',            160, N'Android/iOS, Flutter'),
('EV010', N'Blockchain Forum',    '2026-02-02 09:00:00', N'TP.HCM - Vinhomes Central',   180, N'Chuỗi khối & Web3');

-- Seed dữ liệu Vé (mẫu) ----------------------
INSERT INTO ve (id_su_kien, khach_hang, so_luong, gia_ve, ngay_mua) VALUES
(1, N'Nguyễn Minh Long', 2, 300000.00, '2025-10-10'),
(1, N'Trần Thu Trang',   1, 300000.00, '2025-10-11'),
(2, N'Lê Văn Hải',       3, 450000.00, '2025-10-12'),
(3, N'Phạm Đức Bình',    1, 250000.00, '2025-10-13'),
(3, N'Hoàng Ngọc Anh',   2, 250000.00, '2025-10-13'),
(4, N'Vũ Quang Huy',     1, 400000.00, '2025-10-14'),
(5, N'Đỗ Thị Linh',      2, 500000.00, '2025-10-15'),
(6, N'Bùi Hữu Tài',      1, 220000.00, '2025-10-16'),
(7, N'Ngô Thanh Tâm',    4, 280000.00, '2025-10-17'),
(8, N'Phan Minh Châu',   2, 320000.00, '2025-10-17'),
(9, N'Đặng Thế Sơn',     1, 350000.00, '2025-10-18'),
(10,N'Nguyễn Hồng Ánh',  2, 380000.00, '2025-10-18');

SELECT * FROM su_kien
SELECT * FROM ve