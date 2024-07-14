
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class ProcedimientosEmpleados {
    
      public static String registrarEmpleado(
            String Nombre,
            String Apellidos,
            String Fecha_Nacimiento,
            String Telefono,
            String Usuario,
            String Contrasena,
            String cod_Tipo
            ) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarEstudiante(?,?,?,?,?,?,?,?)}");
            cs.setString(1, Nombre);
            cs.setString(2, Apellidos);
            cs.setString(3, Fecha_Nacimiento);
            cs.setString(4, Telefono);
            cs.setString(5, Usuario);
            cs.setString(6, Contrasena);
            cs.setString(7, cod_Tipo);
            cs.registerOutParameter(8, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(8);

        } finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return resultado;
    }
  public static List<Empleado> obtenerEmpleados() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        CallableStatement cs = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = conexion.conectar();  // Asegúrate de que este método devuelve una conexión válida
            cs = con.prepareCall("{call ObtenerEmpleados()}");
            rs = cs.executeQuery();

            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCodEmpleado(rs.getString("cod_Empleado"));
                empleado.setNombre(rs.getString("Nombre"));
                empleado.setApellidos(rs.getString("Apellidos"));
                empleado.setFechaNacimiento(rs.getString("Fecha_Nacimiento"));
                empleado.setTelefono(rs.getString("Telefono"));
                empleado.setUsuario(rs.getString("Usuario"));
                empleado.setContrasena(rs.getString("Contrasena"));
                empleado.setCodTipo(rs.getString("cod_Tipo"));
                empleados.add(empleado);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return empleados;
    }
  // Método para eliminar un empleado
    public static String eliminarEmpleado(String cod_Empleado) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call EliminarEmpleado(?)}");
            cs.setString(1, cod_Empleado);
            cs.execute();
            resultado = "Empleado eliminado exitosamente";

        } finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return resultado;
    }

    // Método para modificar un empleado
    public static String modificarEmpleado(
            String cod_Empleado,
            String Nombre,
            String Apellidos,
            String Fecha_Nacimiento,
            String Telefono,
            String Usuario,
            String Contrasena,
            String cod_Tipo
    ) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call ModificarEmpleado(?,?,?,?,?,?,?,?)}");
            cs.setString(1, cod_Empleado);
            cs.setString(2, Nombre);
            cs.setString(3, Apellidos);
            cs.setString(4, Fecha_Nacimiento);
            cs.setString(5, Telefono);
            cs.setString(6, Usuario);
            cs.setString(7, Contrasena);
            cs.setString(8, cod_Tipo);
            cs.execute();
            resultado = "Empleado modificado exitosamente";

        } finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return resultado;
    }
}
