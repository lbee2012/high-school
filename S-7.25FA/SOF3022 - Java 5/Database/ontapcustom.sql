CREATE DATABASE ontapcustom;
GO

--de1
USE ontapcustom;
GO

CREATE TABLE KhachHang (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(50),
	sdt NVARCHAR(15),
	dia_chi NVARCHAR(100)
);
GO

INSERT INTO KhachHang(ten, sdt, dia_chi)
VALUES
	(N'Nguyễn Minh Long', N'0912345678', N'Hà Nội'),
	(N'Trần Thị Hoa', N'0988123456', N'Hải Phòng'),
	(N'Lê Văn Nam', N'0977665544', N'Đà Nẵng'),
	(N'Phạm Hương Ly', N'0909090909', N'Cần Thơ');
GO


CREATE TABLE DonHang (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ma_don NVARCHAR(20),
	ngay_dat NVARCHAR(20),
	tong_tien FLOAT,
	id_khach_hang INT FOREIGN KEY REFERENCES KhachHang(id)
);
GO

INSERT INTO DonHang(ma_don, ngay_dat, tong_tien, id_khach_hang)
VALUES
	('DH001', '2025-10-01', 1200000, 1),
	('DH002', '2025-10-02', 350000,  1),
	('DH003', '2025-10-05', 780000,  2),
	('DH004', '2025-10-06', 220000,  3),
	('DH005', '2025-10-07', 910000,  4);
GO

SELECT * FROM KhachHang;
SELECT * FROM DonHang;
GO

--de2
USE ontapcustom
GO

CREATE TABLE LopHoc (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten_lop NVARCHAR(50),
	giao_vien_chu_nhiem NVARCHAR(50)
);
GO

INSERT INTO LopHoc(ten_lop, giao_vien_chu_nhiem)
VALUES
	(N'12A1', N'Nguyễn Văn Tâm'),
	(N'12A2', N'Trần Thị Mai'),
	(N'11A1', N'Lê Văn Hòa');
GO

CREATE TABLE HocSinh (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(50),
	tuoi INT,
	gioi_tinh BIT,   -- 0 = Nam, 1 = Nữ
	id_lop INT FOREIGN KEY REFERENCES LopHoc(id)
);
GO

INSERT INTO HocSinh(ten, tuoi, gioi_tinh, id_lop)
VALUES
	(N'Phạm Minh Long', 17, 0, 1),
	(N'Nguyễn Hồng Ánh', 17, 1, 1),
	(N'Lê Quốc Huy', 16, 0, 2),
	(N'Đỗ Thị Linh', 16, 1, 2),
	(N'Trần Văn Dũng', 15, 0, 3);
GO

SELECT * FROM LopHoc;
SELECT * FROM HocSinh;
GO

--de3
USE ontapcustom
GO

CREATE TABLE BacSi (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(50),
	chuyen_khoa NVARCHAR(50),
	so_nam_kinh_nghiem INT
);
GO

INSERT INTO BacSi(ten, chuyen_khoa, so_nam_kinh_nghiem)
VALUES
	(N'Nguyễn Đức Hùng', N'Nội tổng hợp', 12),
	(N'Lê Thị Hòa', N'Nhi khoa', 8),
	(N'Trần Văn Quang', N'Ngoại khoa', 10);
GO

CREATE TABLE BenhNhan (
	id INT IDENTITY(1,1) PRIMARY KEY,
	ten NVARCHAR(50),
	tuoi INT,
	gioi_tinh BIT,   -- 0 = Nam, 1 = Nữ
	chuan_doan NVARCHAR(100),
	id_bac_si INT FOREIGN KEY REFERENCES BacSi(id)
);
GO

INSERT INTO BenhNhan(ten, tuoi, gioi_tinh, chuan_doan, id_bac_si)
VALUES
	(N'Phạm Anh Tuấn', 30, 0, N'Cảm cúm', 1),
	(N'Nguyễn Hồng Nhung', 4, 1, N'Sốt siêu vi', 2),
	(N'Lê Văn Trí', 55, 0, N'Đau dạ dày', 1),
	(N'Đỗ Hoàng Minh', 40, 0, N'Gãy tay', 3);
GO

SELECT * FROM BacSi;
SELECT * FROM BenhNhan;