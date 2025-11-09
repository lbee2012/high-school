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
public class Lab1_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao canh cua khoi lap phuong: ");
        double canh = sc.nextDouble();
        
        double S = canh * canh * canh;
        
        System.out.println("The tich cua khoi lap phuong la: " + S);
    }
}
