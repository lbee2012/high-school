/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De3.model;

/**
 *
 * @author longg
 */
public class PhongBan {
    public String ma;
    public String ten;
    public Boolean trangThai;
    public Integer soNhanVien;

    public PhongBan() {
    }

    public PhongBan(String ma, String ten, Boolean trangThai, Integer soNhanVien) {
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
        this.soNhanVien = soNhanVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(Integer soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
    
    
}
