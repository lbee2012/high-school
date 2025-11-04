USE SOF3022;
Go
CREATE TABLE danh_muc (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(100) NOT NULL,
    cap_do INT NOT NULL,
    he_so FLOAT NOT NULL
);
GO

INSERT INTO danh_muc (ten, cap_do, he_so) VALUES
(N'Gia dụng', 1, 1.0),
(N'Máy móc', 2, 1.5),
(N'Đồ chơi', 1, 2.0),
(N'Đồ ăn', 2, 2.5),
(N'Nội thất', 3, 3.0);
GO

USE SOF3022;
GO
CREATE TABLE san_pham(
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(100) NOT NULL,
	gia FLOAT,
	con_bao_hanh BIT, -- 1: con bao hanh, 0: het bao hanh
	id_danh_muc INT,
	FOREIGN KEY(id_danh_muc) REFERENCES danh_muc(id)
)
GO
INSERT INTO san_pham
VALUES 
	('Quat', 4.4, 1, 1),
	('PC', 5.4, 0, 2),
	('Hamburger', 9.2, 0, 3),
	('Ban hoc', 10.3, 1, 4);
GO