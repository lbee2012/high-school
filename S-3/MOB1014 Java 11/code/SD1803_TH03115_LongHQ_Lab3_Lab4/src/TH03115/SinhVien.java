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
public class SinhVien {
    private String tenSV;
    private int tuoiSV;
    private double diemTB;
    
    public SinhVien(String tenSV, int tuoiSV, double diemTB) {
        this.tenSV = tenSV;
        this.tuoiSV = tuoiSV;
        this.diemTB = diemTB;
    }

    public String getTenSV() {
        return tenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    public void nhap() { //in
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sivi: ");
        tenSV = sc.nextLine();
        System.out.print("Nhap tuoi sivi: ");
        tuoiSV = sc.nextInt();
        System.out.print("Nhap DTB cua sivi: ");
        diemTB = sc.nextDouble();
    }
    public void xuat() { //out
        System.out.println("Ten sivi: " + tenSV);
        System.out.println("Tuoi sivi: " + tuoiSV);
        System.out.println("DTB cua sivi: " + diemTB);
    }
}