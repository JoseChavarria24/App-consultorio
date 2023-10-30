package Componentes;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 * Jose Santos Chavarria Valdez
 */

public class MyTextField extends JTextField implements FocusListener {
    private Color colorOriginal= Color.white;
    public MyTextField(){
        super();
        addFocusListener(this);
    }

    public void focusGained(FocusEvent e) {
        setBackground(new Color(255,255,150));
    }

    public void focusLost(FocusEvent e) {
        setBackground(colorOriginal);
    }
}
