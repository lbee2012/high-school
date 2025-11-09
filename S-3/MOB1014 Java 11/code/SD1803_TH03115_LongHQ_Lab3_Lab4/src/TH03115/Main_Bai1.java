/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TH03115;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class Main_Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner chu = new Scanner(System.in);
        Scanner so = new Scanner(System.in);
        
        String[] ten = new String[5];
        double[] cao = new double[5];
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Nhap vao ho ten cua sv" + (i + 1) + ": ");
            ten[i] = chu.nextLine();
            System.out.print("Nhap vao chieu cao cua sv" + (i + 1) + ": ");
            cao[i] = so.nextDouble();
        }
        
        System.out.println("");
        
        double min = cao[0];
        double max = cao[0];
        double tong = 0;
        String tenmin = ten[0];
        String tenmax = ten[0];
        
        for (int i = 0; i < 5; i++)
        {
            tong = tong + cao[i];
            
            if (cao[i] < min)
            {
                min = cao[i];
                tenmin = ten[i];
            }
            
            if (cao[i] > max)
            {
                max = cao[i];
                tenmax = ten[i];
            }
        }
        
        double tbc = tong / 5;
        
        System.out.println("Danh sach sivi da nhap la:");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(ten[i] + " - " + cao[i]);
        }
        
        sapxep(ten, cao);
        
        System.out.println("");
        System.out.println("Danh sach sap xep theo chieu cao giam dan la: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.println(ten[i] + " - " + cao[i]);
        }
        System.out.println("Sivi co chieu cao thap nhat la: " + tenmin + " cao: " + min);
        System.out.println("Sivi co chieu cao thap nhat la: " + tenmax + " cao: " + max);
        System.out.println("Chieu cao trung binh cua 5 sivi la: " + tbc);   
    } //main
    
    public static void sapxep(String[] ten, double[] cao) {
        for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (cao[i] < cao[j]) 
                {
                    double tempcao = cao[i];
                    cao[i] = cao[j];
                    cao[j] = tempcao;
                    
                    String tempten = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempten;
                }
            }
        }
    } //void sapxep
} //class
