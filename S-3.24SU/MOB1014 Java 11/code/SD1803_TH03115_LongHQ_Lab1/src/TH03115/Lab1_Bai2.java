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
public class Lab1_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap do dai canh 1: ");
        double c1 = sc.nextDouble();
        
        System.out.print("Nhap do dai canh 2: ");
        double c2 = sc.nextDouble();
        
        System.out.println("Canh nho hon co do dai la: " + Math.min(c1, c2));
//        if (c1 < c2)
//            System.out.println("Canh nho hon la canh 1: " + c1);
//        else
//            System.out.println("Canh nho hon la canh 2: " + c2);
        double P = 2 * (c1 + c2);
        double S = c1 * c2;
        
        System.out.println("Chu vi cua HCN la: " + P);
        System.out.println("Dien tich cua HCN la: " + S);
        
    }
}
