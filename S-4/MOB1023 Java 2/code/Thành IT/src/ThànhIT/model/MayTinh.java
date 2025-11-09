/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThànhIT.model;

/**
 *
 * @author longsuwu
 */
public class MayTinh {
    private int ID;
    private String hangMay;
    private String CPU;
    private String GPU;
    private float gia;

    public MayTinh() {
    }

    public MayTinh(int ID, String hangMay, String CPU, String GPU, float gia) {
        this.ID = ID;
        this.hangMay = hangMay;
        this.CPU = CPU;
        this.GPU = GPU;
        this.gia = gia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHangMay() {
        return hangMay;
    }

    public void setHangMay(String hangMay) {
        this.hangMay = hangMay;
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
        return ID + ", " + hangMay + ", " + CPU + ", " + GPU + ", " + gia;
    }
}
