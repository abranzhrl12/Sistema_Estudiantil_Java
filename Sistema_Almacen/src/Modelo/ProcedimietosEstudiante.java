
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedimietosEstudiante {
   public static String registrarEstudiante(
        String cod_Estudiante,
        String DNI,
        String Nombre,
        String Ape_Paterno,
        String Ape_Materno,
        String Sexo,
        String Fecha_Nacimiento,
        String RutaImgQR,
        String Semestre,
        String Fecha_Matricula,
        String cod_Programa
    ) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";
        try {
            con = conexion.conectar(); // Asegúrate de que este método conecta a tu base de datos
            cs = con.prepareCall("{call RegistrarEstudiante(?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, cod_Estudiante);
            cs.setString(2, DNI);
            cs.setString(3, Nombre);
            cs.setString(4, Ape_Paterno);
            cs.setString(5, Ape_Materno);
            cs.setString(6, Sexo);
            cs.setString(7, Fecha_Nacimiento);
            cs.setString(8, RutaImgQR);
            cs.setString(9, Semestre);
            cs.setString(10, Fecha_Matricula);
            cs.setString(11, cod_Programa);
            cs.registerOutParameter(12, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(12);
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
