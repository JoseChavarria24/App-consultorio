package Componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;
import modelo.excepciones.HoraInvalida;
import modelo.excepciones.MinutoInvalido;
import modelo.vo.Calendario;

public class FechaActualizada extends JLabel {
    Timer timer;
    String componente;

    public FechaActualizada() throws HoraInvalida, MinutoInvalido {

        timer = new Timer(1000, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            actualizarFecha();
        } catch (HoraInvalida ex) {
            Logger.getLogger(FechaActualizada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MinutoInvalido ex) {
            Logger.getLogger(FechaActualizada.class.getName()).log(Level.SEVERE, null, ex);
        }
        repaint();
     }
       });

        timer.start();
        actualizarFecha();
        repaint();
    }
    
    private void actualizarFecha() throws HoraInvalida, MinutoInvalido {
            Calendario cale=new Calendario();
       componente = cale.getComponenteFecha() + "    " + cale.getComponenteHora();
        setText(componente);
        repaint();
    }
}

