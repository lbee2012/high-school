/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.ArrayList;

/**
 *
 * @author longsuwu
 */
public class ViDuArraylist {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("Hello");
        a.add("Tintin");
        a.add("Xgai dyeu");
        
        for (Object object : a) {
            System.out.println(object);
        }
        
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Phan tu thu " + (i+1) + " la: " + a.get(i));
        }
        System.out.println("So luong phan tu la: " + a.size());
    }
}
