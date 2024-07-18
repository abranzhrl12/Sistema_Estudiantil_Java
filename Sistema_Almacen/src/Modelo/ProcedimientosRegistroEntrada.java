package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
public class ProcedimientosRegistroEntrada {
    
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static String registrarIngresoEstudiante(
        String cod_Estudiante,
        String Fecha_Reg,
        String Hora
    ) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";
        try {
            con = conexion.conectar();  // Asegúrate de que este método conecta a tu base de datos
            cs = con.prepareCall("{call RegistrarIngresoEstudiante(?,?,?,?)}");

            java.sql.Date sqlFechaReg = null;
            java.sql.Time sqlHoraReg = null;

            try {
                if (Fecha_Reg != null && !Fecha_Reg.isEmpty()) {
                    java.util.Date utilFechaReg = dateFormat.parse(Fecha_Reg);
                    sqlFechaReg = new java.sql.Date(utilFechaReg.getTime());
                }
            } catch (ParseException e) {
                throw new SQLException("Error al parsear la fecha de registro.", e);
            }

            try {
                if (Hora != null && !Hora.isEmpty()) {
                    sqlHoraReg = java.sql.Time.valueOf(Hora);
                }
            } catch (IllegalArgumentException e) {
                throw new SQLException("Error al parsear la hora de registro.", e);
            }

            cs.setString(1, cod_Estudiante);
            if (sqlFechaReg != null) {
                cs.setDate(2, sqlFechaReg);
            } else {
                cs.setNull(2, Types.DATE);
            }
            if (sqlHoraReg != null) {
                cs.setTime(3, sqlHoraReg);
            } else {
                cs.setNull(3, Types.TIME);
            }

            cs.registerOutParameter(4, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(4);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
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
