/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Menu {
    Scanner sc = new Scanner(System.in);
    
    public void menu() {
        
    }
    
    public void add(ArrayList <ThucVat> tv) {
        do {
            System.out.print("Nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("Nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("Nhap loai cay: ");
            String loaiCay = sc.nextLine();
            System.out.print("Nhap khu vuc song: ");
            String khuVucSong = sc.nextLine();
            System.out.print("Nhap khoi luong: ");
            int khoiLuong = Integer.parseInt(sc.nextLine());

            tv.add(new ThucVat(ma, ten, loaiCay, khuVucSong, khoiLuong));

            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong (Y/N) ?: ");
            String yn = sc.nextLine();

            if (yn.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
    }
    
    public void ds(ArrayList <ThucVat> tv) {
        System.out.println("List cay dang co: ");
        System.out.println("");
        for (ThucVat thucVat : tv) {
            thucVat.xuat();
            System.out.println("");
        }
    }
    
    public void timT(ArrayList <ThucVat> tv) {
        for (ThucVat thucVat : tv) {
            if (thucVat.getTen().trim().startsWith("t")) {
                thucVat.xuat();
                System.out.println("");
            }
        }
    }
    
    public void dsChan(ArrayList <ThucVat> tv) {
        for (int i = 0; i < tv.size(); i++) {
            if (i % 2 == 0) {
                tv.get(i).xuat();
                System.out.println("");
            }
        }
    }
    
    public void tenUpTrend(ArrayList <ThucVat> tv) {
        
    }
    
    public void del(ArrayList <ThucVat> tv, int vitri) {
        tv.remove(vitri);
    }
    
    public void delMa(ArrayList <ThucVat> tv, String ma) {
        for (int i = 0; i < tv.size(); i++) {
            if (tv.get(i).getMa().equalsIgnoreCase(ma)) {
                tv.remove(i);
                break;
            } else {
                System.out.println("Ma khong ton tai!");
                break;
            }
        }
    }
    
    public void khoangKL(ArrayList <ThucVat> tv, int min, int max) {
        if (min < max) {
            for (ThucVat thucVat : tv) {
                if (thucVat.getKhoiLuong() > min && thucVat.getKhoiLuong() < max) {
                    thucVat.xuat();
                    System.out.println("");
                }
            }
        } else {
            System.out.println("Min khong duoc lon hon Max!");
        }
    }
}