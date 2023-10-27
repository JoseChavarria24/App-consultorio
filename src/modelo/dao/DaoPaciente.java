/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import modelo.vo.Paciente;
import Repositorio.RepositorioPacientes;

/**
 *
 * @author alejb
 */
public class DaoPaciente {

    public DaoPaciente() {
    }
    RepositorioPacientes repositorio = new RepositorioPacientes();

    public void Dao_agregarPaciente(Paciente pas) {
        repositorio.agregarPaciente(pas);
    }

    public void Dao_eliminarPaciente(Paciente pas) {
        repositorio.eliminarPaciente(pas);
    }

    public void Dao_modificarPaciente(Paciente pas) {
        repositorio.modificarPaciente(pas);
    }
}
