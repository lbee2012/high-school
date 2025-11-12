/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class DongHoService {
    
    public void mot(ArrayList<DongHo>lists) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma dong ho: ");
        String maDongHo = sc.nextLine();
        
        System.out.println("Nhap the loai dong ho: ");
        String theLoai = sc.nextLine();
        
        System.out.println("Nhap mau cua dong ho: ");
        String mauSac = sc.nextLine();
        
        System.out.println("Nhap size dong ho: ");
        int kichThuoc = Integer.valueOf(sc.nextInt());
        
        System.out.println("Nhap chat lieu dong ho: ");
        String chatLieu = sc.nextLine();
        
        System.out.println("Nhap gia cua dong ho: ");
        int gia = Integer.valueOf(sc.nextInt());
        
        DongHo dh = new DongHo(maDongHo, theLoai, mauSac, kichThuoc, chatLieu, gia);
        lists.add(dh);
    }
    
    public void hai(ArrayList<DongHo>lists) {
        for (DongHo dh : lists) {
            dh.xuat();
        }
    }
}
