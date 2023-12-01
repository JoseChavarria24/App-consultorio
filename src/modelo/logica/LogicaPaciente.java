/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logica;

import modelo.dao.DaoPacienteBD;
import modelo.vo.Paciente;
import controlador.Coordinador;




public class LogicaPaciente {
    DaoPacienteBD daoPaciente = new DaoPacienteBD();
    
    Coordinador coordinador = null;
    
    public void setCoordinador(Coordinador coordinador){
        this.coordinador = coordinador;
    }
    
    public Paciente agregarPacienteLogica(Paciente cte){
        return daoPaciente.agregarDAO(cte);
    }
    
    public int modificarDAO(Paciente paciente){
        return daoPaciente.modificarDAO(paciente);
    }
    
    public int eliminarDAO(Paciente paciente){
        return daoPaciente.eliminarDAO(paciente);
    }
    /*public void logica_agregarPaciente(Paciente pac){
        daoPaciente.Dao_agregarPaciente(pac);
    }
    
    public void logica_modificarPaciente(Paciente pac){
        daoPaciente.Dao_modificarPaciente(pac);
    }
    
    public void logica_eliminarPaciente(Paciente pac){
        daoPaciente.Dao_eliminarPaciente(pac);
    }*/
}
