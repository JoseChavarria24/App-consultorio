/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;
import modelo.excepciones.HoraInvalida;
import modelo.excepciones.MinutoInvalido;
/**
 *
 * @author alejb
 */
public class Hora {
    int componenteHora;
    int componenteMinuto;

    public Hora(int componenteHora, int componenteMinuto)throws HoraInvalida,MinutoInvalido {
        
        if(HoraValida(componenteHora)){
            this.componenteHora = componenteHora;
        }else{
            throw new HoraInvalida("Hora invalida");
        }
        
        if(MinutoValido(componenteMinuto)){
            this.componenteMinuto = componenteMinuto;
        }else{
            throw new MinutoInvalido("Minutos invalidso");
        }
    }

    public int getComponenteHora() {
        return componenteHora;
    }

    public void setComponenteHora(int componenteHora) {
        this.componenteHora = componenteHora;
    }

    public int getComponenteMinuto() {
        return componenteMinuto;
    }

    public void setComponenteMinuto(int componenteMinuto) {
        this.componenteMinuto = componenteMinuto;
    }
    
    
    
    
    private boolean HoraValida(int componenteHora){
        if(componenteHora>= 1 && componenteHora<=24){
            return true;
        }
        return false;
    }
    
    private boolean MinutoValido(int componenteMinuto){
        if(componenteMinuto>= 1 && componenteMinuto<=59){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return  componenteHora + ":" + componenteMinuto;
    }
    
    
    
}
