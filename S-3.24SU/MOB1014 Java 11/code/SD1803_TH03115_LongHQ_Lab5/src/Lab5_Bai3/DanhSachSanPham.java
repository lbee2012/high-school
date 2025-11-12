/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5_Bai3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class DanhSachSanPham {
    private final ArrayList<SanPham> list = new ArrayList<>();
    
    public void nhap() {
        int i = 1;
        System.out.println("Nhap danh sach san pham: ");
        do {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Nhap ten sp" + i + ": ");
            String ten = sc.nextLine();
            
            if (ten == null || ten.equals("")) {
                System.out.println("Nhap thong tin ");
                break;
            }
            i++;
            
            System.out.print("Gia san pham: ");
            double gia = sc.nextDouble();
            list.add(new SanPham(ten, gia));
        }
        while (true);
    }
    
    public void xuat() {
        System.out.println("Danh sach san pham: ");
        System.out.println("Ten | Gia");
        for (SanPham sp : list) {
            System.out.println(sp.getTen() + " | " + sp.getGia());
        }
    }
    
    public void sapxep() {
        Comparator <SanPham> comp = new Comparator<SanPham> () {
            @Override
            public int compare (SanPham o1, SanPham o2) {
                return Double.compare(o1.getGia(), o2.getGia());
            }
        };
        Collections.sort(list, comp);
        xuat();
    }
    
    public void timxoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sp can tim:");
        String ten = sc.nextLine();
        SanPham sp = null;
        for (SanPham sp1 : list) {
            if (sp1.getTen().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Da xoa sp ");
        } 
        else {
            System.out.println("Khong tim thay sp");
        }
    }
    
    public void giaTB() {
        double avg = 0, sum = 0;
        for (SanPham sp : list) {
            sum += sp.getGia();
        }
        avg = sum / list.size();
        System.out.println("Giá trung bình là :" + avg);
    }
    
    public void menu() {
        Scanner sc = new Scanner(System.in);
        
        int chon = 0;
        do {
            System.out.println("Menu quan ly thong tin san pham");
            System.out.println("1. Nhap danh sach sp");
            System.out.println("2. Sap xep sp theo giam dan");
            System.out.println("3. Tim, xoa sp theo ten");
            System.out.println("4. Xuat gia trung binh");
            
            System.out.println("0. Thoat MENU");
            
            System.out.print("Moi chon chuc nang: ");
            chon = sc.nextInt();
            if (chon != 0)
            {
                switch (chon)
                {
                    case 1:
                        nhap();
                        break;
                    case 2:
                        sapxep();
                        break;
                    case 3:
                        timxoa();
                        break;
                    case 4:
                        giaTB();
                        break;
                    case 0:
                        System.out.println("Thoat MENU thanh cong");
                        break;
                    default:
                        System.out.println("Nhap sai, moi nhap lai!");
                        break;
                }
            }
            
        }
        while (chon != 0);
    }
}
