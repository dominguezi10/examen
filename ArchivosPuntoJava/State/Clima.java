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
public class Clima{

    private State estado;

    public Clima(State estado) {
        this.estado = estado;
    }
    
    public void VerEstadoClima(){
        estado.Recomendaciones();
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
    
    
}
