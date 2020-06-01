/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author Ingrid
 */
public class Camisa_Formal extends Prenda {

    Camisa_Formal(Talla talla){
        super(Tipo.Camisa_Formal, talla, 569.99);
    }

    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
