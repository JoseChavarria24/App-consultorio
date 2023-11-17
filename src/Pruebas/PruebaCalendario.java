
package Pruebas;

import modelo.excepciones.HoraInvalida;
import modelo.excepciones.MinutoInvalido;
import modelo.vo.Calendario;


public class PruebaCalendario {

    
    public static void main(String[] args) throws HoraInvalida, MinutoInvalido {
     Calendario cale= new Calendario();
    
     cale.setDia(13);
     cale.setMes(12);
     cale.setAño(2023);
     cale.setComponenteFecha(cale.getDia(),cale.getMes(), cale.getAño());
     
     
        System.out.println(cale.getComponenteFecha());
    
    }
    
}
