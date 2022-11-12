package modelo;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Image; // Necesaria para establecer correctamente la imagen del label en el criterio

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
    Fecha última modificación: 11-11-2022
    Versión: 1.6
    Licencia: GNU-GPL
*/

public class formas{
    
    java.util.List<String> misFormas = new ArrayList<>();
    public String imageSource = "";
    
    public formas(){
        misFormas.add("CIRCULO");
        misFormas.add("CORAZON");
        misFormas.add("PICA");
        misFormas.add("ROMBO");
        misFormas.add("TREBOL");
    }   
 
    public String generarForma(){
        int numeroRandom;
        numeroRandom = (int) 0 + (int) (Math.random() * ((misFormas.size() - 1) + 1));        
        return misFormas.get(numeroRandom);
    }
    
    public void generarCriterioForma(JLabel lbl_criterio){
        modelo.colores color = new modelo.colores();
        ImageIcon miImagen = new ImageIcon(); 
        
        lbl_criterio.setText(generarForma());
        
        switch (lbl_criterio.getText()) {
            case "CIRCULO":
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png"));              
                break;
            case "CORAZON":
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon.png"));              
                break;
            case "PICA":
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/pica.png"));              
                break;
            case "ROMBO":
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/rombo.png"));              
                break;
            case "TREBOL":
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/trebol.png"));              
                break;
            default:
                System.out.println("Se recibió " + lbl_criterio.getText() + " como color");
                break;
        } 
        
        lbl_criterio.setIcon(new ImageIcon(miImagen.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
    }
    
    public void asignarForma(JButton fichaActual, String fichaActualImg, String criterioActual){        
        int numeroRandom;
        numeroRandom = (int) 1 + (int) (Math.random() * ((4 - 1) + 1)); 
        
        ImageIcon miImagen = new ImageIcon();          
        
        switch (criterioActual) {
            case "CIRCULO":
            fichaActual.setText("CIRCULO");
            
            switch (numeroRandom) {
                case 1:    
                    imageSource = "/imagenes/circulo-amarillo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/circulo-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/circulo-rojo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/circulo-verde.png";
                    break;
                default:
                    break;
            }
            break;

            case "CORAZON":
            fichaActual.setText("CORAZON");
                
                switch (numeroRandom) {
                case 1:   
                    imageSource = "/imagenes/corazon-amarillo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/corazon-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/corazon-rojo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/corazon-verde.png";
                    break;
                default:
                    break;
                }
            break;
            
            case "PICA":
            fichaActual.setText("PICA");
                
                switch (numeroRandom) {
                case 1: 
                    imageSource = "/imagenes/pica-amarillo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/pica-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/pica-rojo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/pica-verde.png";
                    break;
                default:
                    break;
                }
            break;
            
            case "ROMBO":
            fichaActual.setText("ROMBO");
                
                switch (numeroRandom) {
                case 1:
                    imageSource = "/imagenes/rombo-amarillo.png";                    
                    break;
                case 2:
                    imageSource = "/imagenes/rombo-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/rombo-rojo.png";
                    break;
                case 4:
                    imageSource = "/imagenes/rombo-verde.png";
                    break;
                default:
                    break;
                }
            break;
            
            case "TREBOL":
            fichaActual.setText("TREBOL");
                
                switch (numeroRandom) {
                case 1:   
                    imageSource = "/imagenes/trebol-amarillo.png";
                    break;
                case 2:
                    imageSource = "/imagenes/trebol-azul.png";
                    break;
                case 3:
                    imageSource = "/imagenes/trebol-rojo.png";
                    break;
                case 4:
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
