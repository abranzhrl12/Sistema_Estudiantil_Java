
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
  private String dni="";
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
                dni = vistaIngreso.getCodigo();
                
                if (!dni.isEmpty() && !dni.equals(lectura)) {
                    try {
                        
                    String codEstudiante = ProcedimientosRegistroIngreso.obtenerCodEstudiantePorDni(dni);
                        
                          if (!codEstudiante.equals("NO ENCONTRADO")) {
                            String resultado = ProcedimientosRegistroIngreso.registrarIngreso(codEstudiante);
                            lectura = dni;
                            SwingUtilities.invokeLater(() -> vistaIngreso.limpiarCodigo()); // Limpia el campo después de procesar
                            System.out.println(resultado);  // O mostrar el resultado en la GUI

                            // Programar la limpieza de 'lectura' después de 10 segundos
                            scheduler.schedule(() -> {
                                lectura = "";
                            }, 10, TimeUnit.SECONDS);
                        } else {
                            System.out.println("Estudiante no encontrado");
                        }
                       
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

