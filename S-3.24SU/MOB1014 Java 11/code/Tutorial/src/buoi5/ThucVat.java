/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author longsuwu
 */
public class ThucVat {
    private String ma;
    private String ten;
    private int gioiTinh;
    private double canNang;
    private double chieuCao;
    private String loai;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, int gioiTinh, double canNang, double chieuCao, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.loai = loai;
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

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    public String chuyenDoiGioiTinh() {
        if (gioiTinh == 1) {
            return "duc";
        } return "cai";
    }
    
    public void xuat() {
        System.out.println("");
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + chuyenDoiGioiTinh());
        System.out.println("Can nang: " + canNang);
        System.out.println("Chieu cao: " + chieuCao);
        System.out.println("Loai`: " + loai);
    }
}
