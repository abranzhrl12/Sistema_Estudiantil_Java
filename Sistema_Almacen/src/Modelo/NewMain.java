/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

/**
 *
 * @author jhoyb
 */
import java.sql.*;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        conexion conec = new conexion();
        conec.conectar();
        ResultSet rs = conec.getConsulta("SELECT * FROM sistema_registro.empleado;");
        
          while (rs.next()) {
    int id = rs.getInt(1);
    String nombre = rs.getString(2);
    String edad = rs.getString(3);

    System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
}
          
         conec.cerrarConexion();
        
    }
    
}
