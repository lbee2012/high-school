/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import test.model.MayTinh;

/**
 *
 * @author longsuwu
 */
public class QuanLyMayTinh {
    ArrayList<MayTinh> mtList = new ArrayList<>();
    
    public ArrayList<MayTinh> getList() {
        return mtList;
    }
    
    public QuanLyMayTinh() {
        mtList.add(new MayTinh(1, "Macbook","M3 Ultra", "Khong", 100));
        mtList.add(new MayTinh(2, "Asus","i9 14900k", "Co", 90));
        mtList.add(new MayTinh(3, "Acer","i9 13900k", "Co", 80));
        mtList.add(new MayTinh(4, "MSI","i9 12900k", "Co", 70));
        mtList.add(new MayTinh(5, "Lenovo","i9 11900k", "Co", 60));
    }
    
    public String add(MayTinh mt) {
        mtList.add(mt);
        return "Them thanh cong";
    }
    
    public String remove(int row) {
        mtList.remove(row);
        return "Xoa thanh cong";
    }
    
    public String update(int row, MayTinh mt) {
        mtList.set(row, mt);
        return "Sua thanh cong";
    }
    
    public ArrayList<MayTinh> write() {
        String file = "output.txt";
        
        ArrayList<MayTinh> files = new ArrayList<>();
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (MayTinh mayTinh : mtList) {
                bufferedWriter.write(mayTinh.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            JOptionPane.showMessageDialog(null, "Ghi thanh cong vao file: " + file);
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return files;
    }
    
    public ArrayList<MayTinh> read() {
        String file = "output.txt";
        
        ArrayList<MayTinh> files = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer ID = Integer.parseInt(parts[0]);
                String Hang = parts[1];
                String CPU = parts[2];
                String GPU = parts[3];
                float gia = Float.parseFloat(parts[4]);
                
                MayTinh mt = new MayTinh(ID, Hang, CPU, GPU, gia);
                files.add(mt);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return files;
    }
}
