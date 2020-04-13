/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guis;

import Modelos.Pasajero;

/**
 *
 * @author JhonLegends
 */
public class Silla {

    int numero;
    boolean disponibilidad;
    Pasajero pasajero;
    String posicion;
    String clase;
    int Precio;

    public Silla(int numero, boolean disponibilidad, String posicion, String clase, Pasajero pasajero, int Precio) {
        this.numero = numero;
        this.disponibilidad = disponibilidad;
        this.posicion = posicion;
        this.clase = clase;
        this.pasajero = pasajero;
        this.Precio = Precio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "Silla{" + "numero=" + numero + ", disponibilidad=" + disponibilidad + ", pasajero=" + pasajero + ", posicion=" + posicion + ", clase=" + clase + ", Precio=" + Precio + '}';
    }

}
