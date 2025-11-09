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
public class Lab6_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();
        
        int index1 = ten.indexOf(" ");
        int index2 = ten.lastIndexOf(" ");
        
        System.out.println("Ho: " + ten.substring(0, index1).toUpperCase());
        System.out.println("Dem: " + ten.substring(index1 + 1, index2));
        
        System.out.println("Ten: " + ten.substring(index2 + 1).toUpperCase());
        System.out.println("Ten: " + ten.substring(index2 + 1, ten.length()));
        
    }
}
