/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class MonHocService {
    Scanner sc = new Scanner(System.in);
    
    public void nhapTT(ArrayList <MonHoc> mh) {
        while (true) {
            System.out.print("Nhap ma mon hoc: ");
            String maMon = sc.nextLine();
            System.out.print("Nhap ten mon hoc: ");
            String tenMon = sc.nextLine();
            
            int soTinChi = 0;
            while (true) {
                System.out.print("Nhap so tin chi: ");
                soTinChi = Integer.parseInt(sc.nextLine());
                
                if (soTinChi <= 0) {
                    System.out.println("Vui long nhap so tin chi lon hon 0");
                } else {
                    break;
                }
            }
            
            mh.add(new MonHoc(maMon, tenMon, soTinChi));
            System.out.println();
            
            System.out.println("Ban co muon nhap tiep khong? (Y/N): ");
            String yn = sc.nextLine();
            
            if(yn.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    public void xuatTT(ArrayList <MonHoc> mh) {
        for (MonHoc monHoc : mh) {
            monHoc.inThongTin();
        }
    }
    
    public void KeThua(ArrayList <MonHoc> mh) {
        System.out.print("Nhap ma mon hoc: ");
            String maMon = sc.nextLine();
            System.out.print("Nhap ten mon hoc: ");
            String tenMon = sc.nextLine();
            
            int soTinChi = 0;
            while (true) {
                System.out.print("Nhap so tin chi: ");
                soTinChi = Integer.parseInt(sc.nextLine());
                
                if (soTinChi <= 0) {
                    System.out.println("Vui long nhap so tin chi lon hon 0");
                } else {
                    break;
                }
            }
            
            System.out.print("Nhap link meet: ");
            String linkMeet = sc.nextLine();
            
            mh.add(new MonHocOnline(linkMeet, maMon, tenMon, soTinChi));
            System.out.println();
    }
}
