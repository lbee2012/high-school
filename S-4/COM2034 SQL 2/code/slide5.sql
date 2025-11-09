use slide5

create procedure tinh_tong_no_out
@so1 int, @so2 int
as
begin
    declare @tong int
    set @tong = @so1 + @so2
    print @tong
end

exec tinh_tong_no_out 1, 6
