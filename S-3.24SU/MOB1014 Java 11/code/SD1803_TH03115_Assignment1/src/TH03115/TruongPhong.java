/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class TruongPhong extends NhanVien {
    private double trachNhiem; //luong trach nhiem

    public TruongPhong(String maNV, String hoTen, double luong, double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }
    
    @Override
    public double getThuNhap() {
        return getLuong() + trachNhiem;
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Luong trach nhiem: " + trachNhiem);
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }
    
    
}
