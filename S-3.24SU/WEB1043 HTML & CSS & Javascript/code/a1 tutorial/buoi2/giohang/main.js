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
                name : name,
                quantity : quantity,
                price : price
            }
            hang.push(sp);
            alert(`Them san pham vao gio hang thanh cong`);
            break;
        } else {
            alert(`Thong tin san pham khong hop le`)
        }
    }
}

function xoa() {
    let tenSP = prompt(`Nhap ten: `);
    let isFound = false;
    let index = 0;

    for (let sp of hang) {
        if (sp.name.toLowerCase() === tenSP.toLocaleLowerCase()) {
            hang.splice(index,1);
            isFound = true;
            alert(`Xoa san pham "${tenSP}" thanh cong`);
            break;
        }
        index++;
        
        if(!isFound) {
            alert(`Khong tim thay san pham "${tenSP}"`)
        }
    }
}
function tongTien() {
    let tong = 0;
    for (let sp of hang) {
        total += sp.price * sp.quantity;
    }
    return total.toFixed(3);
}

function giohang() {
    if (hang.length === 0) {
        alert(`Gio hang kcj`);
    }
    let hienThi = ``;
    for (let sp of hang) {
        hienThi += `San pham ${sp.name}, so luong ${sp.quantity}, gia ${sp.price}`;
    }
    hienThi += `Tong tien hang = ${tongTien()}`
}