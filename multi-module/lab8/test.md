
# Form nhập thông tin gửi mail
http://localhost:8080/mail/form

# Đăng nhập
http://localhost:8080/auth/login

# Truy cập trang cần đăng nhập (sẽ bị chặn nếu chưa đăng nhập)
http://localhost:8080/account/edit-profile
http://localhost:8080/account/change-password
http://localhost:8080/order/view

# Truy cập trang cần quyền ADMIN (sẽ bị chặn nếu không phải admin)
http://localhost:8080/admin/users
http://localhost:8080/admin/products

# Trang admin không bị chặn
http://localhost:8080/admin/index
