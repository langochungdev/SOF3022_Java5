# 🌐 Link test Lab 5 - Spring Beans (localhost:8080)

http://localhost:8080/account/login           
→ GET: Form đăng nhập

http://localhost:8080/account/login           
→ POST: Xử lý đăng nhập (user: poly, pass: 123)

http://localhost:8080/item/index              
→ Hiển thị danh sách sản phẩm

http://localhost:8080/cart/view               
→ Xem giỏ hàng

http://localhost:8080/cart/add/1              
→ Thêm sản phẩm có id = 1 vào giỏ

http://localhost:8080/cart/update/1           
→ Cập nhật số lượng sản phẩm có id = 1 (submit onblur)

http://localhost:8080/cart/remove/1           
→ Xoá sản phẩm có id = 1 khỏi giỏ

http://localhost:8080/cart/clear              
→ Xoá toàn bộ giỏ hàng

# Gợi ý test nhanh:
- Truy cập /item/index để thêm sản phẩm vào giỏ
- Truy cập /cart/view để xem, cập nhật, xóa
- Đăng nhập bằng /account/login → user: poly, pass: 123
