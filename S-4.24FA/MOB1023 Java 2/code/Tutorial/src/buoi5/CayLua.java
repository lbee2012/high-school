/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

/**
 *
 * @author longsuwu
 */
public class CayLua extends ThucVat {
    private double sanLuong;

    public CayLua() {
    }

    public CayLua(double sanLuong, String ma, String ten, int gioiTinh, double canNang, double chieuCao, String loai) {
        super(ma, ten, gioiTinh, canNang, chieuCao, loai);
        this.sanLuong = sanLuong;
    }

    public double getSanLuong() {
        return sanLuong;
    }

    public void setSanLuong(double sanLuong) {
        this.sanLuong = sanLuong;
    }
    
    public void xuat() {
        System.out.println("");
        System.out.println("San luong moi nam: " + sanLuong);
        super.xuat();
    }
}
