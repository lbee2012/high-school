function doiDonVi() {
    let m2 = prompt('Nhap dien tich cua manh dat (m2): ')

    let sao = m2 / 360
    let ha = m2 / 10000
    let mau = m2 / 3600

    document.write("m2 dat la: " + m2)
    document.write(sao.toPrecision(2) + "sao")
    document.write(mau.toPrecision(2) + "mau")
    document.write(ha.toPrecision(2) + "ha")
}