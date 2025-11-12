var a = "", b = "", o = null;

function lam_lai() {
    a = "";
    b = "";
    o = null;
}

function toan_tu(x) {
    o = x;
}

function toan_hang(x) {
    if (o == null) {
        a += x;
    } else {
        b += x;
    }
}

function thuc_hien() {
    var num1 = parseFloat(a);
    var num2 = parseFloat(b);
    var c;
    switch (o) {
        case "+":
            c = num1 + num2;
            alert("Tong: " + c);
            break;
        case "-":
            c = num1 - num2;
            alert("Hieu: " + c);
            break;
        case "*":
            c = num1 * num2;
            alert("Tich: " + c);
            break;
        case "/":
            c = num1 / num2;
            alert("Thuong: " + c);
            break;
        default:
            alert(o + " khong phai toan tu");
            return;
    }
    lam_lai();
}