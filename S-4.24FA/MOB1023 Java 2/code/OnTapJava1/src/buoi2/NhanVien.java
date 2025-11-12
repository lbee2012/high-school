/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2;

/**
 *
 * @author longsuwu
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, int tuoi, String diaChi, String gioiTinh) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ten: " + hoTen);
        System.out.println("Nam sinh: " + tuoi);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("=====");
    }
}
