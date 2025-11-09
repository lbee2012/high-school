USE LuyenTapLan1
GO

-- Tạo bảng khóa học
CREATE TABLE khoa_hoc (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_khoa_hoc NVARCHAR(255) NOT NULL,
    so_tin_chi INT NOT NULL,
    phong_hoc NVARCHAR(100)
);
GO

-- Tạo bảng học sinh
CREATE TABLE hoc_sinh (
    id INT PRIMARY KEY IDENTITY(1,1),
    id_khoa_hoc INT,
    ten_hoc_sinh NVARCHAR(255) NOT NULL,
    ngay_dang_ky DATE NOT NULL,
    trang_thai_hoc NVARCHAR(50), -- Ví dụ: "Đang học", "Đã tốt nghiệp", "Bảo lưu"
    FOREIGN KEY (id_khoa_hoc) REFERENCES khoa_hoc(id)
);
GO

-- Chèn dữ liệu vào bảng khoa_hoc
INSERT INTO khoa_hoc (ten_khoa_hoc, so_tin_chi, phong_hoc) VALUES
(N'Lập trình Web nâng cao', 4, N'Phòng A101'),
(N'Thiết kế đồ họa cơ bản', 3, N'Phòng B203'),
(N'Kinh tế học vĩ mô', 3, N'Phòng C305'),
(N'Tiếng Anh giao tiếp', 2, N'Phòng D402');
GO

-- Chèn dữ liệu vào bảng hoc_sinh
INSERT INTO hoc_sinh (id_khoa_hoc, ten_hoc_sinh, ngay_dang_ky, trang_thai_hoc) VALUES
(1, N'Nguyễn Văn An', '2023-09-01', N'Đang học'),
(2, N'Trần Thị Bình', '2023-09-01', N'Đang học'),
(1, N'Lê Văn Chung', '2024-01-15', N'Đang học'),
(3, N'Phạm Thị Dung', '2023-09-01', N'Đã tốt nghiệp'),
(4, N'Hoàng Minh Hải', '2024-03-10', N'Đang học');
GO

SELECT * FROM khoa_hoc
SELECT * FROM hoc_sinh