create database j5lab6
go
use j5lab6

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

create table Accounts (
	username nvarchar(30) primary key,
	password nvarchar(100),
	fullname nvarchar(50),
	email nvarchar(100),
	photo nvarchar(100),
	activated bit,
	admin bit
)

create table Orders (
	id bigint identity primary key,
	address nvarchar(255),
	Createdate date,
	Username nvarchar(30) foreign key references Accounts(username)
)

create table Orderdetails (
	id bigint identity primary key,
	price float,
	quantity int,
	Productid int foreign key references Products(id),
	Orderid bigint foreign key references Orders(id)
)


insert into Categories(id, name) values 
('C01', N'Điện thoại'),
('C02', N'Laptop'),
('C03', N'Phụ kiện'),
('C04', N'Máy tính bảng'),
('C05', N'Màn hình')

insert into Products(name, image, price, Createdate, available, Categoryid) values 
(N'iPhone 15', 'iphone.jpg', 25000000, '2024-07-01', 1, 'C01'),
(N'Samsung Galaxy S24', 'samsung.jpg', 22000000, '2024-07-05', 1, 'C01'),
(N'MacBook Air M2', 'macbook.jpg', 32000000, '2024-06-20', 1, 'C02'),
(N'Dell XPS 13', 'dell.jpg', 28000000, '2024-06-15', 1, 'C02'),
(N'Tai nghe Sony', 'sony.jpg', 2500000, '2024-07-10', 1, 'C03'),
(N'iPad Air', 'ipad.jpg', 18000000, '2024-06-25', 1, 'C04'),
(N'Apple Watch', 'watch.jpg', 12000000, '2024-07-02', 1, 'C03'),
(N'Loa Bluetooth JBL', 'jbl.jpg', 3500000, '2024-07-06', 1, 'C03'),
(N'Samsung Tab S9', 'tabs9.jpg', 21000000, '2024-06-28', 1, 'C04'),
(N'Màn hình LG 27"', 'lg27.jpg', 6000000, '2024-07-01', 1, 'C05'),
(N'Màn hình Samsung 24"', 'sam24.jpg', 4500000, '2024-07-04', 1, 'C05'),
(N'Chuột Logitech MX', 'mouse.jpg', 2000000, '2024-07-03', 1, 'C03'),
(N'Bàn phím cơ Keychron', 'keychron.jpg', 2500000, '2024-07-07', 1, 'C03'),
(N'Laptop Asus Zenbook', 'asus.jpg', 27000000, '2024-06-30', 1, 'C02'),
(N'Laptop HP Envy', 'hp.jpg', 26000000, '2024-07-01', 1, 'C02'),
(N'iPhone 14', 'iphone14.jpg', 21000000, '2024-07-01', 1, 'C01'),
(N'Ốp lưng iPhone 15', 'oplung.jpg', 500000, '2024-07-01', 1, 'C03'),
(N'Cáp sạc Type-C', 'cap.jpg', 300000, '2024-07-01', 1, 'C03'),
(N'Tai nghe AirPods Pro', 'airpods.jpg', 5500000, '2024-07-01', 1, 'C03'),
(N'Bộ vệ sinh laptop', 'clean.jpg', 150000, '2024-07-01', 1, 'C03')


insert into Accounts(username, password, fullname, email, photo, activated, admin) values 
('admin', '123', N'Quản trị', 'admin@mail.com', 'admin.png', 1, 1),
('user1', '123', N'Nguyễn Văn A', 'a@mail.com', 'a.png', 1, 0),
('user2', '123', N'Trần Thị B', 'b@mail.com', 'b.png', 1, 0),
('user3', '123', N'Lê Văn C', 'c@mail.com', 'c.png', 0, 0),
('user4', '123', N'Phạm Thị D', 'd@mail.com', 'd.png', 1, 0)

insert into Orders(address, Createdate, Username) values 
(N'Hà Nội', '2024-07-11', 'user1'),
(N'TP.HCM', '2024-07-11', 'user2'),
(N'Đà Nẵng', '2024-07-12', 'user1'),
(N'Cần Thơ', '2024-07-13', 'user3'),
(N'Huế', '2024-07-13', 'user4')

insert into Orderdetails(price, quantity, Productid, Orderid) values 
(25000000, 1, 1, 1),
(22000000, 2, 2, 1),
(32000000, 1, 3, 2),
(28000000, 1, 4, 3),
(2500000, 3, 5, 4)
