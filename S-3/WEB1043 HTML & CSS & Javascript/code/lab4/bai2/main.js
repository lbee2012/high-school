var sv = new Object();

function nhapThongTin() {
    sv.ten = prompt("Ho va ten");
    sv.diem = parseFloat(prompt("Diem trung binh"));

    sv.hienThi = function() {
        if (this.diem >= 5) {
            this.hocLuc = "Đậu";
        } else {
            this.hocLuc = "Rớt";
        }
        document.write("Ho va ten: " + this.ten);
        document.write("Diem trung binh: " + this.diem);
        document.write("Hoc luc: "+this.hocLuc);
    };
    
    sv.hienThi();
}