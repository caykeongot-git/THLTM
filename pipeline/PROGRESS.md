# 📝 NHẬT KÝ TIẾN ĐỘ & BÀN GIAO (AGENT HANDOVER LOG)

> **QUY TẮC BẮT BUỘC DÀNH CHO CẢ 2 AGENT (NHÀ & TRƯỜNG):**
> - **Trước khi code:** Luôn đọc file này để biết phiên trước dừng ở đâu.
> - **Trước khi Moshi push Git:** BẮT BUỘC cập nhật lại nhật ký phiên làm việc của mình vào đây (ghi rõ ngày giờ, môi trường, việc đã làm, và việc bàn giao cho máy tiếp theo).

---

## 📌 PHIÊN HIỆN TẠI (LATEST STATUS)

- **Trạng thái bài tập:** 
  - ✅ **Bài 1:** Hoàn thành xuất sắc (CSDL, JDBC, Form Đăng ký Swing).
  - ✅ **Bài 2:** Hoàn thành xuất sắc (2.1: Duyệt & Lọc thư mục `frmDirectory`; 2.2: Đọc/Ghi file nhị phân & văn bản `frmReadWriteFile`).
- **Mục tiêu tiếp theo:** Bắt đầu **Bài 3: Lập trình mạng InetAddress (IP, Domain, DNS)**.
- **Trạng thái Git:** Sẵn sàng commit & push Bài 2 lên GitHub.
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

### 🗓️ Session 2: 2026-09-28 (Tại Nhà - Windows) - HOÀN THÀNH BÀI 2
- **Agent:** Antigravity (Home)
- **Môi trường:** Windows 10/11, Adoptium JDK 17, NetBeans 22.
- **Những việc đã hoàn thành:**
  1. Tạo Project `ThucHanh2` trong thư mục `Bai02/ThucHanh2`.
  2. **Hoàn thành Phần 2.1 (Thao tác Thư mục):** Form `frmDirectory` với `fcpath` (JFileChooser dạng `DIRECTORIES_ONLY`), lọc file theo ký tự `txtkytu` qua `FilenameFilter`, hiển thị ra `JList`. Test thành công rực rỡ với thư mục `#Cisco`.
  3. **Hoàn thành Phần 2.2 (Thao tác File):** Form `frmReadWriteFile` với 4 chức năng: Ghi/Đọc nhị phân (`FileOutputStream`/`FileInputStream`) và Ghi/Đọc văn bản (`FileWriter`/`FileReader`).
  4. Test thành công đọc/ghi file `test.txt` với chuỗi `MoshiRedTeam2026`. File được lưu tự động tại thư mục gốc của project.
- **Lời nhắn bàn giao cho Agent phiên tiếp theo (hoặc ở trường):**
  - **Bài 1 và Bài 2 đã xong 100%!**
  - Chuẩn bị cho **Bài 3: Lập trình mạng INETADDRESS** (Bắt đầu từ **trang 33** trong file giáo trình PDF).
  - Tiếp tục phát huy tinh thần: Moshi tự gõ code, Agent hỗ trợ logic, giải thích bản chất network/security và fix bug môi trường.

---

*(Agent tiếp theo hãy copy mẫu session ở trên và ghi tiếp vào bên dưới trước khi kết thúc)*
