
package Controlador;


import java.sql.SQLException;
import Modelo.ProcedimientosRegistroIngreso;
import Vista.ReadQrcode;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class ControladorRegistroIngreso {
    private ReadQrcode vistaIngreso;

 

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
                if (!codEstudiante.isEmpty()) {
                    try {
                        String resultado = ProcedimientosRegistroIngreso.registrarIngreso(codEstudiante);
                        vistaIngreso.limpiarCodigo();  // Limpia el campo después de procesar
                        System.out.println(resultado);  // O mostrar el resultado en la GUI
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

