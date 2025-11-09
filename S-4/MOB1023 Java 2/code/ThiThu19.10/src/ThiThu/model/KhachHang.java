/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu.model;

/**
 *
 * @author longsuwu
 */
public class KhachHang {
    private String ma;
    private String ten;
    private Integer namSinh;
    private String loai;
    private String gioiTinh;

    public KhachHang() {
    }

    public KhachHang(String ma, String ten, Integer namSinh, String loai, String gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
        this.loai = loai;
        this.gioiTinh = gioiTinh;
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

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return ma + ", " + ten + ", " + namSinh + ", " + loai + ", " + gioiTinh;
    }
}
