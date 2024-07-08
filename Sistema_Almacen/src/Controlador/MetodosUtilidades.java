
package Controlador;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import Vista.Frm_R_Estudiante;
import com.raven.datechooser.DateChooser;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;
import com.raven.datechooser.SelectedDate;
import javax.swing.SwingUtilities;
public class MetodosUtilidades {

    
    private Frm_R_Estudiante vistaEstudiante;
  private Timer timer;

    public MetodosUtilidades(Frm_R_Estudiante vistaEstudiante) {
        this.vistaEstudiante = vistaEstudiante;
   
    }
     //Metodo para ocultar y desocultar un panel
     public void LogicaPanel(JPanel jo, int tamaño) {
        if (jo.isVisible()) {
            jo.setVisible(false);
            jo.setPreferredSize(new Dimension(jo.getWidth(), 0)); // Establece altura cero
        } else {
            jo.setPreferredSize(new Dimension(264, tamaño)); // Establece altura deseada
            jo.setVisible(true);
        }
     }
     
 public void initTimer(DateChooser dateChooser) {
        timer = new Timer(300, (evt) -> {
            SelectedDate selectedDate = dateChooser.getSelectedDate();
            if (selectedDate != null) {
                int day = selectedDate.getDay();
                int month = selectedDate.getMonth();
                int year = selectedDate.getYear();

                String fechaSeleccionada = day + "-" + month + "-" + year;

                // Actualizar el texto en lblfechaNacimiento en el EDT
                SwingUtilities.invokeLater(() -> {
                  vistaEstudiante.getfechaNacimiento().setText(fechaSeleccionada);
                });
            }
        });
        timer.start(); // Inicia el Timer
    }
   public void generarQR(String codigo, String directorio) {
        int size = 800;
        String fileType = "png";

        QRCodeWriter qrcode = new QRCodeWriter();
        try {
            BitMatrix matrix = qrcode.encode(vistaEstudiante.getDni(), BarcodeFormat.QR_CODE, size, size);
            File f = new File(directorio + "/" + vistaEstudiante.getCodigo() + "." + fileType);
            int matrixWidth = matrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);

            Graphics2D qd = (Graphics2D) image.getGraphics();
            qd.setColor(Color.WHITE);
            qd.fillRect(0, 0, matrixWidth, matrixWidth);
            qd.setColor(Color.blue);

            for (int i = 0; i < matrixWidth; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (matrix.get(i, j)) {
                        qd.fillRect(i, j, 1, 1);
                    }
                }
            }

            ImageIO.write(image, fileType, f);
            System.out.println("Código QR generado exitosamente en: " + f.getAbsolutePath());
           
  ImageIcon mIcono = new ImageIcon(image.getScaledInstance(vistaEstudiante.getLblqr().getWidth(), vistaEstudiante.getLblqr().getHeight(), Image.SCALE_SMOOTH));

            vistaEstudiante.getLblqr().setIcon(mIcono);
        } catch (WriterException | IOException ex) {
            Logger.getLogger(MetodosUtilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
  
    
}


 