/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String ten;
    private int tuoi;
    private double diem;

    public SinhVien(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    
    
}
