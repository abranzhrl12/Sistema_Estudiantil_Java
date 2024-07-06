/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Conexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *yaaa
 * @author STEFANY isdfhsdbhfikisdddddddddddddddddddddddouuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuud
 */
public class conexion {
    
  private static String bd = "sistema_salazar";
    private static String url = "jdbc:mysql://localhost:3306/" + bd;
    private static String usuario = "root";
    private static String clave = "123456";
    private static Connection con;
    private static PreparedStatement stpp;
    private static ResultSet rs;
      
       public static  Connection conectar(){      
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
       
       }

       

