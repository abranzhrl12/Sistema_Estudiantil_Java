
package Controlador;

import Modelo.ProgramaEstudio;
import Modelo.RegistroProgramaEstudio;
import Modelo.conexion;
import Vista.Frm_R_Prog_Estudio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 *
 * @author Abraham
 */
public class ControladorPrograma {
 private RegistroProgramaEstudio registroPrograma;
    private Frm_R_Prog_Estudio programa;
    
    public ControladorPrograma(Frm_R_Prog_Estudio programa) {
        this.registroPrograma = new RegistroProgramaEstudio();
        this.programa = programa;
    }
    
    public String registrarPrograma() {
        try {
            return registroPrograma.registrarPrograma(programa.getCodigoPrograma(), programa.getNombrePrograma());
            
       } catch (SQLException e) {
           e.printStackTrace();
           return "Error al registrar el programa: " + e.getMessage();
       }
    }
   public List<ProgramaEstudio> obtenerTodosLosProgramas() {
        try {
            return registroPrograma.obtenerTodosLosProgramas();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
