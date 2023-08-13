/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioderobot.entidades;

/**
 *
 * @author danyl
 */
public class Robot {
    private Bateria bateria;
    private int numSerie;           
    private boolean despierto;

    public Robot(int numSerie) {
        this.numSerie = numSerie;
        bateria = new Bateria("Li-Ion");
        despierto = false;
    }
    
    public void Avanzar(int pasos) {
        bateria.setCarga(bateria.getCarga()-pasos/10);                          // la relación entre energía consumida (EC) y pasos (P) es de 1 a 10 (osea: EC*10=P). Por tanto, para calcular la energía consumida solo hago: EC = P/10. Luego, resto EC a la energia que había antes de la operación.
        System.out.println("\nEl robot a avanzado "+pasos+" pasos.\n");
    }
    
    public void Retroceder(int pasos) {
        bateria.setCarga(bateria.getCarga()-pasos/10);
        System.out.println("\nEl robot a retrocedido "+pasos+" pasos.\n");
    }
}
