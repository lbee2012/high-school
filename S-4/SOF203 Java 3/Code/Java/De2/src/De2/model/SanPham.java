/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De2.model;

/**
 *
 * @author longg
 */
public class SanPham {
    public String ma;
    public String ten;
    public Double giaBan;
    public Boolean trangThai;

    public SanPham() {
    }

    public SanPham(String ma, String ten, Double giaBan, Boolean trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
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

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    
}
