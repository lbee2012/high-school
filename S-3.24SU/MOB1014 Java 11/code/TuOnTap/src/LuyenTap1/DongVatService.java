/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class DongVatService {
    ArrayList <DongVat> dv = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void nhapTTDoiTuong() {
        while (true) {
            System.out.print("Nhap ma dong vat: ");
            String maDongVat = sc.nextLine();
            System.out.print("Nhap ten dong vat: ");
            String tenDongVat = sc.nextLine();
            System.out.print("Nhap can nang: ");
            int canNang = Integer.parseInt(sc.nextLine());
            System.out.print("Nhap noi song: ");
            String noiSong = sc.nextLine();
            
            dv.add(new DongVat(maDongVat, tenDongVat, canNang, noiSong));
            
            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatDSDoiTuong() {
        for (DongVat dongVat : dv) {
            dongVat.inThongTin();
            System.out.println("");
        }
    }
    
    public void khoangCanNang() {
        int min = 0;
        
        while (true) {
            System.out.print("Nhap vao khoang can nang toi thieu: ");
            try {
                min = Integer.parseInt(sc.nextLine());

                if (min < 0) {
                    System.out.print("Vui long nhap so lon hon 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap so nguyen");
            }
        }
        
        for (DongVat dongVat : dv) {
            if (dongVat.getCanNang() > min) {
                dongVat.inThongTin();
            }
        }
    }
    
    public void meo() {
        
    }
}
