/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Ingrid
 */
public class Noticiero implements Subject{
    private ArrayList<Noticia> noticias = new ArrayList();
    private ArrayList<Observer> userList = new ArrayList();
    
    
    public void CrearNoticia(String titulo, String fecha, String contenido){
        Noticia noticia = new Noticia(titulo, fecha, contenido) {};
        Notificar();
    }
    
    @Override
    public void NuevoObserver(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void QuitarObserver(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void Notificar() {
        for(Observer ob: userList){
            ob.notificacion();
        }
    }
    
}
