/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;
import autonoma.ProyectoAmistades.exceptions.CorreoInvalidoException;
import autonoma.ProyectoAmistades.exceptions.TelefonoInvalidoException;

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

    
    
    public Amigo(String email, String nombres) throws CorreoInvalidoException {
        super(nombres);
        this.email = email;
    }

    /**
     * Inicializa los atributos de la clase y lanza la excepcion de DatosInvalidosException
     * @param telefono
     * @param email
     * @param nombres
    */
    public Amigo(String telefono, String email, String nombres) throws TelefonoInvalidoException {
        super(nombres);
        this.verificarDatos(telefono, email);

        this.telefono = telefono;
        this.email = email;
    }

    public void verificarDatos (String telefono, String email){
        if (telefono == null || telefono.isEmpty()) {
            throw new TelefonoInvalidoException();
        }
        
        if (email == null || email.isEmpty()) {
            throw new CorreoInvalidoException();
        }

        boolean inicioTel = telefono.startsWith("606");
        boolean inicioTel2 = telefono.startsWith("30");
        
        if (!(inicioTel || inicioTel2)) { 
            throw new TelefonoInvalidoException();
        }

        if (email.indexOf('@') == -1) {
            throw new CorreoInvalidoException();
        }
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
        if (telefono == null || telefono.isEmpty()) {
            throw new TelefonoInvalidoException();
        }

        boolean inicioTel = telefono.startsWith("606");
        boolean inicioTel2 = telefono.startsWith("30");

        if (!(inicioTel || inicioTel2)) { 
            throw new TelefonoInvalidoException();
        }
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
        if (email == null || email.isEmpty()) {
            throw new TelefonoInvalidoException();
        }
        
        if (email.indexOf('@') == -1) {
            throw new TelefonoInvalidoException();
        }
        
        this.email = email;
    }
}
