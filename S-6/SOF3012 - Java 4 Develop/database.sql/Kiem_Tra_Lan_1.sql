CREATE DATABASE ThiLan1
GO

USE ThiLan1
GO

CREATE TABLE cap_sach (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten_cap_sach NVARCHAR(100),
    mo_ta NVARCHAR(255),
    so_ngan INT,
    trong_luong FLOAT,
    laptop BIT -- Có ngăn đựng laptop không 1: Có, 0: Không
);
GO
INSERT INTO cap_sach (ten_cap_sach, mo_ta, so_ngan, trong_luong, laptop)
VALUES (N'Cặp sách Học Sinh', N'Dành cho học sinh tiểu học, màu sắc tươi sáng', 3, 0.8, 0);
GO
INSERT INTO cap_sach (ten_cap_sach, mo_ta, so_ngan, trong_luong, laptop)
VALUES (N'Cặp Da Công Sở', N'Chất liệu da tổng hợp, kiểu dáng lịch sự', 2, 1.2, 1);
GO
INSERT INTO cap_sach (ten_cap_sach, mo_ta, so_ngan, trong_luong, laptop)
VALUES (N'Balo Thể Thao', N'Phù hợp đi du lịch, chơi thể thao', 4, 1.0, 1);
GO
INSERT INTO cap_sach (ten_cap_sach, mo_ta, so_ngan, trong_luong, laptop)
VALUES (N'Cặp Vải Canvas', N'Thiết kế trẻ trung, phù hợp học sinh-sinh viên', 1, 0.5, 0);
GO
INSERT INTO cap_sach (ten_cap_sach, mo_ta, so_ngan, trong_luong, laptop)
VALUES (N'Cặp Du Lịch Đa Năng', N'Nhiều ngăn tiện lợi cho du lịch dài ngày', 5, 1.5, 1);
GO

Hiển thị: 5 điểm
Thêm: 2 điểm
Update: 2 điểm
Chức năng tìm kiếm theo tên cặp sách: 1 điểm
Trường laptop là radio button

