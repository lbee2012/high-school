USE LuyenTapLan1
GO

-- Tạo bảng người dùng
CREATE TABLE nguoi_dung (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_dang_nhap NVARCHAR(100) NOT NULL,
    mat_khau NVARCHAR(255) NOT NULL,
    email NVARCHAR(255),
    ho_ten NVARCHAR(255),
    -- ngay_tao NVARCHAR(50), -- This attribute has been removed
    trang_thai_hoat_dong BIT DEFAULT 1 -- 1 là hoạt động, 0 là không hoạt động
);
GO

-- Chèn dữ liệu vào bảng người_dung
INSERT INTO nguoi_dung (ten_dang_nhap, mat_khau, email, ho_ten, trang_thai_hoat_dong) VALUES
(N'user_an', N'pass123', N'an.nguyen@example.com', N'Nguyễn Văn An', 1),
(N'user_binh', N'securepass', N'binh.tran@example.com', N'Trần Thị Bình', 1),
(N'user_cuong', N'mysecret', N'cuong.le@example.com', N'Lê Văn Cường', 0),
(N'user_dung', N'password456', N'dung.pham@example.com', N'Phạm Thị Dung', 1);
GO
