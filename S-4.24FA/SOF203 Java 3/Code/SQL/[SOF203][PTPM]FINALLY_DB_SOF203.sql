USE [master]
GO

CREATE DATABASE [PTPM_FINALLY_JAVA_SOF203]
GO

USE [PTPM_FINALLY_JAVA_SOF203]
GO

CREATE TABLE [dbo].[Ban](
	[Id] [uniqueidentifier] PRIMARY KEY ,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[NgaySinh] [date] NULL,
	[SoThich] [nvarchar](30) NULL,
	[GioiTinh] [int] NULL,
	[IdMQH] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
)

CREATE TABLE [dbo].[ChucVu](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
)


CREATE TABLE [dbo].[LoaiSP](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
)

CREATE TABLE [dbo].[LoaiXM](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
)

CREATE TABLE [dbo].[MoiQuanHe](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
)

CREATE TABLE [dbo].[NhanVien](
	[Id] [uniqueidentifier] PRIMARY KEY, 
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[TenDem] [nvarchar](30) NULL,
	[Ho] [nvarchar](30) NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[NgaySinh] [date] NULL,
	[DiaChi] [nvarchar](100) NULL,
	[Sdt] [varchar](30) NULL,
	[MatKhau] [varchar](max) NULL,
	[IdCV] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
)

CREATE TABLE [dbo].[NXB](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](50) NULL,
)

CREATE TABLE [dbo].[Sach](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[NgayXuatBan] [date] NULL,
	[SoTrang] [int] NULL,
	[DonGia] [decimal](20, 0) NULL,
	[IdNXB] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
) 

CREATE TABLE [dbo].[SanPham](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[NgaySX] [date] NULL,
	[Mota] [nvarchar](30) NULL,
	[Website] [nvarchar](30) NULL,
	[GiaBan] [decimal](20, 0) NULL,
	[SoLuong] [int] NULL,
	[IdLoaiSP] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
)

CREATE TABLE [dbo].[XeMay](
	[Id] [uniqueidentifier] PRIMARY KEY,
	[Ma] [varchar](20) NULL,
	[Ten] [nvarchar](30) NULL,
	[NgaySX] [date] NULL,
	[Mota] [nvarchar](30) NULL,
	[GiaNhap] [decimal](20, 0) NULL,
	[GiaBan] [decimal](20, 0) NULL,
	[SoLuong] [int] NULL,
	[Website] [nvarchar](30) NULL,
	[IdLXM] [uniqueidentifier] NULL,
	[TrangThai] [int] NULL,
)
GO
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'99430132-dd4a-430d-8f77-3d0f606dffc3', N'Dungna29', N'Nguyễn Anh Dũng', CAST(N'2022-08-01' AS Date), N'Đi chơi', 1, N'1a241616-61d2-43f6-a21e-024d8b34ea74', 0)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'44b81377-7ab8-4442-9942-6b7faf13b84e', N'Khanhpg', N'Phạm Gia Khánh', CAST(N'2022-08-01' AS Date), N'Học lại', 1, NULL, 1)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'23bd39fc-602f-4e1e-aa52-75c7dcd9ed36', N'Nguyenvv4', N'Vũ Văn Nguyên', CAST(N'2022-08-01' AS Date), N'Xem phim', 1, N'76898eeb-45a1-4181-b58d-0a2b9d00e2d6', 1)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'2033f0b5-a8c9-43af-aaaa-b3aed31fe79c', N'TrangNTN', N'Nguyễn Thị Như Trang', CAST(N'2022-08-01' AS Date), N'Đi chơi, xem phim, đá bóng', 0, N'71c733c0-f241-454a-bcc9-a39bbe0fd18d', 1)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'ce0bef65-32f1-4686-ae1d-b9e424a166dd', N'Hangnt169', N'Nguyễn Thúy Hằng', CAST(N'2022-08-01' AS Date), N'Đi chơi, Uống nước lọc', 0, NULL, 1)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'be6ddd57-b28c-4d3a-8493-f031a58ce2b2', N'Tiennh21', N'Nguyễn Hoàng Tiến', CAST(N'2022-08-01' AS Date), N'Đi chơi', 1, N'b2a99881-bd54-4037-8603-f3f162a5ecfd', 1)
INSERT [dbo].[Ban] ([Id], [Ma], [Ten], [NgaySinh], [SoThich], [GioiTinh], [IdMQH], [TrangThai]) VALUES (N'24b894dd-ba35-4edf-8e68-f7f4ce0aa5de', N'Phongtt35', N'Trần Tuấn Phong', CAST(N'2022-08-01' AS Date), N'Chơi Liên Minh', 1, N'02706502-cfbb-44dd-b211-f886d8f459e4', 1)
GO
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'de5a941e-95ee-4361-89f1-b545d2199979', N'GÐ', N'Giám Đốc')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'03209341-f29c-4ed0-8e10-b824e6a9ab70', N'PP', N'Phó Phòng')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'3331757a-35a7-4f1b-bf56-c01b0eccfda3', N'BV', N'Bảo Vệ')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'14bb0eb7-3a70-462e-b782-d36e29381d83', N'TP', N'Trưởng Phòng')
INSERT [dbo].[ChucVu] ([Id], [Ma], [Ten]) VALUES (N'7eb0d939-d23b-4f31-9626-d5a258a8744f', N'NV', N'Nhân Viên')
GO
INSERT [dbo].[LoaiSP] ([Id], [Ma], [Ten]) VALUES (N'677a690f-f4f8-4b34-a4a0-50c01c7444b0', N'PC', N'Để bàn')
INSERT [dbo].[LoaiSP] ([Id], [Ma], [Ten]) VALUES (N'9ddd2b77-e19f-4b4e-86e1-59056888183a', N'LT', N'Laptop')
INSERT [dbo].[LoaiSP] ([Id], [Ma], [Ten]) VALUES (N'04b33f09-c7e6-4b23-a4a9-bbc19d312cd7', N'NB', N'Nhà bếp')
INSERT [dbo].[LoaiSP] ([Id], [Ma], [Ten]) VALUES (N'5f1b24fc-a54f-492e-84cd-c1dd4f0f3a74', N'PN', N'Phòng ngủ')
INSERT [dbo].[LoaiSP] ([Id], [Ma], [Ten]) VALUES (N'07ffd5af-1b72-497f-9590-e7a5a7a35457', N'GD', N'Gia dụng')
GO
INSERT [dbo].[LoaiXM] ([Id], [Ma], [Ten]) VALUES (N'7b49541b-da5e-4415-a2ed-151b0500cf93', N'XMÐ', N'Xe máy điện')
INSERT [dbo].[LoaiXM] ([Id], [Ma], [Ten]) VALUES (N'99a57054-4771-437b-b130-5b3a181f6275', N'XS', N'Xe Số')
INSERT [dbo].[LoaiXM] ([Id], [Ma], [Ten]) VALUES (N'764d3383-9814-4f20-8dc4-aa7700877fa4', N'XG', N'Xe Tay Ga')
INSERT [dbo].[LoaiXM] ([Id], [Ma], [Ten]) VALUES (N'eb3497b5-7f84-454b-af77-e682f8e7bcf4', N'XÐ', N'Xe Điện')
GO
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'1a241616-61d2-43f6-a21e-024d8b34ea74', N'EG', N'Em gái')
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'76898eeb-45a1-4181-b58d-0a2b9d00e2d6', N'BG', N'Bạn gái')
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'71c733c0-f241-454a-bcc9-a39bbe0fd18d', N'ÐC', N'Đồng chí')
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'e0cac81b-d4f0-42b7-b6cf-bc4d7adfaaca', N'AE', N'Anh em')
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'b2a99881-bd54-4037-8603-f3f162a5ecfd', N'BT', N'Bạn trai')
INSERT [dbo].[MoiQuanHe] ([Id], [Ma], [Ten]) VALUES (N'02706502-cfbb-44dd-b211-f886d8f459e4', N'ET', N'Em trai')
GO
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCV], [TrangThai]) VALUES (N'65e0473a-7aca-4d25-b80f-123ac1f5aa1e', N'Nguyenvv4', N'Nguyên', N'Văn', N'Vũ', N'Nam', CAST(N'2022-08-01' AS Date), N'Số 4 Trịnh Văn Bô', N'0123456789', N'123456', N'de5a941e-95ee-4361-89f1-b545d2199979', 1)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCV], [TrangThai]) VALUES (N'7979aa87-3a95-4a1c-8f4f-817dfad172dc', N'Tiennh21', N'Tiến', N'Hoàng', N'Nguyễn', N'Nam', CAST(N'2022-08-01' AS Date), N'Số 2 Trịnh Văn Bô', N'0123456789', N'123456', N'14bb0eb7-3a70-462e-b782-d36e29381d83', 0)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCV], [TrangThai]) VALUES (N'339840bf-28d4-48bf-954a-8df9aff454e5', N'TrangNTN', N'Trang', N'Thị Như', N'Nguyễn', N'Nữ', CAST(N'2022-08-01' AS Date), N'Số 1 Trịnh Văn Bô', N'0123456789', N'123456', N'03209341-f29c-4ed0-8e10-b824e6a9ab70', 1)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCV], [TrangThai]) VALUES (N'e6dc6fb0-8d02-41e4-bca8-d2dcff345963', N'Phongtt35', N'Phong', N'Tuấn', N'Trần', N'Nữ', CAST(N'2022-08-01' AS Date), N'Số 4 Trịnh Văn Bô', N'0123456789', N'123456', N'7eb0d939-d23b-4f31-9626-d5a258a8744f', 1)
INSERT [dbo].[NhanVien] ([Id], [Ma], [Ten], [TenDem], [Ho], [GioiTinh], [NgaySinh], [DiaChi], [Sdt], [MatKhau], [IdCV], [TrangThai]) VALUES (N'fe659c8a-8ca4-4e2e-ab91-dae7bfd70c02', N'Hangnt169', N'Hằng', N'Thúy', N'Nguyễn', N'Nam', CAST(N'2022-08-01' AS Date), N'Số 2 Trịnh Văn Bô', N'0123456789', N'123456', N'3331757a-35a7-4f1b-bf56-c01b0eccfda3', 1)
GO
INSERT [dbo].[NXB] ([Id], [Ma], [Ten]) VALUES (N'f0f8c530-eb43-4dab-b55b-52e95934261a', N'PN', N'Phụ nữ')
INSERT [dbo].[NXB] ([Id], [Ma], [Ten]) VALUES (N'fcdf6f58-4e4c-44aa-a558-54a62f6adecc', N'TP', N'Tiền Phong')
INSERT [dbo].[NXB] ([Id], [Ma], [Ten]) VALUES (N'6f91746c-f6c0-4b9c-bfbb-a70bf360ccfb', N'ND', N'Nhân dân')
INSERT [dbo].[NXB] ([Id], [Ma], [Ten]) VALUES (N'c044efd0-6aa0-497c-9389-a7102eaf641c', N'AD', N'Anh Dũng')
INSERT [dbo].[NXB] ([Id], [Ma], [Ten]) VALUES (N'37fcffa6-26de-4aee-b923-ada8f40c7a96', N'KÐ', N'Kim đồng')
GO
INSERT [dbo].[Sach] ([Id], [Ma], [Ten], [NgayXuatBan], [SoTrang], [DonGia], [IdNXB], [TrangThai]) VALUES (N'c2c9f1a6-9a52-4bf6-92a0-4a7b799af0fa', N'S2', N'Học 2 lần qua môn', CAST(N'2022-07-28' AS Date), 30, CAST(13500000 AS Decimal(20, 0)), NULL, 1)
INSERT [dbo].[Sach] ([Id], [Ma], [Ten], [NgayXuatBan], [SoTrang], [DonGia], [IdNXB], [TrangThai]) VALUES (N'2370efb8-22e2-4083-842b-4f0279343bd6', N'S4', N'Học lại rồi thôi', CAST(N'2022-07-28' AS Date), 12, CAST(43500000 AS Decimal(20, 0)), NULL, 1)
INSERT [dbo].[Sach] ([Id], [Ma], [Ten], [NgayXuatBan], [SoTrang], [DonGia], [IdNXB], [TrangThai]) VALUES (N'bb1b56f8-1cc9-4783-94c1-79a8c1b7acc3', N'S3', N'Học nữa học mãi ', CAST(N'2022-07-28' AS Date), 99, CAST(3500000 AS Decimal(20, 0)), NULL, 0)
INSERT [dbo].[Sach] ([Id], [Ma], [Ten], [NgayXuatBan], [SoTrang], [DonGia], [IdNXB], [TrangThai]) VALUES (N'eb13d64c-9cb0-4cca-86c5-8abf9bf9b9f8', N'S1', N'Học 1 lần qua môn', CAST(N'2022-07-28' AS Date), 200, CAST(6500000 AS Decimal(20, 0)), NULL, 1)
GO
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten], [NgaySX], [Mota], [Website], [GiaBan], [SoLuong], [IdLoaiSP], [TrangThai]) VALUES (N'691c9f02-d301-4c5e-8231-0718922fb5f3', N'SP1', N'Macbook', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', N'fpoly.com', CAST(65000000 AS Decimal(20, 0)), 199, N'9ddd2b77-e19f-4b4e-86e1-59056888183a', 1)
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten], [NgaySX], [Mota], [Website], [GiaBan], [SoLuong], [IdLoaiSP], [TrangThai]) VALUES (N'a0c6a898-4ce4-4138-9e6b-07c455407035', N'SP3', N'Giường ngủ đơn', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', N'fpoly.com', CAST(16000000 AS Decimal(20, 0)), 150, N'07ffd5af-1b72-497f-9590-e7a5a7a35457', 0)
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten], [NgaySX], [Mota], [Website], [GiaBan], [SoLuong], [IdLoaiSP], [TrangThai]) VALUES (N'e896062d-55c7-4793-8111-f4949bad23e4', N'SP2', N'Nồi chiên không điện', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', N'fpoly.com', CAST(6000000 AS Decimal(20, 0)), 200, N'07ffd5af-1b72-497f-9590-e7a5a7a35457', 0)
INSERT [dbo].[SanPham] ([Id], [Ma], [Ten], [NgaySX], [Mota], [Website], [GiaBan], [SoLuong], [IdLoaiSP], [TrangThai]) VALUES (N'72bf86f0-beff-4264-9458-f7388eb7b065', N'SP4', N'Tủ lạnh Sony', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', N'fpoly.com', CAST(29000000 AS Decimal(20, 0)), 200, NULL, 0)
GO
INSERT [dbo].[XeMay] ([Id], [Ma], [Ten], [NgaySX], [Mota], [GiaNhap], [GiaBan], [SoLuong], [Website], [IdLXM], [TrangThai]) VALUES (N'4f953c91-cfd7-4c2d-b3ce-a7fec5643766', N'HÐ4', N'SHMode', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', CAST(60000000 AS Decimal(20, 0)), CAST(900000000 AS Decimal(20, 0)), 200, N'Honda.com', N'99a57054-4771-437b-b130-5b3a181f6275', 1)
INSERT [dbo].[XeMay] ([Id], [Ma], [Ten], [NgaySX], [Mota], [GiaNhap], [GiaBan], [SoLuong], [Website], [IdLXM], [TrangThai]) VALUES (N'2c8c9811-2a7a-483c-a93a-a93c9c309d01', N'HÐ2', N'SH', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', CAST(80000000 AS Decimal(20, 0)), CAST(100000000 AS Decimal(20, 0)), 2000, N'Honda.com', N'764d3383-9814-4f20-8dc4-aa7700877fa4', 1)
INSERT [dbo].[XeMay] ([Id], [Ma], [Ten], [NgaySX], [Mota], [GiaNhap], [GiaBan], [SoLuong], [Website], [IdLXM], [TrangThai]) VALUES (N'2bdee38e-fd39-4964-ac8e-c1d074c3bbae', N'HÐ1', N'Honda AirBlade', CAST(N'2022-02-27' AS Date), N'Xe đi rất tiết kiệm xăng', CAST(30000000 AS Decimal(20, 0)), CAST(60000000 AS Decimal(20, 0)), 200, N'honda.com', N'764d3383-9814-4f20-8dc4-aa7700877fa4', 1)
INSERT [dbo].[XeMay] ([Id], [Ma], [Ten], [NgaySX], [Mota], [GiaNhap], [GiaBan], [SoLuong], [Website], [IdLXM], [TrangThai]) VALUES (N'558b051b-6302-4e22-ab22-cce4ee927e19', N'HÐ3', N'Future', CAST(N'2022-07-28' AS Date), N'Chưa có thông tin', CAST(30000000 AS Decimal(20, 0)), CAST(600000000 AS Decimal(20, 0)), 500, N'Honda.com', N'99a57054-4771-437b-b130-5b3a181f6275', 1)

ALTER TABLE [dbo].[Ban] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT (NULL) FOR [NgaySinh]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT (NULL) FOR [SoThich]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT ((0)) FOR [GioiTinh]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT (NULL) FOR [IdMQH]
GO
ALTER TABLE [dbo].[Ban] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[ChucVu] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[ChucVu] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[LoaiSP] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[LoaiSP] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[LoaiXM] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[LoaiXM] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[MoiQuanHe] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[MoiQuanHe] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [TenDem]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Ho]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [GioiTinh]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [NgaySinh]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [DiaChi]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [Sdt]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [MatKhau]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (NULL) FOR [IdCV]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[NXB] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[NXB] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT (NULL) FOR [NgayXuatBan]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ((0)) FOR [SoTrang]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ((0)) FOR [DonGia]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT (NULL) FOR [IdNXB]
GO
ALTER TABLE [dbo].[Sach] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (NULL) FOR [NgaySX]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (NULL) FOR [Mota]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (NULL) FOR [Website]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((0)) FOR [GiaBan]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((0)) FOR [SoLuong]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT (NULL) FOR [IdLoaiSP]
GO
ALTER TABLE [dbo].[SanPham] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (newid()) FOR [Id]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (NULL) FOR [Ten]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (NULL) FOR [NgaySX]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (NULL) FOR [Mota]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT ((0)) FOR [GiaNhap]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT ((0)) FOR [GiaBan]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT ((0)) FOR [SoLuong]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (NULL) FOR [Website]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT (NULL) FOR [IdLXM]
GO
ALTER TABLE [dbo].[XeMay] ADD  DEFAULT ((0)) FOR [TrangThai]
GO
ALTER TABLE [dbo].[Ban]  WITH CHECK ADD  CONSTRAINT [FK1_MQH] FOREIGN KEY([IdMQH])
REFERENCES [dbo].[MoiQuanHe] ([Id])
GO
ALTER TABLE [dbo].[Ban] CHECK CONSTRAINT [FK1_MQH]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK1_NV] FOREIGN KEY([IdCV])
REFERENCES [dbo].[ChucVu] ([Id])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK1_NV]
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [FK1_NXB] FOREIGN KEY([IdNXB])
REFERENCES [dbo].[NXB] ([Id])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [FK1_NXB]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK1_LSP] FOREIGN KEY([IdLoaiSP])
REFERENCES [dbo].[LoaiSP] ([Id])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK1_LSP]
GO
ALTER TABLE [dbo].[XeMay]  WITH CHECK ADD  CONSTRAINT [FK1_LXM] FOREIGN KEY([IdLXM])
REFERENCES [dbo].[LoaiXM] ([Id])
GO
ALTER TABLE [dbo].[XeMay] CHECK CONSTRAINT [FK1_LXM]
GO
USE [master]
GO
ALTER DATABASE [PTPM_FINALLY_JAVA_SOF203] SET  READ_WRITE 
GO
USE PTPM_FINALLY_JAVA_SOF203
GO



USE PTPM_FINALLY_JAVA_SOF203

SELECT * FROM Ban
SELECT * FROM ChucVu
SELECT * FROM LoaiSP
SELECT * FROM LoaiXM
SELECT * FROM MoiQuanHe
SELECT * FROM NhanVien
SELECT * FROM NXB
SELECT * FROM Sach
SELECT * FROM SanPham
SELECT * FROM XeMay

validate trống, số đúng số

khi rdHetHang true => giá -> 0

confirm

-- INSERT INTO NhanVien (Ma, Ten, Sdt, TrangThai) VALUES (?, ?, ?, ?)
-- UPDATE NhanVien SET Ten = ?, Sdt = ?, TrangThai = ? WHERE Ma = ?
-- DELETE FROM NhanVien WHERE Ma = ?
-- SELECT * FROM NhanVien WHERE Ma like ? ("%" + ? "%")