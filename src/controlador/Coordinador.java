package controlador;
import vista.Formulario;
import vista.ValoracionTerapiaFisica;

/**
 *
 * @author alejb
 */
public class Coordinador {
    /*
    Se crean las referencias y su metodo de acceso setter, se trata de cada una
    de las clases que el coordinador va a comunicar
    */
    
    /*
    Faltan las delcaraciones de todos los set de las clases que se comunican con
    el coordinador, eso incluye la ventana del scroll Pane, la JTable(Falta hacerla), la
    clase de logica de persona(Falta haacerla), en el caso de la logica esa clase
    debe tener funciones para agregar, modificar y eliminar pacientes
    */

    
    //Declaracion en coordinador de ventana de valoracion
    private ValoracionTerapiaFisica valoracion = null;
    public void setFormulario(ValoracionTerapiaFisica valoracion){
        this.valoracion = valoracion;
    }
    
    //Declaracion de JTable que falta
    
    
    //Declaracion de las funciones de logica
    
}
