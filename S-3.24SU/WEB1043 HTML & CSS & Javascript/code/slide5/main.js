function kiemtra() {
    var d = document.querySelector("#hello");
    var e = document.querySelector(".");
    console.log(e);

    //trả về giá trị text trong thẻ
    console.log(e.textContent);
    
    //truyền html vào thẻ
    e.innerHTML = "<h1 id='hello' class='sd1803'>xin chào Việt Nam</h1>";

    //getElementById lấy ra thẻ đầu tiên chứa...
    var a = document.getElementById("hello");
    console.log(a);

    //
    var b = document.getElementsByTagName("h1");
    console.log(b);

    //
    var c = document.getElementsByClassName("sd1803");
    console.log(c);
}