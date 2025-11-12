/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2java.model;

/**
 *
 * @author longg
 */
public class Sach {
    public Integer ID;
    public String tenSach;
    public Double giaBan;
    public String loai;

    public Sach() {
    }

    public Sach(Integer ID, String tenSach, Double giaBan, String loai) {
        this.ID = ID;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.loai = loai;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    
}
