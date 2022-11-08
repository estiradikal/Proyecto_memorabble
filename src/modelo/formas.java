package modelo;




import java.util.ArrayList;
/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: formas.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 11-07-2022
    Fecha última modificación: 11-07-2022
    Versión: 1.0
    Licencia: GNU-GPL
*/

public class formas{
    
    java.util.List<String> misFormas = new ArrayList<>();
    
    public formas(){
        misFormas.add("CIRCULO");
        misFormas.add("CORAZON");
        misFormas.add("CUADRADO");
        misFormas.add("PICA");
        misFormas.add("ROMBO");
        misFormas.add("TREBOL");
        misFormas.add("TRIANGULO");
    }   
 
    public String generarForma(){
        int numeroRandom;
        numeroRandom = (int) 0 + (int) (Math.random() * ((misFormas.size() - 1) + 1));        
        return misFormas.get(numeroRandom);
    }
}
