/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.exceptions;

/**
 *
 * @author maria
 */
public class AmigoExistenteException extends RuntimeException{
    
    public AmigoExistenteException(){
        super("El amigo ya existe en el directorio");
    }
    
}
