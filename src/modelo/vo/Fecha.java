package modelo.vo;


import java.util.Calendar;
import javax.swing.*;


import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;

public class Fecha{
    static Calendar Hora= Calendar.getInstance();
    public int dia;
    public int mes;
    public int año;
    public int hora,minutos;
    
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

    public Fecha sacarFechaCadena(String cad) throws DiaInvalido, MesInvalido{
        int diap,mesp,añop;
        
        diap=cad.charAt(0)+cad.charAt(1);
        mesp= cad.charAt(3)+cad.charAt(4);
        añop= cad.charAt(6)+cad.charAt(7);
        
        Fecha f= new Fecha(diap,mesp,añop);
        return f;
        
    }
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }    
    
}
 

