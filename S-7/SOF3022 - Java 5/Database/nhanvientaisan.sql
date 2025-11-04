CREATE DATABASE TUTORSOF3022FA25
GO

USE TUTORSOF3022FA25;
CREATE TABLE NhanVien(
	id int PRIMARY KEY IDENTITY(1,1),
	ten nvarchar(50),
	luong float,
	gioi_tinh bit
)
GO
INSERT INTO NhanVien
VALUES
	(N'Nguyễn Văn A', 5.6, 0),
	(N'Nguyễn Thị B', 7.6, 1),
	(N'Nguyễn Trần C', 9.6, 0),
	(N'Nguyễn Hương D', 2.6, 1);
GO

USE TUTORSOF3022FA25
GO
CREATE TABLE GauBong (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(100) NOT NULL,
	chieu_dai FLOAT NOT NULL,
	chieu_cao FLOAT NOT NULL,
	dep BIT -- 0 la xau, 1 la dep
)
GO
INSERT INTO GauBong
VALUES
	('Mickey', 2.3, 4.1, 0),
	('Doraemon', 5.3, 3.1, 1),
	('Doraemi', 7.1, 5.5, 0),
	('Nobita', 2.7, 6.6, 1),
	('Suneo', 8.4, 2.5, 0);
GO

USE TUTORSOF3022FA25
GO
CREATE TABLE TaiSan (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(100) NOT NULL,
	nam_san_xuat INT NOT NULL,
	gia FLOAT NOT NULL,
	id_nhan_vien int,
	FOREIGN KEY (id_nhan_vien) REFERENCES NhanVien(id)
)
GO
INSERT INTO TaiSan
VALUES
(N'Kim cương', 2024, 199, 1),
(N'Vàng', 2024, 199, 2),
(N'Đá quý', 2024, 199, 3),
(N'Ruby', 2024, 199, 4);
GO


SELECT * FROM NhanVien;
SELECT * FROM GauBong;
SELECT * FROM TaiSan;