var a = prompt("Toán hạng a: ");
var b = prompt("Toán hạng b: ");
var o = prompt("Toán tử: ");

switch (o) {
    case "+":
        var kq = a + b
        alert("Tong : " + kq)
        break
    case "-":
        var kq = a - b
        alert("Hieu : " + kq)
        break
    case "*":
        var kq = a * b
        alert("Tich : " + kq)
        break
    case "/":
        var kq = a / b
        alert("Thuong : " + kq)
        break
    default:
        alert(o + " khong phai la toan tu")
        break
}
