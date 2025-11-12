/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithu;

/**
 *
 * @author longsuwu
 */
public class KhachHang {
    private String id;
    private String hoTen;
    private String sdt;
    private String gioiTinh;
    private int namSinh;

    public KhachHang() {
    }

    public KhachHang(String id, String hoTen, String sdt, String gioiTinh, int namSinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void inThongTin() {
        System.out.println("ID KH: " + id);
        System.out.println("Ho ten KH: " + hoTen);
        System.out.println("SDT KH: " + sdt);
        System.out.println("Gioi tinh KH: " + gioiTinh);
        System.out.println("Nam sinh KH: " + namSinh);
        System.out.println("===========");
    }
}
