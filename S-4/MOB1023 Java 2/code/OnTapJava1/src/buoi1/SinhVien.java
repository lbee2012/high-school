/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi1;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String maSinhVien;
    private String tenSinhVien;
    private int namSinh;
    private String diaChi;
    private String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String tenSinhVien, int namSinh, String diaChi, String gioiTinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void inThongTin() {
        System.out.println("Ma sv: " + maSinhVien);
        System.out.println("Ten sv: " + tenSinhVien);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + gioiTinh);
    }
}


