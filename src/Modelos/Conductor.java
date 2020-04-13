/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Mateo
 */
public class Conductor extends Persona {

    private double salarioConductor;
    private String tipoLicenciaConductor;
    private String RHConductor;
    private String tipoContratoConductor;
    private static Conductor[] objConductor = new Conductor[3];

    public Conductor() {
    }

    public Conductor(double salarioConductor, String tipoLicenciaConductor, String RHConductor, String tipoContratoConductor, String CedulaPersona, String nombrePersona, String ApellidoPersona, String Telefono, String correoPersona, String direccionPersona, String fechaNacimientoPersona) {
        super(CedulaPersona, nombrePersona, ApellidoPersona, Telefono, correoPersona, direccionPersona, fechaNacimientoPersona);
        this.salarioConductor = salarioConductor;
        this.tipoLicenciaConductor = tipoLicenciaConductor;
        this.RHConductor = RHConductor;
        this.tipoContratoConductor = tipoContratoConductor;
    }

    public double getSalarioConductor() {
        return salarioConductor;
    }

    public void setSalarioConductor(double salarioConductor) {
        this.salarioConductor = salarioConductor;
    }

    public String getTipoLicenciaConductor() {
        return tipoLicenciaConductor;
    }

    public void setTipoLicenciaConductor(String tipoLicenciaConductor) {
        this.tipoLicenciaConductor = tipoLicenciaConductor;
    }

    public String getRHConductor() {
        return RHConductor;
    }

    public void setRHConductor(String RHConductor) {
        this.RHConductor = RHConductor;
    }

    public String getTipoContratoConductor() {
        return tipoContratoConductor;
    }

    public void setTipoContratoConductor(String tipoContratoConductor) {
        this.tipoContratoConductor = tipoContratoConductor;
    }

    public Conductor[] getObjConductor() {
        return objConductor;
    }

    public void setObjConductor(Conductor objCon) {
        for (int i = 0; i < this.objConductor.length; i++) {
            if (this.objConductor[i] == null) {
                this.objConductor[i] = objCon;
                break;
            }
        }

    }
    public void recorrerConductor(){
        for (int i=0;i<this.objConductor.length;i++){
            System.out.println(i+" "+objConductor[i]);
        }
    }
}
