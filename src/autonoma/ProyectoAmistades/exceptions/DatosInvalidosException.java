/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.exceptions;

/**
 * Excepcion de DatosInvalidosException
 * @author Camila
 * @since 20250321
 * @version 1.0
 */
public class DatosInvalidosException extends RuntimeException {
    /**
     * Mensaje de la excepcion
    */
    public DatosInvalidosException(){
        super ("Datos invalidos, intentelo nuevamente");
    }
}
