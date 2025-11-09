/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n2909.service;

import java.util.ArrayList;
import n2909.model.HoaDon;

/**
 *
 * @author longsuwu
 */
public class QuanLyHoaDon {
    ArrayList<HoaDon> hdList = new ArrayList<>();
    
    public ArrayList<HoaDon> getList() {
        return hdList;
    }
    
    public QuanLyHoaDon() {
        hdList.add(new HoaDon("01", "Chuot", 1, 100000, "Con hang"));
        hdList.add(new HoaDon("02", "Ban phim", 2, 200000, "Con hang"));
        hdList.add(new HoaDon("03", "Tai nghe", 3, 300000, "Con hang"));
        hdList.add(new HoaDon("04", "Lot chuot", 4, 400000, "Con hang"));
        hdList.add(new HoaDon("05", "May tinh", 5, 500000, "Con hang"));
    }
    
    public String them(HoaDon hd) {
        hdList.add(hd);
        return "Them thanh cong";
    }
}
