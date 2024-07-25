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
public class ProcedimientosRegistroIngreso {
    
       // Método estático para registrar el ingreso de un estudiante con confirmación
    public static String registrarIngreso(String codEstudiante) throws SQLException {
        String resultado = "";
        String sql = "{ CALL RegistrarIngreso(?, ?) }"; // Asume que el procedimiento almacenado tiene un parámetro de salida

        // Uso de try-with-resources para asegurar que la conexión y el CallableStatement se cierran adecuadamente
        try (Connection con = conexion.conectar();  // Asegúrate de que este método conecta a tu base de datos
             CallableStatement cs = con.prepareCall(sql)) {
            
            cs.setString(1, codEstudiante); // Establece el código del estudiante en el primer parámetro
            cs.registerOutParameter(2, Types.VARCHAR); // Registra el segundo parámetro como de salida
            cs.execute(); // Ejecuta el procedimiento almacenado
            resultado = cs.getString(2); // Obtiene el resultado del parámetro de salida
            
        } // Los recursos se cierran automáticamente aquí

        return resultado;
    }
}


