-- Thi thử
-- 1
-- DROP DATABASE ThiThu1810
CREATE DATABASE ThiThu18101
GO
USE ThiThu18101
GO
CREATE TABLE VATTU (
    MaVT INT PRIMARY KEY,
    TenVT NVARCHAR(100),
    DVTinh NVARCHAR(100)
)
CREATE TABLE PHIEUXUAT (
    SoPX int PRIMARY KEY,
    NgayXuat DATE
)
CREATE TABLE CTPXUAT (
    SoPX INT,
    MaVT INT,
    SLXuat INT,
    DonGia FLOAT,

    PRIMARY KEY (SoPX, MaVT),
    FOREIGN KEY (MaVT) REFERENCES VATTU(MaVT),
    FOREIGN KEY (SoPX) REFERENCES PHIEUXUAT(SoPX)
)
GO

--2
CREATE PROC AddVATTU 
    @MaVT INT,
    @TenVT NVARCHAR(100),
    @DVTinh NVARCHAR(100)
AS
BEGIN
    IF @MaVT IS NULL
    BEGIN
        PRINT N'Vui lòng nhập đầy đủ thông tin'
    END
    ELSE IF
    ELSE
    BEGIN
        INSERT INTO VATTU VALUES (@MaVT, @TenVT, @DVTinh)
        PRINT N'Thêm vật tư thành công'
    END
END
GO
EXEC AddVATTU 1, N'Bản lề', N'Cái'
GO
EXEC AddVATTU 2, N'Đinh ốc', N'Bịch'
GO
EXEC AddVATTU 3, N'Tấm lợp', N'Tấm'
GO

CREATE PROC AddPHIEUXUAT 
    @SoPX INT,
    @NgayXuat DATE
AS
BEGIN
    IF @SoPX IS NULL
    BEGIN
        PRINT N'Vui lòng nhập đầy đủ thông tin'
    END
    ELSE
    BEGIN
        INSERT INTO PHIEUXUAT VALUES (@SoPX, @NgayXuat)
        PRINT N'Thêm phiếu xuất thành công'
    END
END
GO
EXEC ADDPHIEUXUAT 101, '2024-01-15'
GO
EXEC AddPHIEUXUAT 102, '2024-02-10'
GO
EXEC AddPHIEUXUAT 103, '2024-03-05'
GO

CREATE PROC AddCTPXUAT 
    @SoPX INT,
    @MaVT INT,
    @SLXuat INT,
    @DonGia FLOAT
AS
BEGIN
    IF @SoPX IS NULL OR @MaVT IS NULL OR @SLXuat IS NULL OR @DonGia IS NULL
    BEGIN
        PRINT N'Vui lòng nhập đầy đủ thông tin'
    END
    ELSE
    BEGIN
        INSERT INTO CTPXUAT VALUES (@SoPX, @MaVT, @SLXuat, @DonGia)
        PRINT N'Thêm phiếu xuất thành công'
    END
END
GO
EXEC AddCTPXUAT 101, 1, 3, 15000
GO
EXEC AddCTPXUAT 102, 2, 2, 30000
GO
EXEC AddCTPXUAT 103, 3, 5, 50000
GO

SELECT * FROM VATTU
SELECT * FROM PHIEUXUAT
SELECT * FROM CTPXUAT
GO

--4
CREATE VIEW Top2PhieuGiaTriLon AS
SELECT 
    VT.MaVT, 
    VT.TenVT, 
    PX.NgayXuat, 
    CT.SLXuat, 
    CT.DonGia, 
    (CT.SLXuat * CT.DonGia) AS "ThanhTienGiaTriMAX"
FROM PHIEUXUAT PX
JOIN CTPXUAT CT ON PX.SoPX = CT.SoPX
JOIN VATTU VT ON CT.MaVT = VT.MaVT
GO
SELECT * FROM Top2PhieuGiaTriLon