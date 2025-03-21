/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.exceptions;

/**
 * Excepcion AmigoNoEncontradoException
 * @author Camila
 * @since 20250321
 * @version 1.0
 */

public class AmigoNoEncontradoException extends RuntimeException {
    /**
     * Mensaje de la excepcion
    */
    public AmigoNoEncontradoException(){
        super("El amigo no fue encontrado en el directorio");
    }
}
