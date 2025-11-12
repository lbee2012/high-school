/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThu;

/**
 *
 * @author longsuwu
 */
public class MonHoc {
    private String maMon;
    private String tenMon;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    public void inThongTin() {
        System.out.println("");
        System.out.println("Ma mon la: " + maMon);
        System.out.println("Ten mon la: " + tenMon);
        System.out.println("So tin chi la: " + soTinChi);
    }
}
