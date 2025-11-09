/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Bai1;

/**
 *
 * @author longsuwu
 */
public class ChuNhat {
    private double rong;
    private double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public double getDai() {
        return dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }
    
    public double getChiVu() {
        return ((this.dai + this.rong) * 2);
    }
    
    public double getDienTich() {
        return (this.dai * this.rong);
    }
    
    public void xuat() {
        System.out.println("Chieu rong la: " + this.rong);
        System.out.println("Chieu dai la: " + this.dai);
        System.out.println("Chi vu la: " + getChiVu());
        System.out.println("Dien tich la: " + getDienTich());
    }
}
