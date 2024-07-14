
package Controlador;

import Modelo.ProgramaEstudio;
import Modelo.RegistroProgramaEstudio;
import Vista.Frm_R_Prog_Estudio;
import java.sql.SQLException;
import java.util.List;

public class ControladorPrograma {
 private RegistroProgramaEstudio registroPrograma;
    private Frm_R_Prog_Estudio programa;
    
    public ControladorPrograma(Frm_R_Prog_Estudio programa) {
        this.registroPrograma = new RegistroProgramaEstudio();
        this.programa = programa;
    }
    
 public String registrarPrograma() {
     return registroPrograma.registrarPrograma(programa.getCodigoPrograma(), programa.getNombrePrograma());
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
