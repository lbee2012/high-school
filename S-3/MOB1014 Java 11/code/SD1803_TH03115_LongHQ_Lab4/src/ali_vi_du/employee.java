/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ali_vi_du;

import java.util.Scanner;

/**
 *
 * @author longsuwu
 */
public class employee {
    public String fullname;
    public double salary;
    public boolean tanh;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter fullname: ");
        this.fullname = sc.nextLine();
        
        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
    }
    
    public void output() {
        System.out.println("Fullname: " + this.fullname);
        System.out.println("Salary: " + this.salary);
    }
    
    public int tanh(boolean tanh) {
        return 1;
    }
}
