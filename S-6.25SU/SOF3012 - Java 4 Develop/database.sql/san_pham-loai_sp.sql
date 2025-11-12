CREATE DATABASE TutorSOF3012
GO
USE TutorSOF3012
GO

-- Tạo bảng loai_sp
CREATE TABLE loai_sp (
    id INT PRIMARY KEY IDENTITY(1,1),
    ma NVARCHAR(50) NOT NULL,
    ten NVARCHAR(255) NOT NULL
);
GO

-- Tạo bảng san_pham (đã được sửa lại)
CREATE TABLE san_pham (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten NVARCHAR(255) NOT NULL,
    mo_ta NVARCHAR(MAX),
    id_loai_sp INT,
    FOREIGN KEY (id_loai_sp) REFERENCES loai_sp(id)
);
GO

-- Chèn dữ liệu vào bảng loai_sp
INSERT INTO loai_sp (ma, ten) VALUES
('DT', N'Điện tử'),
('QA', N'Quần áo'),
('GD', N'Đồ gia dụng'),
('SA', N'Sách');
GO

-- Chèn dữ liệu vào bảng san_pham
INSERT INTO san_pham (ten, mo_ta, id_loai_sp) VALUES
(N'Điện thoại thông minh X', N'Điện thoại cao cấp', 1),
(N'Áo phông nam', N'Áo phông cotton 100%', 2),
(N'Nồi cơm điện Z', N'Nồi cơm điện thông minh', 3),
(N'Sách Lập trình', N'Sách hướng dẫn cho người mới', 4);
GO



SELECT * FROM san_pham
SELECT * FROM loai_sp

DROP TABLE san_pham
DROP Table loai_sp