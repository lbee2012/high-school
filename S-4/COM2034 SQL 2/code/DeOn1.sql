-- đề ôn 1
CREATE DATABASE DeOn1
GO
USE DeOn1
GO
-- Bảng Events (Sự kiện)
CREATE TABLE Events (
    event_id INT PRIMARY KEY,
    event_name NVARCHAR(100),
    event_date DATE NOT NULL,
    event_location NVARCHAR(100)
)
-- Bảng Artists (Nghệ sĩ)
CREATE TABLE Artists (
    artist_id INT PRIMARY KEY,
    artist_name NVARCHAR(100) NOT NULL
)
-- Bảng Tickets (Vé)
CREATE TABLE Tickets (
    ticket_id INT PRIMARY KEY,
    event_id INT NOT NULL,
    price FLOAT NOT NULL CHECK (price > 0),
    quantity INT NOT NULL CHECK (quantity > 0),
    FOREIGN KEY (event_id) REFERENCES Events(event_id)
)
GO
-- Insert dữ liệu vào bảng Events
INSERT INTO Events VALUES
(1, N'Hội Chợ Ẩm Thực', '2024-11-01', N'Hà Nội'),
(2, N'Lễ Hội Âm Nhạc', '2024-11-15', N'Đà Nẵng'),
(3, N'Triển Lãm Nghệ Thuật', '2024-12-01', N'TP HCM')
-- Insert dữ liệu vào bảng Artists
INSERT INTO Artists VALUES
(1, N'Nguyễn Văn A'),
(2, N'Trần Thị B'),
(3, N'Lê Hồng C')
-- Insert dữ liệu vào bảng Tickets
INSERT INTO Tickets VALUES
(1, 1, 50000, 100),
(2, 2, 75000, 150),
(3, 3, 100000, 200)
GO
SELECT * FROM Events
SELECT * FROM Artists
SELECT * FROM Tickets
GO
-- PROC Add
-- Add Events
CREATE PROC AddEvents
    @event_id INT,
    @event_name NVARCHAR(100),
    @event_date DATE,
    @event_location NVARCHAR(100)
AS
BEGIN
    IF @event_name
END
-- Add Artists

-- Add Tickets

-- 1. Yêu cầu về Stored Procedures (CRUD)
-- Thêm sự kiện mới: Tạo thủ tục để thêm một sự kiện mới vào bảng Events với tên, ngày tháng, và địa điểm. Dữ liệu sẽ được kiểm tra để đảm bảo không null.
-- Cập nhật thông tin nghệ sĩ: Tạo thủ tục cập nhật tên nghệ sĩ dựa trên artist_id. Sử dụng câu lệnh `UPDATE` để thay đổi tên dựa vào ID.
-- Xóa vé: Tạo thủ tục xóa một vé từ bảng Tickets dựa trên ticket_id. Sử dụng `DELETE` để xóa bản ghi.
-- Truy xuất thông tin sự kiện: Tạo thủ tục lấy tất cả thông tin của một sự kiện dựa trên event_id bằng `SELECT`.
-- Tăng số lượng vé: Tạo thủ tục để tăng số lượng vé trong bảng Tickets, ví dụ thêm 50 vé.

-- 2. Yêu cầu về Functions (Tính toán)
-- Tính tổng doanh thu sự kiện: Tạo function tính tổng doanh thu của sự kiện (price * quantity) dựa trên event_id.
-- Tính số ngày đến sự kiện: Tạo function tính số ngày còn lại đến sự kiện, sử dụng `event_date - GETDATE()`.
-- Kiểm tra giá vé hợp lệ: Tạo function kiểm tra xem giá vé có lớn hơn 0 hay không.
-- Tính số lượng vé còn lại: Tạo function tính tổng số vé còn lại cho một sự kiện (số lượng vé - vé đã bán).
-- Tính giá trung bình vé: Tạo function tính giá vé trung bình cho một sự kiện.

-- 3. Yêu cầu về Views (SELECT và tính toán)
-- Danh sách sự kiện sắp diễn ra: Tạo view hiển thị các sự kiện diễn ra trong 30 ngày tới, sử dụng `GETDATE()` và phép so sánh thời gian.
-- Top 5 sự kiện có nhiều vé nhất: Tạo view sắp xếp sự kiện theo số lượng vé giảm dần và lấy top 5.
-- Tính tổng doanh thu từ sự kiện: Tạo view hiển thị tổng doanh thu cho mỗi sự kiện.
-- Nối tên nghệ sĩ và sự kiện: Tạo view kết hợp thông tin từ Artists và Events sử dụng `INNER JOIN`.
-- Tách chuỗi thông tin sự kiện: Tạo view để tách từng phần của tên sự kiện nếu có dấu cách.
-- Ngày kết thúc sự kiện: Tính ngày kết thúc sự kiện bằng cách cộng 3 ngày vào event_date.
-- Giảm giá vé trước 7 ngày: Tạo view tính toán giá vé giảm trong 7 ngày trước sự kiện.
-- Số ngày còn lại đến sự kiện: Tạo view sử dụng `DATEDIFF` để tính số ngày còn lại.

-- 4. Yêu cầu về Transactions
-- Bán vé và cập nhật số lượng: Tạo transaction để giảm số lượng vé sau khi bán và cập nhật doanh thu.
-- Tạo sự kiện và thêm vé: Tạo transaction để thêm sự kiện mới và các vé, rollback nếu có lỗi.
-- Xóa sự kiện và vé liên quan: Tạo transaction để xóa sự kiện và tất cả vé liên quan. Nếu xóa vé thất bại, rollback xóa sự kiện.