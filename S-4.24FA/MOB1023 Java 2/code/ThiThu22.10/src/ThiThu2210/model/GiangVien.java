/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu2210.model;

/**
 *
 * @author longsuwu
 */
public class GiangVien {
    private String hoTen;
    private String boMon;
    private Double luong;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String boMon, Double luong) {
        this.hoTen = hoTen;
        this.boMon = boMon;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return hoTen + ", " + boMon + ", " + luong;
    }
}
