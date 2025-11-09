CREATE DATABASE Assignment2Java
GO
USE Assignment2Java
GO

CREATE TABLE Nguoi (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    HoTen NVARCHAR(100) NOT NULL,
    GioiTinh NVARCHAR(100) NOT NULL
)
GO

CREATE TABLE Sach (
    ID INT IDENTITY(1,1) PRIMARY KEY,
    TenSach NVARCHAR(100) NOT NULL,
    GiaBan FLOAT NOT NULL,
    Loai NVARCHAR(100) NOT NULL
)
GO

INSERT INTO Nguoi (HoTen, GioiTinh)
VALUES 
('Nguyen Van A', 'Nam'),
('Tran Thi B', 'Nu'),
('Pham Van C', 'Nam'),
('Le Thi D', 'Nu'),
('Ngo Van E', 'Nam'),
('Vo Thi F', 'Nu'),
('Dang Van G', 'Nam'),
('Hoang Thi H', 'Nu'),
('Bui Van I', 'Nam'),
('Do Thi J', 'Nu');
GO

INSERT INTO Sach (TenSach, GiaBan, Loai)
VALUES 
('Lap trinh Java co ban', 150.0, 'Giao trinh'),
('Ky thuat phan tich du lieu', 200.0, 'Khoa hoc'),
('Tieu thuyet kinh dien', 300.0, 'Van hoc'),
('Sach giao duc tre em', 120.0, 'Giao duc'),
('Huong dan tu hoc Python', 180.0, 'Giao trinh'),
('Tam ly hoc hien dai', 250.0, 'Khoa hoc'),
('Truyen ngan Viet Nam', 130.0, 'Van hoc'),
('Cam nang suc khoe', 220.0, 'Y hoc'),
('Tu duy logic', 170.0, 'Phat trien ban than'),
('Lap trinh C nang cao', 400.0, 'Giao trinh');
GO

SELECT * FROM Nguoi
SELECT * FROM Sach

-- GO
-- DROP TABLE Nguoi
-- DROP TABLE Sach