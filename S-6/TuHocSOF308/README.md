Chào bạn! Tôi hiểu rằng bạn đang cảm thấy khá choáng váng và muốn có một lộ trình học tập rõ ràng, đặc biệt khi bạn cảm thấy mình đang bắt đầu "từ gần như con số không". Đừng lo lắng, các bài tập thực hành này được thiết kế như những khối xây dựng, giúp bạn từng bước nắm vững các khái niệm cốt lõi. Việc bạn sử dụng Visual Studio Code - Insider là một lựa chọn tuyệt vời, và lộ trình này sẽ giúp bạn tận dụng tối đa công cụ đó.

Hãy cùng tôi đi qua từng bài học một, và tôi sẽ giải thích các mục tiêu cũng như nhiệm vụ cụ thể của từng bài, giúp bạn dễ dàng theo dõi và thực hành.

***

### **Lộ Trình Học Tập: Phát Triển Full-Stack với Bootstrap và VueJS**

Lộ trình học tập này được chia thành các Bài tập thực hành, mỗi bài được thiết kế để củng cố kiến thức của bạn về các khái niệm chính trong lập trình giao diện người dùng và framework.

***

#### **Bài 1: Giới thiệu Bootstrap**

Bài học này giúp bạn có cái nhìn tổng quan về Bootstrap, cách nhúng nó vào website, hiểu về hệ thống lưới (Grid System), xây dựng layout và làm quen với các thành phần cơ bản.

*   **Mục tiêu chính:**
    *   Hiểu tổng quan về Bootstrap.
    *   Biết cách nhúng Bootstrap vào website của bạn.
    *   Nắm vững hệ thống lưới và cách xây dựng layout đáp ứng.
    *   Làm quen với các thành phần UI cơ bản như Navs menu, Card, và List Group.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Thiết Lập Môi Trường (Environment Setup):**
        *   Bạn cần **tạo một file HTML cơ bản** và **nhúng Bootstrap 5 vào file này bằng cách sử dụng CDN** (Content Delivery Network).
        *   **Gợi ý:** Đảm bảo các thẻ `<link>` (cho CSS) và `<script>` (cho JavaScript) được đặt đúng vị trí trong phần `<head>` và trước thẻ `</body>` tương ứng để Bootstrap hoạt động chính xác.
        *   **Mục tiêu học tập:** Thực hành tích hợp Bootstrap vào dự án web của bạn.
    2.  **Xây Dựng Layout Cơ Bản Với Hệ Thống Lưới (Building Basic Layout with Grid System):**
        *   Trong file HTML đã tạo, hãy xây dựng một layout đáp ứng đơn giản sử dụng **hệ thống lưới của Bootstrap**.
        *   Sử dụng **`container-fluid`** để bao bọc toàn bộ nội dung, tạo một hàng (`.row`), và chia nó thành **ba cột có chiều rộng bằng nhau** trên các thiết bị vừa trở lên (width >= 768px) sử dụng lớp **`.col-md-4`**.
        *   Thêm một hàng mới và chia thành hai cột (1/3 và 2/3 chiều rộng) trên các thiết bị nhỏ trở lên (width >= 576px), ví dụ: **`.col-sm-4` và `.col-sm-8`**.
        *   **Gợi ý:** Sử dụng các lớp như `bg-light` và `p-2` để dễ dàng hình dung và phân biệt các cột.
        *   **Mục tiêu học tập:** Hiểu và áp dụng hệ thống lưới của Bootstrap cho thiết kế responsive.
    3.  **Sử Dụng Các Thành Phần Cơ Bản (Using Basic Components):**
        *   Thêm một **Navs menu** (thanh điều hướng) ở trên cùng của trang.
        *   Trong một cột, thêm một **Card** với tiêu đề (`card-title`), nội dung (`card-text`), và một nút (`btn`).
        *   Trong một cột khác, thêm một **List Group** cơ bản.
        *   Thử nghiệm với **thanh điều hướng màu** (ví dụ: `bg-warning`) và tích hợp **thư viện Icon Font Awesome** (bằng cách nhúng link thư viện vào `<head>`, tìm kiếm và sao chép mã HTML icon).
        *   **Mục tiêu học tập:** Làm quen và áp dụng các thành phần UI sẵn có của Bootstrap.

***

#### **Bài 2: Thiết Kế Tables, Forms Và Tabs Với Bootstrap**

Bài này tập trung vào việc định dạng bảng, thiết kế biểu mẫu, và sử dụng các thành phần tương tác như Tabs và Modal.

*   **Mục tiêu chính:**
    *   Nắm vững cách định dạng bảng với các lớp Bootstrap.
    *   Thiết kế các loại biểu mẫu khác nhau.
    *   Sử dụng Tabs để tổ chức nội dung và Modal để tạo hộp thoại pop-up.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Định Dạng Bảng (Table Formatting):**
        *   Tạo một bảng HTML và áp dụng các kiểu Bootstrap như **`.table`** (cơ bản), **`.table-bordered`** (có viền), **`.table-striped`** (hàng xen kẽ màu), **`.table-hover`** (hiệu ứng hover).
        *   Kết hợp **`.table-dark`** và **`.table-hover`** để tạo bảng nền tối có hiệu ứng hover.
        *   **Mục tiêu học tập:** Nắm vững các lớp CSS của Bootstrap để định dạng bảng.
    2.  **Xây Dựng Biểu Mẫu (Building Forms):**
        *   Tạo một biểu mẫu đăng ký người dùng với các trường như **Input text** (`.form-control`, thử kích thước `.form-control-lg`, `.form-control-sm`), **Input password**, **textarea**.
        *   Thêm **Select menu**, nhóm **radio buttons**, và **checkbox**.
        *   Sử dụng **"Floating labels"** cho ít nhất hai trường input.
        *   Áp dụng **Form Validation** với lớp **`.was-validated`** để hiển thị phản hồi hợp lệ/không hợp lệ.
        *   **Mục tiêu học tập:** Thực hành thiết kế các loại trường form khác nhau và áp dụng validation của Bootstrap.
    3.  **Tạo Nút và Nhóm Nút (Creating Buttons and Button Groups):**
        *   Tạo các nút với **các trạng thái màu khác nhau** (ví dụ: `btn-primary`, `btn-success`, `btn-danger`) và **nút có viền** (outline buttons).
        *   Tạo **nhóm nút ngang** (`.btn-group`) và **nhóm nút dọc** (`.btn-group-vertical`).
        *   **Mục tiêu học tập:** Hiểu và sử dụng các loại nút và nhóm nút trong Bootstrap.
    4.  **Sử Dụng Tabs và Modal (Using Tabs and Modal):**
        *   Tạo giao diện với **hai Tabs** ("Thông tin cá nhân", "Lịch sử mua hàng") và đảm bảo nội dung chuyển đổi tương ứng.
        *   Tạo một nút "Mở hộp thoại" để khi click, một **hộp thoại Modal** sẽ xuất hiện.
        *   **Mục tiêu học tập:** Áp dụng Tabs và Modal để tổ chức nội dung và tạo pop-up tương tác.

***

#### **Bài 3: Các Thành Phần Giao Diện Hữu Ích Của Bootstrap**

Bài này giới thiệu các thành phần UI nâng cao của Bootstrap, giúp trang web của bạn trở nên sinh động và hấp dẫn hơn.

*   **Mục tiêu chính:**
    *   Sử dụng thành thạo Jumbotron, Carousel (Slideshow), Collapse, Pagination, Hình ảnh đáp ứng, Badges, Alert, và Tooltip.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Xây Dựng Trang Đơn Với Các Thành Phần (Building a Single Page with Components):**
        *   Tạo một **Jumbotron** ở đầu trang, sử dụng các lớp trợ giúp để tạo sự chú ý.
        *   Một **Carousel (Slideshow)** với ít nhất 3 hình ảnh và caption (có thể tham khảo mã nguồn từ tài liệu Bootstrap).
        *   Hai phần nội dung có thể **thu gọn (Collapse)**, một phần hiển thị khi click nút "Xem thêm".
        *   Một hệ thống **phân trang (Pagination)** cơ bản với trạng thái "Active" và "Disabled", và căn giữa phân trang.
        *   Ít nhất ba **hình ảnh đáp ứng (responsive images)** với các hình dạng khác nhau (`.rounded`, `.rounded-circle`, `.img-thumbnail`). Căn chỉnh một hình ảnh sang trái (`float-start`), một sang phải (`float-end`), và một căn giữa (`mx-auto d-block`).
        *   Vài **Badges** để thêm thông tin bổ sung (ví dụ: "Sản phẩm Mới", số thông báo) và thử nghiệm các màu khác nhau cho Badges (`bg-*`).
        *   Một **Alert** cảnh báo hoặc thành công, thêm liên kết (`.alert-link`), và tạo Alert có thể đóng (`.alert-dismissible`).
        *   Một **Tooltip** xuất hiện khi di chuột qua, đảm bảo đã thêm JavaScript để khởi tạo Tooltip.
        *   **Mục tiêu học tập:** Thực hành sử dụng đa dạng các thành phần giao diện nâng cao của Bootstrap để làm cho trang web động và hấp dẫn hơn.

***

#### **Bài 4: Tổng Quan Về Framework VueJS**

Đây là bước chuyển sang framework JavaScript, giúp bạn hiểu về VueJS, cài đặt môi trường, và viết mã VueJS đơn giản.

*   **Mục tiêu chính:**
    *   Hiểu khái niệm VueJS và cách cài đặt môi trường phát triển.
    *   Viết được mã VueJS đơn giản, nắm vững cú pháp Template và nội suy.
    *   Biết cách kết hợp Bootstrap với VueJS.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Cài Đặt Môi Trường VueJS (VueJS Environment Setup):**
        *   **Kiểm tra phiên bản NodeJS và NPM** bằng lệnh `node -v` và `npm -v` trong cửa sổ lệnh (CMD/Terminal).
        *   **Tạo một dự án VueJS mới sử dụng Vite** (công cụ xây dựng front-end thế hệ tiếp theo) bằng lệnh `npm create vite@latest`.
        *   **Di chuyển vào thư mục dự án** (`cd project-name`) và **cài đặt các dependencies** (`npm install`).
        *   **Khởi chạy dự án** (`npm run dev`) và xác nhận rằng ứng dụng VueJS mặc định đang chạy trên cổng `http://localhost:5173/`.
        *   **Mục tiêu học tập:** Nắm vững quy trình thiết lập môi trường phát triển VueJS.
    2.  **Chương Trình VueJS Đầu Tiên và Cú Pháp Template (First VueJS Program and Template Syntax):**
        *   Mở file `App.vue` (trong dự án VueJS của bạn trong **VS Code - Insider**).
        *   Trong phần `<script setup>`, **khai báo một biến `message`** và một **phương thức `greet()`**.
        *   Sử dụng **Interpolation (`{{ }}`)** để hiển thị giá trị của biến `message` và gọi phương thức `greet()` trong phần `<template>`.
        *   Khai báo một biến `htmlContent` chứa HTML thô và hiển thị nó bằng **`v-html`**.
        *   Khai báo biến `className` và `styleData`. Áp dụng chúng vào một thẻ `<div>` sử dụng **`v-bind:class` và `v-bind:style`** (hoặc cú pháp viết tắt `:class`, `:style`). Định nghĩa `.my-custom-class` trong `<style scoped>`.
        *   Thử nghiệm **JavaScript Expressions** bên trong interpolation (ví dụ: `{{ number * 2 }}`).
        *   **Mục tiêu học tập:** Làm quen với các cú pháp template cơ bản của VueJS bao gồm nội suy, `v-html`, và `v-bind`.
    3.  **Sử Dụng Directives `v-bind` và `v-on` (Using `v-bind` and `v-on` Directives):**
        *   Trong `App.vue`, tạo một nút (`<button>`).
        *   Sử dụng **`v-on:click` (hoặc `@click`)** để gán một phương thức (ví dụ: `showAlert()`) khi nút được click. Phương thức này sẽ hiển thị một thông báo `alert()`.
        *   Thêm một thẻ `<input type="text">`.
        *   Sử dụng **`v-bind:value` (hoặc `:value`)** để liên kết giá trị của input với một biến `inputValue` được khai báo trong `<script setup>`.
        *   **Mục tiêu học tập:** Hiểu cách `v-bind` và `v-on` giúp liên kết dữ liệu và xử lý sự kiện.
    4.  **Kết Hợp Bootstrap và VueJS (Combining Bootstrap and VueJS):**
        *   **Cài đặt Bootstrap bằng NPM** (`npm install bootstrap`) trong dự án VueJS của bạn.
        *   **Import Bootstrap CSS và JS vào file `main.js`** của bạn.
        *   Trong `App.vue` hoặc một component con mới, thêm một số nút Bootstrap với các màu khác nhau để xác nhận rằng Bootstrap đã được tích hợp thành công.
        *   **Mục tiêu học tập:** Nắm vững quy trình tích hợp Bootstrap vào một dự án VueJS.

***

#### **Bài 5: Data Binding Trong VueJS**

Bài học này đi sâu vào cách VueJS quản lý và đồng bộ hóa dữ liệu với giao diện người dùng, giới thiệu các khái niệm quan trọng như Reactivity.

*   **Mục tiêu chính:**
    *   Tìm hiểu về Data binding (một chiều và hai chiều).
    *   Nắm được khái niệm Reactivity với `ref` và `reactive`.
    *   Hiểu và áp dụng Class và Style binding.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Data Binding Một Chiều (One-Way Data Binding):**
        *   Khai báo biến `productName` và `productLink`.
        *   Hiển thị `productName` trong một thẻ `<p>` bằng interpolation `{{ }}`.
        *   Liên kết `productLink` với thuộc tính `href` của thẻ `<a>` sử dụng **`v-bind:href`**.
        *   **Mục tiêu học tập:** Củng cố sự hiểu biết về cách dữ liệu từ JavaScript được hiển thị ra DOM.
    2.  **Data Binding Hai Chiều (Two-Way Data Binding) với `v-model`:**
        *   Khai báo biến `searchText` (sử dụng `ref('')`).
        *   Tạo một `<input type="text">` và liên kết nó với `searchText` sử dụng **`v-model`**.
        *   Hiển thị giá trị của `searchText` trong một thẻ `<p>` bên dưới input.
        *   **Quan sát sự thay đổi:** Khi bạn gõ vào input, văn bản trong thẻ `<p>` sẽ tự động cập nhật.
        *   **Mục tiêu học tập:** Nắm bắt khái niệm và ứng dụng của two-way data binding, đặc biệt với `v-model`.
    3.  **Thực Hành Reactivity với `ref` và `reactive` (Practicing Reactivity with `ref` and `reactive`):**
        *   **Sử dụng `ref`:** Khai báo biến `count` với `ref(0)`. Tạo nút "Tăng" (`.btn`). Khi click, tăng giá trị của `count` (ví dụ: `count.value++`) và hiển thị `count` trong template.
        *   **Sử dụng `reactive`:** Khai báo đối tượng `user` với `reactive()` chứa `name` và `email`. Hiển thị `user.name` và `user.email` trong template. Tạo nút "Cập nhật Thông tin". Khi click, thay đổi `user.name` và `user.email` trực tiếp (ví dụ: `user.name = 'Jane Doe'`) và quan sát sự cập nhật.
        *   **Mục tiêu học tập:** Phân biệt và áp dụng `ref` và `reactive` để quản lý trạng thái phản ứng trong VueJS.
    4.  **Class và Style Binding (Class and Style Binding):**
        *   **Class Binding (Kiểu Object):** Tạo biến `isLarge` với `ref(true)` và `isRed` với `ref(false)`. Áp dụng các class `large-text` (tự định nghĩa trong `<style>`) và `text-danger` (Bootstrap) dựa trên `isLarge` và `isRed` sử dụng `:class="{ 'large-text': isLarge, 'text-danger': isRed }"`. Thêm nút để toggle giá trị của chúng.
        *   **Class Binding (Kiểu Array):** Khai báo các biến `primaryClass` và `boldClass`. Áp dụng chúng vào một thẻ `<span>` sử dụng `:class="[primaryClass, boldClass]"`.
        *   **Style Binding (Kiểu Object):** Khai báo các biến `myColor` (ví dụ: `ref('blue')`) và `myFontSize` (ví dụ: `ref(18)`). Áp dụng chúng vào một thẻ `<p>` sử dụng `:style="{ color: myColor, fontSize: myFontSize + 'px' }"`. Thêm nút để thay đổi màu sắc và kích thước font.
        *   **Style Binding (Kiểu Array):** Khai báo hai đối tượng style (ví dụ: `styleObj1`, `styleObj2`). Áp dụng chúng vào một thẻ `<div>` sử dụng `:style="[styleObj1, styleObj2]"`.
        *   **Mục tiêu học tập:** Làm chủ việc thêm/loại bỏ các class và điều khiển inline styles một cách linh hoạt.

***

#### **Bài 6: Conditional Rendering và List Rendering**

Bài này tập trung vào việc kiểm soát hiển thị các phần tử dựa trên điều kiện và cách hiển thị danh sách dữ liệu trong VueJS.

*   **Mục tiêu chính:**
    *   Nắm vững kiến thức về Conditional rendering (`v-if`, `v-else`, `v-else-if`, `v-show`) và List rendering (`v-for`).
    *   Phân biệt được trường hợp sử dụng `v-if` và `v-show`.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Conditional Rendering (`v-if`, `v-else`, `v-else-if`, `v-show`):**
        *   **`v-if` và `v-else`:** Tạo biến `isLoggedIn` với `ref(false)`. Hiển thị thông báo "Chào mừng, bạn đã đăng nhập!" nếu `isLoggedIn` là true, và "Vui lòng đăng nhập" nếu false. Thêm một nút để chuyển đổi trạng thái `isLoggedIn`.
        *   **`v-else-if`:** Mô phỏng xếp loại học sinh. Tạo input cho phép nhập `score`. Dựa trên `score`, hiển thị "Xuất sắc", "Giỏi", "Khá", "Trung bình", hoặc "Yếu" sử dụng `v-if`, `v-else-if`, `v-else`.
        *   **`v-show`:** Tạo nút "Hiện/Ẩn Chi Tiết" và một đoạn văn bản dài. Sử dụng `v-show` để ẩn/hiện đoạn văn bản khi click nút. Quan sát sự khác biệt về cách ẩn/hiện so với `v-if` (kiểm tra trong Developer Tools của trình duyệt - F12).
        *   **Mục tiêu học tập:** Hiểu rõ cách kiểm soát hiển thị phần tử dựa trên điều kiện và phân biệt giữa `v-if` và `v-show`.
    2.  **List Rendering (`v-for`):**
        *   **Hiển thị danh sách cơ bản:** Tạo một mảng các chuỗi `fruits` (ví dụ: `['Táo', 'Chuối', 'Cam']`). Sử dụng **`v-for`** để hiển thị mỗi loại trái cây trong một thẻ `<li>`.
        *   **Hiển thị với index:** Sửa đổi ví dụ trên để hiển thị cả tên trái cây và vị trí index của nó trong danh sách.
        *   **Lặp qua đối tượng:** Tạo một mảng các đối tượng `products` (mỗi đối tượng có `id`, `name`, `price`). Sử dụng `v-for` để hiển thị tên và giá của từng sản phẩm trong một danh sách. Đảm bảo sử dụng **`:key="item.id"`**.
        *   **Lặp với range:** Hiển thị các số từ 1 đến 5 trong một danh sách `<ul>` sử dụng `v-for="i in 5"`.
        *   **Kết hợp `v-for` với `v-if`:** Sử dụng ví dụ `products` ở trên. Chỉ hiển thị những sản phẩm có giá lớn hơn một giá trị nhất định (ví dụ: `price > 12`) bằng cách đặt `v-if` bên trong `v-for`.
        *   **Mục tiêu học tập:** Thành thạo việc lặp qua và hiển thị dữ liệu từ mảng/đối tượng, bao gồm cả việc kết hợp với điều kiện.
    3.  **Tạo Form Thêm Mới & Hiển Thị Danh Sách (Creating Add Form & Displaying List):**
        *   Tạo một giao diện đơn giản cho phép thêm mới sinh viên và hiển thị danh sách sinh viên.
        *   Tạo một form với các trường **"Tên sinh viên"** (text input) và **"Tuổi"** (number input).
        *   Sử dụng **`v-model`** để liên kết dữ liệu từ form với một đối tượng `newStudent` trong script của bạn.
        *   Tạo một nút **"Thêm sinh viên"**. Khi click, sử dụng **`@submit.prevent`** để ngăn chặn hành vi mặc định của form và thêm `newStudent` vào một mảng `students`.
        *   Sử dụng **`v-for`** để hiển thị danh sách `students` bên cạnh form.
        *   **Mục tiêu học tập:** Tổng hợp kiến thức về form binding và list rendering trong một ứng dụng nhỏ.

***

#### **Bài 7: Event Handling và Form Binding Trong VueJS**

Bài học này đi sâu vào cách xử lý các sự kiện người dùng và các kỹ thuật liên kết dữ liệu nâng cao với form trong VueJS.

*   **Mục tiêu chính:**
    *   Hiểu về cách Lắng nghe sự kiện (Listen to Events) và Trình xử lý phương thức.
    *   Nắm được các sự kiện chuột, bàn phím và cách sử dụng Event Modifiers.
    *   Hiểu cách liên kết dữ liệu trong Form binding, và sử dụng `v-model` với các thuộc tính nâng cao hoặc component tùy chỉnh.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Event Handling (Xử Lý Sự Kiện):**
        *   **Lắng nghe sự kiện cơ bản:** Tạo nút "Click Me". Sử dụng **`@click`** để tăng một biến `counter` mỗi khi nút được click và hiển thị giá trị của `counter`.
        *   **Trình xử lý phương thức:** Chuyển logic tăng `counter` vào một phương thức riêng (ví dụ: `incrementCounter()`) và gọi phương thức này khi nút được click.
        *   **Truyền tham số:** Tạo nút "Gửi Lời Chào". Sử dụng `@click` để gọi phương thức `greet(message)` và truyền một chuỗi message làm tham số. Phương thức này sẽ hiển thị message trong một `alert()`.
        *   **Event Modifiers (`.prevent`, `.stop`):**
            *   Tạo một form HTML. Khi submit form, sử dụng **`@submit.prevent`** để ngăn chặn việc tải lại trang mặc định của form.
            *   Tạo một `<div>` lớn và một nút nhỏ bên trong. Gán sự kiện `@click` cho cả `div` và nút. Khi click nút, sử dụng **`@click.stop`** trên nút để ngăn sự kiện click lan truyền lên `div` cha.
        *   **Key Modifiers (`.enter`):** Tạo một input text. Sử dụng **`@keyup.enter`** để hiển thị một `alert()` khi người dùng gõ xong và nhấn Enter.
        *   **System Key Modifiers (`.ctrl`, `.alt`):** Tạo một nút. Gán sự kiện **`@click.ctrl`** để chỉ kích hoạt khi người dùng click nút đồng thời giữ phím Ctrl.
        *   **Mục tiêu học tập:** Làm chủ việc xử lý các sự kiện người dùng và sử dụng các modifiers để kiểm soát hành vi sự kiện.
    2.  **Form Binding Nâng Cao (Advanced Form Binding):**
        *   **Textarea:** Tạo một `textarea` và liên kết nó với biến `feedbackMessage` (sử dụng `ref`) sử dụng **`v-model`**. Hiển thị nội dung `feedbackMessage` trong một thẻ `<p>`.
        *   **Checkboxes (multiple):** Tạo một nhóm checkboxes cho phép chọn nhiều sở thích. Liên kết chúng với một mảng `selectedHobbies` (sử dụng `ref`) sử dụng **`v-model`**. Hiển thị các sở thích đã chọn.
        *   **Select/Option:** Tạo một select menu cho phép chọn màu sắc yêu thích. Liên kết nó với biến `favoriteColor` (sử dụng `ref`) sử dụng **`v-model`**. Hiển thị màu đã chọn.
        *   **`v-model` modifiers (`.lazy`, `.number`, `.trim`):**
            *   Tạo input text cho "Tên đăng nhập". Áp dụng **`.trim` modifier** cho `v-model` để tự động loại bỏ khoảng trắng thừa.
            *   Tạo input number cho "Tuổi". Áp dụng **`.number` modifier** cho `v-model` để đảm bảo giá trị là kiểu số.
            *   Tạo `textarea` cho "Góp ý". Áp dụng **`.lazy` modifier** cho `v-model` để giá trị chỉ cập nhật khi sự kiện `change` xảy ra (khi blur khỏi input) thay vì mỗi lần gõ phím.
        *   **`v-model` với Custom Component (Optional, Nâng cao):** Nếu có thời gian, hãy thử tạo một component con (ví dụ: `MyInput.vue`) và sử dụng `v-model` trên component đó trong component cha. Component con cần nhận `modelValue` qua props và `emit('update:modelValue')` khi giá trị thay đổi.
        *   **Mục tiêu học tập:** Thấu hiểu các cách ràng buộc dữ liệu trong form và các thuộc tính nâng cao của `v-model`.

***

#### **Bài 8: Vue Router và Authentication**

Bài cuối cùng này giới thiệu về Vue Router, cách quản lý điều hướng trong ứng dụng một trang (SPA), và các khái niệm cơ bản về xác thực người dùng.

*   **Mục tiêu chính:**
    *   Tìm hiểu khái niệm Router và cách cài đặt Vue Router.
    *   Nắm được các tính năng cơ bản của Vue Router.
    *   Hiểu cách kết hợp Vue Router với Authentication để bảo vệ các route.

*   **Các nhiệm vụ thực hành (Bài Tập):**
    1.  **Cài Đặt và Cấu Hình Vue Router Cơ Bản (Basic Vue Router Installation and Configuration):**
        *   Trong dự án VueJS hiện có của bạn (trong **VS Code - Insider**), **cài đặt Vue Router** (`npm install vue-router@next` cho Vue 3).
        *   **Tạo thư mục `src/router` và một file `index.js`** bên trong.
        *   Trong `src/router/index.js`, **cấu hình ít nhất ba routes**:
            *   Route `/` (Home) liên kết với một component `HomeView.vue`.
            *   Route `/about` liên kết với một component `AboutView.vue`.
            *   Một **dynamic route `/users/:id`** liên kết với một component `UserDetail.vue`.
        *   **Tạo các component `HomeView.vue`, `AboutView.vue`, và `UserDetail.vue` đơn giản** (chỉ chứa một tiêu đề `<h1>` với tên component).
        *   Trong `src/main.js`, **thêm Router vào ứng dụng Vue của bạn**.
        *   **Mục tiêu học tập:** Nắm vững các bước cài đặt và cấu hình cơ bản của Vue Router.
    2.  **Điều Hướng Cơ Bản với `RouterLink` và `RouterView` (Basic Navigation with `RouterLink` and `RouterView`):**
        *   Trong file `App.vue` (hoặc layout chính của bạn), thêm các thẻ **`<RouterLink>`** để điều hướng đến Home và About.
        *   Thêm một thẻ **`<RouterView>`** để hiển thị component tương ứng với route hiện tại.
        *   Tạo một `RouterLink` đến dynamic route `users/:id`, ví dụ: `<RouterLink to="/users/123">User 123</RouterLink>`.
        *   Trong `UserDetail.vue`, hiển thị `id` của người dùng từ `route params` (thông qua `useRoute().params.id` trong Composition API) [Không được chỉ rõ trực tiếp trong nguồn, nhưng là phần mở rộng tự nhiên của Dynamic Routing].
        *   **Mục tiêu học tập:** Hiểu cách thiết lập điều hướng giữa các trang và hiển thị nội dung route.
    3.  **Khái Niệm về Authentication (Concept of Authentication - Lý Thuyết):**
        *   Dựa vào các nguồn, mô tả lại vai trò của **Route Guards** trong việc xử lý xác thực và phân quyền trong ứng dụng SPA.
        *   Đặc biệt tập trung vào **`beforeEach`** (một loại Navigation Guard chạy trước mỗi thay đổi route) và thuộc tính **`meta`** của route (dùng để đánh dấu route cần xác thực).
        *   **Mục tiêu học tập:** Hiểu lý thuyết về cách Vue Router có thể được sử dụng để bảo vệ các route yêu cầu xác thực. (Lưu ý: Thực hành chi tiết cần hiểu sâu hơn về backend và quản lý trạng thái xác thực).

***

### **Lời Khuyên Chung Cho Việc Tự Học (trong Visual Studio Code - Insider):**

*   **Bắt đầu từ những điều cơ bản nhất:** Đừng cố gắng làm quá nhiều cùng một lúc. Hãy chắc chắn bạn nắm vững Bài 1 và Bài 2 (Bootstrap) trước khi chuyển sang VueJS. Nền tảng vững chắc sẽ giúp bạn tiến xa hơn.
*   **Thực hành lặp đi lặp lại:** Luôn **gõ lại mã ví dụ từ các nguồn** thay vì chỉ sao chép. Điều này giúp bạn ghi nhớ cú pháp và hiểu rõ cách hoạt động của code. Hãy coi như bạn đang tự tay lắp ráp từng phần của một cỗ máy.
*   **Sử dụng Developer Tools (F12):** Đây là công cụ không thể thiếu của mọi lập trình viên. Thường xuyên kiểm tra các phần tử HTML, CSS và console log trong trình duyệt để gỡ lỗi và hiểu rõ hơn cách Bootstrap và VueJS tác động đến DOM.
*   **Đừng ngại tìm kiếm thông tin:** Các nguồn đã cung cấp nhiều liên kết đến tài liệu chính thức của Bootstrap và VueJS (ví dụ: `getbootstrap.com`, `vuejs.org`). Hãy tận dụng chúng để tìm hiểu thêm khi cần. Cộng đồng trực tuyến cũng rất lớn và sẵn lòng giúp đỡ.
*   **Với Visual Studio Code - Insider:**
    *   Hãy cài đặt **Extension Vue - Official** (`Vue Language Features (Volar)`) và các extension Bootstrap liên quan để có trải nghiệm phát triển tốt nhất, bao gồm gợi ý code, kiểm tra lỗi, và định dạng.
    *   Tận dụng tính năng Git tích hợp trong VS Code để quản lý phiên bản code của bạn, điều này rất hữu ích cho các dự án lớn sau này.

***

Hãy tưởng tượng bạn đang xây dựng một ngôi nhà kỹ thuật số. **Bootstrap cung cấp cho bạn những bản vẽ kiến trúc và các bộ phận lắp ghép sẵn** như cửa, cửa sổ và khung sườn để bạn nhanh chóng dựng lên cấu trúc bên ngoài ngôi nhà một cách đẹp mắt và vững chắc. Còn **VueJS thì giống như hệ thống điện, nước và các thiết bị thông minh bên trong**, giúp ngôi nhà của bạn trở nên sống động và tương tác được, tự động điều chỉnh ánh sáng khi trời tối hay bật nhạc khi bạn bước vào phòng. Để ngôi nhà hoạt động trơn tru và hiệu quả, bạn cần học cách lắp đặt từng phần đúng cách và hiểu cách chúng giao tiếp với nhau. Mỗi bài tập bạn hoàn thành không chỉ là một nhiệm vụ, mà là một viên gạch được đặt đúng chỗ, một đường dây điện được nối đúng cách, từng chút một sẽ tạo nên một công trình vững chắc và hiện đại! Cố lên nhé!