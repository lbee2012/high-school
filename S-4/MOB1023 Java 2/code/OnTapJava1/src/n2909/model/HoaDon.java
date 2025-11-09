/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2909.model;

/**
 *
 * @author longsuwu
 */
public class HoaDon {
    public String ID;
    public String sanPham;
    public int soLuong;
    public float giaBan;
    public String trangThai;

    public HoaDon() {
    }

    public HoaDon(String ID, String sanPham, int soLuong, float giaBan, String trangThai) {
        this.ID = ID;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
