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
    
    
    public boolean eliminarAmigo(Amigo amigo){
        for (int i = 0; i < amigos.size(); i++){
            if (amigos.get(i).getNombres().equals(amigo.getNombres())){ 
                amigos.remove(i);
            }
            
            return true;
        }
       
      return false;  
    }
    
    public Amigo buscarAmigo(String email){
        for (int i = 0; i < amigos.size(); i++){
            Amigo amigo = amigos.get(i);
            if (amigo.getEmail().equals(email)) {
                return amigo;
            }
        }
        return null;      
    }
    
    
}
