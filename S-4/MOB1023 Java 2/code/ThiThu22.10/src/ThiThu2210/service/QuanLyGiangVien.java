/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu2210.service;

import ThiThu2210.model.GiangVien;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author longsuwu
 */
public class QuanLyGiangVien {
    ArrayList<GiangVien> gvList = new ArrayList<>();
    
    public ArrayList<GiangVien> getList() {
        return gvList;
    }
    
    public QuanLyGiangVien() {
        gvList.add(new GiangVien("Hoang Quy Long", "PTPM", 100.0));
        gvList.add(new GiangVien("Nguyen Khanh Minh", "KTTT", 90.0));
        gvList.add(new GiangVien("Ta Quang The Dan", "KTPM", 80.0));
        gvList.add(new GiangVien("Pham Ha Anh", "KPTP", 70.0));
    }
    
    public String them(GiangVien gv) {
        gvList.add(gv);
        return "Them giang vien moi vao danh sach thanh cong!";
    }
    
    public String sua(int row, GiangVien gv) {
        gvList.set(row, gv);
        return "Chinh sua thong tin giang vien thanh cong!";
    }
    
    public String xoa(int row) {
        gvList.remove(row);
        return "Xoa giang vien khoi danh sach thanh cong!";
    }
    
    public ArrayList<GiangVien> ghi() {
        String file = "output.txt";
        
        QuanLyGiangVien qlgv = new QuanLyGiangVien();
        ArrayList<GiangVien> files = qlgv.getList();
        
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (GiangVien giangVien : files) {
                bufferedWriter.write(giangVien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Ghi vao file " + file + " thanh cong!");
        return files;
    }
    
    public ArrayList<GiangVien> doc() {
        String file = "output.txt";
        
        ArrayList<GiangVien> files = new ArrayList<>();
        File fileObj = new File(file);
        
        if (!fileObj.exists()) {
            JOptionPane.showMessageDialog(null, "File " + file + " khong ton tai!");
            return files;
        } else {
            String line;

            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split(",\\s*");
                    String ten = parts[0];
                    String mon = parts[1];
                    Double luong = Double.valueOf(parts[2]);

                    GiangVien gv = new GiangVien(ten, mon, luong);
                    files.add(gv);
                }
            } catch (Exception e) {
                System.out.println("Co loi xay ra: " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Ghi vao file " + file + " thanh cong!");
            return files;
        }
    }
}
