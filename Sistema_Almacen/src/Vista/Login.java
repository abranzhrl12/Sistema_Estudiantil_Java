
package Vista;


import Vista.Clases.ValidarC_Vacios;
import FiveCodMover.FiveCodMoverJFrame;
import javax.swing.UIManager;
import Controlador.LoignControlador;
public class Login extends javax.swing.JFrame {
 LoignControlador log=new LoignControlador(this);
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
//       GlassPanePopup.install(this);
    }

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSScaleLabel1 = new rsscalelabel.RSScaleLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnconectar = new rojerusan.RSButtonRound();
        jLabel2 = new javax.swing.JLabel();
        txtmensaje = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        panelRoundshadow1 = new Vista.Clases.PanelRoundshadow();
        panelRoundshadow2 = new Vista.Clases.PanelRoundshadow();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        txtusuario1 = new LIB.FSTexFieldMD();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        txtpass = new rojerusan.RSMetroTextPassPlaceHolder();
        panelRoundshadow3 = new Vista.Clases.PanelRoundshadow();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        txtusuario = new LIB.FSTexFieldMD();
        customCheckbox1 = new Vista.Clases.CustomCheckbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));
        jPanel5.setForeground(new java.awt.Color(16, 0, 43));
        jPanel5.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentHidden(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBarra/icons8_multiply_18px_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(836, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 32));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 140, 41));

        btnconectar.setBackground(new java.awt.Color(95, 72, 236));
        btnconectar.setText("Ingresar");
        btnconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconectarActionPerformed(evt);
            }
        });
        jPanel1.add(btnconectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 197, -1));

        jLabel2.setText("Sistema de Ingreso de Alumnos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 180, 20));
        jPanel1.add(txtmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 275, 240, 20));

        rSLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/foto1.png"))); // NOI18N
        jPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 390, 510));

        panelRoundshadow1.setBackground(new java.awt.Color(243, 241, 255));
        panelRoundshadow1.setRoundBottomLeft(25);
        panelRoundshadow1.setRoundBottomRight(25);
        panelRoundshadow1.setRoundTopLeft(25);
        panelRoundshadow1.setRoundTopRight(25);
        panelRoundshadow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRoundshadow2.setRoundBottomLeft(25);
        panelRoundshadow2.setRoundBottomRight(25);
        panelRoundshadow2.setRoundTopLeft(25);
        panelRoundshadow2.setRoundTopRight(25);
        panelRoundshadow2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage4.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/user.png"))); // NOI18N
        panelRoundshadow2.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        txtusuario1.setBackground(new java.awt.Color(243, 241, 255));
        txtusuario1.setForeground(new java.awt.Color(102, 102, 102));
        txtusuario1.setAutoscrolls(false);
        txtusuario1.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtusuario1.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtusuario1.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        txtusuario1.setHighlighter(null);
        txtusuario1.setMargin(new java.awt.Insets(0, 10, 0, 10));
        txtusuario1.setPlaceholder("Ingresear usuario");
        panelRoundshadow2.add(txtusuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 210, 70));

        panelRoundshadow1.add(panelRoundshadow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 270, 50));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/lock.png"))); // NOI18N
        panelRoundshadow1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        txtpass.setBackground(new java.awt.Color(243, 241, 255));
        txtpass.setForeground(new java.awt.Color(204, 204, 204));
        txtpass.setAutoscrolls(false);
        txtpass.setBorderColor(new java.awt.Color(243, 241, 255));
        txtpass.setBotonColor(new java.awt.Color(243, 241, 255));
        txtpass.setCaretColor(new java.awt.Color(255, 51, 51));
        txtpass.setDisabledTextColor(new java.awt.Color(255, 102, 0));
        txtpass.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtpass.setHighlighter(null);
        txtpass.setMargin(new java.awt.Insets(0, 10, 0, 12));
        txtpass.setOpaque(true);
        txtpass.setPhColor(new java.awt.Color(51, 51, 51));
        txtpass.setPlaceholder("password");
        txtpass.setSelectedTextColor(new java.awt.Color(255, 51, 0));
        txtpass.setSelectionColor(new java.awt.Color(255, 51, 0));
        panelRoundshadow1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 210, 68));

        jPanel1.add(panelRoundshadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 270, 50));

        panelRoundshadow3.setBackground(new java.awt.Color(243, 241, 255));
        panelRoundshadow3.setRoundBottomLeft(25);
        panelRoundshadow3.setRoundBottomRight(25);
        panelRoundshadow3.setRoundTopLeft(25);
        panelRoundshadow3.setRoundTopRight(25);
        panelRoundshadow3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage5.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/user.png"))); // NOI18N
        panelRoundshadow3.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        txtusuario.setBackground(new java.awt.Color(243, 241, 255));
        txtusuario.setForeground(new java.awt.Color(102, 102, 102));
        txtusuario.setAutoscrolls(false);
        txtusuario.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtusuario.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        txtusuario.setHighlighter(null);
        txtusuario.setMargin(new java.awt.Insets(0, 10, 0, 10));
        txtusuario.setPlaceholder("Ingresear usuario");
        panelRoundshadow3.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 210, 70));

        jPanel1.add(panelRoundshadow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 270, 50));

        customCheckbox1.setText("Recordar Contraseña");
        customCheckbox1.setBorderRadius(8);
        customCheckbox1.setCheckedBackgroundColor(new java.awt.Color(51, 102, 255));
        customCheckbox1.setSelectedColor(new java.awt.Color(255, 255, 255));
        customCheckbox1.setUncheckedBackgroundColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(customCheckbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 860, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseMoved
     
    }//GEN-LAST:event_panelRound1MouseMoved

    private void panelRound1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseDragged
      

    }//GEN-LAST:event_panelRound1MouseDragged

    private void jPanel5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5ComponentHidden

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased

    }//GEN-LAST:event_jPanel5MouseReleased

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
        int initialY = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        int currentY = evt.getY();

        int frameX = this.getLocation().x;
        int frameY = this.getLocation().y;
        //top
        int distanceY = this.getY();

        // Calcular el tamaño del JFrame para ajustarlo a los límites de la pantalla

    }//GEN-LAST:event_jPanel5MouseDragged

    private void btnconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconectarActionPerformed
        ValidarC_Vacios val=new ValidarC_Vacios();
       boolean a= val.camposTextoVacios(txtusuario,txtpass);
        if(a){
           log.validarCredenciales();  
        }
//         Message obj = new Message();
//        obj.eventOK(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.out.println("Click OK");
//                GlassPanePopup.closePopupLast();
//            }
//        });
//        GlassPanePopup.showPopup(obj);
    }//GEN-LAST:event_btnconectarActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
      FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        int currentY = evt.getY();

        int frameX = this.getLocation().x;
        int frameY = this.getLocation().y;
        //top
        int distanceY = this.getY();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        FiveCodMoverJFrame.MousePressed(evt);
        int initialY = evt.getY();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
 try {
    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (Exception ex) {
    ex.printStackTrace();
}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
public String getUsuario(){
return txtusuario.getText();
}
public String getContraseña(){
return txtpass.getText();
}
public void setResultado(String respuesta) {
    txtmensaje.setText(respuesta);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonRound btnconectar;
    private Vista.Clases.CustomCheckbox customCheckbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private Vista.Clases.PanelRoundshadow panelRoundshadow1;
    private Vista.Clases.PanelRoundshadow panelRoundshadow2;
    private Vista.Clases.PanelRoundshadow panelRoundshadow3;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private rsscalelabel.RSScaleLabel rSScaleLabel1;
    private javax.swing.JLabel txtmensaje;
    private rojerusan.RSMetroTextPassPlaceHolder txtpass;
    private LIB.FSTexFieldMD txtusuario;
    private LIB.FSTexFieldMD txtusuario1;
    // End of variables declaration//GEN-END:variables
}
