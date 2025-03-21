/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

/**
 * Modelo que permite representar un amigo
 * @author Mariana
 * @since 20250321
 * @version 1.0
 */
public class Amigo extends Persona {
    //Atributos
    /**
    * Telefono del amigo
    */
    private String telefono;
    
    /**
    * Email del amigo
    */
    private String email;

    /**
     * Inicializa los atributos de la clase
     * @param telefono
     * @param email
     * @param nombres
    */
    public Amigo(String telefono, String email, String nombres) {
        super(nombres);
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Retorna el telefono del amigo
     * @return telefono
    */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el telefono del amigo
     * @param telefono
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Retorna el email del amigo
     * @return email
    */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica el email del amigo
     * @param email
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
    
    
    
    
    
}
