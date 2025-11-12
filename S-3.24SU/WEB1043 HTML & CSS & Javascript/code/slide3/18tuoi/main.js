do {
    let age = kiemTraTuoi();
    kiemTraTuoi2(age)


    var kiemTra = confirm("Ban co muon nhap tiep khong?")
} while (kiemTra == true)

function kiemTraTuoi() {
    let tuoi = prompt("Nhap vao tuoi cua ban: ");
    let check = age >= 18 ? "Ban du dk thi bang lai" : "Ban khong du dk thi bang lau";
    alert(check);

    alert("Tuoi cua ban la: ", age)
}

function kiemTraTuoi2(age) {
    switch (age) {
        case "20":
            alert("Ban 20 tuoi")
            break;
        case "21":
            alert("Ban 21 tuoi")
            break;
        case "22":
            alert("Ban 22 tuoi")
            break;
        case "23":
            alert("Ban 23 tuoi")
            break;
        default:
            alert("Ban khong trong khoang tu 20-23 tuoi")
            break;
    }
}

let arr = ["Mot", "Hai", 3, "Bon"]

for (let i = 0; i < arr; i ++){
    console.log("Phan tu thu " + (i + 1) + " la: " + arr[i] )
}