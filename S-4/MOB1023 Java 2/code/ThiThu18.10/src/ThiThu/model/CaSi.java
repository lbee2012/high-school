/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu.model;

/**
 *
 * @author longsuwu
 */
public class CaSi {
    private String ma;
    private String ten;
    private String gioiTinh;
    private String hang;
    private Integer namHoatDong;

    public CaSi() {
    }

    public CaSi(String ma, String ten, String gioiTinh, String hang, Integer namHoatDong) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.hang = hang;
        this.namHoatDong = namHoatDong;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public Integer getNamHoatDong() {
        return namHoatDong;
    }

    public void setNamHoatDong(Integer namHoatDong) {
        this.namHoatDong = namHoatDong;
    }

    @Override
    public String toString() {
        return ma + ", " + ten + ", " + gioiTinh + ", " + hang + ", " + namHoatDong;
    }
}
