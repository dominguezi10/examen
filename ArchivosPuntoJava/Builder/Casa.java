/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Ingrid
 */
public class Casa {
    private int paredes;
    private int ventanas;
    private String techo;
    private int niveles;
    private String detalles;
    private int puertas;
    private String piso;
    private int banios;

    public void setParedes(int paredes) {
        this.paredes = paredes;
    }

    public void setVentanas(int ventanas) {
        this.ventanas = ventanas;
    }

    public void setTecho(String techo) {
        this.techo = techo;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int baños) {
        this.banios = baños;
    }
    
    public String toString(){
        return "    No. Paredes: "+paredes+"\n"+
               "    No. Ventanas: "+ventanas+"\n"+
               "    No. Niveles: "+niveles+"\n"+
               "    No. Banios: "+banios+"\n"+
               "    No. Puertas: "+puertas+"\n"+
               "    Estilo piso: "+piso+"\n"+
               "    Detalles: "+detalles+"\n";
               
    }
    
}
