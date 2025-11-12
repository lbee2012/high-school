/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8;

/**
 *
 * @author longsuwu
 */
public class Laptop extends MayTinh {
    private String hang;

    public Laptop() {
    }

    public Laptop(String hang, String maMayTinh, String tenMayTinh, int trongLuong, String noiBan) {
        super(maMayTinh, tenMayTinh, trongLuong, noiBan);
        this.hang = hang;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hang laptop la: " + hang);
    }
}
