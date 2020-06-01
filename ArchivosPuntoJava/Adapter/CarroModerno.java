/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Ingrid
 */
public class CarroModerno {
    public boolean estado = false;
    
    public CarroModerno(){
        estado= true;
    }
    
    public void EncenderLuces(){
        System.out.println("Lucen encendidas.");
    }
    
    public void Estacionar(){
        System.out.println("Estacionando...");
    }
    
    public void ActivarAlarma(){
        System.out.println("Alarmas activadas.");
    }
    
    public void ConductorAutomatico(){
        if(estado == true){
            System.out.println("    Conductor automático activado.");
        }else{
            System.out.println("    Conductor automático desactivado.");
        }
        
    }
    
    public void Avanzar(){
        System.out.println("Carro en movimiento.");
    }
    
    public void Detener(){
        System.out.println("Carro detenido.");
    }
    
    
}

