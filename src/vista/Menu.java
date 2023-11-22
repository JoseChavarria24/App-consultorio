package vista;

import Repositorio.RepositorioPacientes;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import vista.TablaPacientes;
import vista.ValoracionTerapiaFisica;
import vista.PanelCitas;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import utilerias.WrapperMouse;

/**
 * José Santos Chavarría Valdez
 */
public class Menu extends JFrame {

    JPanel panel_norte;
    JPanel panel_oeste;
    JPanel panel_oeste0;
    JPanel panel_oeste1;
    JPanel panel_oeste2;
    JPanel panel_oeste3;
    JPanel panel_oeste4;
    JPanel panel_centro;

    JLabel lbl_titulo;
    JLabel lbl_oeste0;
    JLabel lbl_oeste1;
    JLabel lbl_oeste2;
    JLabel lbl_oeste3;
    JLabel lbl_oeste4;
    JLabel lbl_logo;

    JScrollPane sb_panel;

    public Menu() {
        setTitle("APP CONSULTORIO");//titulo de la vnetana
        iniciarComponentes();
        eventos();
        
        JScrollPane sb_panel = new JScrollPane(panel_centro);
        sb_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sb_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Dimension medida = Toolkit.getDefaultToolkit().getScreenSize();
        int pantalla_alto = (int) medida.getWidth();
        int pantalla_ancho = (int) medida.getHeight();
        
        sb_panel.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                repaint();
            }
        
        });
        

        this.setBackground(new Color(224, 224, 224));
        this.add(sb_panel);
        this.setSize(pantalla_alto, pantalla_ancho);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }

    private void iniciarComponentes() {
        //crear paneles
        panel_norte = new JPanel();
        panel_oeste = new JPanel();
        panel_oeste0 = new JPanel();
        panel_oeste1 = new JPanel();
        panel_oeste2 = new JPanel();
        panel_oeste3 = new JPanel();
        panel_oeste4 = new JPanel();
        panel_centro = new JPanel();

        //crear etiquetas
        lbl_titulo = new JLabel(" CONSULTORIO ");
        lbl_oeste0 = new JLabel(" REGISTRO ");
        lbl_oeste1 = new JLabel(" PACIENTE ");
        lbl_oeste2 = new JLabel(" CITAS ");
        lbl_oeste3 = new JLabel(" NOTAS ");
        lbl_oeste4 = new JLabel(" SALIR ");
        lbl_logo = new JLabel(new ImageIcon("Logo.png"));

        //estilos de fuente a la etiqueta titulo
        Font titulo = new Font("Arial", Font.BOLD, 25);
        Font pOeste = new Font("Arial", Font.BOLD, 18);
        lbl_titulo.setFont(titulo);
        lbl_oeste0.setFont(pOeste);
        lbl_oeste1.setFont(pOeste);
        lbl_oeste2.setFont(pOeste);
        lbl_oeste3.setFont(pOeste);
        lbl_oeste4.setFont(pOeste);
        
        lbl_titulo.setForeground(Color.white);
        lbl_oeste0.setForeground(Color.white);
        lbl_oeste1.setForeground(Color.white);
        lbl_oeste2.setForeground(Color.white);
        lbl_oeste3.setForeground(Color.white);
        lbl_oeste4.setForeground(Color.white);

        //fondo de colores para los paneles
        panel_norte.setBackground(new Color(0, 151, 167));
        panel_oeste.setBackground(new Color(0, 151, 167));
        panel_oeste0.setBackground(new Color(0, 151, 167));
        panel_oeste1.setBackground(new Color(0, 151, 167));
        panel_oeste2.setBackground(new Color(0, 151, 167));
        panel_oeste3.setBackground(new Color(0, 151, 167));
        panel_oeste4.setBackground(new Color(0, 151, 167));
        panel_centro.setBackground(new Color(0, 141, 167));
        
        //panel norte
        panel_norte.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));//Seleccion de layout para el panel norte
        panel_norte.add(lbl_titulo);

        //panel oeste
        panel_oeste.setLayout(new BoxLayout(panel_oeste, 1));//BoxLayout para el panel oeste y acomodar los subpaneles de froma vertical
        panel_oeste.add(panel_oeste0);
        panel_oeste.add(panel_oeste1);
        panel_oeste.add(panel_oeste2);
        panel_oeste.add(panel_oeste3);
        panel_oeste.add(panel_oeste4);

        panel_centro.setLayout(new BorderLayout());
        panel_centro.add(lbl_logo);

        //paneles secundarios
        //panel_oeste0
        panel_oeste0.add(lbl_oeste0);
        //panel_oeste1
        panel_oeste1.add(lbl_oeste1);
        //panel_oeste2
        panel_oeste2.add(lbl_oeste2);
        //panel_oeste3
        panel_oeste3.add(lbl_oeste3);
        //panel_oeste4
        panel_oeste4.add(lbl_oeste4);

        //colocar los paneles sobre la ventana con el layout por defecto de los JFrmae
        this.add(panel_norte, BorderLayout.NORTH);
        this.add(panel_oeste, BorderLayout.WEST);
        this.add(panel_centro, BorderLayout.CENTER);
    }

    private void eventos() {
        panel_oeste0.addMouseListener(new WrapperMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new ValoracionTerapiaFisica());
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                panel_oeste0.setBackground(new Color(255, 193, 7));
                lbl_oeste0.setForeground(Color.black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel_oeste0.setBackground(new Color(0, 151, 167));
                lbl_oeste0.setForeground(Color.white);
            }
        });

        panel_oeste1.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new TablaPacientes());
              
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                panel_oeste1.setBackground(new Color(255, 193, 7));
                lbl_oeste1.setForeground(Color.black);

            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel_oeste1.setBackground(new Color(0, 151, 167));
                lbl_oeste1.setForeground(Color.white);
            }
        });

        panel_oeste2.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new PanelCitas());
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                panel_oeste2.setBackground(new Color(255, 193, 7));
                lbl_oeste2.setForeground(Color.black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel_oeste2.setBackground(new Color(0, 151, 167));
                lbl_oeste2.setForeground(Color.white);
            }
        });

        panel_oeste3.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new PanelNotasDeSesion());
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                panel_oeste3.setBackground(new Color(255, 193, 7));
                lbl_oeste3.setForeground(Color.black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel_oeste3.setBackground(new Color(0, 151, 167));
                lbl_oeste3.setForeground(Color.white);
            }
        });

        panel_oeste4.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                panel_oeste4.setBackground(new Color(255, 193, 7));
                lbl_oeste4.setForeground(Color.black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                panel_oeste4.setBackground(new Color(0, 151, 167));
                lbl_oeste4.setForeground(Color.white);
            }
        });
    }

    private void mostrarPanel(JPanel ventana) {
        
        panel_centro.removeAll();
        panel_centro.add(ventana,BorderLayout.CENTER);
        panel_centro.revalidate();
        panel_centro.repaint();
    }
}
