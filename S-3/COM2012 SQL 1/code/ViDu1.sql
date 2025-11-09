Create Database Test;
Alter Database Test Modify Name = Test;
Drop Database Test;

Create Database BT1;
use BT1;
Create Table VD1(
A varchar(10) primary key not null,
B int,
C nvarchar(30))
	
Create Database QuanLyNhanSu;
use QuanLyNhanSu;
Create Table Nhan_Vien(
ID_NV int primary key not null,
Ho_NV nvarchar(20) null,
Ten_NV nvarchar(25) not null,
Ngay_Sinh date null,
Luong money not null,
PHG char(5) not null)

Alter Table Nhan_Vien
Add Constraint PK1 primary key (ID_NV);
Alter Table Nhan_Vien
Add Email varchar(50);
Alter Table Nhan_Vien
Add Constraint CH_Luong
Check (Luong >= 100)

Create Table PB(
ID_Phong char(5) not null,
Ten_Phong nvarchar(25) not null)

Alter Table PB
Add Constraint PK12 primary key (ID_Phong);

Alter Table Nhan_Vien
Add Constraint FK1 foreign key (PHG) references PB(ID_Phong);
