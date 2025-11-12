USE SD20205
GO

CREATE TABLE the_loai (
    id INT PRIMARY KEY IDENTITY(1,1),
    ten_the_loai NVARCHAR(255) NOT NULL
);
GO

CREATE TABLE sach (
    id INT PRIMARY KEY IDENTITY(1,1),
    the_loai_id INT,
    ten_sach NVARCHAR(255) NOT NULL,
    tac_gia NVARCHAR(255) NOT NULL,
    gia FLOAT NOT NULL,
    so_luong INT NOT NULL,
    con_hang BIT,
    FOREIGN KEY (the_loai_id) REFERENCES the_loai(id)
);
GO

INSERT INTO the_loai (ten_the_loai) VALUES
(N'Khoa học viễn tưởng'),
(N'Phần kỳ'),
(N'Phi hư cấu'),
(N'Trinh thám');
GO

INSERT INTO sach (the_loai_id, ten_sach, tac_gia, gia, so_luong, con_hang) VALUES
(1, 'Dune', 'Frank Herbert', 20.99, 15, 1),
(2, 'The Hobbit', 'J.R.R. Tolkien', 10.99, 0, 0),
(3, 'Sapiens', 'Yuval Noah Harari', 14.50, 25, 1),
(4, 'The Girl with the Dragon Tattoo', 'Stieg Larsson', 18.00, 0, 0);
GO

