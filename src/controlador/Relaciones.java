
package controlador;
import controlador.Coordinador;
import modelo.logica.LogicaPaciente;
import vista.Menu;
import vista.ValoracionTerapiaFisica;

    

public class Relaciones {
    public void crearObjetos(){
        System.out.println("se crearon los objetos");
        //Se crea el objeto del Menu(Ventana principal) y se pone visible, no se comunica con el modelo
        Menu menuPrincipal = new Menu();
        menuPrincipal.setVisible(true);
        
        Coordinador coordinador = new Coordinador();
        
        //Vista(falta poner la conexion con coordinador en la clase ValoracionTerapiaFisica)
        ValoracionTerapiaFisica valoracion = new ValoracionTerapiaFisica();
        valoracion.setCoordinador(coordinador);
        coordinador.setValoracionTerapiaFisica(valoracion);
        
        //Logica paciente (esta clase aun no existe)
        LogicaPaciente logicaPaciente = new LogicaPaciente();
        logicaPaciente.setCoordinador(coordinador);
        coordinador.setLogicaPaciente(logicaPaciente);
    }
}
