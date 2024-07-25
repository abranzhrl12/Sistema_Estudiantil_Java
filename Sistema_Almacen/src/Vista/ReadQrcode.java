
package Vista;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ReadQrcode extends javax.swing.JFrame implements Runnable,ThreadFactory{
    private WebcamPanel panel=null;
    private Webcam webcam=null;
    private Executor executor=Executors.newSingleThreadExecutor(this);
    public ReadQrcode() {
        initComponents();
       new Controlador.ConfiguracionLectorQR().initWebcam(webcam, panel, panelCamara);
       
      
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lectorQRPanel = new Vista.Clases.JpanelRound();
        panelCamara = new javax.swing.JPanel();
        result_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lectorQRPanel.setBackground(new java.awt.Color(255, 255, 204));

        panelCamara.setBackground(new java.awt.Color(255, 255, 255));
        panelCamara.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("RESULT:");

        javax.swing.GroupLayout lectorQRPanelLayout = new javax.swing.GroupLayout(lectorQRPanel);
        lectorQRPanel.setLayout(lectorQRPanelLayout);
        lectorQRPanelLayout.setHorizontalGroup(
            lectorQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lectorQRPanelLayout.createSequentialGroup()
                .addGroup(lectorQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lectorQRPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(panelCamara, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lectorQRPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(lectorQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lectorQRPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(result_field, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        lectorQRPanelLayout.setVerticalGroup(
            lectorQRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lectorQRPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panelCamara, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(result_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel1.add(lectorQRPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 760, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadQrcode().setVisible(true);
            }
        });
    }

  


    
    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ReadQrcode.class.getName()).log(Level.SEVERE, null, ex);
            }

            BufferedImage image = webcam.getImage();
            if (image == null) {
                continue;
            }

            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            Result result = null;

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException ex) {
                Logger.getLogger(ReadQrcode.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (result != null) {
                String text = result.getText();
                SwingUtilities.invokeLater(() -> result_field.setText(text));
            }
        } while (true);
    }
    
@Override
public Thread newThread(Runnable r){
    Thread t=new Thread(r,"My Thread");
    System.out.println("hola22");
    t.setDaemon(true);
    return t; 
}
   public String getCodigo() {
        return result_field.getText();
    }

    public void limpiarCodigo() {
        result_field.setText("");
    }

    public JTextField getResultField() {
        return result_field;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public Vista.Clases.JpanelRound lectorQRPanel;
    private javax.swing.JPanel panelCamara;
    private javax.swing.JTextField result_field;
    // End of variables declaration//GEN-END:variables
}
