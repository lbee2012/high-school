/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAYTINH;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class MayTinh {
    private String name;
    private double price;
    
    public MayTinh (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
    }
}
