/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

import autonoma.ProyectoAmistades.exceptions.TelefonoInvalidoException;

/**
 * Modelo que permite representar una persona
 * @author Mariana
 * @since 20250321
 * @version 1.0
 */
public abstract class Persona {
    //Atributos
    /**
    * Nombres de la persona
    */
    private String nombres;

    /**
     * Inicializa los atributos de la clase y lanza la excepcion de DatosInvalidosException
     * @param nombres
    */
    public Persona(String nombres)throws TelefonoInvalidoException {
        if(nombres == null || nombres.isEmpty()){
            throw new TelefonoInvalidoException();
        }
        this.nombres = nombres;
    }

    /**
     * Retorna los nombres de la persona
     * @return nombres
    */
    public String getNombres() {
        return nombres;
    }

    /**
     * Modifica los nombres de la persona
     * @param nombres
    */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
