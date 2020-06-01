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
public class Vestido extends Prenda {

    Vestido(Talla talla){
        super(Tipo.Vestido, talla,248.99);
        this.talla = talla;
        precio = 649.99;
    }
    
    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
