
package Controlador;

import Modelo.ProcedimientosRegistroEntrada;
import java.sql.SQLException;

public class ControladorRegistroEntrada {
   public String registrarIngreso(String cod_Estudiante, String Fecha_Reg, String Hora) {
        String resultado = "";
        try {
            resultado = ProcedimientosRegistroEntrada.registrarIngresoEstudiante(cod_Estudiante, Fecha_Reg, Hora);
        } catch (SQLException e) {
            e.printStackTrace();
            resultado = "Error al registrar el ingreso del estudiante: " + e.getMessage();
        }
        return resultado;
    } 
}
