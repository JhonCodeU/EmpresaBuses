package Modelos;

/**
 *
 * @author JhonLegends
 */
public class buses {

    private String placa;
    private String tipoBus;
    private int cantidadSillas;
    private boolean soat;
    private boolean tecnomecanica;
    private static buses[] objBuses = new buses[10];

    public buses(String placa, String tipoBus, int cantidadSillas, boolean soat, boolean tecnomecanica) {
        this.placa = placa;
        this.tipoBus = tipoBus;
        this.cantidadSillas = cantidadSillas;
        this.soat = soat;
        this.tecnomecanica = tecnomecanica;
    }

    public buses() {
    }

    
    public buses[] getObjBuses() {
        return objBuses;
    }

    public void setObjBuses(buses objectBuses) {
        for (int i = 0; i < this.objBuses.length; i++) {
            if (this.objBuses[i] == null) {
                this.objBuses[i] = objectBuses;
                break;
            }
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoBus() {
        return tipoBus;
    }

    public void setTipoBus(String tipoBus) {
        this.tipoBus = tipoBus;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }

    public boolean isSoat() {
        return soat;
    }

    public void setSoat(boolean soat) {
        this.soat = soat;
    }

    public boolean isTecnomecanica() {
        return tecnomecanica;
    }

    public void setTecnomecanica(boolean tecnomecanica) {
        this.tecnomecanica = tecnomecanica;
    }
    public void recorrerBuses(){
        for (int i=0;i<this.objBuses.length;i++){
            System.out.println(i+" "+objBuses[i]);
        }
    }

}
