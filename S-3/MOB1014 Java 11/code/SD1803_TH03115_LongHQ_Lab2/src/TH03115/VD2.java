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
public class VD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();
        
        switch (n)
        {
            case 1:
                System.out.println("Ban da nhap so 1");
                break;
            case 2:
                System.out.println("Ban da nhap so 2");
                break;
            case 3:
                System.out.println("Ban da nhap so 3");
                break;
            default:
                System.out.println("Ban da nhap so khong phai 1, 2, 3");
                break;
        }
    }
}
