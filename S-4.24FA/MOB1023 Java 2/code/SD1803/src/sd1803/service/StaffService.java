/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import sd1803.model.Staff;

/**
 *
 * @author longsuwu
 */
public class StaffService {

    ArrayList<Staff> staffList = new ArrayList<>();

    public ArrayList<Staff> getList() {
        return staffList;
    }

    public StaffService() {
        staffList.add(new Staff(1, "Hoang Quy Long", 17, "IT", "Khong lam viec"));
        staffList.add(new Staff(2, "Nguyen Khanh Minh", 17, "IT", "Dang lam viec"));
        staffList.add(new Staff(3, "Pham Ha Anh", 17, "IT", "Dang lam viec"));
        staffList.add(new Staff(4, "Ta Quang The Dan", 17, "IT", "Khong lam viec"));
        staffList.add(new Staff(5, "Duong Gia Minh", 17, "GD", "Khong lam viec"));
    }

    public String add(Staff s) {
        staffList.add(s);
        return "Them thanh cong";
    }

    public String remove(int row) {
        staffList.remove(row);
        return "Xoa thanh cong";
    }

    public String update(int row, Staff s) {
        staffList.set(row, s);
        return "Sua thanh cong";
    }

    public ArrayList<Staff> write() {
        String file = "output.txt";

        ArrayList<Staff> files = new ArrayList();

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Staff staff : staffList) {
                bufferedWriter.write(staff.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return files;
    }

    public ArrayList<Staff> read() {
        String file = "output.txt";

        ArrayList<Staff> files = new ArrayList();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer ID = Integer.parseInt(parts[0]);
                String name = parts[1];
                Integer age = Integer.parseInt(parts[2]);
                String role = parts[3];
                String status = parts[4];

                Staff s = new Staff(ID, name, age, role, status);
            }

        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        return files;
    }
}
