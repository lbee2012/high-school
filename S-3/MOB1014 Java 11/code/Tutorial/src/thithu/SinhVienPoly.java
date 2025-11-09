/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

/**
 *
 * @author longsuwu
 */
public class SinhVienPoly extends SinhVien {
    private String chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String maSV, String hoTen, String chuyenNganh, String chuyenNganhHep) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Chuyen nganh hep sivi la: " + chuyenNganhHep);
    }
}
