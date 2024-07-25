
package Controlador;

import java.util.List;
import Modelo.ProcedimientosEmpleados;
import Modelo.Empleado;
import java.sql.SQLException;

/**
 *
 * @author Abraham
 */
public class ControladorEmpleado {
    public static String registrarEmpleado(
            String Nombre,
            String Apellidos,
            String Fecha_Nacimiento,
            String Telefono,
            String Usuario,
            String Contrasena,
            String cod_Tipo
    ) {
        try {
            return ProcedimientosEmpleados.registrarEmpleado(Nombre, Apellidos, Fecha_Nacimiento, Telefono, Usuario, Contrasena, cod_Tipo);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
    
   public static List<Empleado> obtenerEmpleados() {
        try {
            return ProcedimientosEmpleados.obtenerEmpleados();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
   
   
    public static String eliminarEmpleado(String cod_Empleado) {
        try {
            return ProcedimientosEmpleados.eliminarEmpleado(cod_Empleado);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
    
     public static String modificarEmpleado(
            String cod_Empleado,
            String Nombre,
            String Apellidos,
            String Fecha_Nacimiento,
            String Telefono,
            String Usuario,
            String Contrasena,
            String cod_Tipo
    ) {
        try {
            return ProcedimientosEmpleados.modificarEmpleado(cod_Empleado, Nombre, Apellidos, Fecha_Nacimiento, Telefono, Usuario, Contrasena, cod_Tipo);
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
