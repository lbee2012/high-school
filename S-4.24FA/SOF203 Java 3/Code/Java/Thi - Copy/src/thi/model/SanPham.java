/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi.model;

/**
 *
 * @author longg
 */
public class SanPham {
    public String ma;
    public String ten;
    public Boolean trangThai;
    public Double giaBan;

    public SanPham() {
    }

    public SanPham(String ma, String ten, Boolean trangThai, Double giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
        this.giaBan = giaBan;
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

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    
}
