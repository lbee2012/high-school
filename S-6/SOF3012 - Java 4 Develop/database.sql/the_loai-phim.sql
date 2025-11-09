USE LuyenTapLan2
GO

-- Tạo bảng the_loai (Genre)
CREATE TABLE the_loai (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_the_loai NVARCHAR(255) NOT NULL
);
GO

-- Tạo bảng phim (Movie)
CREATE TABLE phim (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_phim NVARCHAR(255) NOT NULL,
    dao_dien NVARCHAR(255),
    nam_phat_hanh INT,
    dang_chieu BIT, -- Thêm cột boolean cho trạng thái phim
    id_the_loai INT,
    FOREIGN KEY (id_the_loai) REFERENCES the_loai(id)
);
GO

-- Chèn dữ liệu vào bảng the_loai
INSERT INTO the_loai (ten_the_loai) VALUES
(N'Hành động'),
(N'Kinh dị'),
(N'Hài'),
(N'Khoa học viễn tưởng');
GO

-- Chèn dữ liệu vào bảng phim
INSERT INTO phim (ten_phim, dao_dien, nam_phat_hanh, dang_chieu, id_the_loai) VALUES
(N'Siêu anh hùng báo thù', N'Đạo diễn A', 2022, 1, 1), -- Đang chiếu
(N'Căn nhà bí ẩn', N'Đạo diễn B', 2021, 0, 2), -- Đã chiếu
(N'Biệt đội siêu nhân', N'Đạo diễn C', 2023, 1, 1), -- Đang chiếu
(N'Vũ trụ song song', N'Đạo diễn D', 2024, 1, 4), -- Đang chiếu
(N'Chuyện tình của tôi', N'Đạo diễn E', 2020, 0, 3); -- Đã chiếu
GO
