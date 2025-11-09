/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.luanpv;

/**
 *
 * @author Admin
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

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getTuoiSV() {
        return tuoiSV;
    }

    public void setTuoiSV(int tuoiSV) {
        this.tuoiSV = tuoiSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    
    
}
