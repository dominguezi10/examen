/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class BaseMilitar {
    private static volatile BaseMilitar instance = new BaseMilitar();
    public ArrayList<Comando> listaComandos = new ArrayList();
    
    // private constructor
    private BaseMilitar() {
    }
    
    
    //metodos
    public static BaseMilitar getInstance() {
        return instance;
    }
    
    public void DardeBajaComando(int codigo) {
        int estado = 0;
        for (Comando cod: listaComandos ) {
            if (cod.codigo == codigo) {
                estado++;
                cod.setEstadoActivo(false);
                System.out.println("El comando ha sido cambiado a estado Inactivo.");
            }
        }
        if (estado == 0) {
            System.out.println("NO existe un Comando con ese código.");
        }

    }

    public void AgregarComando(String nombre,int tipo,String acuartelamiento,
            String nombreComandantenombre) {
        Comando comando = new Comando(nombre, tipo, acuartelamiento, nombreComandantenombre);
        listaComandos.add(comando);
        System.out.println("El comando con código: "+comando.codigo +" ha sido creado exitosamente.");
    }
    
    public void Comandos(){
        if(!listaComandos.isEmpty()){
            System.out.println("Lista de Comandos Registrados en la Base Militar:");
            for(Comando c: listaComandos){
                System.out.println("   "+c.toString());
            } 
        }else{
            System.out.println("No hay comandos ingresados en la Base Militar.");
        }
        
    }
    public String toString(){
        return "Base Militar Principal";
    }
}
