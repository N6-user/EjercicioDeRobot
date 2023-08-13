/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioderobot.entidades;

/**
 *
 * @author nahue
 */
public class Bateria {
    private String tipoBat;
    private int carga;

    public Bateria(String tipoBat) {
        this.tipoBat = tipoBat;
        carga=1000;
    }

    public String getTipobat() {
        return tipoBat;
    }

    public void setTipobat(String tipoBat) {
        this.tipoBat = tipoBat;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {               
        this.carga = carga;
    }
}
