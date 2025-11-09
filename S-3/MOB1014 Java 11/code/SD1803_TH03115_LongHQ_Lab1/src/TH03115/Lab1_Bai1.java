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
public class Lab1_Bai1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao ten cua ban: ");
        String ten = sc.nextLine();
        
        System.out.print("Nhap vao tuoi cua ban: ");
        int tuoi = sc.nextInt();
        
        System.out.print("Diem trung binh cua ban la: ");
        double dtb = sc.nextDouble();
        
        System.out.println("Ban ten la " + ten + " va ban " + tuoi + " tuoi");
        System.out.println("Diem trung binh cua ban la: " + dtb);
    }
}
