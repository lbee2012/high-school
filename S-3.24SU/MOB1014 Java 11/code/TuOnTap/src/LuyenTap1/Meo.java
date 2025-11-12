/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuyenTap1;

/**
 *
 * @author longsuwu
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
        super.inThongTin();
        System.out.println("Tieng keu: " + tiengKeu);
    }
}
