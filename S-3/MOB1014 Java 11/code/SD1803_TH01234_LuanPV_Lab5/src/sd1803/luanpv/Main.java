/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803.luanpv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv1 = new SinhVien("DEF", 20, 9);
        SinhVien sv2 = new SinhVien("ABC", 19, 8);
        // Tạo list SinhVien
        ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
        svList.add(sv1);
        svList.add(sv2);
        svList.add(new SinhVien("XYZ", 16, 6));
        svList.add(new SinhVien("GHK", 15, 7));
        // Hiển thị list
        System.out.println("List chưa sắp xếp: ");
        for (int i = 0; i < svList.size(); i++) {
            System.out.print("Tên: " + svList.get(i).getTenSV());
            System.out.print("Tuổi: " + svList.get(i).getTuoiSV());
            System.out.println("Điểm: " + svList.get(i).getDiemTB());
        }

        for (SinhVien sv : svList) {
            System.out.print("Tên: " + sv.getTenSV());
            System.out.print("Tuổi: " + sv.getTuoiSV());
            System.out.println("Điểm: " + sv.getDiemTB());
        }

        
        Comparator<SinhVien> comp1 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTenSV().compareTo(o2.getTenSV());
            }
        };

        Comparator<SinhVien> comp2 = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o2.getDiemTB(), o1.getDiemTB());
            }
        };
        Collections.sort(svList, comp2);

//        System.out.println("Đã sắp xếp: ");
//        for (SinhVien sv : svList) {
//            System.out.print("Tên: " + sv.getTenSV());
//            System.out.print("Tuổi: " + sv.getTuoiSV());
//            System.out.println("Điểm: " + sv.getDiemTB());
//        }
//        for (int i = 0; i < a.size(); i++) {
//            System.out.println("Phần tử thứ " + i + " là: " + a.get(i));
//        }
//        System.out.println("Số lượng phần tử: " + a.size());
//        System.out.println("ArrayList có tồn tại? " + a.contains(1000));
//        System.out.println("ArrayList có rỗng? " + a.isEmpty());
//        System.out.println("Vị trí của phần tử " + a.indexOf(100));
    }
}
