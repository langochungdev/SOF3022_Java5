create database j5lab8
go
use j5lab8

create table Accounts (
	username nvarchar(50) primary key,
	password nvarchar(100),
	fullname nvarchar(100),
	email nvarchar(100),
	photo nvarchar(100),
	activated bit,
	admin bit
)

insert into Accounts(username, password, fullname, email, photo, activated, admin) values
('admin', '123', N'Quản trị viên', 'admin@gmail.com', 'admin.png', 1, 1),
('user', '123', N'Người dùng thường', 'user@gmail.com', 'user.png', 1, 0)
