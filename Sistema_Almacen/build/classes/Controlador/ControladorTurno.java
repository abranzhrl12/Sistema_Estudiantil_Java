/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.ProcimientosRegistrarTurno;

import Modelo.Turno;
import Vista.Frm_R_Turno;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Abraham
 */
public class ControladorTurno {
    private ProcimientosRegistrarTurno procimientosRegistrarTurno;
    private Frm_R_Turno turno;
    
    public ControladorTurno(Frm_R_Turno turno) {
        this.procimientosRegistrarTurno = new ProcimientosRegistrarTurno();
        this.turno = turno;
    }
    
    public String registrarTurno() {
        try {
            return procimientosRegistrarTurno.registrarTurno(turno.getCodigoTurno(), turno.getNombreTurno(), turno.getHoraInicialTurno(), turno.getHoraFinalTurno());
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al registrar el turno: " + e.getMessage();
        }
    }

    public List<Turno> obtenerTodosLosTurnos() {
        try {
            return procimientosRegistrarTurno.obtenerTodosLosTurnos();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
