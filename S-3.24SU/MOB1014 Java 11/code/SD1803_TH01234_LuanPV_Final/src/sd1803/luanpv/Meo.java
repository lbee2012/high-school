/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.luanpv;

/**
 *
 * @author Admin
 */
public class Meo extends DongVat {

    private String tiengKeu;

    public Meo() {
    }

    public Meo(String tiengKeu, String maDongVat, String tenDongVat, int canNang, String noiSong) {
        super(maDongVat, tenDongVat, canNang, noiSong);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void inThongTin() {
        System.out.println("Ma Meo: " + super.getMaDongVat());
        System.out.println("Ten Meo: " + super.getTenDongVat());
        System.out.println("Can nang Meo: " + super.getCanNang());
        System.out.println("Noi song Meo: " + super.getNoiSong());
        System.out.println("Tieng keu Meo:" + this.tiengKeu);
    }

}
