

package Controlador;

import Modelo.ProcedimietosEstudiante;
import Vista.Frm_R_Estudiante;
import java.sql.SQLException;
import java.util.Date;

public class ControladorEstudiante {
    private ProcedimietosEstudiante procedimietnosestudiantes;
    private Frm_R_Estudiante estudiante;
    
        public ControladorEstudiante(Frm_R_Estudiante estudiante) {
        this.procedimietnosestudiantes = new ProcedimietosEstudiante();
        this.estudiante = estudiante;
         }

  public String registrarEstudiante() {
        try {
            String fechaNacimiento = estudiante.getFecha_Nacimiento();
            return procedimietnosestudiantes.registrarEstudiante(
                    estudiante.getCodigo(), 
                    estudiante.getDni(),
                    estudiante.getNomEstudiante(),
                    estudiante.getapePaterno(),
                    estudiante.getapeMaterno(), 
                    estudiante.getSexo(),
                    fechaNacimiento , 
                    estudiante.getRuta(),
                    estudiante.getSemestre(),
                    null,
                    estudiante.getPrograma(),
                    estudiante.getTurno());
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al registrar el estudiante: " + e.getMessage();
        }
    }
}
