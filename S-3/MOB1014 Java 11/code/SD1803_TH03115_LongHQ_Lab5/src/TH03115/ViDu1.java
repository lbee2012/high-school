/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH03115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author longsuwu
 */
public class ViDu1 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Be",17,9);
        SinhVien sv2 = new SinhVien("Tin",16,10);
        
        ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
        svList.add(sv1);
        svList.add(sv2);
        
        svList.add(new SinhVien("Kiki",16,8));
        svList.add(new SinhVien("Dan",17,7));
        
        System.out.println("List chưa sắp xếp");
        for (int i = 0; i < svList.size(); i++) {
            System.out.println("Ten: " + svList.get(i).getTen());
            System.out.println("Tuoi: " + svList.get(i).getTuoi());
            System.out.println("Diem: "+svList.get(i).getDiem());
        }
        
        for (SinhVien sv : svList) {
            System.out.println("Ten: " + sv.getTen());
            System.out.println("Tuoi: " + sv.getTuoi());
            System.out.println("Diem: "+ sv.getDiem());
        }
        
        Comparator<SinhVien> comp1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        };
        
        Comparator<SinhVien> comp2 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o2.getDiem(), o1.getDiem());
            }
        };
        
        Collections.sort(svList, comp2);
    }
}
