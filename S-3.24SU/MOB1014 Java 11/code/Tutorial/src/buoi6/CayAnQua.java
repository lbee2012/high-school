/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6;

/**
 *
 * @author longsuwu
 */
public class CayAnQua extends ThucVat {
    private int soNamTuoi;

    public CayAnQua() {
    }

    public CayAnQua(int soNamTuoi, String ma, String ten, String loaiCay, String khuVucSong, int khoiLuong) {
        super(ma, ten, loaiCay, khuVucSong, khoiLuong);
        this.soNamTuoi = soNamTuoi;
    }

    public int getSoNamTuoi() {
        return soNamTuoi;
    }

    public void setSoNamTuoi(int soNamTuoi) {
        this.soNamTuoi = soNamTuoi;
    }
    
    public void xuat() {
        System.out.println("So nam tuoi: " + soNamTuoi);
        super.xuat();
    }
}
