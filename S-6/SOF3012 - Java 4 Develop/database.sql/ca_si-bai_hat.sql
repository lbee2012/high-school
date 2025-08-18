USE SD20205
GO

-- Tạo bảng ca_si
CREATE TABLE ca_si (
    id INT IDENTITY(11,1) PRIMARY KEY,
    ten_ca_si NVARCHAR(100)
);
GO

-- Tạo bảng bai_hat
CREATE TABLE bai_hat (
    id INT IDENTITY(11,1) PRIMARY KEY,
    ten_bai_hat NVARCHAR(100),
    thoi_luong INT,
    phat_hanh_chua BIT,
    ca_si_id INT FOREIGN KEY REFERENCES ca_si(id)
);
GO

-- Thêm dữ liệu vào ca_si
INSERT INTO ca_si (ten_ca_si) VALUES
(N'Sơn Tùng M-TP'),
(N'Mỹ Tâm'),
(N'Hồ Quang Hiếu'),
(N'Hoa Minzy'),
(N'Đen Vâu');
GO

-- Thêm dữ liệu vào bai_hat
INSERT INTO bai_hat (ten_bai_hat, thoi_luong, phat_hanh_chua, ca_si_id) VALUES
(N'Lạc Trôi', 210, 1, 11),
(N'Nơi Này Có Anh', 190, 1, 11),
(N'Người Hãy Quên Em Đi', 230, 1, 12),
(N'Đừng Hỏi Em', 200, 0, 12),
(N'Con Bướm Xuân', 180, 1, 13),
(N'Không Cảm Xúc', 190, 0, 13),
(N'Không Thể Cùng Nhau Suốt Kiếp', 250, 1, 14),
(N'Rời Bỏ', 240, 0, 14),
(N'Bài Này Chill Phết', 260, 1, 15),
(N'Đi Về Nhà', 220, 1, 15);
GO

SELECT * FROM ca_si
SELECT * FROM bai_hat