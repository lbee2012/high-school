/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class PhuongTienService {
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(ArrayList <PhuongTien> pt) {
        while (true) {
            System.out.print("Nhap ma phuong tien: ");
            String maPhuongTien = sc.nextLine();
            
            System.out.print("Nhap ten phuong tien: ");
            String tenPhuongTien = sc.nextLine();
            
            System.out.print("Nhap trong luong phuong tien: ");
            int trongLuong = Integer.parseInt(sc.nextLine());
            
            float giaTien;
            while (true) {
                System.out.print("Nhap gia tien phuong tien: ");
                giaTien = Float.parseFloat(sc.nextLine());

                if (giaTien < 0) {
                    System.out.println("Vui long nhap gia tien > 0");
                } else {
                    break;
                }
            }
            
            pt.add(new PhuongTien(maPhuongTien, tenPhuongTien, trongLuong, giaTien));
            
            System.out.println();
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatTT(ArrayList <PhuongTien> pt) {
        for (PhuongTien phuongTien : pt) {
            phuongTien.inThongTin();
        }
    }
    
    public void timTheoGia(ArrayList <PhuongTien> pt) {
        while (true) {
            System.out.print("Nhap vao khoang gia toi thieu: ");
            double min = Double.parseDouble(sc.nextLine());

            if (min <= 0) {
                System.out.println("Vui long nhap lai khoang gia toi thieu");
            } else {
                for (PhuongTien phuongTien : pt) {
                    if (phuongTien.getGiaTien() >= min) {
                        phuongTien.inThongTin();
                    }
                }
                break;
            }
        }   
    }
    
    public void xeMay(ArrayList <PhuongTien> pt) {
        System.out.print("Nhap ma phuong tien: ");
        String maPhuongTien = sc.nextLine();

        System.out.print("Nhap ten phuong tien: ");
        String tenPhuongTien = sc.nextLine();

        System.out.print("Nhap trong luong phuong tien: ");
        int trongLuong = Integer.parseInt(sc.nextLine());

        float giaTien;
        while (true) {
            System.out.print("Nhap gia tien phuong tien: ");
            giaTien = Float.parseFloat(sc.nextLine());
            
            if (giaTien < 0) {
                System.out.println("Vui long nhap gia tien > 0");
            } else {
                break;
            }
        }

        System.out.print("Nhap vao hang xe: ");
        String hang = sc.nextLine();

        pt.add(new XeMay(hang, maPhuongTien, tenPhuongTien, trongLuong, giaTien));
    }
}
