declare @hoTen nvarchar(100)
set @hoTen = 'Nguyen Van A'
select @hoTen

declare @tuoi int
set @tuoi = 17
select @tuoi

declare @chieuDai int, @chieuRong int, @dienTich int
set @chieuDai = 10
set @chieuRong = 10
set @dienTich = @chieuDai * @chieuRong
select @dienTich

declare @sinhVien table (maSV nvarchar(100), trangThai int, namSinh int)
insert into @sinhVien
    select MaSV, TrangThai, NamSinh from sinhVien
select * from sinhVien

begin
    declare @kq int;
    declare @v_a int = 55;
    declare @v_b int = 500;

    print 'v_a: =' + cast(@v_a as nvarchar(100));
    print 'v_b: =' + cast(@v_b as nvarchar(100));

    set @kq = @v_a + @v_b;
    print 'ket qua: ' + cast(@kq as nvarchar(100));
end

begin
    declare @ngaySinh date = '2007/12/20';
    select @ngaySinh as 'ngay sinh',
    cast(@ngaySinh as varchar(100)) as 'ngay sinh varchar',

    convert(varchar, @ngaySinh, 101) as 'ngay sinh 101',
    convert(varchar, @ngaySinh, 103) as 'ngay sinh 103',
    convert(varchar, @ngaySinh, 105) as 'ngay sinh 105',
    convert(varchar, @ngaySinh, 107) as 'ngay sinh 107',
    convert(varchar, @ngaySinh, 110) as 'ngay sinh 110'
end