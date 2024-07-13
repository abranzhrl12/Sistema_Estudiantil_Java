
package Vista;



import FiveCodMover.FiveCodMoverJFrame;
import javax.swing.UIManager;
import Controlador.LoignControlador;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;


public class Login extends javax.swing.JFrame {
 LoignControlador log=new LoignControlador(this);
 Controlador.MetodosUtilidades metodos=new Controlador.MetodosUtilidades(this);
    public Login() {
        initComponents();
  jPanel3.requestFocusInWindow();
        this.setLocationRelativeTo(null);
       inicializarMouseListeners();
        pack();
        Shape roundShape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30);
        setShape(roundShape);
        setVisible(true); 
         setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

     @Override
    public void setShape(Shape shape) {
        super.setShape(shape);
    }
     private void inicializarMouseListeners() {
        metodos.configurarMouseListener(btnIniciarSecion, () -> { 
            log.validarCredenciales();
        });

       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSScaleLabel1 = new rsscalelabel.RSScaleLabel();
        rSFotoSquare1 = new rojerusan.RSFotoSquare();
        rSFotoCircle1 = new rojerusan.RSFotoCircle();
        rSFotoCircle2 = new rojerusan.RSFotoCircle();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        btnSalir = new Vista.Clases.JpanelRound();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnIniciarSecion = new Vista.Clases.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JLabel();
        txtusuario1 = new app.bolivia.swing.JCTextField();
        txtpass = new rojerusan.RSPasswordTextPlaceHolder();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(68, 122, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setBackground(new java.awt.Color(255, 255, 102));
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/foto2.png"))); // NOI18N
        rSLabelImage1.setOpaque(true);
        jPanel2.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 430, 430));

        btnSalir.setBackground(new java.awt.Color(2, 29, 48));
        btnSalir.setRoundBottomRight(30);
        btnSalir.setRoundTopRight(30);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/power-button (1).png"))); // NOI18N
        jLabel1.setText("   Salir");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 130, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        btnIniciarSecion.setBackground(new java.awt.Color(56, 130, 186));
        btnIniciarSecion.setRoundBottomLeft(30);
        btnIniciarSecion.setRoundBottomRight(30);
        btnIniciarSecion.setRoundTopLeft(30);
        btnIniciarSecion.setRoundTopRight(30);
        btnIniciarSecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSecionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSecionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSecionMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Iniciar Secion");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/right-arrow.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout btnIniciarSecionLayout = new javax.swing.GroupLayout(btnIniciarSecion);
        btnIniciarSecion.setLayout(btnIniciarSecionLayout);
        btnIniciarSecionLayout.setHorizontalGroup(
            btnIniciarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarSecionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        btnIniciarSecionLayout.setVerticalGroup(
            btnIniciarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnIniciarSecionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnIniciarSecionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/candado (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/user (1).png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(56, 130, 186));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(56, 130, 186));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSeparator2.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Usuario");

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Contraceña");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/Scan.png"))); // NOI18N

        txtRespuesta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(255, 51, 51));

        txtusuario1.setBorder(null);
        txtusuario1.setMargin(new java.awt.Insets(3, 3, 3, 3));
        txtusuario1.setPlaceholder("ingrese su usuario");

        txtpass.setBorder(null);
        txtpass.setForeground(new java.awt.Color(51, 51, 51));
        txtpass.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtpass.setMargin(new java.awt.Insets(3, 3, 3, 3));
        txtpass.setPhColor(new java.awt.Color(51, 51, 51));
        txtpass.setPlaceholder("***********");
        txtpass.setSelectionColor(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtusuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jLabel7)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(txtRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelRound1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseMoved
     
    }//GEN-LAST:event_panelRound1MouseMoved

    private void panelRound1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseDragged
      

    }//GEN-LAST:event_panelRound1MouseDragged

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

    private void btnIniciarSecionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSecionMouseEntered
        // TODO add your handling code here:
        btnIniciarSecion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnIniciarSecion.setBackground(new Color(37, 116, 176));
        
    }//GEN-LAST:event_btnIniciarSecionMouseEntered

    private void btnIniciarSecionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSecionMouseExited
        // TODO add your handling code here:
         btnIniciarSecion.setCursor(Cursor.getDefaultCursor());
         btnIniciarSecion.setBackground(new Color(56,130,186));
         
    }//GEN-LAST:event_btnIniciarSecionMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalir.setBackground(new Color(4, 83, 138));
        
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        
        btnSalir.setCursor(Cursor.getDefaultCursor());
        btnSalir.setBackground(new Color(2, 29, 48));
    }//GEN-LAST:event_btnSalirMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        cerrarVentana();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here: 
         jPanel3.requestFocus();
         
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    
//        iniciarVentanaPrincipal();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnIniciarSecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSecionMouseClicked
        // TODO add your handling code here:
//        iniciarVentanaPrincipal();
    }//GEN-LAST:event_btnIniciarSecionMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
   
//        iniciarVentanaPrincipal();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
         jLabel3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel3MouseEntered

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
return txtusuario1.getText();
}
public String getContraseña(){

return txtpass.getText();
}
public void setResultado(String respuesta) {
    txtRespuesta.setText(respuesta);
}

private void cerrarVentana(){
    dispose();
    System.exit(0);
}
//private void iniciarVentanaPrincipal(){
//
//    //code Necesario Para abrir la nueva ventana si se valida el usuario existe
//    JOptionPane.showMessageDialog(rootPane, "Creo que inicio secion");
//    setResultado("Creo que no as ingresado nada o si");
//}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vista.Clases.JpanelRound btnIniciarSecion;
    private Vista.Clases.JpanelRound btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private rojerusan.RSFotoCircle rSFotoCircle1;
    private rojerusan.RSFotoCircle rSFotoCircle2;
    private rojerusan.RSFotoSquare rSFotoSquare1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rsscalelabel.RSScaleLabel rSScaleLabel1;
    private javax.swing.JLabel txtRespuesta;
    private rojerusan.RSPasswordTextPlaceHolder txtpass;
    private app.bolivia.swing.JCTextField txtusuario1;
    // End of variables declaration//GEN-END:variables
}
