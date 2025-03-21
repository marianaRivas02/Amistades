/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.exceptions;

/**
 *
 * @author maria
 */
public class AmigoNoEncontradoException extends RuntimeException {
    
     public AmigoNoEncontradoException(){
         super("El amigo no fue encontrado en el directorio");
     }
    
}
