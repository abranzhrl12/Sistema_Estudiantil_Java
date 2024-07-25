
package Controlador;


import java.sql.SQLException;
import Modelo.ProcedimientosRegistroIngreso;
import Vista.ReadQrcode;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class ControladorRegistroIngreso {
  private ReadQrcode vistaIngreso;
  private String lectura="";
 private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public ControladorRegistroIngreso(ReadQrcode vistaIngreso) {
        this.vistaIngreso = vistaIngreso;
        addDocumentListenerToTextField();
    }

    private void addDocumentListenerToTextField() {
        vistaIngreso.getResultField().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                processTextChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                processTextChange();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                processTextChange();
            }

            private void processTextChange() {
                String codEstudiante = vistaIngreso.getCodigo();
                
                if (!codEstudiante.isEmpty() && !codEstudiante.equals(lectura)) {
                    try {
                        String resultado = ProcedimientosRegistroIngreso.registrarIngreso(codEstudiante);
                        lectura=codEstudiante;
                        SwingUtilities.invokeLater(() -> vistaIngreso.limpiarCodigo());
                        vistaIngreso.limpiarCodigo();// Limpia el campo después de procesar
                          vistaIngreso.result_field.setText("");
                        
                        System.out.println(resultado);  // O mostrar el resultado en la GUI
                            scheduler.schedule(() -> {
                            lectura = "";
                        }, 10, TimeUnit.SECONDS);
                    } catch (SQLException e) {
                        System.err.println("Error en la base de datos al registrar el ingreso: " + e.getMessage());
                    }
                }
            }
        });
    }

    public String registrarIngreso() {
        String codEstudiante = vistaIngreso.getCodigo();
        try {
            return ProcedimientosRegistroIngreso.registrarIngreso(codEstudiante);
        } catch (SQLException e) {
            System.err.println("Error en la base de datos al registrar el ingreso: " + e.getMessage());
            return "Error en la base de datos al registrar el ingreso.";
        }
    }
}

