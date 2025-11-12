function tinhBMI() {
    let can = prompt('Nhap vao can nang(kg): ');
    let cao = prompt('Nhap vao chieu cao(m): ');

    let bmi = can / (cao*cao);

    if (can == "" || cao == "") {
        alert("Vui long khong de trong");
        return;
    }
    if (isNaN(can) || isNaN(cao)) {
        alert("Vui long nhap can nang va chieu cao la so");
        return;
    }

    document.getElementById("kq").innerText = `Chi so BMI = ${bmi}`

    if (bmi < 18.5) {
        document.getElementById("kq").innerText = "Thieu can"
    } else if (bmi >= 18.5 && bmi < 25) {
        document.getElementById("kq").innerText = "Binh thuong"
    } else if (bmi >= 25 && bmi < 30) {
        document.getElementById("kq").innerText = "Thua can"
    } else {
        document.getElementById("kq").innerText = "Beo phi"
    }
}