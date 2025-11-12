/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten:");
        String ten = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        int gioiTinh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap can nang: ");
        double canNang = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap chieu cao: ");
        double chieuCao = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap loai: ");
        String loai = sc.nextLine();
        System.out.print("Nhap san luong: ");
        double sanLuong = Double.parseDouble(sc.nextLine());
        
        CayLua cl = new CayLua(sanLuong, ma, ten, gioiTinh , canNang, chieuCao, loai);
        
    }
}
