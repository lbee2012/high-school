/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LamThu;

/**
 *
 * @author longsuwu
 */
public class MonHocOnline extends MonHoc {
    private String linkMeet;

    public MonHocOnline() {
    }

    public MonHocOnline(String linkMeet, String maMon, String tenMon, int soTinChi) {
        super(maMon, tenMon, soTinChi);
        this.linkMeet = linkMeet;
    }

    public String getLinkMeet() {
        return linkMeet;
    }

    public void setLinkMeet(String linkMeet) {
        this.linkMeet = linkMeet;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Link meet la: " + linkMeet);
    }
}
