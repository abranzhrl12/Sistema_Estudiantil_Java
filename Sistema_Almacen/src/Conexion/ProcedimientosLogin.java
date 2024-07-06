/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;
public class ProcedimientosLogin {
    public static String validarUsuario(String usuario, String contraseña) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = Conexion.conexion.conectar();
            cs = con.prepareCall("{call ValidateLogin(?,?,?)}");
            cs.setString(1, usuario);
            cs.setString(2, contraseña);
            cs.registerOutParameter(3, Types.VARCHAR); // Registro del parámetro de salida

            cs.execute();

            resultado = cs.getString(3); // Obtener el valor del parámetro de salida

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
