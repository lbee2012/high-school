/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhongOn3Diem;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String mssv;
    private String hoTen;
    private String lop;
    private int tuoi;
    private String gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String mssv, String hoTen, String lop, int tuoi, String gioiTinh) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.lop = lop;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void inThongTin() {
        System.out.println("MSSV: " + mssv);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Tuoi: " + tuoi);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("=====");
    }
}
