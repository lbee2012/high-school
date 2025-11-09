/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8;

/**
 *
 * @author longsuwu
 */
public class MayTinh {
    private String maMayTinh;
    private String tenMayTinh;
    private int trongLuong;
    private String noiBan;

    public MayTinh() {
    }

    public MayTinh(String maMayTinh, String tenMayTinh, int trongLuong, String noiBan) {
        this.maMayTinh = maMayTinh;
        this.tenMayTinh = tenMayTinh;
        this.trongLuong = trongLuong;
        this.noiBan = noiBan;
    }

    public String getMaMayTinh() {
        return maMayTinh;
    }

    public void setMaMayTinh(String maMayTinh) {
        this.maMayTinh = maMayTinh;
    }

    public String getTenMayTinh() {
        return tenMayTinh;
    }

    public void setTenMayTinh(String tenMayTinh) {
        this.tenMayTinh = tenMayTinh;
    }

    public int getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(int trongLuong) {
        this.trongLuong = trongLuong;
    }

    public String getNoiBan() {
        return noiBan;
    }

    public void setNoiBan(String noiBan) {
        this.noiBan = noiBan;
    }
    
    public void inThongTin() {
        System.out.println();
        System.out.println("Ma may tinh la: " + maMayTinh);
        System.out.println("Ten may tinh la: " + tenMayTinh);
        System.out.println("Trong luong may la: " + trongLuong);
        System.out.println("Noi ban may la: " + noiBan);
    }
}
