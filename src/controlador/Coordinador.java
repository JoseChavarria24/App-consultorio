/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.logica.LogicaPaciente;
import modelo.vo.Paciente;
import vista.TablaPacientes;
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

    
    //Declaracion en coordinador de setValoracionTerapiaFisica
    private ValoracionTerapiaFisica valoracion = null;
    public void setValoracionTerapiaFisica(ValoracionTerapiaFisica valoracion){
        this.valoracion = valoracion;
    }
    
    //Declaracion de setLogicaPaciente
   LogicaPaciente logicaPaciente;
   public void setLogicaPaciente(LogicaPaciente logicaPaciente){
       this.logicaPaciente = logicaPaciente;
   }
   
   //Declaracion de setTablaPacientes
   TablaPacientes tablaPacientes;
   public void setTablaPacientes(TablaPacientes tablaPacientes){
       this.tablaPacientes = tablaPacientes;
   }
    
    /*
   METODOS DE COMUNICACION DE MVC: Los metodos son ejecutados desde la vista y 
   estos ejecutan los metodos de logica que se encuentran en LogicaPaciente
   */
    
   public void coord_agregarPaciente(Paciente pac){
       logicaPaciente.logica_agregarPaciente(pac);
   }
   
   public void coord_modificarPaciente(Paciente pac){
       logicaPaciente.logica_modificarPaciente(pac);
   }
   
   public void coord_eliminarPaciente(Paciente pac){
       logicaPaciente.logica_eliminarPaciente(pac);
   }
   
}
