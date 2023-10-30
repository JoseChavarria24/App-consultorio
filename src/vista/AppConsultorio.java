/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;


import Repositorio.RepositorioPacientes;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import vista.*;
import vista.Menu;

/**
 *José Santos Chavarría Valdez     
 */
public class AppConsultorio {
    
    public AppConsultorio(){
    
    }

    public static void main(String[] args) throws DiaInvalido, MesInvalido {
        Menu app = new Menu();
        app.setVisible(true);
        
        
        RepositorioPacientes.CargaDatosPaciente();
    }
    
}
