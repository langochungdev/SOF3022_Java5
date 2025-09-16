create database j5lab7
go
use j5lab7

create table Categories (
	id nvarchar(10) primary key,
	name nvarchar(50)
)

create table Products (
	id int identity primary key,
	name nvarchar(100),
	image nvarchar(255),
	price float,
	Createdate date,
	available bit,
	Categoryid nvarchar(10) foreign key references Categories(id)
)

insert into Categories(id, name) values 
('C01', N'Điện thoại'),
('C02', N'Laptop'),
('C03', N'Phụ kiện'),
('C04', N'Máy tính bảng'),
('C05', N'Màn hình'),
('C06', N'Loa'),
('C07', N'Camera'),
('C08', N'Thiết bị đeo'),
('C09', N'Bàn phím'),
('C10', N'Chuột')

insert into Products(name, image, price, Createdate, available, Categoryid) values 
(N'iPhone 15', 'iphone.jpg', 25000000, '2024-07-01', 1, 'C01'),
(N'Samsung S24', 's24.jpg', 22000000, '2024-07-02', 1, 'C01'),
(N'MacBook Air', 'macbook.jpg', 32000000, '2024-07-03', 1, 'C02'),
(N'Dell XPS', 'dell.jpg', 28000000, '2024-07-04', 1, 'C02'),
(N'Tai nghe Sony', 'sony.jpg', 2500000, '2024-07-05', 1, 'C03'),
(N'iPad Air', 'ipad.jpg', 18000000, '2024-07-06', 1, 'C04'),
(N'LG 27"', 'lg27.jpg', 6000000, '2024-07-07', 1, 'C05'),
(N'JBL Flip', 'jbl.jpg', 3500000, '2024-07-08', 1, 'C06'),
(N'Canon M50', 'canon.jpg', 15000000, '2024-07-09', 1, 'C07'),
(N'Apple Watch', 'watch.jpg', 12000000, '2024-07-10', 1, 'C08'),
(N'Keychron K8', 'keychron.jpg', 2500000, '2024-07-11', 1, 'C09'),
(N'Logitech MX', 'mouse.jpg', 2000000, '2024-07-12', 1, 'C10')
