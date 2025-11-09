use slide5

create function tinh_tuoi (@nam_sinh int)
returns int
as
begin
    return year(getdate()) - @nam_sinh
end
go
print dbo.tinh_tuoi

select * from Product

create function getProduct(@price int)
returns @tableTmp table
(id nvarchar(100), name nvarchar(100), price int, quantity int)
as
begin
    insert into @tableTmp
        select @id, @name, @price, @quantity
        from Product where price > @price
    return
end

select * from dbo.getProduct(200)

--lophoc voi sinhvien
--lop hoc co nhieu sinh vien nam nhat
create table LopHoc (
    id int,
    TenLop varchar(50),

    primary key (id)
)
go
create table SinhVien (
    id int,
    HoTen varchar(100),
    GioiTinh varchar(10),
    idLop int,

    primary key (id),
    foreign key (idLop) references LopHoc(id)
)
go
-- thêm dữ liệu vào bảng lophoc
insert into LopHoc() values
(1, 'Lop A'),
(2, 'Lop B'),
(3, 'Lop C')
go
-- thêm dữ liệu vào bảng sinhvien
insert into SinhVien() values 
(1, 'Nguyen Van A', 'Nam', 1),
(2, 'Le Thi B', 'Nu', 1),
(3, 'Pham Van C', 'Nam', 2),
(4, 'Tran Thi D', 'Nu', 2),
(5, 'Nguyen Van E', 'Nam', 3),
(6, 'Le Thi F', 'Nu', 3),
(7, 'Hoang Van G', 'Nam', 3)
go
create function GetLopHocNhieuSinhVienNamNhat()
returns @tableTmp table (
    idLop int,
    TenLop nvarchar(100),
    SoLuongNam int
)
as
begin
    -- chèn dữ liệu vào bảng tạm @tabletmp để lưu trữ số lượng sinh viên nam của mỗi lớp
    insert into @tabletmp (idLop, TenLop, SoLuongNam)
    select l.id, l.TenLop, count(sv.id)
    from LopHoc l
    inner join SinhVien sv on l.id = sv.idLop
    where sv.GioiTinh = 'nam'
    group by l.id, l.TenLop
    order by count(sv.id) desc

    return
end
go
select top 1 * from dbo.GetLopHocNhieuSinhVienNamNhat()

drop table LopHoc
drop table SinhVien
drop function dbo.GetLopHocNhieuSinhVienNamNhat