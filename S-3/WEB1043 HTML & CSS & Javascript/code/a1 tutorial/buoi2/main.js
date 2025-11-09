//onclick on+V : vieest o open tag, tỏng html
// dùng DOM
//

function sayHello() {
    alert("He lo ca nha iu cua kem");
}

let hang = [];

//func add vao gio hang
function them() {
    let name, quantity, price;
    //is + True/False
    let isValid = false;
    while (!isValid) {
        name = prompt(`Nhap ten: `);
        quantity = prompt(`Nhap so luong: `);
        price = prompt(`Nhap gia: `);

        //check dieu kien nhap vao: ten, so luong, gia
        if (name && !isNaN(quantity) && quantity > 0 && !isNaN(price) && price > 0) {
            isValid = true;
            let sp = {
                ten : ten,
                quantity : quantity,
                price : price
            }
            hang.push(sp);
            alert(`Them san pham vao gio hang thanh cong`);
        } else {
            alert(`Thong tin san pham khong hop le`)
        }
    }
}