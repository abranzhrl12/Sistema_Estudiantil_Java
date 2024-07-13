
package Controlador;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.Executors;
import javax.swing.JPanel;

/**
 *
 * @author Abraham
 */
public class ConfiguracionLectorQR {
      
    
    public void initWebcam(Webcam webcam, WebcamPanel panel, JPanel panelcamara) {
        try {
            List<Webcam> webcams = Webcam.getWebcams();
            if (webcams.isEmpty()) {
                throw new RuntimeException("No se encontró ninguna cámara web.");
            }

            Dimension size = WebcamResolution.VGA.getSize();
            webcam = webcams.get(0);
            webcam.setViewSize(size);
            panel = new WebcamPanel(webcam);
            panel.setPreferredSize(size);
            panel.setFPSDisplayed(true);
            panelcamara.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            panelcamara.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

            Executors.newSingleThreadExecutor().submit(() -> {
            });
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null, "Error inicializando la cámara web: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}
