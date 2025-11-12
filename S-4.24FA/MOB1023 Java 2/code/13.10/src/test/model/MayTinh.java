/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.model;

/**
 *
 * @author longsuwu
 */
public class MayTinh {
    private Integer ID;
    private String Hang;
    private String CPU;
    private String GPU;
    private float gia;

    public MayTinh() {
    }

    public MayTinh(Integer ID, String Hang, String CPU, String GPU, float gia) {
        this.ID = ID;
        this.Hang = Hang;
        this.CPU = CPU;
        this.GPU = GPU;
        this.gia = gia;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getHang() {
        return Hang;
    }

    public void setHang(String Hang) {
        this.Hang = Hang;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return ID + ", " + Hang + ", " + CPU + ", " + GPU + ", " + gia;
    }
    
    
}
