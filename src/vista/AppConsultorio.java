package vista;


import Repositorio.RepositorioCitas;
import Repositorio.RepositorioPacientes;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import vista.*;
import vista.Menu;

public class AppConsultorio {
    
    public AppConsultorio(){
    
    }

    public static void main(String[] args) throws DiaInvalido, MesInvalido {
        Menu app = new Menu();
        app.setVisible(true);
        
        RepositorioPacientes.CargaDatosPaciente();
    }
    
}
