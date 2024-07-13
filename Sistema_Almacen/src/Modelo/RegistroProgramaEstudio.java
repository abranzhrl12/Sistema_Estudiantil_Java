
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class RegistroProgramaEstudio {
    
       public static String registrarPrograma(
        String cod_Programa,
        String Nombre
    ) throws SQLException {
        
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";
        try {
            con = conexion.conectar(); // Asegúrate de que este método conecta a tu base de datos
            cs = con.prepareCall("{call RegistrarPrograma(?,?,?)}");
            cs.setString(1, cod_Programa);
            cs.setString(2, Nombre);
            cs.registerOutParameter(3, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(3);
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
       
       // Método para traer todos los programas
    public static List<ProgramaEstudio> obtenerTodosLosProgramas() throws SQLException {
        List<ProgramaEstudio> programas = new ArrayList<>();
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            con = conexion.conectar(); // Asegúrate de que este método conecta a tu base de datos
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT cod_Programa, Nombre FROM programa_estudio");

            while (rs.next()) {
                String cod_Programa = rs.getString("cod_Programa");
                String nombre = rs.getString("Nombre");
                ProgramaEstudio programa = new ProgramaEstudio(cod_Programa, nombre);
                programas.add(programa);
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

        return programas;
    }
}
