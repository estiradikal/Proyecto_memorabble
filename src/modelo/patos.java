package modelo;

import java.util.ArrayList;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla
    Archivo: patos.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 11-11-2022
    Fecha última modificación: 11-11-2022
    Versión: 1.1
    Licencia: GNU-GPL
*/

public class patos{
    java.util.List<String> misColores = new ArrayList<>();
    
    public patos (){
    }   

    
    public String definirPato(int aciertos){        
        String titulo = "";
        
        if(aciertos>=0 && aciertos<5){
            titulo = "Pato cocinado";
        }
        else if(aciertos>=5 && aciertos<10){
            titulo = "Pato en sandalias";
        }
        else if(aciertos>=10 && aciertos<15){
            titulo = "Pato en bermudas ";
        }
        else if(aciertos>=15 && aciertos<20){
            titulo = "Pato aesthetic";
        }
        else if(aciertos>=20 && aciertos<30){
            titulo = "Pato fachero facherito";
        }
        else if(aciertos>=30 && aciertos<40){
            titulo = "Pato con traje";
        }
        else if(aciertos>=40 && aciertos<80){
            titulo = "Pato con Jordans";
        }
        else if(aciertos>=80){
            titulo = "Pato supremo";
        }
        
        return titulo;
    }
}