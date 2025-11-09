USE LuyenTapLan1
GO

-- Create the department table
CREATE TABLE phong_ban (
	id INT PRIMARY KEY IDENTITY(1,1),
	ten_phong_ban NVARCHAR(255) NOT NULL,
	vi_tri NVARCHAR(255)
);
GO

-- Create the employee table
CREATE TABLE nhan_vien (
	id INT PRIMARY KEY IDENTITY(1,1),
	ma_phong_ban INT,
	ten_nhan_vien NVARCHAR(255) NOT NULL,
	ngay_sinh DATE,
	gioi_tinh BIT, -- 1 for Male, 0 for Female
	luong FLOAT NOT NULL,
	FOREIGN KEY (ma_phong_ban) REFERENCES phong_ban(id)
);
GO

-- Insert data into phong_ban
INSERT INTO phong_ban (ten_phong_ban, vi_tri) VALUES
(N'Phòng Kỹ thuật', N'Tầng 3'),
(N'Phòng Marketing', N'Tầng 2'),
(N'Phòng Kế toán', N'Tầng 1');
GO

-- Insert data into nhan_vien
INSERT INTO nhan_vien (ma_phong_ban, ten_nhan_vien, ngay_sinh, gioi_tinh, luong) VALUES
(1, N'Trần Văn E', '1990-05-10', 1, 15000000.00),
(2, N'Nguyễn Thị F', '1992-11-20', 0, 12000000.00),
(1, N'Lê Minh G', '1988-03-15', 1, 18000000.00),
(3, N'Phạm Thu H', '1995-07-01', 0, 10000000.00);
GO

SELECT * FROM phong_ban
select * from nhan_vien