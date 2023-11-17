package Componentes;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import modelo.vc.ModeloCitasTabla;
import modelo.vc.ModeloPacientesTabla;
    
public class TablaCitas extends JPanel{

    JTable tablaCitas;
    JScrollPane scrollPane;

    public TablaCitas(){
        this.setLayout(new BorderLayout());
        tablaCitas= new JTable();
        scrollPane=new JScrollPane(tablaCitas);
      

        tablaCitas.setPreferredScrollableViewportSize(new Dimension(700,300));
        this.add(scrollPane,BorderLayout.CENTER);
        tablaCitas.setModel(new ModeloCitasTabla());


     /*   tablaCitas.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(javax.swing.event.AncestorEvent event) {
                          tablaCitas.setModel(new ModeloCitasTabla());

            }

            @Override
            public void ancestorRemoved(javax.swing.event.AncestorEvent event) {
            }

            @Override
            public void ancestorMoved(javax.swing.event.AncestorEvent event) {
            }
        });
     */
    
        
    }
    
    public void actualizarDatos() {
        tablaCitas.setModel(new ModeloCitasTabla());
    }
}