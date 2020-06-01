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
public class CarroAutomatico extends Carro{

    public CarroAutomatico() {
    }
     
    @Override
    public void Encender() {
        System.out.println("Encendiendo carro autómatico.");
    }

    @Override
    public void Apagar() {
        System.out.println("Apagando carro automático.");
    }

    @Override
    public void Acelar() {
        System.out.println("Acelerando carro automático.");
    }

    @Override
    public void Frenar() {
        System.out.println("Frenar carro automático.");
    }

    
    
}
