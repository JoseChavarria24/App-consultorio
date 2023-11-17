/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author alejb
 */
public class DiaInvalido extends Exception{
    
    public DiaInvalido(){
        super("Dia Invalido");
    }
    
    public DiaInvalido(String msg){
        super(msg);
    }
}
