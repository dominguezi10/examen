/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Ingrid
 */
public interface Subject {
    public void NuevoObserver(Observer observer);
    public void QuitarObserver(Observer observer);
    public void Notificar();
}
