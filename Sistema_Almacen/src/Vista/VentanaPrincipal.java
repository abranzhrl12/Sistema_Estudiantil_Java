
package Vista;

import FiveCodMover.FiveCodMoverJFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Abraham
 */
public class VentanaPrincipal extends javax.swing.JFrame {

//     Vista.Clases.SimpleTitleBar barra2=new Vista.Clases.SimpleTitleBar();
//         Controlador.MetodosUtilidades metodos=new Controlador.MetodosUtilidades(this);
 
    public VentanaPrincipal() {
        
        initComponents();
         this.setBackground(new Color(0,0,0,0));
         this.setLocationRelativeTo(null);
//          inicializarMouseListeners();
//     barra2.init(this);
//     pRegistrarEstudiante.setVisible(false);
     
    }
//private void inicializarMouseListeners() {
//        metodos.configurarMouseListener(btnRegistrarEstudiante, () -> {
//            
//            metodos.actualizarPanel(PanelPrincipal,new Frm_R_Estudiante().panel_r_3);
//        }, Arrays.asList(new JComponent[]{ jLabel12}));
//
//        metodos.configurarMouseListener(btnLectorQR, () -> {
//            ReadQrcode readQR = new ReadQrcode();
//            metodos.actualizarPanel(PanelPrincipal, readQR.lectorQRPanel);
//        }, Arrays.asList(new JComponent[]{ /* Agregar aquí los componentes a ignorar */ }));
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1207, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
