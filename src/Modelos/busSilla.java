/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Arrays;

/**
 *
 * @author JhonLegends
 */
public class busSilla {

    private Silla[] silla;
    private String pos;
    private Pasajero pasajero = new Pasajero();
    
    public busSilla(Silla[] silla, String pos) {
        this.silla = silla;
        this.pos = pos;
    }

    

   
//    public void selBusSilla(int cant){
//        silla = new Silla[50];
//        for (int i = 0; i <= silla.length - 1; i++) {
//            if (i <= 8) {
//                if (i == 0 || i == 3 || i == 4 || i == 7) {
//                    pos = "Ventana";
//                } else {
//                    pos = "Pasillo";
//                }
//                silla[i] = new Silla((i + 1), true, pos, "Ejecutiva", pasajero, 80000);
//            } else {
//                if (((i - 8) % 6 == 0) || ((i - 13) % 6 == 0)) {
//                    pos = "Ventana";
//                } else if (((i - 9) % 3 == 0)) {
//                    pos = "";
//                } else if (((i - 10) % 6 == 0) || ((i - 11) % 6 == 0)) {
//                    pos = "Pasillo";
//                }
//                silla[i] = new Silla((i + 1), true, pos, "Economica", pasajero, 60000);
//            }
//
//        }
//    }
    

 

    public Silla[] getSilla() {
        return silla;
    }

    public void setSilla(Silla[] silla) {
        this.silla = silla;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
     public  busSilla() {

        silla = new Silla[50];
        
        for (int i = 0; i <= silla.length - 1; i++) {
            if (i <= 8) {
                if (i == 0 || i == 3 || i == 4 || i == 7) {
                    pos = "Ventana";
                } else {
                    pos = "Pasillo";
                }
                silla[i] = new Silla((i + 1), true, pos, "Ejecutiva", pasajero, 80000);
            } else {
                if (((i - 8) % 6 == 0) || ((i - 13) % 6 == 0)) {
                    pos = "Ventana";
                } else if (((i - 9) % 3 == 0)) {
                    pos = "";
                } else if (((i - 10) % 6 == 0) || ((i - 11) % 6 == 0)) {
                    pos = "Pasillo";
                }
                silla[i] = new Silla((i + 1), true, pos, "Economica", pasajero, 60000);
            }

        }
    }

    @Override
    public String toString() {
        return "bus{" + "silla=" + Arrays.toString(silla) + '}';
    }
}
