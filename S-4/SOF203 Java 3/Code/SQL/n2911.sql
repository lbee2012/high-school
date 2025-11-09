CREATE DATABASE n2911
GO
USE n2911
GO

CREATE TABLE HoaDon (
    MaHoaDon INT ,                                   -- Mã hóa đơn
    NgayLap DATE NOT NULL,                           -- Ngày lập hóa đơn
    MaKhachHang INT NOT NULL,                        -- Mã khách hàng
    TongTien DECIMAL(18, 2) NOT NULL,                -- Tổng tiền hóa đơn
    TrangThai VARCHAR(50) DEFAULT 'Chưa thanh toán', -- Trạng thái hóa đơn
    GhiChu TEXT,                                     -- Ghi chú
    
);

GO
INSERT INTO HoaDon (MaHoaDon, NgayLap, MaKhachHang, TongTien, TrangThai, GhiChu)
VALUES
(1, '2024-11-01', 101, 500000.00, 'Chua thanh toan', 'Hoa don mua sam'),
(2, '2024-11-02', 102, 750000.00, 'Da thanh toan', 'Hoa don thanh toan qua the'),
(3, '2024-11-03', 103, 1200000.00, 'Chua thanh toan', 'Khach hang dang cho xac nhan'),
(4, '2024-11-04', 104, 350000.00, 'Da thanh toan', 'Hoa don cho dich vu'),
(5, '2024-11-05', 105, 2500000.00, 'Chua thanh toan', 'Hoa don dat hang truc tuyen'),
(6, '2024-11-06', 106, 420000.00, 'Chua thanh toan', 'Khach hang mua tai cua hang'),
(7, '2024-11-07', 107, 800000.00, 'Da thanh toan', 'Hoa don da duoc giao dich'),
(8, '2024-11-08', 108, 1600000.00, 'Chua thanh toan', 'Hoa don voi chinh sach uu dai'),
(9, '2024-11-09', 109, 700000.00, 'Da thanh toan', 'Khach hang thanh toan tien mat'),
(10, '2024-11-10', 110, 950000.00, 'Chua thanh toan', 'Hoa don dang cho phe duyet');

GO
INSERT INTO HoaDon (MaHoaDon, NgayLap, MaKhachHang, TongTien, TrangThai, GhiChu)
VALUES
(?, ?, ?, ?, ?, ?)

GO
UPDATE HoaDon
SET MaHoaDon = ?, NgayLap = ?, MaKhachHang = ?, TongTien = ?, TrangThai = ?, GhiChu = ?

GO
DELETE FROM HoaDon WHERE MaHoaDon = ?


-- Thực hiện các chức năng hiển thị, thêm, sửa , xoá cơ bản
-- Thiết kế màn hình thực hiện chức năng tìm kiếm hoá đơn theo ngày lập hoá đơn