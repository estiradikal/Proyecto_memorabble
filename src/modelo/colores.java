package modelo;




import java.util.ArrayList;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: colores.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 11-07-2022
    Fecha última modificación: 11-07-2022
    Versión: 1.0
    Licencia: GNU-GPL
*/

public class colores{
    
    java.util.List<String> misColores = new ArrayList<>();
    
    public colores (){
        misColores.add("AMARILLO");
        misColores.add("AZUL");
        misColores.add("NEGRO");
        misColores.add("ROJO");
        misColores.add("VERDE");
    }   
 
    public String generarColor(){
        int numeroRandom;
        numeroRandom = (int) 0 + (int) (Math.random() * ((misColores.size() - 1) + 1));        
        return misColores.get(numeroRandom);
    }
}