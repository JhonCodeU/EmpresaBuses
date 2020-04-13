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
public class Persona {


    private String CedulaPersona;
    private String nombrePersona;
    private String ApellidoPersona;
    private String Telefono;
    private String correoPersona;
    private String direccionPersona;
    private String fechaNacimientoPersona;

    public Persona() {
    }

    public Persona(String CedulaPersona, String nombrePersona, String ApellidoPersona, String Telefono, String correoPersona, String direccionPersona, String fechaNacimientoPersona) {
        this.CedulaPersona = CedulaPersona;
        this.nombrePersona = nombrePersona;
        this.ApellidoPersona = ApellidoPersona;
        this.Telefono = Telefono;
        this.correoPersona = correoPersona;
        this.direccionPersona = direccionPersona;
        this.fechaNacimientoPersona = fechaNacimientoPersona;
    }

    public Persona(String CedulaPersona, String nombrePersona) {
        this.CedulaPersona = CedulaPersona;
        this.nombrePersona = nombrePersona;
    }
    

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getCedulaPersona() {
        return CedulaPersona;
    }

    public void setCedulaPersona(String CedulaPersona) {
        this.CedulaPersona = CedulaPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return ApellidoPersona;
    }

    public void setApellidoPersona(String ApellidoPersona) {
        this.ApellidoPersona = ApellidoPersona;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getFechaNacimientoPersonaDate() {
        return fechaNacimientoPersona;
    }

    public void setFechaNacimientoPersonaDate(String fechaNacimientoPersonaDate) {
        this.fechaNacimientoPersona = fechaNacimientoPersonaDate;
    }

}