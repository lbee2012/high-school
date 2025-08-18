-- Tạo database mới cho bài tập
USE LuyenTapLan2
GO

-- Tạo bảng giao_vien (Teacher)
CREATE TABLE giao_vien (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_gv NVARCHAR(255) NOT NULL,
    email NVARCHAR(255),
    sdt NVARCHAR(20),
    chuyen_mon NVARCHAR(100)
);
GO

-- Tạo bảng lop_hoc (Class)
CREATE TABLE lop_hoc (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_lop NVARCHAR(255) NOT NULL,
    so_luong_sv INT,
    thoi_luong INT, -- Thời lượng học (phút)
    id_giao_vien INT,
    FOREIGN KEY (id_giao_vien) REFERENCES giao_vien(id)
);
GO

-- Chèn dữ liệu vào bảng giao_vien
INSERT INTO giao_vien (ten_gv, email, sdt, chuyen_mon) VALUES
(N'Nguyễn Thị Lan', N'lan.nguyen@edu.vn', N'0901112233', N'Toán học'),
(N'Trần Văn Long', N'long.tran@edu.vn', N'0904445566', N'Vật lý'),
(N'Lê Thị Mai', N'mai.le@edu.vn', N'0907778899', N'Ngữ văn'),
(N'Phạm Văn Hùng', N'hung.pham@edu.vn', N'0901234567', N'Tin học');
GO

-- Chèn dữ liệu vào bảng lop_hoc
INSERT INTO lop_hoc (ten_lop, so_luong_sv, thoi_luong, id_giao_vien) VALUES
(N'Lớp Toán A1', 30, 120, 1), -- 2 tiếng = 120 phút
(N'Lớp Vật lý B2', 25, 120, 2), -- 2 tiếng = 120 phút
(N'Lớp Ngữ văn C3', 35, 120, 3), -- 2 tiếng = 120 phút
(N'Lớp Lập trình Web', 28, 120, 4), -- 2 tiếng = 120 phút
(N'Lớp Toán A2', 32, 120, 1); -- 2 tiếng = 120 phút
GO

select * from giao_vien
select * from lop_hoc