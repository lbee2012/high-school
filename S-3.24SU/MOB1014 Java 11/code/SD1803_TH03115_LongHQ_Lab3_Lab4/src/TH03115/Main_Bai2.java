/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

/**
 *
 * @author longsuwu
 */
public class Main_Bai2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("", 0, 0.0);
        SinhVien sv2 = new SinhVien("", 0, 0.0);
        
        //nhap
        System.out.println("Nhap thong tin sivi1");
        sv1.nhap();
        System.out.println("Nhap thong tin sivi2");
        sv2.nhap();
        
        System.out.println("");
        
        //xuat
        System.out.println("Thong tin sivi1 la:");
        sv1.xuat();
        System.out.println("Thong tin sivi2 la:");
        sv2.xuat();
    }
}
