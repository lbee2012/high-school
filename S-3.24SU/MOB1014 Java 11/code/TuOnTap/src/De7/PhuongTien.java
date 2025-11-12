/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7;

/**
 *
 * @author longsuwu
 */
public class PhuongTien {
    private String maPhuongTien;
    private String tenPhuongTien;
    private int trongLuong;
    private float giaTien;

    public PhuongTien() {
    }

    public PhuongTien(String maPhuongTien, String tenPhuongTien, int trongLuong, float giaTien) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.trongLuong = trongLuong;
        this.giaTien = giaTien;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public float getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(float giaTien) {
        this.giaTien = giaTien;
    }
    
    public void inThongTin() {
        System.out.println();
        System.out.println("Ma phuong tien la: " + maPhuongTien);
        System.out.println("Ten phuong tien la: " + tenPhuongTien);
        System.out.println("Trong luong phuong tien la: " + trongLuong);
        System.out.println("Gia tien phuong tien la: " + giaTien);
    }
}
