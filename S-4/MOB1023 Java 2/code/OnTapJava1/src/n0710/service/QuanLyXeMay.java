/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n0710.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import n0710.model.XeMay;

/**
 *
 * @author longsuwu
 */
public class QuanLyXeMay {
    ArrayList<XeMay> xmList = new ArrayList<>();
    
    public ArrayList<XeMay> getList() {
        return xmList;
    }
    
    public QuanLyXeMay() {
        xmList.add(new XeMay(1, "Honda SH 160i", "Xe ga", 160));
        xmList.add(new XeMay(2, "Honda Winner X", "Xe con", 150));
        xmList.add(new XeMay(3, "Honda Cub 50", "Xe so", 50));
        xmList.add(new XeMay(4, "Vinfast Theon S", "Xe dien", 110));
        xmList.add(new XeMay(5, "Yamaha Exciter", "Xe ga", 155));
    }
    
    public ArrayList<XeMay> read() {
        String path = "output.txt";
        
        ArrayList<XeMay> file = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer ID = Integer.parseInt(parts[0]);
                String ten = parts[1];
                String chungLoai = parts[2];
                Integer dungTich = Integer.parseInt(parts[3]);
                
                XeMay xm = new XeMay(ID, ten, chungLoai, dungTich);
                file.add(xm);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return file;
    }
    
    public String add(XeMay xm) {
        xmList.add(xm);
        return "Them thanh cong";
    }
    
    public String remove(int row) {
        xmList.remove(row);
        return "Xoa thanh cong";
    }
    
    public String update(int row, XeMay xm) {
        xmList.set(row, xm);
        return "Cap nhat thanh cong";
    }
}
