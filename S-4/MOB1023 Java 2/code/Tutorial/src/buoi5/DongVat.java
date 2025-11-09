/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author longsuwu
 */
public class DongVat {
    private String ma;
    private String ten;
    private String gioiTinh;
    private double canNang;

    public DongVat() {
    }

    public DongVat(String ma, String ten, String gioiTinh, double canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
    
    public void xuat() {
        System.out.println("");
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Can nang: " + canNang);
    }
}