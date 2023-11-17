
package modelo.vo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.Timer;
import modelo.excepciones.HoraInvalida;
import modelo.excepciones.MinutoInvalido;




public class Calendario {
    int hora,minuto,segundos;
    int dia,mes,año;
    
    
    String componente="";
    String ComponenteHora,ComponenteFecha;
    String se,sa;
    String componenteHoram;
    
    Calendar objetoHora= Calendar.getInstance();
    Calendar objetoFecha= Calendar.getInstance();
    
    public Calendario(){
        objetoFecha= Calendar.getInstance();
        objetoHora= Calendar.getInstance();
        
        hora= objetoHora.get(Calendar.HOUR_OF_DAY);
        minuto=objetoHora.get(Calendar.MINUTE);
        segundos = objetoHora.get(Calendar.SECOND);   
        
        dia = objetoFecha.get(Calendar.DAY_OF_MONTH);
        mes = objetoFecha.get(Calendar.MONTH)+1;
        año = objetoFecha.get(Calendar.YEAR);
               
   
        if (segundos<10){
            se="0"+segundos;
        }
        else{
          se=""+segundos;
        }
        if (minuto<10){
            sa="0"+minuto;
        }
        else{
          sa=""+minuto;
        }
        ComponenteHora=hora+":"+sa+":"+se;
        ComponenteFecha=dia+"/"+mes+"/"+año;
            
        
    }
    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora ) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String getComponenteHora(){
        
        return ComponenteHora;
    }
    public void setComponenteHora(int hora,int minuto){
        
        this.ComponenteHora=hora+":"+minuto+":"+segundos;
    }
    
    
    private boolean HoraValida(int hora){
        if(hora>= 1 && hora<=24){
            return true;
        }
        return false;
    }
    
    private boolean MinutoValido(int minuto){
        if(minuto>= 0 && minuto<=59){
            return true;
        }
        return false;
    }

    public String toStringHora() {
        return  hora + ":" + minuto;
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

    public void setAño(int año) {
        this.año = año;
    }

    public String getComponenteFecha() {
        
        return ComponenteFecha;
    }
   public String getComponenteHoram() {
       componenteHoram=hora+":"+minuto;
        return componenteHoram;
    }

    public void setComponenteHoram(int hora, int minuto) {
        this.ComponenteHora=hora+":"+minuto;
    }
    public void setComponenteFecha(int dia, int mes, int año) {
        ComponenteFecha=dia+"/"+mes+"/"+año;
        this.ComponenteFecha =ComponenteFecha;
    }

   
}

