/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab7_Bai1;

/**
 *
 * @author longsuwu
 */
public class Vuong extends ChuNhat {
    
    public Vuong(double rong, double dai) {
        super(rong, dai);
    }

    @Override
    public void xuat() {
        System.out.println("Canh hinh vuong: " + getDai());
        System.out.println("Chi vu la: " + getChiVu());
        System.out.println("Dien tich la: " + getDienTich());
    }
    
}
