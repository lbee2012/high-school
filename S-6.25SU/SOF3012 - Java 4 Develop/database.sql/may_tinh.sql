USE BoTucSOF3012
GO

CREATE TABLE may_tinh (
    id INT IDENTITY(1,1) PRIMARY KEY,
    hang NVARCHAR(255),
    ton_kho INT,
    bo_nho FLOAT
);
GO
INSERT INTO may_tinh (hang, ton_kho, bo_nho) VALUES (N'Dell', 10, 250.1);
GO
INSERT INTO may_tinh (hang, ton_kho, bo_nho) VALUES (N'HP', 15, 320.3);
GO
INSERT INTO may_tinh (hang, ton_kho, bo_nho) VALUES (N'Apple', 8, 210.5);
GO
INSERT INTO may_tinh (hang, ton_kho, bo_nho) VALUES (N'Sony', 12, 280.6);
GO

SELECT * FROM may_tinh