package controlador;

import vista.interfaz_jugable;
import modelo.formaEspecifica;
import java.time.LocalTime;

/*
    Archivo: mainProvisional.java

    PARA HACER EXPERIMENTOS 
*/
public class mainProvisional {
    public static void main(String[] args) {  
        
        LocalTime tiempoInicio;    
        int tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos;

        tiempoInicio = LocalTime.now();
        tiempoInicioHoras = tiempoInicio.getHour();
        tiempoInicioMinutos = tiempoInicio.getMinute();
        tiempoInicioSegundos = tiempoInicio.getSecond();  

        interfaz_jugable miInterfaz = new interfaz_jugable(tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos, 3, 0, 0, 1, 0, 1);
        miInterfaz.setVisible(true);
    }
}
