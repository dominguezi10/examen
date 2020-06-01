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
public class Subcriptor implements Observer {
    String nickname ="";

    public Subcriptor(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    
    
    @Override
    public void notificacion() {
        System.out.println("Hey! @"+nickname+" Se ha publicado una nueva noticia.");
    }
    
}
