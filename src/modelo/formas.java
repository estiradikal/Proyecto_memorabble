package modelo;

import java.util.ArrayList;
import javax.swing.*;
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
    
    public void asignarForma(JButton fichaActual, String criterioActual){        
        ImageIcon miImagen = new ImageIcon();    
        
        switch (criterioActual) {
            case "CIRCULO":
                fichaActual.setText("CIRCULO");
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-amarillo.png"));
                break;
            case "CORAZON":
                fichaActual.setText("CORAZON");
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-azul.png"));
                break;
            case "PICA":
                fichaActual.setText("PICA");
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-negro.png"));
                break;
            case "ROMBO":
                fichaActual.setText("ROMBO");
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-rojo.png"));
                break;
            case "TREBOL":
                fichaActual.setText("TREBOL");
                miImagen = new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-verde.png"));
                break;
            default:                
                break;
        } 
        
        fichaActual.setIcon(new ImageIcon(miImagen.getImage()));
        // ADAPTABLE
        //misFichas.get(_direccion).setIcon(new ImageIcon(miImagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
    }
}
