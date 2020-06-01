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
public class CasaTradicional extends CasaBuilder{

    @Override
    public void buildParedes() {
        casa.setParedes(6);
    }

    @Override
    public void buildVentanas() {
        casa.setVentanas(3);
    }

    @Override
    public void buildTecho() {
        casa.setTecho("Métalicos");
    }

    @Override
    public void buildNiveles() {
        casa.setNiveles(1);
    }

    @Override
    public void buildDetalles() {
        casa.setDetalles("Decoración sencilla con colores tonos hueso");
    }

    @Override
    public void buildPuertas() {
        casa.setParedes(4);
    }

    @Override
    public void buildPiso() {
        casa.setPiso("Cerámica");
    }

    @Override
    public void buildBanios() {
        casa.setBanios(2);
    }
    
}
