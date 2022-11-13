/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.time.LocalTime;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import modelo.*;


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
    Fecha última modificación: 11-12-2022
    Versión: 0.8
    Licencia: GNU-GPL
*/

public class interfaz_jugable extends javax.swing.JFrame {
    // Variables principales de pleno juego
    private LocalTime tiempoFinal;
    private int tiempoInicioHoras, tiempoInicioMinutos, tiempoInicioSegundos; // Variables de tiempo
    private int vidas = 3, aciertos = 0, fallos = 0, rondaActual = 1, puntuacion = 0, dificultad = 2; // Valores iniciales de la partida 0
    private int gameReady = 0; // 0 = Inhabilita la funcionalidad de las fichas mientras no hay criterio    
    private int criterio; 
    private int restantes;
    
    // Imagen vacia multiuso
    private ImageIcon imagenVacia = new javax.swing.ImageIcon(getClass().getResource("/imagenes/empty.png"));
    
    // Arreglos
    private java.util.List<JButton> misFichas = new ArrayList<>(); // Botones de fichas
    private java.util.List<String> misFichasImg = new ArrayList(); // Copia de la ruta de imagen del boton
    private java.util.List<String> misFichasStr = new ArrayList<>(); // Copia del texto del boton
    
    // Contenedor del criterio
    private JLabel lbl_imagen_criterio = new JLabel();
    
    // Instancias de clases
    public colores color = new colores();
    public formas forma = new formas();

    public interfaz_jugable(int _tiempoInicioHoras, int _tiempoInicioMinutos, int _tiempoInicioSegundos) {
        // Inicio de componentes a primera vista
        initComponents();
        iniciarFichas();     
        
        // Ajustes de ventana
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
     
        // Guardado del tiempo
        this.tiempoInicioHoras = _tiempoInicioHoras;
        this.tiempoInicioMinutos = _tiempoInicioMinutos;
        this.tiempoInicioSegundos = _tiempoInicioSegundos; 
  
        // ORDEN DE PRIMERA EJECUCION //
        // Actualizacion de variables
        actualizarVidas();        
        actualizarRonda();
        actualizarPuntuacion();
        
        // Iniciar lógica de juego
        iniciarCriterio();
        asignarFichas();
        syncBotonesStrings();
        mostrarCriterio(8);    
        // --------------------------- //
    }
    
    
    //    INICIALIZACIONES Y ACTUALIZACIONES DE ELEMENTOS EN  GUI   //
    
    /**
    * Codigo autogenerado por el creador de interfaces de NetBeans
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_rondaActual = new javax.swing.JLabel();
        lbl_puntuacion = new javax.swing.JLabel();
        lbl_puntuacionActual = new javax.swing.JLabel();
        lbl_didactica = new javax.swing.JLabel();
        lbl_vida1 = new javax.swing.JLabel();
        lbl_vida2 = new javax.swing.JLabel();
        lbl_vida3 = new javax.swing.JLabel();
        lbl_banner_superior = new javax.swing.JLabel();
        btn_rendirse = new javax.swing.JToggleButton();

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
        lbl_puntuacionActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_puntuacionActual.setText("0");
        lbl_puntuacionActual.setOpaque(true);
        jPanel1.add(lbl_puntuacionActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 4, 90, 30));

        lbl_didactica.setBackground(new java.awt.Color(255, 255, 255));
        lbl_didactica.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lbl_didactica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_didactica.setText("¡Memoriza todas las que puedas!");
        jPanel1.add(lbl_didactica, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 210, -1));

        lbl_vida1.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida1.setEnabled(false);
        jPanel1.add(lbl_vida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 4, 30, 30));

        lbl_vida2.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida2.setEnabled(false);
        jPanel1.add(lbl_vida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 4, 30, 30));

        lbl_vida3.setBackground(new java.awt.Color(0, 102, 102));
        lbl_vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-vidas.png"))); // NOI18N
        lbl_vida3.setEnabled(false);
        jPanel1.add(lbl_vida3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 4, 30, 30));

        lbl_banner_superior.setBackground(new java.awt.Color(0, 102, 102));
        lbl_banner_superior.setForeground(new java.awt.Color(255, 255, 255));
        lbl_banner_superior.setOpaque(true);
        jPanel1.add(lbl_banner_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        btn_rendirse.setBackground(new java.awt.Color(0, 102, 102));
        btn_rendirse.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_rendirse.setForeground(new java.awt.Color(255, 255, 255));
        btn_rendirse.setText("Rendirse");
        btn_rendirse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_rendirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rendirseActionPerformed(evt);
            }
        });
        jPanel1.add(btn_rendirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 80, -1));

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

    /**
    * Comprueba la cantidad de vidas restantes y habilita o deshabilita los lbl_vida#
    */
    public void actualizarVidas(){
        if(vidas>=1){
            lbl_vida1.setEnabled(true);
        }
        else{
            lbl_vida1.setEnabled(false);
        }
        if(vidas>=2){
            lbl_vida2.setEnabled(true);
        }
        else{
            lbl_vida2.setEnabled(false);
        }
        if(vidas>=3){
            lbl_vida3.setEnabled(true);
        }
        else{
            lbl_vida3.setEnabled(false);
        }
    }
    
    /**
    * Actualiza el lbl_rondaActual con el texto "RONDA" y el numero de ronda.
    */
    public void actualizarRonda(){
        lbl_rondaActual.setText("RONDA "  + Integer.toString(rondaActual));
    }
    
    /**
    * Actualiza el texto de lbl_puntuacionActual con el entero de la variable correspondiente
    */
    public void actualizarPuntuacion(){
        lbl_puntuacionActual.setText(Integer.toString(puntuacion));
    }
    
    /**
    * Inicia el label de lbl_imagen_criterio con visibilidad, posicion y fuente preestablecidas.
    * Genera un numero aleatorio entre 1 y 2
    * @see color.generarCriterioColor(); si el numero es 1, pedira al metodo ser llenado con un criterio aleatorio (tipo color)
    * @see forma.generarCriterioColor(); si el numero es 2, pedira al metodo ser llenado con un criterio aleatorio (tipo forma)
    */
    public void iniciarCriterio(){
        lbl_imagen_criterio.setVisible(false);
        jPanel1.add(lbl_imagen_criterio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 170, 170));  
        lbl_imagen_criterio.setFont(new java.awt.Font("Segoe UI", 0, 0)); // NOI18N
        lbl_imagen_criterio.setOpaque(true);
 
        criterio = (int) 1 + (int) (Math.random() * ((2 - 1) + 1)); // Selecciona un criterio al azar: Color = 1, Forma = 2,...        
        
        // DESARROLLADOR // CAMBIA EL CRITERIO A 1 PARA REVISAR LA GENERACION DE COLORES O A 2 PARA REVISAR LA GENERACION DE FORMAS
        /*
            criterio = 1;
        */
        
        if(criterio == 1){
            color.generarCriterioColor(lbl_imagen_criterio);                   
        }
        else if(criterio == 2){
            forma.generarCriterioForma(lbl_imagen_criterio);
        }     
    }
    
    /**
    * Crea los JButton para las fichas (posicion, color, fuente...), las pone en el tablero y les asigna a cada una el mismo ActionListener
    */
    public void iniciarFichas(){
        int cantidadFichas;
        int posX, posY, ancho, alto, filas, columnas;
    
        posX = 20; // La proxima ficha está a +90
        posY = 60; // La proxima ficha está a +80
        ancho = 70;
        alto = 80;
        columnas = 6; // Horizontales
        filas = 3; // Verticales   
        
        cantidadFichas = columnas * filas;        
        
        for(int fichaActual = 0; fichaActual<cantidadFichas; fichaActual++){
            
            misFichas.add(new JButton());            
            misFichas.get(fichaActual).setText("EMPTY");     
            misFichasStr.add("");
            misFichasImg.add("");
        
            misFichas.get(fichaActual).setFont(new java.awt.Font("Segoe UI", 0, 0));  
            misFichas.get(fichaActual).setBackground(new java.awt.Color(150, 152, 154));
            misFichas.get(fichaActual).setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empty.png")));
            misFichas.get(fichaActual).addActionListener(oyenteDeFichas);
            
            jPanel1.add(misFichas.get(fichaActual), new org.netbeans.lib.awtextra.AbsoluteConstraints(posX, posY, ancho, alto));
            posX += ancho+10;
            
            if((fichaActual+1) % columnas == 0){ // Si ya son todas las columnas entonces ir a una nueva fila
                posY += alto+5;
                posX = 20;
            }    
        }     
    }
    
    
    //             LOGICA DE FICHAS               //
    
    /**
    * Debidamente condicionado, decide la funcion de las teclas en distintas condiciones y momentos
    */
    ActionListener oyenteDeFichas = (ActionEvent e) -> { 
            JButton source = (JButton) e.getSource();             
           
            if(gameReady == 0){} // El juego aun no ha mostrado el criterio
            else if("EPIC!".equals(source.getText())){} // Se ha dado clic en una que ya se comnfirmó
            else if(source.getText().equals(lbl_imagen_criterio.getText())){ // La seleccion corresponde al criterio              
                //llenarFicha(source, "nope", criterio);                
                source.setText("EPIC!");
                source.setBackground(new java.awt.Color(0, 255, 0));
                addAcierto();
            }
            else{ // La seleccion no corresponde al criterio
                addFallo();
            }   
    };
   
    /**
    * Asigna figuras y colores en los botones de forma aleatoria.
    * Considera el criterio y crea algunas extra para crearla dificultad del juego.
    * @see llenarFicha(); - Hace uso de este metodo para asignar imagenes a las fichas. 
    */
    public void asignarFichas(){
        int numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1)); 
        
        // Crea fichas que obligatoriamente cumplan con el criterio 
        for(int fichaActual = 0; fichaActual < dificultad; fichaActual ++){     
            numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1)); // Selecciona una ficha al azar,...
            
            // Pasa como parametro el criterio (color o formas exactas)
            llenarFicha(misFichas.get(numRandom), misFichasImg.get(numRandom), lbl_imagen_criterio.getText());
        }
        
        // Crea fichas aleatorias (podrían cumplir o no)
        for(int fichaActual = 0; fichaActual < dificultad*3; fichaActual ++){     
            numRandom = (int) 0 + (int) (Math.random() * ((misFichas.size()-1 - 1) + 1));
            
            // Pasa como parametros un elemento aleatorio del criterio (color o formas aleatorias)           
            if(misFichas.get(numRandom).getText() == "EMPTY"){
                if(criterio == 1)
                    llenarFicha(misFichas.get(numRandom), misFichasImg.get(numRandom), color.generarColor());
                else if(criterio == 2)
                    llenarFicha(misFichas.get(numRandom), misFichasImg.get(numRandom), forma.generarForma());
            }
        } 
        
        // DESARROLLADOR // IMPRIME EL CRITERIO Y LAS FICHAS EN CONSOLA PARA COMPROBAR QUE VA BIEN
        /*
        System.out.println("El criterio (" + criterio + "): " + lbl_imagen_criterio.getText());
        for(JButton fichaActual: misFichas){
            System.out.println(fichaActual.getText());
        }
        */
    }
    
    /**
    * Redirige una ficha a las instancias de color y forma para modificarse.
    * @param fichaActual recibe el boton que será modificado
    * @param fichaActualImg recibe el string correspondiente para guardar parcialmente el criterio original
    * @param criterioActual recibe la cadena del criterio exacta (color o forma exacta)
    */
    public void llenarFicha(JButton fichaActual, String fichaActualImg, String criterioActual){       

        if(criterio == 1){
            color.asignarColor(fichaActual, fichaActualImg, criterioActual);  
        }
        else if(criterio == 2){
            forma.asignarForma(fichaActual, fichaActualImg, criterioActual);
        }
        else{
            System.out.println("Este criterio no existe :( ");
        }  
    }
    
    /**
    * Reemplaza el ImageIcon de las fichas por uno vacio para ocultar el contenido
    */
    public void ocultarFichas(){
        for(JButton fichaActual: misFichas){
            fichaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empty.png")));         
        } 
    }
    
    /**
    * Se encarga de mostrar el criterio en la interfaz y ocultar las fichas
    * Cambia la variable de "gameReady" a 1 para indicarle al actionListener de las fichas que ya puede recibir eventos
    * @param segundos El tiempo que esperará antes de mostrar el criterio y ocultar las fichas
    * @see ocultarFichas(); 
    */
    public void mostrarCriterio(int segundos){
        int delay = segundos*1000;
             
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                lbl_imagen_criterio.setVisible(true);
                if(criterio == 1){
                    lbl_didactica.setText("Selecciona las que tengan este color: ");
                }
                else if(criterio == 2){
                    lbl_didactica.setText("Selecciona las que tengan esta forma: ");
                }
                else{
                    lbl_didactica.setText("Error: Criterio fuera de rango");
                }
                
                ocultarFichas();
                gameReady = 1;
            }
        }, delay);
    }
    
    
    
    //   RESTAURACION DE ELEMENTOS A SUS ESTADOS INICIALES    //
    
    /**
    * Restablece el texto, ImageIcon y background de las fichas a su estado incial
    */
    private void limpiarFichas(){
        for(JButton fichaActual: misFichas){
            fichaActual.setText("EMPTY");
            fichaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empty.png")));
            fichaActual.setBackground(new java.awt.Color(150, 152, 154));
        }
    }
    
    /**
    * Restablece el texto de la lista misFichasStr a su estado inicial
    */
    private void limpiarFichasStr(){
        for(String fichaActual: misFichasStr){
            fichaActual = "EMPTY";
        }
    }
    
    /**
    * Restablece el texto e ImageIcon de lbl_imagen_criterio a su estado inicial
    * Restablece el lbl_didactica a su estado inicial
    */
    private void limpiarCriterio(){
        lbl_imagen_criterio.setText("EMPTY");
        lbl_didactica.setText("¡Memoriza todas las que puedas!");
        lbl_imagen_criterio.setIcon(new ImageIcon(imagenVacia.getImage().getScaledInstance(170, 170, Image.SCALE_SMOOTH)));
    }
    
    
    //             FUNCIONES AUXILIARES                     //
    
    /**
    * Aumenta la puntuacion y los aciertos.
    * Actualiza la cantidad de fichas restantes que coinciden con el criterio.
    * Verifica si ya es momento de cantar la victoria de ronda.
    * @see victoria(); Redirige a este metodo
    */
    public void addAcierto(){
        ReproducirSonido("src/sonido/Acierto.wav");
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
            lbl_didactica.setText("Quedan: " + restantes +  " por encontrar");
        }
        
    }
    
    /**
    * Aumenta los fallos y reduce las vidas
    * @see derrota(); Redirige a este metodo
    */
    public void addFallo(){
        fallos += 1;
        vidas -= 1;        
        derrota();
    }
    
    /**
    * Metodo práctico, solo redirige
    * @see siguienteRonda();  Redirige a este metodo
    */
    public void victoria(){
        siguienteRonda();
        ReproducirSonido("src/sonido/Ganar.wav");
        
    }
    
    /**
    * Verifica si hay vidas restantes para tomar una decision
    * @see siguienteRonda();  Si aun hay vidas restantes
    * @see finalizarPartida(); Si ya no hay vidas restantes
    */
    public void derrota(){
        if(vidas>=1){
            JOptionPane.showMessageDialog(null, "Fallaste pero aun puedes seguir jugando, vamos!");
            siguienteRonda();
            ReproducirSonido("src/sonido/Perder.wav");
        }
        else{            
            lbl_vida1.setEnabled(false);        
            finalizarPartida();
        }     
    }
    
    
    //              LOGICA DE RONDAS Y PARTIDA              //
    
    /**
    * Se encarga de realizar las limpiezas necesarias para iniciar la siguiente ronda
    * @see limpiarCriterio(); |  limpiarFichas();   | limpiarFichasStr();               Limpieza y restablecimiento de GUI
    * @see actualizarVidas(); |  actualizarRonda(); | actualizarPuntuacion();           Actualizacion de variables e hitos
    * @see iniciarCriterio(); |  asignarFichas();   | syncBotonesStrings();  |  mostrarCriterio(8); Inicializacion de lógica de juego 
    */
    public void siguienteRonda(){   
        // Juego no listo
        gameReady = 0;
        
        limpiarCriterio();
        limpiarFichas();
        limpiarFichasStr();
        
        //Aumento de numero de ronda
        rondaActual += 1;
        
        actualizarVidas();
        actualizarRonda();
        actualizarPuntuacion();
        
        iniciarCriterio();
        asignarFichas();
        syncBotonesStrings();
        mostrarCriterio(8);  
    }
    
    /**
    * Termina la partida.
    * Genera y muestra las estadisticas del jugador
    * @see patos.java               Pide un titulo divertido para el usuario.
    * @see interfaz_memorabble.java Instancia un menú principal.
    */
    public void finalizarPartida(){
        // Calculando Tiempo Jugado
        tiempoFinal = LocalTime.now();     
        tiempoFinal = tiempoFinal.minusHours(tiempoInicioHoras);
        tiempoFinal = tiempoFinal.minusMinutes(tiempoInicioMinutos);
        tiempoFinal = tiempoFinal.minusSeconds(tiempoInicioSegundos); 
        ReproducirSonido("src/sonido/GameOver.wav");
        
        patos miPato = new patos();
        
        dispose();
        JOptionPane.showMessageDialog(null, "Resumen de partida" 
                + "\n"
                + "\n" + "Titulo conseguido: " + miPato.definirPato(aciertos)
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
   
    
    //               LOGICA DE RENDICION                    // 
    /**
    * Método práctico autogenerado, redirecciona a otro metodo
    * @see finalizarPartida(); Pide que se inicie el proceso de finalizar la partida
    */
    private void btn_rendirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rendirseActionPerformed
        finalizarPartida();
    }//GEN-LAST:event_btn_rendirseActionPerformed

    
    //       FUNCIONES EXPERIMENTALES EN DESARROLLO          //
    /**
    * Almacena el texto de cada ficha para restaurar en un futuro
    */
    public void syncBotonesStrings(){
        int i = 0;
        for(JButton fichaActual: misFichas){
            misFichasStr.set(i, fichaActual.getText());
            i++;
        }
    } 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_rendirse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_banner_superior;
    private javax.swing.JLabel lbl_didactica;
    private javax.swing.JLabel lbl_puntuacion;
    private javax.swing.JLabel lbl_puntuacionActual;
    private javax.swing.JLabel lbl_rondaActual;
    private javax.swing.JLabel lbl_vida1;
    private javax.swing.JLabel lbl_vida2;
    private javax.swing.JLabel lbl_vida3;
    // End of variables declaration//GEN-END:variables

   
    public void ReproducirSonido(String nombreSonido){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(nombreSonido).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
         System.out.println("Error al reproducir el sonido de " + nombreSonido);
        }
    }
}
