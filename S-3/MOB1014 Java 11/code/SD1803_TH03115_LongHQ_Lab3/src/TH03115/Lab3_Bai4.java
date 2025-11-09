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
public class Lab3_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = sc.nextInt();
        System.out.println("");
        
        String[] ten = new String[n];
        double[] diem = new double[n];
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Nhap vao ten cua sv" + (i + 1) + ": ");
            ten[i] = sc.nextLine();
            System.out.print("Nhap vao diem cua sv" + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        
        System.out.println("");
        System.out.println("Danh sach sivi da nhap la: ");
        for (int i = 0; i < n; i++) 
        {
            String hocluc;
            hocluc = xeploai(diem[i]);
            System.out.println(ten[i] + " " + diem[i] + " diem => hoc luc: " + hocluc);
        }
    }
    
    public static String xeploai(double diem) {
        String hocluc;
            
        if (diem <= 5)
            hocluc = "Yeu";
        else if (diem <= 6.5)
            hocluc = "Trung binh";
        else if (diem <= 7.5)
            hocluc = "Kha";
        else if (diem <= 9)
            hocluc = "Gioi";
        else
        {
            hocluc = "Xuat sac";
        }
        return hocluc;
    }
    
    public static void sapxep(String[] ten, double[] diem) {
         for (int i = 0; i < ten.length - 1; i++) 
         {
            for (int j = i + 1; j < ten.length; j++) 
            {
                if (diem[i] > diem[j]) 
                {
                    double tempdiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = tempdiem;
                    
                    String tempten = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempten;
                }
            }
        }
    }
}
