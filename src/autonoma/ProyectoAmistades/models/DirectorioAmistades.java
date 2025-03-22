/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

import autonoma.ProyectoAmistades.exceptions.AmigoNoEncontradoException;
import autonoma.ProyectoAmistades.exceptions.AmigoExistenteException;
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
    */
    public void agregarAmigo(Amigo amigo) throws AmigoExistenteException {
        for (int i = 0; i < this.amigos.size(); i++) {
            if (this.amigos.get(i).equals(amigo)) { 
                throw new AmigoExistenteException();
            }
        }
        this.amigos.add(amigo); 
    }

    /**
     * Buscar un amigo - Lanzar excepcion si no fue encontrado
     * @param email
     * @return amigo
    */
    public Amigo buscarAmigo(String email) throws AmigoNoEncontradoException{
        boolean encontrado = false;
        for (int i = 0; i < amigos.size(); i++){
            Amigo amigo = amigos.get(i);
            if (amigo.getEmail().equals(email)) {
                encontrado = true;
                return amigo;
            }
        }
        
        if (!encontrado){
            throw new AmigoNoEncontradoException();
        }      
    }
        
    /**
     * Actualiza la informacion de un amigo
     * @param email
     * @param telefono
     * @param emailBuscar
    */
    public void actualizarAmigo (String email, String telefono, String emailBuscar) throws AmigoNoEncontradoException{
        boolean encontrado = false;
        for (int i = 0; i < this.amigos.size(); i++){
            if(this.amigos.get(i).getEmail().equals(emailBuscar)){
                this.amigos.get(i).setEmail(email);
                this.amigos.get(i).setTelefono(telefono);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            throw new AmigoNoEncontradoException();
        }
    }
    
    /**
     * Eliminar un amigo del arreglo
     * @param amigo
    */
    public void eliminarAmigo(Amigo amigo) throws AmigoNoEncontradoException{
        boolean encontrado = false;
        for (int i = 0; i < amigos.size(); i++){
            if (amigos.get(i).getNombres().equals(amigo.getNombres())){ 
                amigos.remove(i);
                encontrado = true;
            }
        }
        
        if(!encontrado){
            throw new AmigoNoEncontradoException();
        }
    }
    
    /**
     * Retorna el arreglo de amigos
     * @return amigos
    */
    public ArrayList mostrarAmigos (){
        return amigos;
    }
}
