package Repositorio;

import modelo.vo.Fecha;
import modelo.vo.Citas;
import java.util.ArrayList;
import java.util.List;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Paciente;

public class RepositorioCitas {

    private static List<Paciente> repositorioCitas =RepositorioPacientes.getRepositorioPacientes();
        private static Paciente pacienteActual;

    public RepositorioCitas() {
    }

    public boolean agregarCita(String paciente,Citas cita) {
          pacienteActual=buscarPaciente(paciente);
          if(pacienteActual.getCita()==""){
            pacienteActual.setCita(cita.toString());
            return true;
          }
          return false;
    }

    public static String getCitaActual() {
        return pacienteActual.getCita();
    }

    public void setCitaActual(Citas cita) {
        RepositorioCitas.pacienteActual.setCita(cita.toString());
    }

    public boolean modificarCita(Paciente paciente) {
        for (Paciente pacienteRepositorio : repositorioCitas) {
            if (paciente.equals(pacienteRepositorio)) {
                int posicion = repositorioCitas.indexOf(pacienteRepositorio);
                repositorioCitas.set(posicion, paciente);
                pacienteActual = paciente;
                return true;
            }

        }
        return false;

    }

    public boolean eliminarCita(Paciente paciente) {
        int posicion = -1;
        for (Paciente pacienteRepositorio : repositorioCitas) {
            if (paciente.equals(pacienteRepositorio)) {
                posicion = repositorioCitas.indexOf(pacienteRepositorio);
                break;
            }
        }
        if (posicion > -1) {
            repositorioCitas.remove(posicion);
            return true;
        }
        return false;
    }
    public Paciente buscarPaciente(String nombre){
        for(Paciente paciente: repositorioCitas){
            if(nombre.equals(paciente.getNombre())){
               return paciente;
            }
            
        }
        return null;
    }
    public static List<Paciente>getRepositorioCitas(){
        List<Paciente> pacienteCitas=new ArrayList<>();
        for (Paciente paciente : repositorioCitas) {
            if (paciente.getCita()!="") {
                pacienteCitas.add(paciente);
            }
        }
        
        return pacienteCitas;
    }
    
  
}
