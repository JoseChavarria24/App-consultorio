package vista;

import java.awt.*;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import utilerias.*;

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

    JScrollPane sb_panel;

    public Menu() {
        setTitle("APP SUBPANELES");//titulo de la vnetana
        iniciarComponentes();
        eventos();
        //configuracion del JFrame
        JPanel panel_contenedor = new JPanel(); // Crea un nuevo panel.

        JScrollPane sb_panel = new JScrollPane(panel_centro);
        sb_panel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sb_panel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        Dimension medida = Toolkit.getDefaultToolkit().getScreenSize();
        int pantalla_alto = (int) medida.getWidth();
        int pantalla_ancho = (int) medida.getHeight();

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
        lbl_titulo = new JLabel("TITULO");
        lbl_oeste0 = new JLabel("-UNO-");
        lbl_oeste1 = new JLabel("-DOS-");
        lbl_oeste2 = new JLabel("-TRES-");
        lbl_oeste3 = new JLabel("-CUATRO-");
        lbl_oeste4 = new JLabel("-   SALIR-");

        //estilos de fuente a la etiqueta titulo
        Font titulo = new Font("Arial", Font.BOLD, 25);
        Font pOeste = new Font("Arial", Font.BOLD, 18);
        lbl_titulo.setFont(titulo);
        lbl_oeste0.setFont(pOeste);
        lbl_oeste1.setFont(pOeste);
        lbl_oeste2.setFont(pOeste);
        lbl_oeste3.setFont(pOeste);
        lbl_oeste4.setFont(pOeste);

        //fondo de colores para los paneles
        panel_norte.setBackground(Color.red);
        panel_oeste.setBackground(Color.orange);
        panel_oeste0.setBackground(Color.cyan);
        panel_oeste1.setBackground(Color.GREEN);
        panel_oeste2.setBackground(Color.MAGENTA);
        panel_oeste3.setBackground(Color.BLUE);
        panel_oeste4.setBackground(Color.orange);
        panel_centro.setBackground(Color.darkGray);

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
                //mostrarPanel(new DatosPersonas());
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {
                panel_oeste0.setBackground(Color.DARK_GRAY);
                lbl_oeste0.setForeground(Color.cyan);

            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                panel_oeste0.setBackground(Color.cyan);
                lbl_oeste0.setForeground(Color.black);
            }
        });
        
        panel_oeste1.addMouseListener(new WrapperMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new ValoracionTerapiaFisica());
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                panel_oeste1.setBackground(Color.magenta);
                lbl_oeste1.setForeground(Color.green);

            }
            public void mouseExited(MouseEvent e) {
                panel_oeste1.setBackground(Color.green);
                lbl_oeste1.setForeground(Color.black);
            }
        });

        panel_oeste2.addMouseListener(new WrapperMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                mostrarPanel(new ValoracionTerapiaFisica());
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                panel_oeste2.setBackground(Color.green);
                lbl_oeste2.setForeground(Color.black);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                panel_oeste2.setBackground(Color.magenta);
                lbl_oeste2.setForeground(Color.white);
            }
        });
        
        panel_oeste3.addMouseListener(new WrapperMouse(){
            @Override
                public void mouseClicked(MouseEvent e) {
                    //mostrarPanel(new vFecha());
                }
                public void mouseEntered(MouseEvent e) {
                    panel_oeste3.setBackground(Color.white);
                    lbl_oeste3.setForeground(Color.blue);
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    panel_oeste3.setBackground(Color.blue);
                    lbl_oeste3.setForeground(Color.white);
                }
        });

        panel_oeste4.addMouseListener(new WrapperMouse(){
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                panel_oeste4.setBackground(Color.cyan);
                lbl_oeste4.setForeground(Color.white);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                panel_oeste4.setBackground(Color.orange);
                lbl_oeste4.setForeground(Color.black);
            }
        });
    }

    private void mostrarPanel(JPanel ventana) {
        panel_centro.removeAll();
        panel_centro.add(ventana);
        panel_centro.revalidate();
        panel_centro.repaint();
    }
}
