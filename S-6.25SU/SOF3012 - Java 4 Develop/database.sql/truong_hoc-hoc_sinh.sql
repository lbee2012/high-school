USE SD20205;
GO
-- Tạo bảng truong_hoc
CREATE TABLE truong_hoc (
    id INT IDENTITY(41,1) PRIMARY KEY,
    ten_truong NVARCHAR(100)
);
GO

-- Tạo bảng hoc_sinh
CREATE TABLE hoc_sinh (
    id INT IDENTITY(41,1) PRIMARY KEY,
    ten_hoc_sinh NVARCHAR(100),
    tuoi INT,
    dang_hoc BIT,
    truong_id INT FOREIGN KEY REFERENCES truong_hoc(id)
);
GO

-- Thêm dữ liệu vào truong_hoc
INSERT INTO truong_hoc (ten_truong) VALUES
(N'Trường THPT Chuyên Hà Nội - Amsterdam'),
(N'Trường THPT Nguyễn Huệ'),
(N'Trường THPT Lê Quý Đôn'),
(N'Trường THPT Phan Đình Phùng'),
(N'Trường THPT Chu Văn An');
GO

-- Thêm dữ liệu vào hoc_sinh
INSERT INTO hoc_sinh (ten_hoc_sinh, tuoi, dang_hoc, truong_id) VALUES
(N'Nguyễn Văn An', 17, 1, 41),
(N'Lê Thị Bích', 18, 1, 41),
(N'Trần Quốc Toàn', 17, 1, 42),
(N'Phạm Hoàng Nam', 18, 0, 42),
(N'Hoàng Minh Anh', 17, 1, 43),
(N'Ngô Khánh Linh', 18, 0, 43),
(N'Vũ Gia Huy', 18, 1, 44),
(N'Lê Thùy Trang', 17, 1, 44),
(N'Phạm Minh Châu', 17, 1, 45),
(N'Đặng Hồng Sơn', 18, 1, 45);
GO

SELECT * FROM truong_hoc
SELECT * FROM hoc_sinh

'CRUD bảng hoc_sinh, 
load được combobox dang_hoc,
sử dụng được radio button dang_hoc: 0 - không, 1 - có
phân trang - mỗi trang 3 bản ghi,
tìm kiếm học sinh được theo tuổi
chức năng nâng cao: có 2 account admin và học sinh. Admin có thể thêm sửa xóa được, còn học sinh chỉ có thể xem thông tin'