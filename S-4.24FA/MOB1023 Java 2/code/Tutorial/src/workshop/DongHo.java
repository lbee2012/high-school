/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workshop;

/**
 *
 * @author longsuwu
 */
public class DongHo {
    private String maDongHo;
    private String theLoai;
    private String mauSac;
    private int kichThuoc;
    private String chatLieu;
    private int gia;

    public DongHo() {
    }

    public DongHo(String maDongHo, String theLoai, String mauSac, int kichThuoc, String chatLieu, int gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public String getMaDongHo() {
        return maDongHo;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getMauSac() {
        return mauSac;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public int getGia() {
        return gia;
    }

    public void setMaDongHo(String maDongHo) {
        this.maDongHo = maDongHo;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    public void xuat() {
        System.out.println("Ma dong ho la: " + maDongHo);
        System.out.println("The loai cua dong ho la: " + theLoai);
        System.out.println("Mau cua dong ho la: " + mauSac);
        System.out.println("Size cua dong ho la: " + kichThuoc);
        System.out.println("Chat lieu lam ra dong ho la: " + chatLieu);
        System.out.println("Cai gia phai tra la: " + gia);
    }
    
}
