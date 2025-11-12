/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2.model;

/**
 *
 * @author longg
 */
public class HocSinh {
    public String maHocSinh;
    public String hoTen;
    public Boolean gioiTinh;
    public String lop;

    public HocSinh() {
    }

    public HocSinh(String maHocSinh, String hoTen, Boolean gioiTinh, String lop) {
        this.maHocSinh = maHocSinh;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    
}
