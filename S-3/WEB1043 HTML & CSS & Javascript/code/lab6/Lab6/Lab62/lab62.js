var flag = true; // để chọn nhãn (true: X, false: O)
        var count = 0; // để đếm số lần click nút trên bàn cờ

        function mark(index) {
            var buttons = document.getElementsByTagName("button");
            var button = buttons[index];
            button.innerText = flag ? "X" : "O";
            button.style.backgroundColor = flag ? "aqua" : "yellow";
            button.setAttribute("disabled", "true");
            flag = !flag; // đảo cờ để lần sau hiển thị nhãn và màu nền khác
            count++; // đếm số lần click

            if (count == 8) {
                alert("Game over!");
                location.reload(); // load lại trang web
            }
        }