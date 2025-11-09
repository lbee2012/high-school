// // so sánh sự khác biệt giữa var và let
// let x = 5;
// console.log("Tutorial Day1")

// //String
// //Number
// //BigInt
// //Boolean
// //Symbol
// //Undefined
// //Null

// let a = "Hello World";
// let b = 5.5;

// //let a = "",'',``;

// let name = "JS";
// let age = 12;
// let hello = "Ali Ali Ali"
// let hello1 = `JavaSkibidi Hihi`

// // ép kiểu
// // kiểu dữliệu (biến)
// let c = 5;
// c = Number(c);

// // so sánh
// // == so sánh giá trị
// // === so sánh kiểu dữ liệu + giá trị : tuyệt đối

// let d = 5;
// let e = `5`;
// console.log(a === b);

// // console.log();
// // prompt();
// // setInterval();
// // setTimeout();
// // Date();
// // alert();

// setTimeout(() => {
    
// }, 2000);


// function bai1() {
//     let inputAge = prompt(`Moi ban nhap tuoi: `);
//     let age = parseInt(inputAge);
//     //isNaN
//     if (!isNaN(age) && age > 0) {
//         if(age < 12) {
//             alert(`Tre con vcl`);
//         } else if(age < 17) {
//             alert(`Thanh nien teen`);
//         } else {
//             alert(`Du tuoi lay vo`);
//         }
//     } else {
//         alert(`Vui long nhap tuoi hop le`)
//     }
// }

// function bai2() {
//     let diemTB = prompt(`Moi ban nhap DTB: `);
//     let diemCK = prompt(`Moi ban nhap DCK: `);

//     let dtb = parseFloat(diemTB);
//     let dck = parseFloat(diemCK);

//     isNaN

//     if (!isNaN(dtb) && dtb >= 0 && dtb <= 10 && !isNaN(dck) && dck >= 0 && dck <= 10) {
//         let diem = dck * 0.6 + dtb * 0.4;
//         if (diem >= 5) {
//             alert(`Chuc mung ban da pass mon`)
//         } else {
//             let diemCanThem = 5 - diem;
//             alert(`Nice Try bri, thieu ${diemCanThem} de qua mon`)
//         }
//     } else {
//         alert(`Vui long nhap diem hop le`)
//     }
// }

let myArr = ["SD1801", "SD1802", "SD1803"];
let myArr1 = ["SD1804", "SD1805", "SD1806"];

//push: thêm phần tử vào cuối
myArr.push("SD1804");
console.log(myArr);

//pop: xóa phần tử cuối
let lastClss = myArr.pop();
console.log(myArr)

//shift: xóa phần tử đầu tiên
let firstClss = myArr.shift();
console.log(myArr)

//concat
let concatmyArr = myArr.concat(myArr1);
console.log(concatmyArr)