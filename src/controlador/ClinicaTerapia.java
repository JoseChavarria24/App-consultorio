

package controlador;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import Repositorio.RepositorioPacientes;
import controlador.Relaciones;
import vista.Menu;


public class ClinicaTerapia {
    public static void main(String[] args) throws DiaInvalido, MesInvalido{
        new Relaciones().crearObjetos();
        
        //Codigo de repositorios
     
        
        RepositorioPacientes.CargaDatosPaciente();
    }
}
