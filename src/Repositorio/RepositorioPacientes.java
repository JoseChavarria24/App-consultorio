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
    
    public static String[] getArregloNombrePacientes(){
        String pacientes[]= new String[repositorioPacientes.size()];
        int indice = 0;
        for(Paciente paciente: repositorioPacientes){
            pacientes[indice]=paciente.getNombre();
            indice++;
        }
        return pacientes;
    }
    
    
    public static void CargaDatosPaciente( ) throws DiaInvalido, MesInvalido{
        Fecha fechia= new Fecha(13,10,2002);
        
     
        repositorioPacientes.add(new Paciente(fechia,"Enrique Rodriguez Guillen",01,"g",21,61412036,1,"Buda","Programador Senior"));
        repositorioPacientes.add(new Paciente(fechia,"Jose Santos Chavarria Valdez",01,"g",21,61412036,1,"Buda","Programador Senior"));
        repositorioPacientes.add(new Paciente(fechia,"Lertín Gómez ",01,"g",21,61412036,1,"Buda","Programador Senior"));
        repositorioPacientes.add(new Paciente(fechia,"Memo ochoa",01,"g",21,61412036,1,"Buda","Programador Senior"));
        repositorioPacientes.add(new Paciente(fechia,"Chocó perez",01,"g",21,61412036,1,"Buda","Programador Senior"));
        repositorioPacientes.add(new Paciente(fechia,"Jhon Cena",01,"g",21,61412036,1,"Buda","Programador Senior"));

      
    }
}
