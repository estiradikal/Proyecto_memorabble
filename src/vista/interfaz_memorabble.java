package vista;

import controlador.*;
import java.awt.*;
import javax.swing.JOptionPane;
import modelo.*;

/*
    Fundamentos de programación orientada a eventos 750014C-01  
    LABORATORIO  
    Profesor: Luis Romo Portilla

    Archivo: interfaz_memorabble.java
    Autores (A-Z): 
            * Alejandro Guerrero <alejandro.cano@correounivalle.edu.co> - 202179652-3743
            * Estiven Andres Martinez Granados <estiven.martinez@correounivalle.edu.co> - 202179687-3743
            * Juan David Loaiza Santiago <juan.loaiza.santiago@correounivalle.edu.co> - 2177570-3743             
    Fecha creación: 10-30-2022
    Fecha última modificación: 11-14-2022
    Versión: 1.1
    Licencia: GNU-GPL
*/
public class interfaz_memorabble extends javax.swing.JFrame{
    
    reproductorSonido reproductor = new reproductorSonido();

    public interfaz_memorabble() {        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false); 
        setIconImage(getImage());
    }
       public Image getImage(){
        
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Memorabble.png"));
        
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_bienvenido = new javax.swing.JLabel();
        lbl_digite_su_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        lbl_separador = new javax.swing.JLabel();
        btn_jugar = new javax.swing.JButton();
        btn_como_jugar = new javax.swing.JButton();
        btn_para_que_sirve = new javax.swing.JButton();
        lbl_imagen_lateral = new javax.swing.JLabel();
        lbl_separador_inferior = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 146, 45));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(436, 472));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_bienvenido.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbl_bienvenido.setText("Bienvenid@,");
        lbl_bienvenido.setFocusable(false);
        jPanel1.add(lbl_bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        lbl_digite_su_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_digite_su_nombre.setText("Digite su nombre para empezar a jugar");
        lbl_digite_su_nombre.setFocusable(false);
        jPanel1.add(lbl_digite_su_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        campo_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        campo_nombre.setForeground(new java.awt.Color(153, 153, 153));
        campo_nombre.setText("Ingrese su nombre...");
        campo_nombre.setBorder(null);
        campo_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_nombreMousePressed(evt);
            }
        });
        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });
        campo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 400, 30));

        lbl_separador.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_separador.setOpaque(true);
        jPanel1.add(lbl_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 400, 2));

        btn_jugar.setBackground(new java.awt.Color(0, 102, 102));
        btn_jugar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btn_jugar.setForeground(new java.awt.Color(255, 255, 255));
        btn_jugar.setText("Jugar");
        btn_jugar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_jugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 90, 40));

        btn_como_jugar.setBackground(new java.awt.Color(0, 102, 102));
        btn_como_jugar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_como_jugar.setForeground(new java.awt.Color(255, 255, 255));
        btn_como_jugar.setText("¿Como jugar?");
        btn_como_jugar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_como_jugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_como_jugar.setFocusable(false);
        btn_como_jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_como_jugarMouseClicked(evt);
            }
        });
        btn_como_jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_como_jugarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_como_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 30));

        btn_para_que_sirve.setBackground(new java.awt.Color(0, 102, 102));
        btn_para_que_sirve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_para_que_sirve.setForeground(new java.awt.Color(255, 255, 255));
        btn_para_que_sirve.setText("¿Para qué sirve?");
        btn_para_que_sirve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_para_que_sirve.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_para_que_sirve.setFocusable(false);
        btn_para_que_sirve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_para_que_sirveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_para_que_sirve, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 130, 30));

        lbl_imagen_lateral.setBackground(new java.awt.Color(0, 102, 102));
        lbl_imagen_lateral.setForeground(new java.awt.Color(255, 255, 255));
        lbl_imagen_lateral.setFocusable(false);
        lbl_imagen_lateral.setOpaque(true);
        jPanel1.add(lbl_imagen_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 140, 370));

        lbl_separador_inferior.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador_inferior.setFocusable(false);
        lbl_separador_inferior.setOpaque(true);
        jPanel1.add(lbl_separador_inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 600, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 220, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Instancia una ventana de la clase como_jugar.java
     */
    private void btn_como_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_como_jugarActionPerformed
        reproductor.reproducirSonido("quack.wav");
        como_jugar cj=new como_jugar();
        cj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_como_jugarActionPerformed

    /**
     * Instancia una ventana de la clase para_que_sirve.java
     */
    private void btn_para_que_sirveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_para_que_sirveActionPerformed
      reproductor.reproducirSonido("quack.wav");
      para_que_sirve cs=new para_que_sirve();
      cs.setVisible(true);
      dispose();
      
    }//GEN-LAST:event_btn_para_que_sirveActionPerformed

    /**
     * Redirige al metodo para verificar el campo de nombre
     */
    private void btn_jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugarActionPerformed
       verificarCampoNombre(); 
    }//GEN-LAST:event_btn_jugarActionPerformed
  
   /**
     * Metodo para alertar al usuario de que no ha escrito su nombre
     */
    public void solicitarCampoNombre(){
        reproductor.reproducirSonido("honk.wav");
        campo_nombre.setForeground(Color.GRAY);
        campo_nombre.setText("Ingrese su nombre...");
        JOptionPane.showMessageDialog(null, "Debes escribir tu nombre para continuar");
    }

    /**
     * Instancia una ventana de la clase gameLauncher.java
     */
    public void iniciarPartida(){
        reproductor.reproducirSonido("quack.wav");
            JOptionPane.showMessageDialog(null, "Buen juego " + campo_nombre.getText());
            dispose();
            gameLauncher lanzador = new gameLauncher();
            lanzador.nuevoJuego();
    }
    
    /**
     * Se encarga de realizar las verificaciones para que el contenido de campo_nombre tenga un nombre válido
     */
    public void verificarCampoNombre(){
    
        String nombre_digitado=campo_nombre.getText();
  
        if((nombre_digitado.isEmpty()) || ("Ingrese su nombre...".equals(nombre_digitado))){
            solicitarCampoNombre();
        }
        else{
            iniciarPartida();
        }  
            
    }

    
    /**
     * Autogenerado por NetBeans
     */
    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
    }//GEN-LAST:event_campo_nombreActionPerformed

    //                  MEJORAR UX                  //
    /**
     * Ajusta las propiedades y limpia campo_nombre para que el usuario escriba
     */
    private void campo_nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_nombreMousePressed
        if("Ingrese su nombre...".equals(campo_nombre.getText())){
            campo_nombre.setForeground(Color.BLACK);
            campo_nombre.setText("");
        }
    }//GEN-LAST:event_campo_nombreMousePressed

    /**
     * Ajusta las propiedades y limpia campo_nombre para que el usuario escriba
     */
    private void campo_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombreKeyPressed
        if (evt.getKeyCode() == 10) {
            verificarCampoNombre();
        }
        else if("Ingrese su nombre...".equals(campo_nombre.getText())){
            campo_nombre.setForeground(Color.BLACK);
            campo_nombre.setText("");
        }
    }//GEN-LAST:event_campo_nombreKeyPressed

    private void btn_como_jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_como_jugarMouseClicked
        como_jugar cj=new como_jugar();        
        cj.setVisible(true);
    }//GEN-LAST:event_btn_como_jugarMouseClicked

    private void campo_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_nombreKeyTyped
        
        char c=evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'A')|c>'Z')evt.consume();{
        }
    }//GEN-LAST:event_campo_nombreKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz_memorabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz_memorabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz_memorabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz_memorabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz_memorabble().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_como_jugar;
    private javax.swing.JButton btn_jugar;
    private javax.swing.JButton btn_para_que_sirve;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_digite_su_nombre;
    private javax.swing.JLabel lbl_imagen_lateral;
    private javax.swing.JLabel lbl_separador;
    private javax.swing.JLabel lbl_separador_inferior;
    // End of variables declaration//GEN-END:variables
}
