/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n1110.model;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private Integer ID;
    private String ten;
    private String diaChi;
    private String gioiTinh;
    private String lop;

    public SinhVien() {
    }

    public SinhVien(Integer ID, String ten, String diaChi, String gioiTinh, String lop) {
        this.ID = ID;
        this.ten = ten;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.lop = lop;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return ID + ", " + ten + ", " + diaChi + ", " + gioiTinh + ", " + lop;
    }
}
