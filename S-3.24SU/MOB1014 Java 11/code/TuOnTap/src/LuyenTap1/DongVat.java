/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap1;

/**
 *
 * @author longsuwu
 */
public class DongVat {
    private String maDongVat;
    private String tenDongVat;
    private int canNang;
    private String noiSong;

    public DongVat() {
    }

    public DongVat(String maDongVat, String tenDongVat, int canNang, String noiSong) {
        this.maDongVat = maDongVat;
        this.tenDongVat = tenDongVat;
        this.canNang = canNang;
        this.noiSong = noiSong;
    }

    public String getMaDongVat() {
        return maDongVat;
    }

    public void setMaDongVat(String maDongVat) {
        this.maDongVat = maDongVat;
    }

    public String getTenDongVat() {
        return tenDongVat;
    }

    public void setTenDongVat(String tenDongVat) {
        this.tenDongVat = tenDongVat;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getNoiSong() {
        return noiSong;
    }

    public void setNoiSong(String noiSong) {
        this.noiSong = noiSong;
    }
    
    public void inThongTin() {
        System.out.println("Ma dong vat la: " + maDongVat);
        System.out.println("Ten dong vat la: " + tenDongVat);
        System.out.println("Can nang la: " + canNang);
        System.out.println("Noi song la: " + noiSong);
    }
}