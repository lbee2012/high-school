/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu.service;

import ThiThu.model.CaSi;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author longsuwu
 */
public class QuanLyCaSi {
    ArrayList<CaSi> csList = new ArrayList<>();
    
    public ArrayList<CaSi> getList() {
        return csList;
    }
    
    public QuanLyCaSi() {
        csList.add(new CaSi("1", "Hoang Quy Long", "Nam", "Hang A", 3));
        csList.add(new CaSi("2", "Nguyen Khanh Minh", "Nu", "Hang C", 1));
        csList.add(new CaSi("3", "Ta Quang The Dan", "Nam", "Hang A", 4));
        csList.add(new CaSi("4", "Pham Ha Anh", "Nu", "Hang C", 2));
        csList.add(new CaSi("5", "Duong Gia Minh", "Nam", "Hang B", 5));
    }
    
    public String add(CaSi cs) {
        csList.add(cs);
        return "Them ca si thanh cong";
    }
    
    public String update(int row, CaSi cs) {
        csList.set(row, cs);
        return "Cap nhat thong tin ca si thanh cong";
    }
    
    public String remove(int row) {
        csList.remove(row);
        return "Xoa ca si thanh cong";
    }
    
    public ArrayList<CaSi> write() {
        String file = "output.txt";
        
        ArrayList<CaSi> files = new ArrayList<>();
        
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (CaSi caSi : csList) {
                bufferedWriter.write(caSi.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Ghi thanh cong vao file: " + file);
        return files;
    }
    
    public ArrayList<CaSi> read() {
        String file = "output.txt";
        
        ArrayList<CaSi> files = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                String ma = parts[0];
                String ten = parts[1];
                String gioiTinh = parts[2];
                String hang = parts[3];
                Integer namHoatDong = Integer.valueOf(parts[4]);
                
                CaSi cs = new CaSi(ma, ten, gioiTinh, hang, namHoatDong);
                files.add(cs);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Doc file: " + file + " thanh cong");
        return files;
    }
}
