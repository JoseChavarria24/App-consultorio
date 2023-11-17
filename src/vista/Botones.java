package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import modelo.excepciones.HoraInvalida;
import modelo.excepciones.MinutoInvalido;
import vista.TablaPacientes;

public class Botones extends JPanel { 
    private JButton guardarButton;
    private JButton borrarButton;
    private JButton nuevoRegistroButton;
    private ValoracionTerapiaFisica pac;

    public Botones() {
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        guardarButton = new JButton("Guardar");
        borrarButton = new JButton("Borrar");

        add(guardarButton);
        add(borrarButton);
        add(nuevoRegistroButton);
        
        
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    ValoracionTerapiaFisica pac= new ValoracionTerapiaFisica();
              
            }
        });
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
}