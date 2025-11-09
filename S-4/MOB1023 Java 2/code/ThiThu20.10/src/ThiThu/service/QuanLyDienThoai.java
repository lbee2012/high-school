/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu.service;

import ThiThu.model.DienThoai;
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
public class QuanLyDienThoai {
    ArrayList<DienThoai> dtList = new ArrayList<>();
    
    public ArrayList<DienThoai> getList() {
        return dtList;
    }
    
    public QuanLyDienThoai() {
        dtList.add(new DienThoai("iPhone 11", "Apple", 600.0));
        dtList.add(new DienThoai("Galaxy S11", "Samsung", 600.0));
        dtList.add(new DienThoai("Alien R11", "Dell", 600.0));
        dtList.add(new DienThoai("iPhone Galaxy 40S Plus Pro Max Hyper Ultra Ultimate", "Apple", 6000.0));
        dtList.add(new DienThoai("Galaxy Note 7", "Samsung", 1000.0));
    }
    
    public String add(DienThoai dt) {
        dtList.add(dt);
        return "Them dien thoai moi thanh cong";
    }
    
    public String update(int row, DienThoai dt) {
        dtList.set(row, dt);
        return "Cap nhat thong tin dien thoai thanh cong";
    }
    
    public ArrayList<DienThoai> write() {
        String file = "output.txt";
        QuanLyDienThoai qldt = new QuanLyDienThoai();
        
        ArrayList<DienThoai> files = qldt.getList();
        
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (DienThoai dienThoai : files) {
                bufferedWriter.write(dienThoai.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Ghi thanh cong vao file:" + file);
        return files;
    }
    
    public ArrayList<DienThoai> read() {
        String file = "output.txt";
        
        ArrayList<DienThoai> files = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                
                String ten = parts[0];
                String hang = parts[1];
                Double gia = Double.valueOf(parts[2]);
                
                DienThoai dt = new DienThoai(ten, hang, gia);
                files.add(dt);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Doc thanh cong file:" + file);
        return files;
    }
}
