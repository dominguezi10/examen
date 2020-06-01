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
public class Tienda {

    public static Prenda CrearPrenda(Tipo tipo, Talla talla) {
        Prenda prenda = null;

        switch (tipo) {
            case Blusa:
                prenda = new Blusa(talla);
                break;
            case Camisa_Formal:
                prenda = new Camisa_Formal(talla);
                break;
            case Falda:
                prenda = new Falda(talla);
                break;
            case Pantalon:
                prenda = new Pantalon(talla);
                break;
            case Short:
                prenda = new Short(talla);
                break;
            default:
                prenda = new Vestido(talla);
                        break;
        }
        return prenda;
    }

}
