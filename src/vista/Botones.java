
package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Botones extends JPanel { // Extiende JPanel
    private JButton guardarButton;
    private JButton borrarButton;
    private JButton nuevoRegistroButton;

    public Botones() {
        setLayout(new FlowLayout(FlowLayout.CENTER,20,20));

        guardarButton = new JButton("Guardar");
        borrarButton = new JButton("Borrar");

        add(guardarButton);
        add(borrarButton);
        add(nuevoRegistroButton);
        
    }
}