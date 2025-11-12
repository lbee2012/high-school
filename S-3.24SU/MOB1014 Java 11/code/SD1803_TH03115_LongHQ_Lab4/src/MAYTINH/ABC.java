/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MAYTINH;

/**
 *
 * @author longsuwu
 */
public class ABC {
    public static void main(String[] args) {
        MayTinh mt1 = new MayTinh("DELL",20);
        
        System.out.println("----Cu----");
        System.out.println("Ten: " + mt1.getName());
        System.out.println("Gia: " + mt1.getPrice());
        
        System.out.println("----Moi----");
        mt1.setName("ASUS");
        mt1.setPrice(10);
        System.out.println("Ten: " + mt1.getName());
        System.out.println("Gia: " + mt1.getPrice());
    }
}
