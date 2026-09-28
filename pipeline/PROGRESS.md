# 📝 NHẬT KÝ TIẾN ĐỘ & BÀN GIAO (AGENT HANDOVER LOG)

> **QUY TẮC BẮT BUỘC DÀNH CHO CẢ 2 AGENT (NHÀ & TRƯỜNG):**
> - **Trước khi code:** Luôn đọc file này để biết phiên trước dừng ở đâu.
> - **Trước khi Moshi push Git:** BẮT BUỘC cập nhật lại nhật ký phiên làm việc của mình vào đây (ghi rõ ngày giờ, môi trường, việc đã làm, và việc bàn giao cho máy tiếp theo).

---

## 📌 PHIÊN HIỆN TẠI (LATEST STATUS)

- **Trạng thái bài tập:** Đã hoàn thành xong **Bài 1** (CSDL & Form Đăng ký Swing).
- **Mục tiêu tiếp theo:** Bắt đầu **Bài 2: Luồng nhập xuất (Thao tác File & Directory)**.
- **Trạng thái Git:** Đã push code Bài 1 lên GitHub (`origin/main`).
- **Mật khẩu MySQL cần nhớ:**
  - Ở Nhà (Windows): `"root123"`
  - Ở Trường (Ubuntu XAMPP): `""` (Rỗng)

---

## 📜 LỊCH SỬ CÁC PHIÊN LÀM VIỆC (SESSION LOGS)

### 🗓️ Session 1: 2026-09-28 (Tại Nhà - Windows)
- **Agent:** Antigravity (Home)
- **Môi trường:** Windows 10/11, JDK 17, NetBeans 22, MySQL80 (port 3306).
- **Những việc đã hoàn thành:**
  1. Fix lỗi khởi động JVM do đường dẫn tiếng Việt có dấu (`Tài Liệu Học`). Project đã chuyển sang: `C:\Users\ADMIN\Documents\#NETBEAN\THLTM\THLTM`.
  2. Fix lỗi lệch phiên bản Java (`UnsupportedClassVersionError: class 65 vs 61`): Chuyển Source/Binary format về `JDK 17` và Clean & Build thành công.
  3. Kết nối MySQL thành công xuất sắc: Test in ra `SUCCESS`.
  4. Fix lỗi hiển thị form Swing bị cắt mép phải (do xóa ảnh nền làm `pack()` co lại): Thêm `setSize(850, 650)` và `setLocationRelativeTo(null)`.
  5. Test thành công chức năng Đăng ký tài khoản vào bảng `account` của database `moshiDB`. Bắt được lỗi trùng khóa chính (Primary Key).
  6. Tạo file `database.sql` tại thư mục gốc để sẵn sàng import vào XAMPP trường.
  7. Cập nhật `.gitignore` chặn `build/`, `dist/`, `nbproject/private/`.
  8. Push thành công code Bài 1 lên repo GitHub: `caykeongot-git/THLTM.git`.
- **Lời nhắn bàn giao cho Agent phiên tiếp theo (hoặc ở trường):**
  - Khi bắt đầu Bài 2: Đọc yêu cầu từ **trang 26** file `THỰC HÀNH LẬP TRÌNH MẠNG MÁY TÍNH.pdf`.
  - Hướng dẫn Moshi tạo project mới hoặc package mới cho Bài 2 (ví dụ `Bai02` hoặc package `bai02`).
  - Duy trì đúng tôn chỉ: Moshi tự gõ code để hiểu sâu, Agent giải thích bản chất và review bảo mật.

---

*(Agent tiếp theo hãy copy mẫu session ở trên và ghi tiếp vào bên dưới trước khi kết thúc)*
