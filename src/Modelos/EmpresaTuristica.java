/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author Mateo
 */
public class EmpresaTuristica {

    private String nitEmepresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    
    public static EmpresaTuristica[] objEmpr = new EmpresaTuristica[1];

    public EmpresaTuristica() {

    }

    public EmpresaTuristica(String nitEmepresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa) {
        this.nitEmepresa = nitEmepresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmepresa() {
        return nitEmepresa;
    }

    public void setNitEmepresa(String nitEmepresa) {
        this.nitEmepresa = nitEmepresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public void registrarEmpresa(EmpresaTuristica objEmpresa) {
        boolean libre = false;
        for (int i = 0; i < this.objEmpr.length; i++) {
            if (this.objEmpr[i] == null) {
                this.objEmpr[i] = objEmpresa;
                libre = true;
                JOptionPane.showMessageDialog(null, "Registro EXITOSO");
                break;
            }
        }
        if(!libre)
            JOptionPane.showMessageDialog(null, "Ya no se pueden hacer mas registros");

    }

    public EmpresaTuristica [] enviarVector() {
        return objEmpr;
    }

}
