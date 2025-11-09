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
public class VD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();
        
        if (n > 0)
        {
            if (n < 10)
            {
                System.out.println(n + " la mot so nho hon 10");
            }
            else
            {
                System.out.println(n + " la mot so lon hon 10");
            }
        }
        else
        {
            if (n == 0)
            {
                System.out.println(n + " la so 0");
            }
            else
            {
                System.out.println(n + " la mot so am");
            }
        }
    }
}
