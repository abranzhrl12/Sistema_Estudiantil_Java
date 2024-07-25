

package Modelo;

import java.sql.*;

public class conexion {

    //holaa
    //-abraham---sistema_salazar
    //-clave--123456
    private static String bd = "bdsistemaingresos";
    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    private static String usuario = "root";
    private static String clave = "12345678";
    private static Connection con;
   
    
    public conexion() {
    }
    
    public conexion(String bd, String usuario,String clave ){
        this.bd = bd;
        this.usuario = usuario;
        this.clave = clave;
    }
    
   public static Connection conectar() {
        try {
            con = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
     
  public static void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
     
     public static ResultSet getConsulta(String consulta) {
         
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(consulta)) {
            System.out.println("Consulta ejecutada correctamente.");
            return rs; // Este retorno puede llevar problemas porque el ResultSet se cierra al salir del try.
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            return null;
        }
        
    }  
}
