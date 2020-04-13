/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.lang.reflect.Array;

/**
 *
 * @author Mateo
 */
public class Reserva {
    private String Cedula;
    private String NombreCliente;
    private String PlacaBus;
    private int []puesto;
    private int pos;
    private static Reserva[]  objReserva=new Reserva[100];
    private static Reserva[][] matrizPuesto;

    public Reserva() {
    }

    public Reserva(String Cedula, String NombreCliente, String PlacaBus, int[] puesto) {
        this.Cedula = Cedula;
        this.NombreCliente = NombreCliente;
        this.PlacaBus = PlacaBus;
        this.puesto = puesto;
    }
    
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getPlacaBus() {
        return PlacaBus;
    }

    public void setPlacaBus(String PlacaBus) {
        this.PlacaBus = PlacaBus;
    }

    public int[] getPuesto() {
        return puesto;
    }

    public void setPuesto(int[] puesto) {
        this.puesto = puesto;
    }

    public static Reserva[] getObjReserva() {
        return objReserva;
    }

    public static void setObjReserva(Reserva[] objReserva) {
        Reserva.objReserva = objReserva;
    }
    
    
    
    
    
}
