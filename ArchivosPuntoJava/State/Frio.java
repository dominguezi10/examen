/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Ingrid
 */
public class Frio implements State{
    @Override
    public void Recomendaciones() {
        System.out.println("El clima está Frío, cúbrete.");
    }
}
