
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProcedimietosEstudiante {
     private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

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
        String cod_Programa,
        String cod_Turno
    ) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";
        try {
            con = conexion.conectar(); // Asegúrate de que este método conecta a tu base de datos
            cs = con.prepareCall("{call RegistrarEstudiante(?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            java.sql.Date sqlFechaNacimiento = null;
            if (Fecha_Nacimiento != null && !Fecha_Nacimiento.isEmpty()) {
                try {
                    java.util.Date utilFechaNacimiento = dateFormat.parse(Fecha_Nacimiento);
                    sqlFechaNacimiento = new java.sql.Date(utilFechaNacimiento.getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                    throw new SQLException("Error al parsear la fecha de nacimiento.");
                }
            }

            java.sql.Date sqlFechaMatricula = null;
            if (Fecha_Matricula != null && !Fecha_Matricula.isEmpty()) {
                try {
                    java.util.Date utilFechaMatricula = dateFormat.parse(Fecha_Matricula);
                    sqlFechaMatricula = new java.sql.Date(utilFechaMatricula.getTime());
                } catch (ParseException e) {
                    e.printStackTrace();
                    throw new SQLException("Error al parsear la fecha de matrícula.");
                }
            }

            cs.setString(1, cod_Estudiante);
            cs.setString(2, DNI);
            cs.setString(3, Nombre);
            cs.setString(4, Ape_Paterno);
            cs.setString(5, Ape_Materno);
            cs.setString(6, Sexo);
            if (sqlFechaNacimiento != null) {
                cs.setDate(7, sqlFechaNacimiento);
            } else {
                cs.setNull(7, Types.DATE);
            }
            cs.setString(8, RutaImgQR);
            cs.setString(9, Semestre);
            if (sqlFechaMatricula != null) {
                cs.setDate(10, sqlFechaMatricula);
            } else {
                cs.setNull(10, Types.DATE);
            }
            cs.setString(11, cod_Programa);
            cs.setString(12, cod_Turno);
            cs.registerOutParameter(13, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(13);
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
