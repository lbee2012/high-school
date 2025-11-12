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
public class TiepThi extends NhanVien {
    private double doanhSo;
    private double hoaHong;

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double hoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return (getLuong() + (doanhSo * (hoaHong/100)));
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Doanh so: " + doanhSo);
        System.out.println("Hoa hong: " + hoaHong);
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }
    
    
}
