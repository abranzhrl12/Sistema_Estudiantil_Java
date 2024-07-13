
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
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import Vista.VentanaPrincipal;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class MetodosUtilidades {
  private JPanel glo;
  private JFrame frame;
    private Frm_R_Estudiante vistaEstudiante;
  private Timer timer;

    public MetodosUtilidades(Frm_R_Estudiante vistaEstudiante) {
        this.vistaEstudiante = vistaEstudiante;
   
    }
    
       public MetodosUtilidades(JFrame frame) {
        this.frame = frame;
    }
     //Metodo para ocultar y desocultar un panel
     public void LogicaPanel(JPanel jo,int ancho ,int alto) {
        if (jo.isVisible()) {
            jo.setVisible(false);
            jo.setPreferredSize(new Dimension(0, 0)); // Establece altura cero
        } else {
            jo.setPreferredSize(new Dimension(ancho, alto)); // Establece altura deseada
            jo.setVisible(true);
        }
     }
     
     //timer para ventana estudiante 
 public void initTimer(DateChooser dateChooser) {
        timer = new Timer(300, (evt) -> {
            SelectedDate selectedDate = dateChooser.getSelectedDate();
            if (selectedDate != null) {
                int day = selectedDate.getDay();
                int month = selectedDate.getMonth();
                int year = selectedDate.getYear();

                String fechaSeleccionada = year + "-" + month + "-" + day;

                // Actualizar el texto en lblfechaNacimiento en el EDT
                SwingUtilities.invokeLater(() -> {
                  vistaEstudiante.getfechaNacimiento().setText(fechaSeleccionada);
                });
            }
        });
        timer.start(); // Inicia el Timer
    }
 
 //codigo generar qr ventana estudiante
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
   
  //metodo para traer paneles de jframes
        public void actualizarPanel(JPanel contenedor, JPanel formulario) {
        contenedor.removeAll();
        formulario.show();
        formulario.setSize(contenedor.getSize());
        contenedor.add(formulario, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = formulario;
    }
        
        
        // Método para configurar el MouseListener en un JPanel y sus componentes hijos
    public void configurarMouseListener(JPanel panel, Runnable onClick) {
        MouseAdapter mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Lógica para manejar el clic
                onClick.run();
            }
        };
        // Agregar el MouseListener al panel
        panel.addMouseListener(mouseListener);
        // Agregar el MouseListener a todos los componentes hijos del panel
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JComponent) {
                ((JComponent) comp).addMouseListener(mouseListener);
            }
        }
    }
}


 