/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TH03115;

/**
 *
 * @author longsuwu
 */
public class ViDu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Lớp SD1803";
        System.out.println("Bỏ khoảng cách ở đằng trước: " + s.trim());
        System.out.println("In hoa: " + s.toUpperCase());
        System.out.println("In thường: " + s.toLowerCase());
        System.out.println("Cắt chuỗi từ vị trí số: " + s.substring(4));
        System.out.println("Cắt chuỗi từ vị trí số x tới số x: " + s.substring(1,5));
        System.out.println("Độ dài: " + s.length());
        
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        
        System.out.println("Vi tri thu 5: " + s.charAt(5));
        String s1 = s.replaceAll("S","G");
        System.out.println(s);
        System.out.println(s1);
        
        String [] slist = s.split(" ");
        for (String str : slist) {
            System.out.println(str);
        }
        
        String ss = "Lớp SD1803 GD1801";
        
    }
}
