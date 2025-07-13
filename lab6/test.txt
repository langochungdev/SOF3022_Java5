# CATEGORY CRUD
http://localhost:8080/category/index         # Trang quản lý loại hàng

# PRODUCT SẮP XẾP
http://localhost:8080/product/sort?field=id
http://localhost:8080/product/sort?field=name
http://localhost:8080/product/sort?field=price
http://localhost:8080/product/sort?field=createDate

# PRODUCT PHÂN TRANG
http://localhost:8080/product/page?p=0       # Trang đầu
http://localhost:8080/product/page?p=1       # Trang kế tiếp
http://localhost:8080/product/page?p=2       # ...

# COMBO (nếu bạn làm thêm)
http://localhost:8080/product/page?field=price&p=0   # Phân trang + sắp xếp
