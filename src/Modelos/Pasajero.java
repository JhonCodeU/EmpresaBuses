/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author Mateo
 */
public class Pasajero extends Persona {
    
    private String fechaRegistro;
    private static Pasajero[] objPasajero=new Pasajero[100];
    public Pasajero() {
    } 

    public Pasajero(String fechaRegistro, String CedulaPersona, String nombrePersona, String ApellidoPersona, String Telefono, String correoPersona, String direccionPersona, String fechaNacimientoPersona) {
        super(CedulaPersona, nombrePersona, ApellidoPersona, Telefono, correoPersona, direccionPersona, fechaNacimientoPersona);
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    

    public Pasajero[] getObjPasajero() {
        return objPasajero;
    }

    public void setObjPasajero(Pasajero objePasajero) {
        for (int i = 0; i < this.objPasajero.length; i++) {
            if (this.objPasajero[i] == null) {
                this.objPasajero[i] = objePasajero;
                break;
            }
        }
    }
    public void recorrerPasajero(){
        for (int i=0;i<this.objPasajero.length;i++){
            System.out.println(i+" "+objPasajero[i]);
        }
    }

    
    
    
    String nombre;
    String Cedula;

    public Pasajero(String nombre, String Cedula) {
        this.nombre = nombre;
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "nombre=" + nombre + ", Cedula=" + Cedula + '}';
    }
    
    
}
