/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.luanpv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DongVatService {

    ArrayList<DongVat> listDV = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

//2đ
    public void cn1() {
        while (true) {
            System.out.print("Nhap ma DV: ");
            String ma = sc.nextLine();
            System.out.print("Nhap ten DV: ");
            String ten = sc.nextLine();
            int canNang = 0;
            // 1đ
            while (true) {
                System.out.print("Nhap can nag DV: ");
                canNang = Integer.parseInt(sc.nextLine());
                if (canNang < 0) {
                    System.out.println("Yeu cau nhap can nang >= 0");
                } else {
                    break;
                }
            }

            System.out.print("Nhap noi song DV: ");
            String noiSong = sc.nextLine();
            listDV.add(new DongVat(ma, ten, canNang, noiSong));
            System.out.println("Ban co muon nhap tiep Y/N?");
            if (sc.nextLine().equalsIgnoreCase("N")) {
                break;
            }

        }

    }
    //1đ
    public void cn2() {
        for (DongVat dongVat : listDV) {
            dongVat.inThongTin();
        }
    }
    //1đ
    public void cn3() {
        int canNangToiThieu = 0;
        while (true) {
            try {
                System.out.println("Nhap vao can nang toi thieu: ");
                canNangToiThieu = Integer.parseInt(sc.nextLine());
                if (canNangToiThieu < 0) {
                    System.out.println("Vui long nhap so > 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Vui long nhap so nguyen.");
            }
        }

        for (DongVat dongVat : listDV) {
            if (dongVat.getCanNang() > canNangToiThieu) {
                dongVat.inThongTin();
            }
        }
    }
    
    public void cn5(){
        Meo m = new Meo();
        m.inThongTin();
    }
}
