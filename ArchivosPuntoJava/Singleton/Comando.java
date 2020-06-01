/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Ingrid
 */
public class Comando {
    public String nombre="";
    public int codigo=0;
    public boolean estadoActivo=true;
    public String acuartelamiento = "";
    public String nombreComandante="";

    //Constructor
    public Comando(String nombre, int codigo,
                   String acuartelamiento, String nombreComandante) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.acuartelamiento = acuartelamiento;
        this.nombreComandante = nombreComandante;
    }
    
    
    // Mutadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public String getAcuartelamiento() {
        return acuartelamiento;
    }

    public void setAcuartelamiento(String acuartelamiento) {
        this.acuartelamiento = acuartelamiento;
    }

    public String getNombreComandante() {
        return nombreComandante;
    }

    public void setNombreComandante(String nombreComandante) {
        this.nombreComandante = nombreComandante;
    }
    

    public String toString(){ 
        String cadena = "";
        if(estadoActivo){
           cadena = "Comando Activo";
        }else{
            cadena = "Comando No Activo";
        }
        
        return "Nombre: "+nombre +"\n"+
                "Código: "+codigo +"\n"+
                "Estado Activo: "+cadena +"\n"+
                "Acuartelamiento: "+acuartelamiento +
                "Nombre Comandante: "+nombreComandante +"\n";
                
    }
    
    
    
}
