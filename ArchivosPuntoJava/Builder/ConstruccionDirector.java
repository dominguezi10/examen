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
public class ConstruccionDirector {
    private CasaBuilder casaBuilder;
    
    public void serCasaBuilder(CasaBuilder casaBuilder){
        this.casaBuilder = casaBuilder;
    }
    
    public Casa getCasa(){
        return casaBuilder.getCasa();
    }
    
    public void ConstruirCasa(){
        casaBuilder.CrearCasa();
        casaBuilder.buildBanios();
        casaBuilder.buildDetalles();
        casaBuilder.buildNiveles();
        casaBuilder.buildParedes();
        casaBuilder.buildPiso();
        casaBuilder.buildPuertas();
        casaBuilder.buildTecho();
        casaBuilder.buildVentanas();
    }
    
}
