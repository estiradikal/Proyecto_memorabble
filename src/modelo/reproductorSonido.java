
package modelo;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: reproductorSonido.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 11-12-2022
    Fecha última modificación: 11-14-2022 
    Versión: 1.0
    Licencia: GNU-GPL
*/
public class reproductorSonido{
    
    //Constructor
    public reproductorSonido(){
    }
    
    /**
     * Funciona para añadir y reproducir audio de extensión WAV.
     * @param nombreSonido variable que almacena la ruta del respectivo audio.
    */
    public void reproducirSonido(String nombreSonido){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/sonido/"+nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido de " + nombreSonido);   
        }
    }
}
