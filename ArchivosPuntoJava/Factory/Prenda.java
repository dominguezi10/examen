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

public abstract class Prenda {
    Tipo tipo;  
    Talla talla;
    double precio;
    
    //constructor 
    public Prenda(Tipo tipo,Talla talla, double precio){
        this.tipo = tipo;
        this.talla = talla;
        this.precio = precio;
    }
    
    protected abstract void Construct();
    
    //Mutadores
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    

    public String Salida(){
        return  "   Tipo: "+this.tipo +"\n"+
                "   Talla: "+this.talla +"\n"+
                "   Precio: "+this.precio +"\n";
    }
    
}
