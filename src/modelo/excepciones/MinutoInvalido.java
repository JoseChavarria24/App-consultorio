/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author alejb
 */
public class MinutoInvalido extends Exception {
    public MinutoInvalido(){
        super("Minuto Invalido");
    }
    
    public MinutoInvalido(String msg){
        super(msg);
    }
}
