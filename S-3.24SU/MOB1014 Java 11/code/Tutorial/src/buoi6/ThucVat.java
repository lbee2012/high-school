/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author longsuwu
 */
public class ThucVat {
    private String ma;
    private String ten;
    private String loaiCay;
    private String khuVucSong;
    private int khoiLuong;

    public ThucVat() {
    }

    public ThucVat(String ma, String ten, String loaiCay, String khuVucSong, int khoiLuong) {
        this.ma = ma;
        this.ten = ten;
        this.loaiCay = loaiCay;
        this.khuVucSong = khuVucSong;
        this.khoiLuong = khoiLuong;
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

    public String getLoaiCay() {
        return loaiCay;
    }

    public void setLoaiCay(String loaiCay) {
        this.loaiCay = loaiCay;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }
    
    public void xuat() {
        System.out.println("Ma: " + ma);
        System.out.println("Ten: " + ten);
        System.out.println("Loai cay: " + loaiCay);
        System.out.println("Khu vuc song: " + khuVucSong);
        System.out.println("Khoi luong: " + khoiLuong);
    }
}
