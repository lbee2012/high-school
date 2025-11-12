CREATE DATABASE n2711
GO
USE n2711
GO
CREATE TABLE Tablets (
    TabletID INT PRIMARY KEY IDENTITY(1,1), -- ID tự tăng
    Brand NVARCHAR(50) NOT NULL,           -- Thương hiệu
    Model NVARCHAR(100) NOT NULL,          -- Model
    ScreenSize DECIMAL(5,2),               -- Kích thước màn hình (inch)
    Storage INT                            -- Bộ nhớ (GB)
);
GO
INSERT INTO Tablets (Brand, Model, ScreenSize, Storage)
VALUES
    ('Apple', 'iPad Pro', 12.9, 512),
    ('Samsung', 'Galaxy Tab S9', 11.0, 256),
    ('Xiaomi', 'Pad 6', 11.0, 128),
    ('Lenovo', 'Tab P11', 11.5, 64);
GO

SELECT * FROM Tablets

SELECT * FROM Tablets
WHERE Storage >= ? AND Storage <= ?