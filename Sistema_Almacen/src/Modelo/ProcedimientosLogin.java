/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
public class ProcedimientosLogin extends conexion{
    
    
    public static String validarUsuario(String usuario, String contraseña) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conectar();
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
            cs.setString(10, fechaMatricula);
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

    public static String RegistrarEmpleado(
            String codigo,
            String DNI,
            String nombre,
            String apellidos,
            String FechaNacimiento,
            String Telefono,
            String Usuario,
            String Contraseña,
            String codigoTipoEmpleado
    ) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String Resultado = "";

        try {

            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarEmpleado(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, DNI);
            cs.setString(3, nombre);
            cs.setString(4, apellidos);
            cs.setString(5, FechaNacimiento);
            cs.setString(6, Telefono);
            cs.setString(7, Usuario);
            cs.setString(8, Contraseña);
            cs.setString(9, codigoTipoEmpleado);

            cs.registerOutParameter(3, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();

            Resultado = cs.getString(3);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }

        }

        return Resultado;
    }

    public static String registrarMovilidad(String codigo, String placa, String color, String descripcion, String codTipoM, String codEstudiante) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";


        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarMovilidad(?,?,?,?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, placa);
            cs.setString(3, color);
            cs.setString(4, descripcion);
            cs.setString(5, codTipoM);
            cs.setString(6, codEstudiante);
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

    public static String registrarProgramaDeEstudio(String codigo, String nombre) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarProgramaDeEstudio(?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, nombre);

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

    public static String registroIngreso(String codigo, String Hora, String fechaIngreso, String codEstudiante) throws SQLException {

        CallableStatement cs = null;
        Connection con = null;
        String Resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarIngreso(?,?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, Hora);
            cs.setString(3, fechaIngreso);
            cs.setString(4, codEstudiante);

            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            Resultado = cs.getString(3);


        } finally {

            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();

            }

        }
        return Resultado;
    }


    public static  String registroDeParqueo(String codigoR, String Hora, String fechaIngreso, String Observacion, String codMovilidad, String codEmpleado) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String Resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarIngreso(?,?,?,?,?,?)}");
            cs.setString(1, codigoR);
            cs.setString(2, Hora);
            cs.setString(3, fechaIngreso);
            cs.setString(4, Observacion);
            cs.setString(5, codMovilidad);
            cs.setString(6, codEmpleado);

            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();
            Resultado = cs.getString(3);

        } finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();

            }
            return Resultado;
        }
    }

    public static String registrarTipoEmpleado(String codigo, String nombre, String descripcion) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarTipoEmpleado(?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, nombre);
            cs.setString(3, descripcion);
            cs.registerOutParameter(3, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            resultado = cs.getString(3);

        }finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }


        return resultado;

    }


    public static String regitrarTipoMovilidad(String codigo, String nombre) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String resultado = "";

        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarTipoMovilidad(?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, nombre);

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
    
    public static String Turno(String codigo , String nombre,String horaInicio,String horaFin) throws SQLException {
        CallableStatement cs = null;
        Connection con = null;
        String Resultado = "";
        
        try {
            con = conexion.conectar();
            cs = con.prepareCall("{call RegistrarTurno(?,?,?,?)}");
            cs.setString(1, codigo);
            cs.setString(2, nombre);
            cs.setString(3, horaInicio);
            cs.setString(4, horaFin);
            cs.registerOutParameter(3, Types.VARCHAR); // Registro del parámetro de salida
            cs.execute();
            Resultado = cs.getString(3);
            
        }finally {
            if (cs != null) {
                cs.close();
            }
            if (con != null) {
                con.close();
            }
        }
        
        return Resultado;
    }
    
    
}
