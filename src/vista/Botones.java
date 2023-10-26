/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author alejb
 */
public class Botones extends JPanel { // Extiende JPanel
    private JButton guardarButton;
    private JButton borrarButton;
    private JButton nuevoRegistroButton;

    public Botones() {
        setLayout(new FlowLayout());

        guardarButton = new JButton("Guardar");
        borrarButton = new JButton("Borrar");
        nuevoRegistroButton = new JButton("Nuevo Registro");

        add(guardarButton);
        add(borrarButton);
        add(nuevoRegistroButton);
    }
}