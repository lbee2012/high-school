/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2java.model;

/**
 *
 * @author longg
 */
public class Nguoi {
    public Integer ID;
    public String hoTen;
    public String gioiTinh;

    public Nguoi() {
    }

    public Nguoi(Integer ID, String hoTen, String gioiTinh) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    
}
