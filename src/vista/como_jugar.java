/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

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
    Fecha última modificación: 11-03-2022
    Versión: 0.2
    Licencia: GNU-GPL
*/
public class como_jugar extends javax.swing.JFrame {
    reproductorSonido reproductor = new reproductorSonido();
    
    /**
     * Creates new form interfaz_memorabble
     */
    public como_jugar() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_separador = new javax.swing.JLabel();
        lbl_imagen_lateral = new javax.swing.JLabel();
        lbl_separador_inferior = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        btn_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_separador1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        lbl_separador2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(90, 146, 45));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(436, 472));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 51, 51));
        lbl_titulo.setText("Instrucciones");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lbl_separador.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_separador.setOpaque(true);
        jPanel1.add(lbl_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 350, 10));

        lbl_imagen_lateral.setBackground(new java.awt.Color(0, 102, 102));
        lbl_imagen_lateral.setForeground(new java.awt.Color(255, 255, 255));
        lbl_imagen_lateral.setOpaque(true);
        lbl_imagen_lateral.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lbl_imagen_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 350, 10));

        lbl_separador_inferior.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador_inferior.setOpaque(true);
        jPanel1.add(lbl_separador_inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 600, 30));

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setBorder(null);
        jTextPane2.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(0, 0, 0));
        jTextPane2.setText("\n                    Y te pediremos\n  las que coinciden con una forma/color\n                           ¡Al azar!");
        jTextPane2.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 160, 50));

        btn_volver.setBackground(new java.awt.Color(0, 102, 102));
        btn_volver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("Volver");
        btn_volver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_volverMouseClicked(evt);
            }
        });
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trebol-verde.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon-rojo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rojo.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 60, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pica-azul.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("¡Memoriza todo lo que puedas!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rombo-amarillo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/corazon.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        lbl_separador1.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_separador1.setOpaque(true);
        jPanel1.add(lbl_separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 4, 60));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Porque desaparecerán...");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 130, 10));

        jTextPane3.setEditable(false);
        jTextPane3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jTextPane3.setText("\n\n\n1. El juego te mostrará varias fichas con figuras específicas, cada una tiene una forma y un color, MEMORIZA TODAS LAS QUE PUEDAS porque DESAPARECERÁN. \n2. El juego te pedirá las fichas con un color o una forma específica, SELECCIONA LAS FICHAS QUE COINCIDAN.\n\n¡Un solo clic en falso y perderas un preciado corazon!");
        jScrollPane2.setViewportView(jTextPane3);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 350, 210));

        lbl_separador2.setBackground(new java.awt.Color(51, 51, 51));
        lbl_separador2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_separador2.setOpaque(true);
        jPanel1.add(lbl_separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 2, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_volverMouseClicked
        
        
    }//GEN-LAST:event_btn_volverMouseClicked

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        /*JOptionPane.showMessageDialog(null,"Instrucciones: "
            + "\n" + "* Saldrán unas figuras con distintos colores y después de unos segundos desaparecerán."
            + "\n" + "* Después saldrá una pregunta."
            + "\n" + "* La pregunta te indicara, que debes pulsar sobre una ficha que cumpla con la condición dada."
            + "\n" + "* ¡OJO! Es posible  que haya que pulsar más de una ficha..."
            + "\n" + "* Es importante que memorices formas, colores y posición de cada ficha.");*/
        reproductor.reproducirSonido("quack.wav");
        interfaz_memorabble im=new interfaz_memorabble();
        im.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

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
            java.util.logging.Logger.getLogger(como_jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(como_jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(como_jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(como_jugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new como_jugar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel lbl_imagen_lateral;
    private javax.swing.JLabel lbl_separador;
    private javax.swing.JLabel lbl_separador1;
    private javax.swing.JLabel lbl_separador2;
    private javax.swing.JLabel lbl_separador_inferior;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
