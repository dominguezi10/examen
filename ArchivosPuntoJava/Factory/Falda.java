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
public class Falda extends Prenda {

    Falda(Talla talla){
        super(Tipo.Falda, talla ,79.99);
        this.talla = talla;
        precio = 379.99;
    }


    @Override
    protected void Construct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
