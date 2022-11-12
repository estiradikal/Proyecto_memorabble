package modelo;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;

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
    Fecha última modificación: 11-11-2022
    Versión: 1.5
    Licencia: GNU-GPL
*/

public class colores{
    
    java.util.List<String> misColores = new ArrayList<>();
    public String imageSource = "";
    
    public colores (){
        misColores.add("AMARILLO");
        misColores.add("AZUL");
        misColores.add("ROJO");
        misColores.add("VERDE");
    }   
 
    public String generarColor(){
        int numeroRandom;
        numeroRandom = (int) 0 + (int) (Math.random() * ((misColores.size() - 1) + 1));        
        return misColores.get(numeroRandom);
    }
    
    public void generarCriterioColor(JLabel lbl_criterio){
        modelo.colores color = new modelo.colores();
        
        lbl_criterio.setText(color.generarColor());
        
        switch (lbl_criterio.getText()) {
            case "AMARILLO":
                lbl_criterio.setBackground(new java.awt.Color(255, 255, 0));                
                break;
            case "AZUL":
                lbl_criterio.setBackground(new java.awt.Color(0, 0, 255));
                break;
            case "ROJO":
                lbl_criterio.setBackground(new java.awt.Color(255, 0, 0));
                break;
            case "VERDE":
                lbl_criterio.setBackground(new java.awt.Color(0, 255, 0));
                break;
            default:
                System.out.println("Se recibió " + lbl_criterio.getText() + " como color");
                break;
        } 
    }
    
    public void asignarColor(JButton fichaActual, String fichaActualImg, String criterioActual){ 
        int numeroRandom;
        numeroRandom = (int) 1 + (int) (Math.random() * ((5 - 1) + 1)); 
        
        ImageIcon miImagen = new ImageIcon();   
        
        
        switch (criterioActual) {
            case "AMARILLO":
            fichaActual.setText("AMARILLO");
            
            switch (numeroRandom) {
                case 1:     
                    imageSource = "/imagenes/circulo-amarillo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/corazon-amarillo.png";
                    break;
                case 3:
                    imageSource = "/imagenes/pica-amarillo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/rombo-amarillo.png";
                    break;
                case 5:
                    imageSource = "/imagenes/trebol-amarillo.png";
                    break;
                default:
                    break;
            }
            break;

            case "AZUL":
                fichaActual.setText("AZUL");
                
                switch (numeroRandom) {
                case 1: 
                    imageSource = "/imagenes/circulo-azul.png";
                    break;
                case 2:
                    imageSource = "/imagenes/corazon-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/pica-azul.png";
                    break;
                case 4:
                    imageSource = "/imagenes/rombo-azul.png";
                    break;
                case 5:
                    imageSource = "/imagenes/trebol-azul.png";
                    break;
                default:
                    break;
                }
            break;
            
            case "ROJO":
                fichaActual.setText("ROJO");
                
                switch (numeroRandom) {
                case 1:           
                    imageSource = "/imagenes/circulo-rojo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/corazon-rojo.png";
                    break;
                case 3:
                    imageSource = "/imagenes/pica-rojo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/rombo-rojo.png";
                    break;
                case 5:
                    imageSource = "/imagenes/trebol-rojo.png";                   
                    break;
                default:
                    break;
                }
            break;
            
            case "VERDE":
                fichaActual.setText("VERDE");
                
                switch (numeroRandom) {
                case 1:              
                    imageSource = "/imagenes/circulo-verde.png";
                    break;
                case 2:
                    imageSource = "/imagenes/corazon-verde.png";   
                    break;
                case 3:
                    imageSource = "/imagenes/pica-verde.png";
                    break;
                case 4:
                    imageSource = "/imagenes/rombo-verde.png";
                    break;
                case 5:
                    imageSource = "/imagenes/trebol-verde.png";
                    break;
                default:
                    break;
                }
            break;
 
        }
        
        fichaActualImg = imageSource;   
        miImagen = new javax.swing.ImageIcon(getClass().getResource(imageSource));
        fichaActual.setIcon(new ImageIcon(miImagen.getImage()));    
    }
}