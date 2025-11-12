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
public class vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao mot so nguyen: ");
        int nhap = 0;
        
        try
        {
            nhap = Integer.parseInt(sc.nextLine());
            System.out.println("Ban vua nhap " + nhap);
        }
        catch (Exception e)
        {
            System.out.println("Ban da khong nhap mot so nguyen");
        }
        
        int b = (nhap > 0 ? 1 : 2);
        if (nhap > 0)
        {
            b = 1;
        }
        else
        {
            b = 2;
        }
    }
}
