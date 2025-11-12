/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package De7;

/**
 *
 * @author longsuwu
 */
public class XeMay extends PhuongTien {
    private String hang;

    public XeMay() {
    }

    public XeMay(String hang, String maPhuongTien, String tenPhuongTien, int trongLuong, float giaTien) {
        super(maPhuongTien, tenPhuongTien, trongLuong, giaTien);
        this.hang = hang;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Hang xe la: " + hang);
    }
}
