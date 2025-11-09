function tinhCanhHuyen() {
    let a = prompt('Nhap canh a: ');
    let b = prompt('Nhap canh b: ');

    let c = Math.sqrt(a*a + b*b);

    if (a == "" || b == "") {
        alert("Vui long khong de trong");
        return;
    }
    if (isNaN(a) || isNaN(b)) {
        alert("Vui long nhap 2 canh la so");
        return;
    }
    document.getElementById("ketqua").innerText = `Canh huyen c = ` + c;
}