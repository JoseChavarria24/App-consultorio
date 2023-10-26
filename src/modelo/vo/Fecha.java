package modelo.vo;


import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alejb
 */
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;

public class Fecha{
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año)throws DiaInvalido,MesInvalido {
        if(mesValido(mes)){
            this.mes = mes;
        }else{
            throw new MesInvalido("Mes invalido");
        }
        
        if(diaValido(dia)){
            this.dia = dia;
        }else{
            throw new MesInvalido("Dia invalido");
        }
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAnio(int año) {
        this.año = año;
    }

    public boolean añoBisiesto() {
        if(this.año % 4 == 0){
            if(this.año % 100 == 0){
                if(this.año % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }
        return false;
    }
    
    private boolean mesValido(int mes){
        if(mes>= 1 && mes<=12){
            return true;
        }
        return false;
    }
    
    private boolean diaValido(int dia){
        switch(this.mes){
            case 1,3,5,7,8,10,12->{
                if(dia>= 1 && dia<=31){
                    return true;
                }else{
                    return false;
                }
            }
            case 4,6,9,11->{
                if(dia>= 1 && dia<=30){
                    return true;
                }else{
                    return false;
                }
            }
            case 2 ->{
                if(añoBisiesto()){
                    if(dia>= 1 && dia<=29){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
            default->{
                return false;
            }
        }
        return false;
    }

    public void sumarDias(int dias) {
        //Sumarle dias a la fecha
        
    }
    
    public void restarDias(int dias) {
        //Restarle dias a la fecha
        
    }

    public void sumarMeses(int meses) {
        //Sumarle meses a la fecha
        
    }
    
    public void restarMeses(int meses) {
        //Restarle meses a la fecha
        
    }

    public void sumarAños(int anos) {
        //Sumarle años a la fecha
    }
    
    public void restarAños(int anos) {
        //Restarle años a la fecha
    }

    @Override
    public String toString() {
        return "ClaseFecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + año + '}';
    }
    
    
}
