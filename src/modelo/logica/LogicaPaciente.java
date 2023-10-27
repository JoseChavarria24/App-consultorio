/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logica;

import controlador.Coordinador;
import modelo.dao.DaoPaciente;
import modelo.vo.Paciente;

/**
 *
 * @author alejb
 */

/*
Falta completar esta clase y hacer DAOClinicaTerapia para que funcione
*/


public class LogicaPaciente {
    DaoPaciente daoPaciente = new DaoPaciente();
    
    Coordinador coordinador = null;
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    public void logica_agregarPaciente(Paciente pac){
        daoPaciente.Dao_agregarPaciente(pac);
    }
    
    public void logica_modificarPaciente(Paciente pac){
        daoPaciente.Dao_modificarPaciente(pac);
    }
    
    public void logica_eliminarPaciente(Paciente pac){
        daoPaciente.Dao_eliminarPaciente(pac);
    }
}
