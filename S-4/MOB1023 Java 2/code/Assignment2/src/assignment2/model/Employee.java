/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.model;

/**
 *
 * @author longsuwu
 */
public class Employee {
    private Integer maNV;
    private String hoTen;
    private Integer tuoi;
    private String email;
    private float luong;

    public Employee() {
    }

    public Employee(Integer maNV, String hoTen, Integer tuoi, String email, float luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public Integer getMaNV() {
        return maNV;
    }

    public void setMaNV(Integer maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return maNV + ", " + hoTen + ", " + tuoi + ", " + email + ", " + luong;
    }
}
