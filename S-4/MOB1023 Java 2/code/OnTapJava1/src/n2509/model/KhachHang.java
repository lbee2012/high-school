/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2509.model;

/**
 *
 * @author longsuwu
 */
public class KhachHang {
    private String ID;
    private String hoTen;
    private String diaChi;
    private String gioiTinh;
    private Integer namSinh;

    public KhachHang() {
    }

    public KhachHang(String ID, String hoTen, String diaChi, String gioiTinh, int namSinh) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
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

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
    
    
}
