package vista;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import modelo.vc.ModeloPacientesTabla;
    
public class TablaPacientes extends JPanel{

    JTable tablaPacientes;
    JScrollPane scrollPane;

    TablaPacientes(){
        this.setLayout(new BorderLayout());
        tablaPacientes= new JTable();
        scrollPane=new JScrollPane(tablaPacientes);
        
        tablaPacientes.setPreferredScrollableViewportSize(new Dimension(700,300));
        this.add(scrollPane,BorderLayout.CENTER);
       

        tablaPacientes.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(javax.swing.event.AncestorEvent event) {
                          tablaPacientes.setModel(new ModeloPacientesTabla());

            }

            @Override
            public void ancestorRemoved(javax.swing.event.AncestorEvent event) {
            }

            @Override
            public void ancestorMoved(javax.swing.event.AncestorEvent event) {
            }
        });
      
        
    
        
    }
    
    
}
        
        