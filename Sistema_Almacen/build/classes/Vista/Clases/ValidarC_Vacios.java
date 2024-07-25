/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Abraham
 */
public class ValidarC_Vacios {
      public static boolean camposTextoVacios(JTextField... campos) {
        for (JTextField campo : campos) {
            if (campo.getText().trim().isEmpty()) {
                mostrarMensajeError("Por favor complete todos los campos.");
                return false;
            }
        }
        return true;
    }
      
    private static void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error de Validación", JOptionPane.ERROR_MESSAGE);
    }
}
