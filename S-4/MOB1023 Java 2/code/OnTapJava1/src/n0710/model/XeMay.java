/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n0710.model;

/**
 *
 * @author longsuwu
 */
public class XeMay {
    private Integer ID;
    private String ten;
    private String chungLoai;
    private Integer dungTich;

    public XeMay() {
    }

    public XeMay(Integer ID, String ten, String chungLoai, Integer dungTich) {
        this.ID = ID;
        this.ten = ten;
        this.chungLoai = chungLoai;
        this.dungTich = dungTich;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        this.chungLoai = chungLoai;
    }

    public Integer getDungTich() {
        return dungTich;
    }

    public void setDungTich(Integer dungTich) {
        this.dungTich = dungTich;
    }

    @Override
    public String toString() {
        return ID + ", " + ten + ", " + chungLoai + ", " + dungTich;
    }
}
