/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03032;

/**
 *
 * @author Hi
 */
public class NhanVien {
    private String maNV;
    private String hoTen;
    private double luong;
    
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public double getThuNhap() {
        return luong;
    }
    
    public double getThueTN() {
        if (luong <= 9000000)
            return 0;
        else if (luong <= 15000000)
            return (luong - 9000000) * 0.1;
        else
        {
            double thueTren9Den15 = (15000000 - 9000000) * 0.1;
            double thueTren15 = (luong - 15000000) * 0.12;
            return thueTren9Den15 + thueTren15;
        }
    }
    
    public void xuatThongTin() {
        System.out.println("Ma nhan vien: " + maNV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Luong: " + luong);
        System.out.println("Thu nhap: " + getThuNhap());
        System.out.println("Thue thu nhap: " + getThueTN());
    }
}