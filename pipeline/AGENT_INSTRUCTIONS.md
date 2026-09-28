# CONTEXT & WORKFLOW PIPELINE: THỰC HÀNH LẬP TRÌNH MẠNG (HUTECH)

> **Dành cho Antigravity AI Agent:** Đọc kỹ tài liệu này trước khi hỗ trợ người dùng (**Moshi**). Bạn phải duy trì đúng phong cách làm việc, hiểu trọn vẹn sự khác biệt giữa hai môi trường (Home vs School), và tiếp tục đồng hành mà không làm mất mạch tư duy.

---

## 🤝 0. THỎA ƯỚC BẮT BUỘC ĐỒNG BỘ TIẾN ĐỘ (AGENT HANDOVER PROTOCOL)

> **LUẬT BẤT THÀNH VĂN CHO CẢ HAI AGENT (NHÀ VÀ TRƯỜNG):**
> 1. **KHI BẮT ĐẦU PHIÊN LÀM VIỆC:** Agent BẮT BUỘC phải đọc file `pipeline/PROGRESS.md` trước tiên để biết phiên trước dừng ở đâu, đã làm xong những gì và Agent trước bàn giao lại điều gì.
> 2. **KHI KẾT THÚC PHIÊN LÀM VIỆC (Trước khi Moshi commit & push Git):** Agent BẮT BUỘC phải chủ động cập nhật lại file `pipeline/PROGRESS.md`:
>    - Ngày giờ & Môi trường thực hiện (Home - Windows hay School - Ubuntu).
>    - Các đầu việc đã hoàn thành.
>    - Các lỗi/bug đã gặp và cách xử lý.
>    - Hướng dẫn bàn giao chi tiết cho Agent ở phiên kế tiếp.

---

## 🧑‍💻 1. THÔNG TIN NGƯỜI DÙNG & NGUYÊN TẮC LÀM VIỆC

- **Người dùng:** Nguyễn Đình An Ninh (biệt danh: **Moshi**).
- **Chuyên môn & Định hướng:** Sinh viên năm 3 CNTT HUTECH, định hướng **Red Team / Smart Contract Auditor**.
- **Ngôn ngữ giao tiếp:** **100% Tiếng Việt**, thân thiện, phong cách pair-programming đồng đội.
- **Nguyên tắc hỗ trợ cốt lõi:**
  - **Moshi tự tay gõ code để hiểu sâu:** Tuyệt đối KHÔNG tự ý can thiệp viết đè code khi chưa có yêu cầu; hãy giải thích nguyên nhân gốc rễ, chỉ rõ dòng lỗi, hướng dẫn logic để Moshi tự sửa.
  - **Góc nhìn Security:** Luôn lồng ghép phân tích bảo mật (SQL Injection, Buffer/Input Validation, Path Traversal,...) vào các bài thực hành mạng.

---

## 🖥️ 2. HAI MÔI TRƯỜNG LÀM VIỆC (HOME vs SCHOOL)

| Thành phần | Máy Nhà (Home Machine) | Máy Trường (School Lab Machine) |
| :--- | :--- | :--- |
| **Hệ điều hành** | Windows 10/11 | **Ubuntu Linux** (Phòng máy trường HUTECH) |
| **Java JDK** | Adoptium OpenJDK 17 (`JDK 17`) | OpenJDK 21 (`JDK 21`) |
| **IDE** | Apache NetBeans 22 + VS Code | Apache NetBeans |
| **Database Server**| MySQL 8.0 Server (`MySQL80` service) | **XAMPP (MySQL / MariaDB)** |
| **Database Port** | `3306` (Localhost) | `3306` (Localhost) |
| **DB Username** | `root` | `root` |
| **DB Password** | `"root123"` (Hoặc pass máy nhà) | **`""` (RỖNG - MẶC ĐỊNH CỦA XAMPP)** |
| **Database Name** | `moshiDB` | `moshiDB` |

---

## ⚠️ 3. BÀI HỌC KINH NGHIỆM & CÁC LỖI ĐÃ XỬ LÝ (GOTCHAS)

1. **Linux Case-Sensitivity (Phân biệt HOA - THƯỜNG):**
   - Windows không phân biệt hoa thường ở tên DB/Table, nhưng **Ubuntu PHÂN BIỆT RẤT RÕ**.
   - Mọi câu lệnh SQL & Table name **bắt buộc viết chữ thường**: `account`, `moshiDB`.
2. **Java Class Version Conflict:**
   - Biên dịch ở mức **Source/Binary Format = JDK 17** trong NetBeans để đạt tính tương thích ngược: chạy mượt cả trên JDK 17 (nhà) lẫn JDK 21 (trường).
3. **Đường dẫn thư mục & File Separator:**
   - Không đặt thư mục chứa ký tự tiếng Việt có dấu (`Tài Liệu Học` $\rightarrow$ sinh lỗi `InvalidPathException: Illegal char <?> at index 9`).
   - Workspace chuẩn: `C:\Users\ADMIN\Documents\#NETBEAN\THLTM\THLTM`.
   - Tuyệt đối không hardcode đường dẫn tuyệt đối dạng `/home/ubuntu/...` hay `C:\...` trong code Java.
4. **VS Code gạch chân đỏ:**
   - Thư viện `AbsoluteLayout` (`org.netbeans.lib.awtextra`) là built-in của NetBeans, VS Code không có lib này nên báo đỏ trong Problems $\rightarrow$ Kệ nó, chỉ quan tâm NetBeans Clean & Build SUCCESS.
5. **Git Push Rules:**
   - File `.gitignore` luôn chặn `**/build/`, `**/dist/`, `**/nbproject/private/` để tránh đẩy file `.class` biên dịch từ máy này sang máy khác.
   - Trước khi push lên Git, biến `String pass` trong `MyConnection.java` luôn chuyển về `""` (pass rỗng) để tương thích với XAMPP trường.

---

## 🗄️ 4. DATABASE PIPELINE (`database.sql`)

Dự án dùng chung **1 Database duy nhất** cho toàn bộ các bài thực hành:
- **Tên Database:** `moshiDB`
- **File kịch bản:** Nằm ở thư mục gốc repo: `database.sql`
- **Quy trình khi lên máy trường:**
  1. Khởi động XAMPP (Start Apache + MySQL).
  2. Truy cập trình duyệt: `http://localhost/phpmyadmin`.
  3. Chọn tab **Import** $\rightarrow$ Chọn file `database.sql` $\rightarrow$ Nhấn **Import (Go)**.

---

## 📚 5. LỘ TRÌNH GIÁO TRÌNH THỰC HÀNH (107 TRANG PDF)

- [x] **Bài 1:** Lập trình kết nối CSDL (JDBC, Form Đăng ký tài khoản Swing, MySQL Connection). **[ĐÃ HOÀN THÀNH]**
- [ ] **Bài 2:** Thao tác File & Luồng I/O (FileFilter, JFileChooser, Đọc/Ghi nhị phân DataStreams, Đọc/Ghi văn bản). **[TIẾP THEO]**
- [ ] **Bài 3:** InetAddress (Phân giải IP, Domain, DNS, NetworkInterface).
- [ ] **Bài 4:** Xử lý tiến trình / Đa luồng (Multithreading).
- [ ] **Bài 5:** TCP Socket, FTP (Chat Room, File Transfer).
- [ ] **Bài 6:** UDP Socket (DatagramPacket, DatagramSocket).
- [ ] **Bài 7:** Lập trình đối tượng phân tán (Java RMI).

---

## 🚀 6. HƯỚNG DẪN KHI ANTIGRAVITY HOẠT ĐỘNG TRÊN MÁY TRƯỜNG (UBUNTU)

Khi Moshi mở repo này trên Ubuntu ở trường và gọi Antigravity:
1. **Kiểm tra trạng thái Git & XAMPP:**
   - Nhắc Moshi clone repo về thư mục không dấu (ví dụ: `~/Desktop/THLTM`).
   - Nhắc Moshi chạy `sudo /opt/lampp/lampp start` hoặc mở XAMPP GUI và import `database.sql`.
2. **Kiểm tra NetBeans Library:**
   - Nếu NetBeans báo chấm than vàng ở thư viện MySQL: Hướng dẫn Moshi Add lại file `mysql-connector-j-8.4.0.jar` ngay trong thư mục gốc.
3. **Tiếp tục Bài 2:**
   - Đọc tiếp yêu cầu Bài 2 từ trang 26 trong file PDF giáo trình và cùng Moshi code tiếp!
