CREATE DATABASE TestLan2
GO
USE TestLan2
GO

-- Tạo bảng tac_gia (Author)
CREATE TABLE tac_gia (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_tac_gia NVARCHAR(255) NOT NULL,
    nam_sinh INT
);
GO

-- Tạo bảng sach (Book)
CREATE TABLE sach (
    id INT PRIMARY KEY IDENTITY(1,1),
    tieu_de NVARCHAR(255) NOT NULL,
    nam_xuat_ban INT,
    tinh_trang BIT, -- 0: Đã bán, 1: Còn hàng
    id_tac_gia INT,
    FOREIGN KEY (id_tac_gia) REFERENCES tac_gia(id)
);
GO

-- Chèn dữ liệu mẫu vào bảng tac_gia
INSERT INTO tac_gia (ten_tac_gia, nam_sinh) VALUES
(N'Nguyễn Nhật Ánh', 1955),
(N'Haruki Murakami', 1949),
(N'Agatha Christie', 1890),
(N'Stephen King', 1947);
GO

-- Chèn dữ liệu mẫu vào bảng sach
INSERT INTO sach (tieu_de, nam_xuat_ban, tinh_trang, id_tac_gia) VALUES
(N'Mắt biếc', 2019, 1, 1),
(N'Rừng Na Uy', 1987, 1, 2),
(N'Án mạng trên chuyến tàu tốc hành Phương Đông', 1934, 0, 3),
(N'IT', 1986, 1, 4),
(N'Cho tôi xin một vé đi tuổi thơ', 2008, 1, 1);
GO

DROP DATABASE ThiLan2