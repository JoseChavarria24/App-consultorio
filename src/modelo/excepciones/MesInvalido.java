/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author alejb
 */
public class MesInvalido extends Exception{
    
    public MesInvalido(){
        super("Dia Invalido");
    }
    
    public MesInvalido(String msg){
        super(msg);
    }
}
