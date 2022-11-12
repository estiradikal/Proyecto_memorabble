/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.util.*;


/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: interfaz_jugable.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 10-30-2022
    Fecha última modificación: 11-07-2022
    Versión: 0.3
    Licencia: GNU-GPL
*/
public class interfaz_jugable extends javax.swing.JFrame implements KeyListener {
    private LocalTime tiempoFinal;
    private int tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos;
    private int vidas, aciertos, fallos, rondaActual, puntuacion, dificultad;
    private int restantes = dificultad+1;
    private int criterio;
    private java.util.List<JButton> misFichas = new ArrayList<>();
    private JLabel lbl_imagen_criterio = new JLabel();

    /**
     * Creates new form interfaz_jugable
     */
    public interfaz_jugable(int _tiempoInicioHoras, int _tiempoInicioMinutos, int _tiempoInicioSegundos, int _vidas, int _aciertos, int _fallos, int _rondaActual, int _puntuacion, int _dificultad) {        
        initComponents();
        iniciarFichas();       
        iniciarCriterio();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
     
        this.tiempoInicioHoras = _tiempoInicioHoras;
        this.tiempoInicioMinutos = _tiempoInicioMinutos;
        this.tiempoInicioSegundos = _tiempoInicioSegundos;   
        this.vidas = _vidas;
        this.aciertos = _aciertos;
        this.fallos = _fallos;    
        this.rondaActual = _rondaActual;
        this.puntuacion = _puntuacion;
        this.dificultad = _dificultad;
        
        // Definiendo numero de Ronda
        lbl_rondaActual.setText("RONDA " + rondaActual);
        
        // Definiendo puntuacion inicial
        lbl_puntuacionActual.setText(Integer.toString(puntuacion));        
        
        // Habilitando los labels de las vidas según la cantidad de vidas
        if(vidas>=1){
            lbl_vida1.setEnabled(true);
        }
        if(vidas>=2){
            lbl_vida2.setEnabled(true);
        }
        if(vidas>=3){
            lbl_vida3.setEnabled(true);
        }    
        
        asignarFichas();
        mostrarCriterio(5);    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_rondaActual = new javax.swing.JLabel();
        lbl_puntuacion = new javax.swing.JLabel();
        lbl_puntuacionActual = new javax.swing.JLabel();
        lbl_criterio = new javax.swing.JLabel();
        lbl_vida1 = new javax.swing.JLabel();
        lbl_vida2 = new javax.swing.JLabel();
        lbl_vida3 = new javax.swing.JLabel();
        lbl_banner_superior = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_rondaActual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_rondaActual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rondaActual.setText("RONDA  ");
        jPanel1.add(lbl_rondaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, -1, 30));

        lbl_puntuacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_puntuacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_puntuacion.setText("PUNTUACIÓN");
        jPanel1.add(lbl_puntuacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 4, -1, 30));

        lbl_puntuacionActual.setBackground(new java.awt.Color(255, 255, 255));
        lbl_puntuacionActual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_puntuacionActual.setForeground(new java.awt.Color(0, 0, 0));
        lbl_puntuacionActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_puntuacionActual.setText("0");
        lbl_puntuacionActual.setOpaque(true);
        jPanel1.add(lbl_puntuacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 4, 90, 30));

        lbl_criterio.setBackground(new java.awt.Color(255, 255, 255));
        lbl_criterio.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_criterio.setForeground(new java.awt.Color(0, 0, 0));
        lbl_criterio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_criterio.setText("¡Memoriza todas las que puedas!");
        jPanel1.add(lbl_criterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 210, -1));

        lbl_vida1.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida1.setEnabled(false);
        jPanel1.add(lbl_vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 4, 30, 30));

        lbl_vida2.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida2.setForeground(new java.awt.Color(0, 0, 0));
        lbl_vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida2.setEnabled(false);
        jPanel1.add(lbl_vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 4, 30, 30));

        lbl_vida3.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida3.setForeground(new java.awt.Color(0, 0, 0));
        lbl_vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida3.setEnabled(false);
        jPanel1.add(lbl_vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 4, 30, 30));

        lbl_banner_superior.setBackground(new java.awt.Color(0, 102, 102));
        lbl_banner_superior.setForeground(new java.awt.Color(255, 255, 255));
        lbl_banner_superior.setOpaque(true);
        jPanel1.add(lbl_banner_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        jToggleButton1.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("Rendirse");
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void iniciarFichas(){
        int cantidadFichas;
        int posX, posY, ancho, alto, filas, columnas;
    
        posX = 20; // La proxima ficha está a +90
        posY = 60; // La proxima ficha está a +80
        ancho = 70;
        alto = 80;
        columnas = 6; // Horizontales
        filas = 3; // Verticales   
        
        cantidadFichas = columnas * filas;
        
        ActionListener oyenteDeFichas = (ActionEvent e) -> { 
            JButton source = (JButton) e.getSource();             
           
            if(source.getText() == lbl_imagen_criterio.getText()){
                source.setText("EPIC!");
                source.setBackground(new java.awt.Color(0, 255, 0));
                addAcierto();
            }
            else{
                addFallo();
            }   
            source.setEnabled(false);
        };
        
        for(int fichaActual = 0; fichaActual<cantidadFichas; fichaActual++){
            
            misFichas.add(new JButton());
            misFichas.get(fichaActual).setEnabled(false);
            misFichas.get(fichaActual).setText("EMPTY");
            
            misFichas.get(fichaActual).setFont(new java.awt.Font("Segoe UI", 0, 0));   
            misFichas.get(fichaActual).setBackground(new java.awt.Color(90, 90, 90));
            misFichas.get(fichaActual).setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
            misFichas.get(fichaActual).addActionListener(oyenteDeFichas);
            
            jPanel1.add(misFichas.get(fichaActual), new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, ancho, alto));
            posX += ancho+10;
            
            if((fichaActual+1) % columnas == 0){ // Si ya son todas las columnas entonces ir a una nueva fila
                posY += alto+5;
                posX = 20;
            }    
        }     
    }
    
    private void habilitarFichas(){
        for(JButton fichaActual: misFichas){
            fichaActual.setEnabled(true);
        } 
    }
    
    private void deshabilitarFichas(){
        for(JButton fichaActual: misFichas){
            fichaActual.setEnabled(false);
        } 
    }
    
    private void asignarFichas(){
        int numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1));
        
        for(int fichaActual = 0; fichaActual < dificultad; fichaActual ++){     
            numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1)); // Selecciona una ficha al azar,...
            asignarFichasColor(numRandom, lbl_imagen_criterio.getText());
        }
     
        for(int fichaActual = 0; fichaActual < dificultad*3; fichaActual ++){     
            numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1)); 
            modelo.colores color = new modelo.colores();
            
            if(misFichas.get(numRandom).getText() == "EMPTY"){
                asignarFichasColor(numRandom, color.generarColor());
            }
        }
    }
    
    private void asignarFichasColor(int _direccion, String criterioActual){
        switch (criterioActual) {
            case "AMARILLO":
                misFichas.get(_direccion).setText("AMARILLO");
                misFichas.get(_direccion).setBackground(new java.awt.Color(255, 255, 0));                
                break;
            case "AZUL":
                misFichas.get(_direccion).setText("AZUL");
                misFichas.get(_direccion).setBackground(new java.awt.Color(0, 0, 255));
                break;
            case "NEGRO":
                misFichas.get(_direccion).setText("NEGRO");
                misFichas.get(_direccion).setBackground(new java.awt.Color(0, 0, 0));
                break;
            case "ROJO":
                misFichas.get(_direccion).setText("ROJO");
                misFichas.get(_direccion).setBackground(new java.awt.Color(255, 0, 0));
                break;
            case "VERDE":
                misFichas.get(_direccion).setText("VERDE");
                misFichas.get(_direccion).setBackground(new java.awt.Color(0, 255, 0));
                break;
            default:                
                break;
        }  
    }
    
    private void ocultarFichas(){
        for(JButton fichaActual: misFichas){
            fichaActual.setBackground(new java.awt.Color(200, 200, 200));
        } 
    }
 
    private void iniciarCriterio(){
        lbl_imagen_criterio.setVisible(false);
        jPanel1.add(lbl_imagen_criterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 170, 170));    
  
        lbl_imagen_criterio.setBackground(new java.awt.Color(102, 102, 102));
        lbl_imagen_criterio.setFont(new java.awt.Font("Segoe UI", 0, 0)); // NOI18N
        lbl_imagen_criterio.setOpaque(true);
        
        criterio = (int) 1 + (int) (Math.random() * ((2 - 1) + 1)); // Selecciona un criterio al azar: Color = 1, Forma = 2,...        
        
        if(criterio == 1){
            generarCriterioColor();                   
        }
        else if(criterio == 2){
            generarCriterioForma();
        }     
    }
    
    private void generarCriterioColor(){
        modelo.colores color = new modelo.colores();
        
        lbl_imagen_criterio.setText(color.generarColor());
        
        switch (lbl_imagen_criterio.getText()) {
            case "AMARILLO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(255, 255, 0));                
                break;
            case "AZUL":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 0, 255));
                break;
            case "NEGRO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 0, 0));
                break;
            case "ROJO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(255, 0, 0));
                break;
            case "VERDE":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 255, 0));
                break;
            default:
                System.out.println("Se recibió " + lbl_imagen_criterio.getText() + " como color");
                break;
        } 
    }
    
    private void generarCriterioForma(){
        modelo.formas forma = new modelo.formas();
        modelo.colores color = new modelo.colores();
        
        lbl_imagen_criterio.setText(color.generarColor());
        
        switch (lbl_imagen_criterio.getText()) {
            case "AMARILLO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(255, 255, 0));                
                break;
            case "AZUL":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 0, 255));
                break;
            case "NEGRO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 0, 0));
                break;
            case "ROJO":
                lbl_imagen_criterio.setBackground(new java.awt.Color(255, 0, 0));
                break;
            case "VERDE":
                lbl_imagen_criterio.setBackground(new java.awt.Color(0, 255, 0));
                break;
            default:
                System.out.println("Se recibió " + lbl_imagen_criterio.getText() + " como color");
                break;
        } 
    }
    
    private void llenarFichas(){
        
    }
    
    public void mostrarCriterio(int segundos){
        int delay = segundos*1000;
             
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                lbl_imagen_criterio.setVisible(true);
                if(criterio == 1){
                    lbl_criterio.setText("Selecciona las que tengan este color: ");
                }
                else if(criterio == 2){
                    lbl_criterio.setText("Selecciona las que tengan esta forma: ");
                }
                else{
                    lbl_criterio.setText("Error: Criterio fuera de rango");
                }
                
                ocultarFichas();
                habilitarFichas();
            }
        }, delay);
    }
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        finalizarPartida();
        interfaz_memorabble im = new interfaz_memorabble();
        im.setVisible(true);  
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public void addAcierto(){
        restantes = 0;
        aciertos += 1;
        puntuacion += 100;
        lbl_puntuacionActual.setText(Integer.toString(puntuacion));   
        
        for(JButton fichaActual: misFichas){
            if(fichaActual.getText() == lbl_imagen_criterio.getText()){ // Comprobación si se seleccionaron todas las figuras que coinciden con el criterio (Por construir...)
                restantes += 1;              
            }
        } 
        
        if(restantes<=0){
            JOptionPane.showMessageDialog(null, "Ganaste esta ronda, vamos por la siguiente!");
            victoria();
        }
        else{
            lbl_criterio.setText("Quedan: " + restantes +  " por encontrar");
        }
    }
    
    public void addFallo(){
        fallos += 1;
        vidas -= 1;
        derrota();
    }
    
    public void victoria(){
        siguienteRonda();      
    }
    
    public void derrota(){
        if(vidas>=1){
            siguienteRonda();
        }
        else{            
            lbl_vida1.setEnabled(false);        
            finalizarPartida();
        }     
    }
    
    public void siguienteRonda(){
        dispose();
        if(rondaActual%3==0){
            dificultad+=1;
        }
        interfaz_jugable ij = new interfaz_jugable(tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos, vidas, aciertos, fallos, rondaActual+1, puntuacion, dificultad);
        ij.setVisible(true);        
    }
    
    public void finalizarPartida(){
        // Calculando Tiempo Jugado
        tiempoFinal = LocalTime.now();     
        tiempoFinal = tiempoFinal.minusHours(tiempoInicioHoras);
        tiempoFinal = tiempoFinal.minusMinutes(tiempoInicioMinutos);
        tiempoFinal = tiempoFinal.minusSeconds(tiempoInicioSegundos); 
        
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
        else if(aciertos>=20 && aciertos<40){
            titulo = "Pato con traje";
        }
        else if(aciertos>=40 && aciertos<80){
            titulo = "Pato con Jordans";
        }
        else if(aciertos>=80){
            titulo = "Pato supremo";
        }
        
        JOptionPane.showMessageDialog(null, "Resumen de partida" 
                + "\n"
                + "\n" + "Titulo conseguido: " + titulo
                + "\n" + "Puntaje total: " + puntuacion
                + "\n" + "Rondas jugadas: " + rondaActual
                + "\n" + "Aciertos: " + aciertos 
                + "\n" + "Fallos: " + fallos
                + "\n"
                + "\n" + "La partida ha durado " + tiempoFinal.getMinute() + " minutos y " + tiempoFinal.getSecond() + " segundos.");
        
        dispose();
        interfaz_memorabble im = new interfaz_memorabble();
        im.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl_banner_superior;
    private javax.swing.JLabel lbl_criterio;
    private javax.swing.JLabel lbl_puntuacion;
    private javax.swing.JLabel lbl_puntuacionActual;
    private javax.swing.JLabel lbl_rondaActual;
    private javax.swing.JLabel lbl_vida1;
    private javax.swing.JLabel lbl_vida2;
    private javax.swing.JLabel lbl_vida3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_UP:
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT: 
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
