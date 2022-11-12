
package controlador;

import vista.interfaz_jugable;
import java.time.LocalTime;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: gameLauncher.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 11-04-2022
    Fecha última modificación: 11-04-2022
    Versión: 1.2
    Licencia: GNU-GPL
*/

/*
    Se encarga de crear LAS PRIMERAS ventanas de juego y asignarles datos frescos como:
    - Tiempo en que se inicia la primer ventana/Ronda (Para que cada ventana lo envíe a la siguiente)
    - Aciertos 0, fallos 0, ronda 1 
    - Etc...
*/
public class gameLauncher {
    private LocalTime tiempoInicio;    
    private int tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos;
    
    public gameLauncher(){
        tiempoInicio = LocalTime.now();
        tiempoInicioHoras = tiempoInicio.getHour();
        tiempoInicioMinutos = tiempoInicio.getMinute();
        tiempoInicioSegundos = tiempoInicio.getSecond();  
    }
    
    public void nuevoJuego(){       
        interfaz_jugable ij = new interfaz_jugable(tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos);
        ij.setVisible(true); 
    }
}
