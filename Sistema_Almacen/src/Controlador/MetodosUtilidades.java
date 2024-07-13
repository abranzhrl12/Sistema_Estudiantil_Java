
package Controlador;

import Vista.Frm_R_Estudiante;
import Vista.VentanaPrincipal;
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

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MetodosUtilidades {

    private JPanel glo;
    private JFrame frame;
    private Frm_R_Estudiante vistaEstudiante;
    private Timer timer;
    private VentanaPrincipal ventanaPrincipal;
    private Animator animator;

    public MetodosUtilidades(Frm_R_Estudiante vistaEstudiante) {
        this.vistaEstudiante = vistaEstudiante;

    }

    public MetodosUtilidades(JFrame frame) {
        this.frame = frame;
    }

    public MetodosUtilidades(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    //Metodo para ocultar y desocultar un panel
    public void LogicaPanel(JPanel jo, int ancho, int alto) {
        if (animator != null && animator.isRunning()) {
            return;
        }

        boolean expanding = !jo.isVisible();
        int startHeight = jo.getHeight();
        int endHeight = expanding ? alto : 0;

        // Determinar la duración de la animación en función de la altura del panel
        int duration;
        if (alto <= 100) {
            duration = 300;
        } else if (alto <= 300) {
            duration = 500;
        } else if (alto <= 500) {
            duration = 600;
        } else {
            duration = 1000; // Default duration for heights greater than 500
        }

        animator = new Animator(duration); // Duración de la animación en milisegundos
        animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                int newHeight = startHeight + (int) ((endHeight - startHeight) * fraction);
                jo.setPreferredSize(new Dimension(ancho, newHeight));
                jo.revalidate();
                jo.repaint();
            }

            @Override
            public void end() {
                if (!expanding) {
                    jo.setVisible(false);
                }
            }

            @Override
            public void begin() {
                if (expanding) {
                    jo.setVisible(true);
                }
            }
        });
        animator.start();
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
        contenedor.setLayout(new BorderLayout()); // Asegúrate de usar BorderLayout
        contenedor.add(formulario, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

        contenedor.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension newSize = contenedor.getSize();
                formulario.setSize(newSize);
                formulario.revalidate();
                formulario.repaint();
            }
        });
    }

    public void actualizarInternalFrame(JDesktopPane desktopPane, JInternalFrame internalFrame) {
        desktopPane.add(internalFrame);
        internalFrame.setVisible(true);
        try {
            internalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    // Método para configurar el MouseListener en un JPanel y sus componentes hijos
//    public void configurarMouseListener(JPanel panel, Runnable onClick) {
//        MouseAdapter mouseListener = new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                // Lógica para manejar el clic
//                onClick.run();
//            }
//        };
//        // Agregar el MouseListener al panel
//        panel.addMouseListener(mouseListener);
//        // Agregar el MouseListener a todos los componentes hijos del panel
//        for (Component comp : panel.getComponents()) {
//            if (comp instanceof JComponent) {
//                ((JComponent) comp).addMouseListener(mouseListener);
//            }
//        }
//    }
    public void configurarMouseListener(JPanel panel, Runnable onClick, List<JComponent> ignoreComponents) {
        MouseAdapter mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Lógica para manejar el clic
                onClick.run();
            }
        };

        // Agregar el MouseListener al panel
        panel.addMouseListener(mouseListener);

        // Agregar el MouseListener a todos los componentes hijos del panel, excepto los que están en la lista ignoreComponents
        for (Component comp : panel.getComponents()) {
            if (comp instanceof JComponent && !ignoreComponents.contains(comp)) {
                ((JComponent) comp).addMouseListener(mouseListener);
            }
        }
    }

    public void ocultarComponentes(JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setVisible(false);
        }
    }
}
