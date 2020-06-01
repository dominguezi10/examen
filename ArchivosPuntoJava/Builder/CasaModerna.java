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
public class CasaModerna extends CasaBuilder{

    @Override
    public void buildParedes() {
        casa.setParedes(9);
    }

    @Override
    public void buildVentanas() {
        casa.setVentanas(7);
    }

    @Override
    public void buildTecho() {
        casa.setTecho("Cielo Falso");
    }

    @Override
    public void buildNiveles() {
        casa.setNiveles(2);
    }

    @Override
    public void buildDetalles() {
        casa.setDetalles("Decaración minimalista");
    }

    @Override
    public void buildPuertas() {
        casa.setParedes(7);
    }

    @Override
    public void buildPiso() {
        casa.setPiso("Madera");
    }

    @Override
    public void buildBanios() {
        casa.setBanios(4);
    }
    
}

