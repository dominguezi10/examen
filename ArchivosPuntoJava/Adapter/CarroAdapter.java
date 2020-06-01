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
public class CarroAdapter extends Carro {
    private CarroModerno carro;
    
    
    @Override
    public void Encender() {
        System.out.println("Enciendo carro Moderno.");
        carro = new CarroModerno();
        carro.ConductorAutomatico();
    }

    @Override
    public void Apagar() {
        carro.estado = false;
        carro.ConductorAutomatico();
        System.out.println("Carro apagado.");
    }

    @Override
    public void Acelar() {
        carro.Avanzar();
    }

    @Override
    public void Frenar() {
        carro.Detener();
    }

    
    
}
