/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViDu;

/**
 *
 * @author longsuwu
 */
public class TruongPhong extends NhanVien {
    
    public TruongPhong(String name, int age, double salary) {
        super(name, age, salary);
    }
    
    @Override
    public void xuat() {
        System.out.println(getName() + " la truong phong");
        System.out.println("Luong tp la: " + getSalary());
    }
    
}
