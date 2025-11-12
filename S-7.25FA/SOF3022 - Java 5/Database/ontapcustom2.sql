CREATE DATABASE ontapcustom2;
GO

/* =========================
   de1 - THU VIỆN (DocGia - PhieuMuon)
   Một độc giả có thể có nhiều phiếu mượn
========================= */
USE ontapcustom2;
GO

CREATE TABLE DocGia (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(50),
    sdt NVARCHAR(15),
    dia_chi NVARCHAR(100)
);
GO

INSERT INTO DocGia(ten, sdt, dia_chi) VALUES
    (N'Vũ Hải Đăng', N'0911002200', N'Quận 1, TP.HCM'),
    (N'Hoàng Thu Trang', N'0988123001', N'Cầu Giấy, Hà Nội'),
    (N'Phạm Đức Bình', N'0977666009', N'Hồng Bàng, Hải Phòng');
GO

CREATE TABLE PhieuMuon (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_phieu NVARCHAR(20),
    ngay_muon NVARCHAR(20),
    ten_sach NVARCHAR(100),
    so_ngay_muon INT,
    id_doc_gia INT FOREIGN KEY REFERENCES DocGia(id)
);
GO

INSERT INTO PhieuMuon(ma_phieu, ngay_muon, ten_sach, so_ngay_muon, id_doc_gia) VALUES
    (N'PM001', N'2025-10-10', N'Clean Code', 7, 1),
    (N'PM002', N'2025-10-11', N'Lập Trình Java Cơ Bản', 14, 1),
    (N'PM003', N'2025-10-12', N'Thiết Kế Cơ Sở Dữ Liệu', 10, 2),
    (N'PM004', N'2025-10-13', N'Head First Design Patterns', 5, 3);
GO

SELECT * FROM DocGia;
SELECT * FROM PhieuMuon;
GO


/* =========================
   de2 - ĐÀO TẠO (GiangVien - KhoaHoc)
   Một giảng viên phụ trách nhiều học phần
========================= */
USE ontapcustom2;
GO

CREATE TABLE GiangVien (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(50),
    bo_mon NVARCHAR(50),
    nam_kinh_nghiem INT
);
GO

INSERT INTO GiangVien(ten, bo_mon, nam_kinh_nghiem) VALUES
    (N'Nguyễn Thị Lan', N'Công nghệ phần mềm', 9),
    (N'Phan Văn Huy',  N'Hệ thống thông tin', 7),
    (N'Lưu Minh Khoa', N'Khoa học dữ liệu', 5);
GO

CREATE TABLE KhoaHoc (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_khoa_hoc NVARCHAR(20),
    ten_khoa_hoc NVARCHAR(100),
    so_tin_chi INT,
    id_giang_vien INT FOREIGN KEY REFERENCES GiangVien(id)
);
GO

INSERT INTO KhoaHoc(ma_khoa_hoc, ten_khoa_hoc, so_tin_chi, id_giang_vien) VALUES
    (N'IT301', N'Phân tích & Thiết kế HTTT', 3, 2),
    (N'IT302', N'Lập trình Java nâng cao',   3, 1),
    (N'IT303', N'Khai phá dữ liệu',         3, 3),
    (N'IT304', N'Quản lý dự án phần mềm',   2, 1);
GO

SELECT * FROM GiangVien;
SELECT * FROM KhoaHoc;
GO


/* =========================
   de3 - SỬA CHỮA THIẾT BỊ (ThietBi - PhieuSua)
   Một thiết bị có thể có nhiều phiếu sửa
========================= */
USE ontapcustom2;
GO

CREATE TABLE ThietBi (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_tb NVARCHAR(20),
    loai_tb NVARCHAR(50),
    hang_sx NVARCHAR(50)
);
GO

INSERT INTO ThietBi(ma_tb, loai_tb, hang_sx) VALUES
    (N'TB001', N'Laptop',  N'Dell'),
    (N'TB002', N'Điện thoại', N'Samsung'),
    (N'TB003', N'Máy in',  N'HP');
GO

CREATE TABLE PhieuSua (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ma_phieu NVARCHAR(20),
    ngay_nhan NVARCHAR(20),
    tinh_trang NVARCHAR(100),
    chi_phi FLOAT,
    id_thiet_bi INT FOREIGN KEY REFERENCES ThietBi(id)
);
GO

INSERT INTO PhieuSua(ma_phieu, ngay_nhan, tinh_trang, chi_phi, id_thiet_bi) VALUES
    (N'PS001', N'2025-10-08', N'Lỗi pin, máy sập nguồn', 450000, 1),
    (N'PS002', N'2025-10-09', N'Vỡ màn hình',            1200000, 2),
    (N'PS003', N'2025-10-10', N'Kẹt giấy, cần vệ sinh',    300000, 3),
    (N'PS004', N'2025-10-12', N'Quá nhiệt, cần thay keo',  500000, 1);
GO

SELECT * FROM ThietBi;
SELECT * FROM PhieuSua;
GO
