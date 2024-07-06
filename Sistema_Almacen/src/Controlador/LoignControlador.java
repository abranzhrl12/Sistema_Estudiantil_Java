
package Controlador;

import Modelo.ProcedimientosLogin;
import Vista.Login;
import Vista.Ventana_Principal;
import java.sql.SQLException;
import javax.swing.JFrame;

public class LoignControlador {
  private ProcedimientosLogin procedimientosLogin; // Variable para referencia al modelo
    private Login loginView; // Referencia a la vista

    public LoignControlador(Login loginView) {
        this.procedimientosLogin = new ProcedimientosLogin();
        this.loginView = loginView;
    }

    public void validarCredenciales() {
        String usuario = loginView.getUsuario(); // Obtener usuario desde la vista
        String contraseña = loginView.getContraseña(); // Obtener contraseña desde la vista
        
        try {
            String resultado = procedimientosLogin.validarUsuario(usuario, contraseña);
            loginView.setResultado(resultado);
            if(resultado.equals("Login successful")){
                cambiarVentanas(loginView, new Ventana_Principal());
            }
        } catch (SQLException e) {
            // Manejo de excepciones, por ejemplo, registrando o lanzando una excepción
            e.printStackTrace();
            // Aquí podrías mostrar un mensaje de error en la vista si ocurre un error de SQL
            loginView.setResultado("Error en la validación: " + e.getMessage());
        }
    }
      
         public static void cambiarVentanas(JFrame ventanaActual, JFrame ventanaSiguiente) {
          ventanaActual.setVisible(false);
         ventanaSiguiente.setVisible(true);
        }
      
}
