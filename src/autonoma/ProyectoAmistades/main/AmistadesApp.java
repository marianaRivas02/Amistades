/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.ProyectoAmistades.main;

import autonoma.ProyectoAmistades.models.DirectorioAmistades;
import autonoma.ProyectoAmistades.views.VentanaPrincipal;

/**
 * Clase principal - main
 * @author Mariana
 * @since 20250321
 * @version 1.0
 */
public class AmistadesApp {
    public static void main (String[] args){
        /**
        * Instancia de DirectorioAmistades
        */
        DirectorioAmistades directorio = new DirectorioAmistades();
        /**
        * Instancia de VentanaPrincipal
        */
        VentanaPrincipal ventana = new VentanaPrincipal(directorio);
        /**
        * Muestra la VentanaPrincipal
        */
        ventana.setVisible(true);
    }
}
