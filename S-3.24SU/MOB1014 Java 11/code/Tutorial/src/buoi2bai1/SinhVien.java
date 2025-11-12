/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2bai1;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String chuyenNganh;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, int namSinh, String chuyenNganh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void xuat() {
        System.out.println("Ma sivi la: " + this.maSV);
        System.out.println("Ho va ten cua sivi la: " + this.hoTen);
        System.out.println("Nam sinh cua sivi la: " + this.namSinh);
        System.out.println("Chuyen nganh sivi hoc la: " + this.chuyenNganh);
        System.out.println("Diem trung binh cua sivi la: " + this.diemTB);
    }
}
