package Repositorio;

import modelo.vo.Expediente;
import modelo.vo.Fecha;
import modelo.vo.Paciente;
import java.util.ArrayList;
import java.util.List;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;

public class RepositorioPacientes {

    private static List<Paciente> repositorioPacientes = new ArrayList<>();
    private static Paciente pacienteActual;

    public RepositorioPacientes() {
    }

    public boolean agregarPaciente(Paciente paciente) {
        int posicion = repositorioPacientes.indexOf(paciente);
        if (posicion < 0) {
            repositorioPacientes.add(paciente);
            return true;

        }
        pacienteActual = paciente;
        return false;
    }

    public static Paciente getPacienteActual() {
        return pacienteActual;
    }

    public void setPacienteActual(Paciente paciente) {
        RepositorioPacientes.pacienteActual = paciente;
    }

    public boolean modificarPaciente(Paciente paciente) {
        for (Paciente pacienteRepositorio : repositorioPacientes) {
            if (paciente.equals(pacienteRepositorio)) {
                int posicion = repositorioPacientes.indexOf(pacienteRepositorio);
                repositorioPacientes.set(posicion, paciente);
                pacienteActual = paciente;
                return true;
            }

        }
        return false;

    }

    public boolean eliminarPaciente(Paciente paciente) {
        int posicion = -1;
        for (Paciente pacienteRepositorio : repositorioPacientes) {
            if (paciente.equals(pacienteRepositorio)) {
                posicion = repositorioPacientes.indexOf(pacienteRepositorio);
                break;
            }
        }
        if (posicion > -1) {
            repositorioPacientes.remove(posicion);
            return true;
        }
        return false;
    }
    public Paciente buscarPaciente(String nombre){
        for(Paciente paciente: repositorioPacientes){
            if(nombre.equals(paciente.getNombre())){
               return paciente;
            }
            
        }
        return null;
    }
    public static List<Paciente>getRepositorioPacientes(){
        return repositorioPacientes;
    }
    
    public static Paciente[] getArregloPacientes(){
        Paciente pacientes[]= new Paciente[repositorioPacientes.size()];
        int indice = 0;
        for(Paciente paciente: repositorioPacientes){
            pacientes[indice]=paciente;
            indice++;
        }
        return pacientes;
    }
    
    
    public static void CargaDatosPaciente( ) throws DiaInvalido, MesInvalido{
        
        
        
      
    }
}
