/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class DirectorioAmistades {
    
    private ArrayList <Amigo> amigos;

    public DirectorioAmistades(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }
    
    
    
    
}
