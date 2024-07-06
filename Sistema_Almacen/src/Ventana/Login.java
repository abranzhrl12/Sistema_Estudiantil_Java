
package Ventana;


import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.UIManager;




/**
 *
 * @author Abraham
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form gfdgfdgf
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        
   
    }

    public static void cambiarVentanas(JFrame ventanaActual, JFrame ventanaSiguiente) {
    ventanaActual.setVisible(false);
    ventanaSiguiente.setVisible(true);
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSScaleLabel1 = new rsscalelabel.RSScaleLabel();
        panelRound1 = new Ventana.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRound3 = new rojerusan.RSButtonRound();
        jLabel2 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtmensaje = new javax.swing.JLabel();
        panelRound3 = new Ventana.PanelRound();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        txtpass = new rojerusan.RSMetroTextPassPlaceHolder();
        panelRound5 = new Ventana.PanelRound();
        txtusuario = new LIB.FSTexFieldMD();
        rSLabelImage3 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorderWidth(0);
        panelRound1.setCornerRadius(0);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("LOGIN");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 41));

        rSButtonRound3.setBackground(new java.awt.Color(95, 72, 236));
        rSButtonRound3.setText("Ingresar");
        rSButtonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound3ActionPerformed(evt);
            }
        });
        panelRound1.add(rSButtonRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 197, -1));

        jLabel2.setText("Sistema de Ingreso de Alumnos");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 180, 20));

        rSLabelImage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/foto1.png"))); // NOI18N
        panelRound1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 420, 500));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordar contraseña");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panelRound1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 270, -1));
        panelRound1.add(txtmensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 260, 20));

        panelRound3.setBackground(new java.awt.Color(243, 241, 255));
        panelRound3.setBorderWidth(0);
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(26);
        panelRound3.setRoundTopRight(25);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/lock.png"))); // NOI18N
        panelRound3.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

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
        panelRound3.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, -10, 220, 68));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 280, 50));

        panelRound5.setBorderColor(new java.awt.Color(255, 255, 255));
        panelRound5.setBorderWidth(0);
        panelRound5.setRoundBottomLeft(25);
        panelRound5.setRoundBottomRight(25);
        panelRound5.setRoundTopLeft(25);
        panelRound5.setRoundTopRight(25);
        panelRound5.setShadowSize(3);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setBackground(new java.awt.Color(243, 241, 255));
        txtusuario.setForeground(new java.awt.Color(102, 102, 102));
        txtusuario.setAutoscrolls(false);
        txtusuario.setBordeColorFocus(new java.awt.Color(255, 255, 255));
        txtusuario.setBordeColorNoFocus(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Roboto Bold", 1, 13)); // NOI18N
        txtusuario.setHighlighter(null);
        txtusuario.setMargin(new java.awt.Insets(0, 10, 0, 10));
        txtusuario.setPlaceholder("Ingresear usuario");
        panelRound5.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 220, 70));

        rSLabelImage3.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/user.png"))); // NOI18N
        panelRound5.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        panelRound1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound3ActionPerformed
   String conectar = "";
String usuario = txtusuario.getText();
String contraseña = txtpass.getText();

if (usuario.isEmpty() || contraseña.isEmpty()) {
    txtmensaje.setText("Ingrese todos los campos");
    txtmensaje.setForeground(Color.red);
} else {
    txtmensaje.setForeground(Color.green);

    try {
        conectar = Conexion.ProcedimientosLogin.validarUsuario(usuario, contraseña);
        System.out.println(conectar);
        if (conectar.equals("Login successful")) {
            txtmensaje.setText("Inicio de sesión exitoso");
            txtmensaje.setForeground(Color.green);
            cambiarVentanas(this, new Ventana_Principal());
        } else {
            txtmensaje.setText("Usuario o contraseña incorrectos");
            txtmensaje.setForeground(Color.red);
        }

    } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        txtmensaje.setText("Error al conectar a la base de datos");
        txtmensaje.setForeground(Color.red);
    }
}

  
    }//GEN-LAST:event_rSButtonRound3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Ventana.PanelRound panelRound1;
    private Ventana.PanelRound panelRound3;
    private Ventana.PanelRound panelRound5;
    private rojerusan.RSButtonRound rSButtonRound3;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rsscalelabel.RSScaleLabel rSScaleLabel1;
    private javax.swing.JLabel txtmensaje;
    private rojerusan.RSMetroTextPassPlaceHolder txtpass;
    private LIB.FSTexFieldMD txtusuario;
    // End of variables declaration//GEN-END:variables
}
