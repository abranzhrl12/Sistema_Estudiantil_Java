/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * yaaa peeeeeeeeeeee
 *
 * @author STEFANY isdfhsdbhfikisdddddddddddddddddddddddouuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuud
 */
public class conexion {

    //holaa
    //-abraham---sistema_salazar
    //-clave--123456
    private static String bd = "sistema_salazar";
    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    private static String usuario = "root";
    private static String clave = "123456";
    private static Connection con;
    private static PreparedStatement stpp;
    private static ResultSet rs;
    
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
            if (con != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("No se pudo establecer conexión a la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
            e.printStackTrace();
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
     
     public static ResultSet getConsulta(String consulta) {
        ResultSet resultado = null;
        try {
            Statement stmt = con.createStatement();
            resultado = stmt.executeQuery(consulta);
            System.out.println("Consulta ejecutada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        } finally {
            
        }
        return resultado;
    }
     
     


    public static String getBd() {
        return bd;
    }

    public static void setBd(String bd) {
        conexion.bd = bd;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        conexion.url = url;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        conexion.usuario = usuario;
    }

    public static String getClave() {
        return clave;
    }

    public static void setClave(String clave) {
        conexion.clave = clave;
    }



   
}
