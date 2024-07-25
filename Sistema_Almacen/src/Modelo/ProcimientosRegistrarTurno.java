
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;


public class ProcimientosRegistrarTurno {

    
 public static String registrarTurno(
    String cod_Turno,
    String Nombre,
    String Hora_Inicio,
    String Hora_Fin
) throws SQLException {

    String resultado = "";
    // Uso de try-with-resources para asegurar que todos los recursos se cierran adecuadamente
    try (Connection con = conexion.conectar();  // Asegúrate de que este método conecta a tu base de datos
         CallableStatement cs = con.prepareCall("{call RegistrarTurno(?,?,?,?,?)}")) {
        
        cs.setString(1, cod_Turno);
        cs.setString(2, Nombre);
        cs.setString(3, Hora_Inicio);
        cs.setString(4, Hora_Fin);
        cs.registerOutParameter(5, Types.VARCHAR); // Registro del parámetro de salida
        cs.execute();
        resultado = cs.getString(5); // Recuperar el resultado del parámetro de salida
        
    } // Los recursos se cierran automáticamente aquí

    return resultado;
}  
  
  // Método para traer todos los turnos
    public static List<Turno> obtenerTodosLosTurnos() throws SQLException {
        List<Turno> turnos = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = conexion.conectar(); // Asegúrate de que este método conecta a tu base de datos
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT cod_Turno, Nombre, Hora_Inicio, Hora_Fin FROM turno");

            while (rs.next()) {
                String cod_Turno = rs.getString("cod_Turno");
                String nombre = rs.getString("Nombre");
                String hora_Inicio = rs.getString("Hora_Inicio");
                String hora_Fin = rs.getString("Hora_Fin");
                Turno turno = new Turno(cod_Turno, nombre, hora_Inicio, hora_Fin);
                turnos.add(turno);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return turnos;
    }
}
