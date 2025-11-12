/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class MayTinhService {
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(ArrayList <MayTinh> mt) {
        while (true) {
            System.out.print("Nhap ma may tinh: ");
            String maMayTinh = sc.nextLine();
            
            System.out.print("Nhap ten may tinh: ");
            String tenMayTinh = sc.nextLine();
            
            int trongLuong;
            while (true) {
                System.out.print("Nhap trong luong may tinh: ");
                trongLuong = Integer.parseInt(sc.nextLine());
                
                if (trongLuong <= 0) {
                    System.out.println("Trong luong phai > 0");
                } else {
                    break;
                }
            }
            
            System.out.print("Nhap ma may tinh: ");
            String noiBan = sc.nextLine();
            
            mt.add(new MayTinh(maMayTinh, tenMayTinh, trongLuong, noiBan));
            
            System.out.println();
            System.out.print("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatTT(ArrayList <MayTinh> mt) {
        for (MayTinh mayTinh : mt) {
            mayTinh.inThongTin();
        }
    }
    
    public void timTheoTen(ArrayList <MayTinh> mt) {
        System.out.print("Nhap vao ten may tinh can tim: ");
        String tenMayTinh = sc.nextLine();
        
        for (MayTinh mayTinh : mt) {
            if (mayTinh.getTenMayTinh().trim().equalsIgnoreCase(tenMayTinh)) {
                mayTinh.inThongTin();
            }
        }
    }
    
    public void laptop(ArrayList <MayTinh> mt) {
        System.out.print("Nhap ma may tinh: ");
        String maMayTinh = sc.nextLine();

        System.out.print("Nhap ten may tinh: ");
        String tenMayTinh = sc.nextLine();

        int trongLuong;
        while (true) {
            System.out.print("Nhap trong luong may tinh: ");
            trongLuong = Integer.parseInt(sc.nextLine());

            if (trongLuong <= 0) {
                System.out.println("Trong luong phai > 0");
            } else {
                break;
            }
        }

        System.out.print("Nhap ma may tinh: ");
        String noiBan = sc.nextLine();
        
        System.out.print("Nhap hang laptop: ");
        String hang = sc.nextLine();

        mt.add(new Laptop(hang, maMayTinh, tenMayTinh, trongLuong, noiBan));
    }
}
