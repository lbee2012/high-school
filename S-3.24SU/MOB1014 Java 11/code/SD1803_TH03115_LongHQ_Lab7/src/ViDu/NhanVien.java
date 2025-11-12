/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ViDu;

/**
 *
 * @author longsuwu
 */
public class NhanVien {
    private String name;
    private int age;
    private double salary;

    public NhanVien(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void xuat() {
        System.out.println("Ten cua nv la: " + this.name);
        System.out.println("Tuoi cua nv la: " + this.age);
        System.out.println("Luong cua nv la: " + this.salary);
    }
}
