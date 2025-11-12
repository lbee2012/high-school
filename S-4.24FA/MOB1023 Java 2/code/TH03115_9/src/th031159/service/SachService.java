/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th031159.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import th031159.model.Sach;

/**
 *
 * @author longsuwu
 */
public class SachService {
    ArrayList<Sach> sList = new ArrayList<>();
    
    public ArrayList<Sach> getList() {
        return sList;
    }
    
    public SachService() {
        sList.add(new Sach("Java", "Trinh thám", 100));
        sList.add(new Sach("C#", "Tiểu thuyết", 100));
        sList.add(new Sach("PHP", "Tiểu thuyết", 120));
        sList.add(new Sach("Angular JS", "Trinh thám", 110));
        sList.add(new Sach("HTML & CSS", "Trinh thám", 90));
    }
    
    public String add(Sach s) {
        sList.add(s);
        return "Thêm sách mới vào danh sách thành công!";
    }
    
    public String remove(int row) {
        sList.remove(row);
        return "Xóa sách khỏi danh sách thành công!";
    }
    
    public ArrayList<Sach> ghi() {
        String file = "output.txt";
        
        ArrayList<Sach> files = new ArrayList<>();
        
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (Sach sach : sList) {
                bufferedWriter.write(sach.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Ghi dữ liệu vào file: " + file + " thành công!");
        return files;
    }
    
    public ArrayList<Sach> mo() {
        String file = "output.txt";
        
        ArrayList<Sach> files = new ArrayList<>();
        
        String line;
        
        File fileObj = new File(file);
        
        if (!fileObj.exists()){
            JOptionPane.showMessageDialog(null, "File: " + file + " khong ton tai");
        } else {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split(",\\s*");
                    String ten = parts[0];
                    String theLoai = parts[1];
                    Integer giaSach = Integer.valueOf(parts[2]);

                    Sach s = new Sach(ten, theLoai, giaSach);
                    files.add(s);
                }
            } catch (Exception e) {
                System.out.println("Có lỗi xảy ra " + e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Đọc dữ liệu của file: " + file + " thành công!");
        }
        return files;
    }
}
