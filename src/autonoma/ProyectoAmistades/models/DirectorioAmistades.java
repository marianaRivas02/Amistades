/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

import autonoma.ProyectoAmistades.exceptions.AmigoNoEncontradoException;
import java.util.ArrayList;

/**
 * Modelo que permite representar un directorio de amigos
 * @author Mariana
 * @since 20250321
 * @version 1.0
 */

public class DirectorioAmistades {
    //Atributos
    /**
    * Arreglo que almacena los amigos
    */
    private ArrayList <Amigo> amigos;
    
    /**
     * Inicializa los atributos de la clase
     * 
    */
    public DirectorioAmistades() {
        this.amigos = new ArrayList<>();
    }
    
    /**
     * Retorna el arreglo de amigos
     * @return amigos
    */
    public ArrayList<Amigo> getAmigos() {
        return amigos;
    }

    /**
     * Modifica el arreglo de amigos
     * @param amigos
    */
    public void setAmigos(ArrayList<Amigo> amigos) {
        this.amigos = amigos;
    }
    
    /**
     * Agregar un nuevo amigo al arreglo
     * @param amigo
     * @return booleano
    */
    public boolean agregarAmigo (Amigo amigo){
        for (int i = 0; i < this.amigos.size(); i++){
            if (this.amigos.get(i) != amigo){
                amigos.add(amigo);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Buscar un amigo - Lanzar excepcion si no fue encontrado
     * @param email
     * @return amigo
    */
    public Amigo buscarAmigo(String email) throws AmigoNoEncontradoException{
        for (int i = 0; i < amigos.size(); i++){
            Amigo amigo = amigos.get(i);
            if (amigo.getEmail().equals(email)) {
                return amigo;
            }
            else{
                throw new AmigoNoEncontradoException();
            }
        }
        return null;      
    }
        
    /**
     * Actualiza la informacion de un amigo
     * @param email
     * @param telefono
     * @return booleano
    */
    public boolean actualizarAmigo (String email, String telefono){
        for (int i = 0; i < this.amigos.size(); i++){
            if(this.amigos.get(i).getEmail().equals(email)){
                this.amigos.get(i).setEmail(email);
                this.amigos.get(i).setTelefono(telefono);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Eliminar un amigo del arreglo
     * @param amigo
     * @return booleano
    */
    public boolean eliminarAmigo(Amigo amigo){
        for (int i = 0; i < amigos.size(); i++){
            if (amigos.get(i).getNombres().equals(amigo.getNombres())){ 
                amigos.remove(i);
            }
            
            return true;
        }
       
      return false;  
    }
}
