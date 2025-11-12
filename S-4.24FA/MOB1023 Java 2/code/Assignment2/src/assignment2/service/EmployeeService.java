/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2.service;

import assignment2.model.Employee;
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
public class EmployeeService {
    ArrayList<Employee> employeeList = new ArrayList<>();
    
    public ArrayList<Employee> getList() {
        return employeeList;
    }
    
    public EmployeeService() {
        employeeList.add(new Employee(1, "Hoang Quy Long", 17, "longhqth03115@fpt.edu.vn", 20000000));
        employeeList.add(new Employee(2, "Nguyen Khanh Minh", 17, "minhnkth03032@fpt.edu.vn", 10000000));
        employeeList.add(new Employee(3, "Pham Ha Anh", 17, "anhphth03066fpt.edu.vn", 10000000));
        employeeList.add(new Employee(4, "Ta Quang The Dan", 17, "dantqtth02882fpt.edu.vn", 15000000));
        employeeList.add(new Employee(5, "Duong Gia Minh", 17, "minhdgth02573fpt.edu.vn", 5000000));
    }
    
    public String add(Employee e) {
        employeeList.add(e);
        return "Them nhan vien moi thanh cong";
    }
    
    public String update(int row, Employee e) {
        employeeList.set(row, e);
        return "Cap nhat thong tin thanh cong";
    }
    
    public String delete(int row) {
        employeeList.remove(row);
        return "Xoa nhan vien thanh cong";
    }
    
    public ArrayList<Employee> open() { //read
        String file = "employee.txt";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",\\s*");
                Integer maNV = Integer.valueOf(parts[0]);
                String hoTen = parts[1];
                Integer tuoi = Integer.valueOf(parts[2]);
                String email = parts[3];
                float luong = Float.valueOf(parts[4]);
                
                Employee e = new Employee(maNV, hoTen, tuoi, email, luong);
            }
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Mo file: " + file + " thanh cong!");
        return employeeList;
    }
    
    public ArrayList<Employee> exit() { //write
        String file = "employee.txt";

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Dong va luu file: " + file + " thanh cong!");
        return employeeList;
    }
}
