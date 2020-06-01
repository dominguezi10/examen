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
public abstract class CasaBuilder {
    protected Casa casa;
    
    
    public abstract void buildParedes();
    public abstract void buildVentanas();
    public abstract void buildTecho();
    public abstract void buildNiveles();
    public abstract void buildDetalles();
    public abstract void buildPuertas();
    public abstract void buildPiso();
    public abstract void buildBanios();
    
    //para la instanncia
    public void CrearCasa(){
        casa = new Casa();
    }
    
    public Casa getCasa(){
        return casa;
    }
    
    
    
    
}
