CREATE DATABASE d1023
GO
USE d1023
GO

CREATE TABLE phong (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_phong NVARCHAR(100),
    so_nguoi_toi_da INT
);
GO

CREATE TABLE dat_phong (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_khach_hang NVARCHAR(100),
    id_phong INT,
    so_dem_dat INT,
    trang_thai BIT -- 0: chua thanh toan, 1: da thanh toan
    FOREIGN KEY (id_phong) REFERENCES phong(id)
);
GO

INSERT INTO phong (ten_phong, so_nguoi_toi_da)
VALUES 
(N'Phòng Deluxe Hướng Biển', 4),
(N'Phòng Đơn Tiêu Chuẩn', 1),
(N'Phòng Gia Đình Cao Cấp', 6);
GO

INSERT INTO dat_phong (ten_khach_hang, id_phong, so_dem_dat, trang_thai)
VALUES 
(N'Nguyễn Văn Long', 1, 3, 1),
(N'Trần Thị Mai', 2, 2, 0),
(N'Lê Đức Thịnh', 3, 4, 1),
(N'Phạm Thảo Nhi', 1, 1, 1),
(N'Hoàng Bảo Ngọc', 2, 3, 0),
(N'Đỗ Minh Quân', 3, 2, 1),
(N'Ngô Văn Hậu', 1, 5, 0),
(N'Vũ Phương Linh', 2, 1, 1),
(N'Bùi Hà An', 3, 2, 0),
(N'Phan Tuấn Kiệt', 1, 3, 1);
GO

select * from dat_phong where so_dem_dat between 2 and 3