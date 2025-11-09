select getdate()
select convert(date, getdate())
select convert(time, getdate())

select year(getdate()) as year,
month(getdate()) as month,
day(getdate()) as day

--số chẵn số lẻ
begin
	declare @a int = 10
	if (@a % 2 = 0)
		begin
			print'day la so chan'
		end
	else
		begin
			print'day la so le'
		end
end

--điểm sang học lực
begin
	declare @diem float = 10
	if (@diem <= 10)
		begin
			if (@diem >= 8)
				begin
					print'Gioi'
				end
			else if (@diem >= 5)
				begin
					print'Kha'
				end
			else if (@diem >= 0)
				begin
					print'Yeu'
				end
		end
	else
		begin
			print'diem khong hop le'
		end
end

begin
	declare @dbt float = 10
end

--tìm khcahs hàng nam
use lab1234
select * from khach_hang kh

begin
	declare @tmp int
	set @tmp = (select count(*) from khach_hang kh where gioi_tinh = 'Nam')
	if (@tmp > 0)
		begin
			select * from khach_hang kh2 where gioi_tinh = 'Nam'
		end
	else
		begin
			print'khong co sinh vien nam nao'
		end
end

--in từ 1 đến 10
begin
	declare @n int = 10
	declare @dem int = 1
	while (@dem <= @n)
		begin
			print @dem
			set @dem = @dem + 1
		end
end

--tong tu 1 den 10
begin
	declare @sum int = 0
	declare @count int = 0
	while (@count <= 10)
		begin
			set @count = @count + 1
			set @sum = @sum + @count
		end
	print @count
	print @sum
end

begin
	declare @tongg int = 0
	declare @chan int = 0
	while (@chan <= 10)
	if (@chan % 2 = 0)
		begin
			set @tongg = @tongg + @chan
			set @chan = @chan + 2
		end
	print @tongg
end

begin
	declare @tong int = 0
	declare @dembo4 int = 0
	while (@dembo4 <= 10)
		begin
			if (@dembo4 != 4)
			begin
				set @tong = @tong + @dembo4
			end
			set @dembo4 = @dembo4 + 1
		end
	print @tong
end

