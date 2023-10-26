/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pruebas;

import modelo.vo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejb
 */
public class RepositorioPacientes {

    private List<Paciente> pacientes;

    public RepositorioPacientes() {
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> obtenerTodosLosPacientes() {
        return pacientes;
    }

    public Paciente obtenerPacientePorMatricula(int matricula) {
        for (Paciente paciente : pacientes) {
            if (paciente.getMatricula() == matricula) {
                return paciente;
            }
        }
        return null;
    }

    public void eliminarPaciente(int matricula) {
        Paciente paciente = obtenerPacientePorMatricula(matricula);
        if (paciente != null) {
            pacientes.remove(paciente);
        }
    }

    public void actualizarPaciente(Paciente pacienteActualizado) {
        int index = -1;
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getMatricula() == pacienteActualizado.getMatricula()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            pacientes.set(index, pacienteActualizado);
        }
    }
}
