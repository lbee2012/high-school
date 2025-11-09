/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class BangDiem {
    private String hoVaTen;
    private double diemJava;
    private double diemWeb;

    public BangDiem() {
    }

    public BangDiem(String hoVaTen, double diemJava, double diemWeb) {
        this.hoVaTen = hoVaTen;
        this.diemJava = diemJava;
        this.diemWeb = diemWeb;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemWeb() {
        return diemWeb;
    }

    public void setDiemWeb(double diemWeb) {
        this.diemWeb = diemWeb;
    }
    
    public void nhapDiem() {
        Scanner sc = new Scanner(System.in);
        
        do {
            while (true) {
                System.out.print("Nhap ho va ten: ");
                hoVaTen = sc.nextLine();
                if (hoVaTen.trim().isEmpty()) {
                    System.out.println("Ho va ten khong duoc de trong!");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Nhap diem Java: ");
                try {
                    diemJava = Double.parseDouble(sc.nextLine());
                    if (diemJava < 0 || diemJava > 10) {
                        System.out.println("Vui long nhap diem la so thuc tu 0-10");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap diem la so thuc");
                }
            }

            while (true) {
                System.out.print("Nhap diem Web: ");
                try {
                    diemJava = Double.parseDouble(sc.nextLine());
                    if (diemJava < 0 || diemJava > 10) {
                        System.out.println("Vui long nhap diem la so thuc tu 0-10");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Vui long nhap diem la so thuc");
                }
            }
            
            System.out.println("");
            System.out.print("Ban co muon nhap tiep khong? (Y/N) : ");
            String yn = sc.nextLine();
            
            if(yn.equalsIgnoreCase("N"))
                break;
        } while (true);
    } //void
    
    public void xuatDiem() {
        System.out.println("");
        System.out.println("Ho va ten la: " + hoVaTen);
        System.out.println("Diem Java la: " + diemJava);
        System.out.println("Diem Web la: " + diemWeb);
    }
} //class
