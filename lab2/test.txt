# Bài 1 – Test các nút OK:
http://localhost:8080/ok              → Load trang ok.html
Click từng nút:
- OK 1: POST → gọi /ctrl/ok → m1()
- OK 2: GET  → gọi /ctrl/ok → m2()
- OK 3: GET  → gọi /ctrl/ok?x → m3()

# Bài 2 – Gửi param và path:
http://localhost:8080/param/form      → Load form.html, nhấn Save để test /param/save/2021

# Bài 3 + 4 – Gửi đối tượng Product + chia sẻ dữ liệu:
http://localhost:8080/product/form    → Load form.html để nhập name + price, nhấn Save

# Bài 5 – Trả dữ liệu qua Model, RedirectAttributes và chuỗi thuần:
http://localhost:8080/a               → Trang a.html
http://localhost:8080/b               → Model → /a
http://localhost:8080/c               → Redirect → /a
http://localhost:8080/d               → Trả chuỗi text thuần "I come from d"
