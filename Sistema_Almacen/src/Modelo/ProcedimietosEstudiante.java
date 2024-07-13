
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class ProcedimietosEstudiante {
    
        public static String registrarEstudiante(
            String codigo,
            String DNI,
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String Sexo,
            String fechaNacimiento,
            String Qr,
            String semestre,
            String fechaMatricula,
            String carrera,
            String turno) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarEstudiante(?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, DNI);
            cs.setString(3, nombre);
            cs.setString(4, apellidoPaterno);
            cs.setString(5, apellidoMaterno);
            cs.setString(6, Sexo);
            cs.setString(7, fechaNacimiento);
            cs.setString(8, Qr);
            cs.setString(9, semestre);
            cs.setString(11, carrera);
            cs.setString(12, turno);

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
}
