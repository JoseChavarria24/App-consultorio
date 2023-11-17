
package modelo.vo;


public class Citas {

    
    String fecha, horaIn,horaFin;
    public Citas(String fecha, String horaIn,String horaFin) {
        this.horaIn=horaIn;
        this.horaFin=horaFin;
        this.fecha=fecha;
    }

    public String getDia() {
        return fecha;
    }

    @Override
    public String toString() {

        return fecha+" Hora inicio: "+horaIn+" Fin de sesión: "+horaFin;
    }

    public void setDia(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraIn() {
        return horaIn;
    }

    public void setHoraIn(String horaIn) {
        this.horaIn = horaIn;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
       
}

