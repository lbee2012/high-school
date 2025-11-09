/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab6_Bai3;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class SinhVien {
    private String hoTen;
    private String SDT;
    private String Email;
    private String CCCD;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String SDT, String Email, String CCCD) {
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.Email = Email;
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return Email;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    
    public void xuat() {
        System.out.println("Ho ten sv la: " + this.hoTen);
        System.out.println("SDT sivi la: " + this.SDT);
        System.out.println("Email sivi la: " + this.Email);
        System.out.println("CCCD sivi la: " + this.CCCD);
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        hoTen = sc.nextLine();

        
        String checkEmail = "\\w+@\\w+(\\.\\w{1,3})";
        String checkSDT = "0+[0-9]{9,10}";
        String checkCCCD = "[0-9]{12}";

        while (true) {
            System.out.print("Số điện thoại: ");
            String sdt = sc.nextLine();

            if (sdt.matches(checkSDT)) {
                System.out.println("Nhap dung");
            } else {
                System.out.println("Nhap sai vui long nhap lai");
                continue;
            }
            break;
        }
        
        while (true) {
            System.out.print("Email: ");
            String email = sc.nextLine();

            if (email.matches(checkEmail)) {
                System.out.println("Nhap dung");
            } else {
                System.out.println("Nhap sai vui long nhap lai");
                continue;
            }
            break;
        }
                
        while (true) {
            System.out.print("CCCD: ");
            String cccd = sc.nextLine();

            if (cccd.matches(checkCCCD)) {
                System.out.println("Nhap dung");
            } else {
                System.out.println("Nhap sai vui long nhap lai");
                continue;
            }
            break;
        }
    }
}
