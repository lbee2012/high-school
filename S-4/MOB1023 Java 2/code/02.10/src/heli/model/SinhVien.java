/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heli.model;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String ID;
    private String hoTen;
    private String gioiTinh;
    private String lopHoc;
    private String trangThai;

    public SinhVien() {
    }

    public SinhVien(String ID, String hoTen, String gioiTinh, String lopHoc, String trangThai) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.lopHoc = lopHoc;
        this.trangThai = trangThai;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ID + ", " + hoTen + ", " + gioiTinh + ", " + lopHoc + ", " + trangThai;
    }
    
    
}
