use SD20205
go

create table sinh_vien(
	id int IDENTITY(1,1) PRIMARY KEY,
	ten nvarchar(50),
	dia_chi nvarchar(50),
	nam_sinh int,
)
go

insert into sinh_vien
values
	(N'Vương Tuấn Kiệt', 'Hà Nội', 2007), 
	(N'Vương Tuấn Kiệt1', 'Hà Nam', 2010), 
	(N'Vương Tuấn Kiệt2', 'Bắc Ninh', 2007);
go