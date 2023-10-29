/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.excepciones;

/**
 *
 * @author alejb
 */
public class HoraInvalida extends Exception{
    public HoraInvalida(){
        super("Hora Invalida");
    }
    
    public HoraInvalida(String msg){
        super(msg);
    }
}
