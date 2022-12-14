package controlador;

import vista.interfaz_memorabble;
import modelo.*;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: main.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 10-30-2022
    Fecha última modificación: 11-14-2022
    Versión: 1.0
    Licencia: GNU-GPL
*/
public class main { //Clase principal del proyecto
    public static void main(String[] args) { 
        reproductorSonido reproductor = new reproductorSonido();        
        interfaz_memorabble im = new interfaz_memorabble();
        im.setVisible(true);  
        reproductor.reproducirSonido("memorabble.wav");
    }
}
