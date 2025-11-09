use slide5

create table product (
    id nvarchar(100) not null,
    name nvarchar(100),
    price int,
    quantity int

    primary key(id)
)

create procedure insert_product
@id nvarchar(100), @name nvarchar(100), @price int, @quantity int
as
begin
    insert into product(id, name, price, quantity) values
    (@id, @name, @price, @quantity)
    select * from product
end

insert_product 'SP01', 'Banh', 100, 10
insert_product 'SP02', 'Banh', 200, 20
insert_product 'SP03', 'Banh', 300, 30
insert_product 'SP04', 'Banh', 400, 40
insert_product 'SP05', 'Banh', 500, 50
insert_product 'SP06', 'Banh', 600, 60
insert_product 'SP07', 'Banh', 700, 70
insert_product 'SP08', 'Banh', 800, 80
insert_product 'SP09', 'Banh', 900, 90
insert_product 'SP10', 'Banh', 1000, 100
select * from product

create procedure tinh_tong_so_chan_tu_1_n
@soN int
as
begin
    declare @tong int = 0
    declare @dem int = 1
    while (@dem <= @soN)
    begin
        if(@dem % 2 = 0)
        begin
            set @tong = @tong + @dem
        end
        set @dem = @dem + 1
    end
    print @tong
end
exec tinh_tong_so_chan_tu_1_n 4
drop procedure tinh_tong_so_chan_tu_1_n