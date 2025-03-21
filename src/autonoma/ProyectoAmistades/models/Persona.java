/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.models;

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
     * Inicializa los atributos de la clase
     * @param nombres
    */
    public Persona(String nombres) {
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
