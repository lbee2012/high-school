--Assignment2

--DROP DATABASE Assignment2
CREATE DATABASE Assignment2
USE Assignment2

GO
--Y3
--BẢNG LOẠI NHÀ
CREATE TABLE LOAINHA (
    MaLoaiNha INT,
    TenLoaiNha NVARCHAR(100),

    PRIMARY KEY (MaLoaiNha)
)

--BẢNG NGƯỜI DÙNG
CREATE TABLE NGUOIDUNG (
    MaNguoiDung INT,
    TenNguoiDung NVARCHAR(100),
    GioiTinh NVARCHAR(100),
    DienThoai NVARCHAR(100),
    DiaChi NVARCHAR(100),
    Quan NVARCHAR(100),
    Email NVARCHAR(100),

    PRIMARY KEY (MaNguoiDung)
)

--BẢNG NHÀ TRỌ
CREATE TABLE NHATRO (
    MaNhaTro INT,
    MaLoaiNha INT,
    DienTich FLOAT,
    GiaPhong FLOAT,
    DiaChi NVARCHAR(100),
    Quan NVARCHAR(100),
    MoTa NVARCHAR(100),
    NgayDangTin DATE,
    MaNguoiLienHe INT,

    PRIMARY KEY (MaNhaTro),
    FOREIGN KEY (MaLoaiNha) REFERENCES LOAINHA(MaLoaiNha),
    FOREIGN KEY (MaNguoiLienHe) REFERENCES NGUOIDUNG(MaNguoiDung)
)

--BẢNG ĐÁNH GIÁ
CREATE TABLE DANHGIA (
    MaDanhGia INT,
    MaNguoiDanhGia INT,
    MaNhaTro INT,
    LikeDislike BIT, --1: Thích, 0: Không thích
    NoiDung NVARCHAR(100),

    PRIMARY KEY (MaDanhGia),
    FOREIGN KEY (MaNguoiDanhGia) REFERENCES NGUOIDUNG(MaNguoiDung),
    FOREIGN KEY (MaNhaTro) REFERENCES NHATRO(MaNhaTro)
)
GO

--DỮ LIỆU LOẠI NHÀ
INSERT INTO LOAINHA VALUES
(1, N'Căn hộ chung cư'),
(2, N'Phòng trọ khép kín'),
(3, N'Nhà riêng')

--DỮ LIỆU NGƯỜI DÙNG
INSERT INTO NGUOIDUNG VALUES
(1, N'Nguyễn Văn A', N'Nam', '0901234561', N'123 Đường ABC', N'Hai Bà Trưng', N'a1@email.com'),
(2, N'Trần Thị B', N'Nữ', '0901234562', N'456 Đường DEF', N'Đống Đa', N'b2@email.com'),
(3, N'Lê Văn C', N'Nam', '0901234563', N'789 Đường GHI', N'Cầu Giấy', N'c3@email.com'),
(4, N'Phạm Thị D', N'Nữ', '0901234564', N'123 Đường JKL', N'Hoàn Kiếm', N'd4@email.com'),
(5, N'Nguyễn Văn E', N'Nam', '0901234565', N'456 Đường MNO', N'Tây Hồ', N'e5@email.com'),
(6, N'Trần Văn F', N'Nam', '0901234566', N'789 Đường PQR', N'Ba Đình', N'f6@email.com'),
(7, N'Phạm Thị G', N'Nữ', '0901234567', N'123 Đường STU', N'Hoàng Mai', N'g7@email.com'),
(8, N'Nguyễn Văn H', N'Nam', '0901234568', N'456 Đường VWX', N'Thanh Xuân', N'h8@email.com'),
(9, N'Trần Thị I', N'Nữ', '0901234569', N'789 Đường YZ', N'Long Biên', N'i9@email.com'),
(10, N'Lê Văn J', N'Nam', '0901234570', N'123 Đường ABC', N'Hai Bà Trưng', N'j10@email.com')

--DỮ LIỆU NHÀ TRỌ
INSERT INTO NHATRO VALUES
(1, 1, 35.50, 3000000, N'123 Đường ABC', N'Hai Bà Trưng', N'Căn hộ mới', '2024-10-01', 1),
(2, 2, 20.00, 1500000, N'456 Đường DEF', N'Đống Đa', N'Phòng trọ rẻ', '2024-10-05', 2),
(3, 3, 50.00, 5000000, N'789 Đường GHI', N'Cầu Giấy', N'Nhà riêng cao cấp', '2024-10-10', 3),
(4, 1, 45.00, 3500000, N'123 Đường JKL', N'Hoàn Kiếm', N'Căn hộ giá rẻ', '2024-10-11', 4),
(5, 2, 25.00, 2000000, N'456 Đường MNO', N'Tây Hồ', N'Phòng trọ thoáng mát', '2024-10-12', 5),
(6, 3, 55.00, 6000000, N'789 Đường PQR', N'Ba Đình', N'Nhà riêng đẹp', '2024-10-13', 6),
(7, 1, 30.00, 2800000, N'123 Đường STU', N'Hoàng Mai', N'Căn hộ mini', '2024-10-14', 7),
(8, 2, 22.50, 1700000, N'456 Đường VWX', N'Thanh Xuân', N'Phòng trọ có cửa sổ', '2024-10-15', 8),
(9, 3, 60.00, 6500000, N'789 Đường YZ', N'Long Biên', N'Nhà riêng mới xây', '2024-10-16', 9),
(10, 1, 40.00, 3200000, N'123 Đường ABC', N'Hai Bà Trưng', N'Căn hộ đẹp', '2024-10-17', 10)

--DỮ LIỆU ĐÁNH GIÁ
INSERT INTO DANHGIA VALUES
(1, 1, 1, 1, N'Phòng rất đẹp'),
(2, 2, 2, 0, N'Phòng không tốt'),
(3, 3, 3, 1, N'Nhà rất thoáng mát'),
(4, 4, 4, 1, N'Căn hộ giá rẻ'),
(5, 5, 5, 0, N'Phòng không an toàn'),
(6, 6, 6, 1, N'Nhà rất sạch sẽ'),
(7, 7, 7, 0, N'Phòng nhỏ'),
(8, 8, 8, 1, N'Phòng rất yên tĩnh'),
(9, 9, 9, 1, N'Nhà xây mới, rất đẹp'),
(10, 10, 10, 0, N'Căn hộ quá xa')

GO

SELECT * FROM LOAINHA
SELECT * FROM NGUOIDUNG
SELECT * FROM NHATRO
SELECT * FROM DANHGIA
GO
--1
--a
CREATE PROC AddNguoiDung
    @MaNguoiDung INT,
    @TenNguoiDung NVARCHAR(100),
    @GioiTinh NVARCHAR(100),
    @DienThoai NVARCHAR(100),
    @DiaChi NVARCHAR(100),
    @Quan NVARCHAR(100),
    @Email NVARCHAR(100)
AS
BEGIN
    IF @TenNguoiDung IS NULL OR @DienThoai IS NULL OR @Email IS NULL
    BEGIN
        PRINT N'Vui lòng nhập đầy đủ thông tin'
    END
    ELSE
    BEGIN
        INSERT INTO NGUOIDUNG VALUES (@MaNguoiDung, @TenNguoiDung, @GioiTinh, @DienThoai, @DiaChi, @Quan, @Email)
        PRINT N'Thêm người dùng thành công'
    END
END
GO
EXEC AddNguoiDung 11, N'Phạm Văn K', N'Nam', '0901234571', N'123 Đường XYZ', N'Hai Bà Trưng', N'k11@email.com'
GO
EXEC AddNguoiDung 12, NULL, N'Nữ', '0901234572', N'456 Đường ABC', N'Đống Đa', N'l12@email.com' --Lỗi
GO
SELECT * FROM NGUOIDUNG
GO

--b
CREATE PROC AddNhaTro
    @MaNhaTro INT,
    @MaLoaiNha INT,
    @DienTich FLOAT,
    @GiaPhong FLOAT,
    @DiaChi NVARCHAR(100),
    @Quan NVARCHAR(100),
    @MoTa NVARCHAR(100),
    @NgayDangTin DATE,
    @MaNguoiLienHe INT
AS
BEGIN
    IF @GiaPhong <= 0
    BEGIN
        PRINT N'Giá phòng không hợp lệ'
    END
    ELSE
    BEGIN
        INSERT INTO NHATRO VALUES (@MaNhaTro, @MaLoaiNha, @DienTich, @GiaPhong, @DiaChi, @Quan, @MoTa, @NgayDangTin, @MaNguoiLienHe);
        PRINT N'Thêm nhà trọ thành công'
    END
END
GO

EXEC AddNhaTro 11, 1, 35.50, 3200000, N'789 Đường EFG', N'Hai Bà Trưng', N'Căn hộ mới đẹp', '2024-10-18', 1
GO
EXEC AddNhaTro 12, 2, 20.00, 0, N'456 Đường LMN', N'Ba Đình', N'Phòng rẻ', '2024-10-19', 2 --Lỗi
GO
SELECT * FROM NHATRO
GO

--c
CREATE PROC AddDanhGia
    @MaDanhGia INT,
    @MaNguoiDanhGia INT,
    @MaNhaTro INT,
    @LikeDislike BIT,
    @NoiDung NVARCHAR(100)
AS
BEGIN
    IF @MaNguoiDanhGia IS NULL OR @MaNhaTro IS NULL OR @NoiDung IS NULL
    BEGIN
        PRINT N'Vui lòng nhập đầy đủ thông tin'
    END
    ELSE
    BEGIN
        INSERT INTO DANHGIA VALUES (@MaDanhGia, @MaNguoiDanhGia, @MaNhaTro, @LikeDislike, @NoiDung)
        PRINT N'Thêm đánh giá thành công'
    END
END
GO
EXEC AddDanhGia 1, 1, 1, 1, N'Phòng rất đẹp'
GO
EXEC AddDanhGia 2, NULL, 1, 0, N'Phòng không tốt' --LỖI
GO

--2
--a
CREATE PROC TimKiemNhaTro
    @Quan NVARCHAR(100),
    @MinDienTich FLOAT,
    @MaxDienTich FLOAT,
    @MinGia FLOAT,
    @MaxGia FLOAT,
    @LoaiNha INT
AS
BEGIN
    SELECT MaNhaTro, DiaChi, DienTich, GiaPhong, MoTa, NgayDangTin
    FROM NHATRO NT
    WHERE Quan = @Quan
      AND DienTich BETWEEN @MinDienTich AND @MaxDienTich
      AND GiaPhong BETWEEN @MinGia AND @MaxGia
      AND MaLoaiNha = @LoaiNha
END
GO
EXEC TimKiemNhaTro N'Hai Bà Trưng', 20.0, 50.0, 1500000, 4000000, 1

EXEC TimKiemNhaTro N'Đống Đa', 15.0, 30.0, 1000000, 2000000, 2
GO

--b
CREATE FUNCTION GetMaNguoiDung(
    @TenNguoiDung NVARCHAR(100),
    @DienThoai NVARCHAR(100),
    @Email NVARCHAR(100)
) 
RETURNS INT
AS
BEGIN
    DECLARE @MaNguoiDung INT;

    SELECT @MaNguoiDung = MaNguoiDung
    FROM NGUOIDUNG
    WHERE TenNguoiDung = @TenNguoiDung 
      AND DienThoai = @DienThoai
      AND Email = @Email;

    RETURN ISNULL(@MaNguoiDung, 0);
END
GO
SELECT dbo.GetMaNguoiDung(N'Nguyễn Văn A', '0901234561', 'a1@email.com')

SELECT dbo.GetMaNguoiDung(N'Trần Thị B', '0901234562', 'b2@email.com')
GO

--c
CREATE FUNCTION TongLikeDislike(@MaNhaTro INT)
RETURNS INT
AS
BEGIN
    DECLARE @Tong INT
    
    SELECT @Tong = COUNT(LikeDislike)
    FROM DANHGIA
    WHERE MaNhaTro = @MaNhaTro AND LikeDislike IN (0, 1)
    
    RETURN @Tong
END
GO
SELECT dbo.TongLikeDislike(1)
GO
SELECT dbo.TongLikeDislike(2)
GO

--d
CREATE VIEW Top10NhaTroLike AS
SELECT TOP 10 
    NT.*, 
    COUNT(DG.LikeDislike) AS SoLike
FROM 
    NHATRO NT
JOIN 
    DANHGIA DG ON NT.MaNhaTro = DG.MaNhaTro
WHERE 
    DG.LikeDislike = 1
GROUP BY 
    NT.MaNhaTro, 
    NT.DienTich, 
    NT.GiaPhong, 
    NT.DiaChi, 
    NT.Quan, 
    NT.MoTa, 
    NT.NgayDangTin
ORDER BY 
    SoLike DESC
GO
SELECT * FROM Top10NhaTroLike
GO

--e
CREATE PROC ThongTinDanhGia
    @MaNhaTro INT
AS
BEGIN
    SELECT 
        NT.MaNhaTro,
        ND.TenNguoiDung,
        DG.LikeDislike,
        DG.NoiDung
    FROM 
        DANHGIA DG
    JOIN
        NHATRO NT ON DG.MaNhaTro = NT.MaNhaTro
    JOIN 
        NGUOIDUNG ND ON DG.MaNguoiDanhGia = ND.MaNguoiDung
    WHERE 
        DG.MaNhaTro = @MaNhaTro
END
GO
EXEC ThongTinDanhGia 1
GO
EXEC ThongTinDanhGia 2
GO

--3
--a
CREATE PROCEDURE XoaTheoDislike 
    @SoLuongDislike INT
AS
BEGIN
    BEGIN TRY
        BEGIN TRANSACTION

        DELETE FROM DanhGia
        WHERE MaNhaTro IN (
            SELECT MaNhaTro FROM NhaTro
            WHERE TongSoDislike > @SoLuongDislike
        )

        DELETE FROM NhaTro
        WHERE TongSoDislike > @SoLuongDislike

        COMMIT TRANSACTION
    END TRY
    BEGIN CATCH
        ROLLBACK TRANSACTION
        THROW
    END CATCH
END
GO
EXEC XoaTheoDislike 1
GO
EXEC XoaTheoDislike 2
GO

--b
CREATE PROCEDURE XoaTheoThoiGianDangTin (
    @TuNgay DATE,
    @DenNgay DATE
)
AS
BEGIN
    BEGIN TRY
        BEGIN TRANSACTION

        DELETE FROM DanhGia
        WHERE MaNhaTro IN (
            SELECT MaNhaTro FROM NhaTro
            WHERE NgayDangTin BETWEEN @TuNgay AND @DenNgay
        )

        DELETE FROM NhaTro
        WHERE NgayDangTin BETWEEN @TuNgay AND @DenNgay

        COMMIT TRANSACTION
    END TRY
    BEGIN CATCH
        ROLLBACK TRANSACTION
        THROW
    END CATCH
END
GO
EXEC XoaTheoThoiGianDangTin '2024-01-01', '2024-06-01'
GO
EXEC XoaTheoThoiGianDangTin '2024-06-01', '2024-12-01'
GO

DROP DATABASE Assignment2