/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 * @author PC
 */
public class Formulario extends JPanel{
    
    //declaracion de panel seis y componentes
    JPanel panel_seis;
    JLabel lbl_titulo_seis;
    JLabel lbl_sitio;
    JTextField txt_sitio;
    JLabel lbl_queloide;
    JCheckBox ck_queloide;
    JLabel lbl_retractil;
    JCheckBox ck_retractil;
    JLabel lbl_abierta;
    JCheckBox ck_abierta;
    JLabel lbl_adherencias;
    JCheckBox ck_adherencias;
    JLabel lbl_hipertrofica;
    JCheckBox ck_hipertrofica;
    
    //declaracion de panel siete y componentes
    JPanel panel_siete;
    JLabel lbl_titulo_siete;
    JLabel lbl_libre;
    JCheckBox ck_libre;
    JLabel lbl_claudicante;
    JCheckBox ck_claudicante;
    JLabel lbl_ayuda;
    JCheckBox ck_ayuda;
    JLabel lbl_espastica;
    JCheckBox ck_espastica;
    JLabel lbl_ataxica;
    JCheckBox ck_ataxica;
    JLabel lbl_otras;
    JTextField txt_otras;

    
    //declaracion de panel ocho y componentes
    JPanel panel_ocho;
    JLabel lbl_titulo_ocho;
    JLabel lbl_valInicial;
    JLabel lbl_indpendiente;
    JCheckBox ck_independiente;
    JLabel lbl_sillaDeRuedas;
    JCheckBox ck_sillaDeRuedas;
    JLabel lbl_ayudas;
    JCheckBox ck_ayudas;
    JLabel lbl_camilla;
    JCheckBox ck_camilla;
    JLabel lbl_valFinal;
    JLabel lbl_independienteFinal;
    JCheckBox ck_independienteFinal;
    JLabel lbl_sillaDeRuedasFinal;
    JCheckBox ck_sillaDeRuedasFinal;
    JLabel lbl_ayudasFinal;
    JCheckBox ck_ayudasFinal;
    JLabel lbl_camillaFinal;
    JCheckBox ck_camillaFinal;
    
    public Formulario(){
        //seleccion de Layout y color de fondo
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.gray);
        
        //fuentes y color de fuentes
        Font Fuente_lbl = new Font("Arial", Font.BOLD, 15);
        Font Fuente_titulo = new Font("Arial", Font.BOLD, 20);
        Color color_lbl = new Color(0,0,255,100);
        
        //declaracoin de etiquetas
        lbl_titulo_seis = new JLabel("CICATRIZ QUIRURGICA");
        lbl_titulo_siete = new JLabel("MARCHA");
        lbl_titulo_ocho = new JLabel("TRASLADOS");
        lbl_sitio = new JLabel("SITIO");
        lbl_queloide = new JLabel("QUELOIDE");
        lbl_retractil = new JLabel("RETRACTIL");
        lbl_abierta = new JLabel("ABIERTA");
        lbl_adherencias = new JLabel("CON ADHERENCIAS");
        lbl_hipertrofica = new JLabel("HIPERTROFICA");
        lbl_titulo_siete = new JLabel("MARCHA");
        lbl_libre = new JLabel("LIBRE");
        lbl_claudicante = new JLabel("CLAUDICANTE");
        lbl_ayuda = new JLabel("CON AYUDAS");
        lbl_espastica = new JLabel("ESPÁSTICA");
        lbl_ataxica = new JLabel("ATÁXICA");
        lbl_otras = new JLabel("OTRAS");
        lbl_titulo_ocho = new JLabel("TRASLADOS");
        lbl_valInicial = new JLabel("VALORACION INICIAL");
        lbl_indpendiente = new JLabel("INDEPENTIENTE");
        lbl_sillaDeRuedas = new JLabel("EN SILLA DE RRUEDAS");
        lbl_ayudas = new JLabel("CON AYUDAS");
        lbl_camilla = new JLabel("CAMILLA");
        lbl_valFinal = new JLabel("VALORACION FINAL");
        lbl_independienteFinal = new JLabel("INDEPENDIENTE");
        lbl_sillaDeRuedasFinal = new JLabel("EN SILLA DE RRUEDAS");
        lbl_ayudasFinal = new JLabel("CON AYUDAS");
        lbl_camillaFinal = new JLabel("CAMILLA");
        //se aplican las fuentes a las etiquetas
        lbl_titulo_seis.setFont(Fuente_titulo);
        lbl_titulo_siete.setFont(Fuente_titulo);
        lbl_titulo_ocho.setFont(Fuente_titulo);
        lbl_sitio.setFont(Fuente_lbl);
        lbl_queloide.setFont(Fuente_lbl);
        lbl_retractil.setFont(Fuente_lbl);
        lbl_abierta.setFont(Fuente_lbl);
        lbl_adherencias.setFont(Fuente_lbl);
        lbl_hipertrofica.setFont(Fuente_lbl);
        lbl_titulo_siete.setFont(Fuente_lbl);
        lbl_libre.setFont(Fuente_lbl);
        lbl_claudicante.setFont(Fuente_lbl);
        lbl_ayuda.setFont(Fuente_lbl);
        lbl_espastica.setFont(Fuente_lbl);
        lbl_ataxica.setFont(Fuente_lbl);
        lbl_otras.setFont(Fuente_lbl);
        lbl_titulo_ocho.setFont(Fuente_lbl);
        lbl_valInicial.setFont(Fuente_lbl);
        lbl_indpendiente.setFont(Fuente_lbl);
        lbl_sillaDeRuedas.setFont(Fuente_lbl);
        lbl_ayudas.setFont(Fuente_lbl);
        lbl_camilla.setFont(Fuente_lbl);
        lbl_valFinal.setFont(Fuente_lbl);
        lbl_independienteFinal.setFont(Fuente_lbl);
        lbl_sillaDeRuedasFinal.setFont(Fuente_lbl);
        lbl_ayudasFinal.setFont(Fuente_lbl);
        lbl_camillaFinal.setFont(Fuente_lbl);
        //cambio de color a la letra de las etiquetas
        lbl_titulo_seis.setForeground(color_lbl);
        lbl_titulo_siete.setForeground(color_lbl);
        lbl_titulo_ocho.setForeground(color_lbl);
        lbl_sitio.setForeground(color_lbl);
        lbl_queloide.setForeground(color_lbl);
        lbl_retractil.setForeground(color_lbl);
        lbl_abierta.setForeground(color_lbl);
        lbl_adherencias.setForeground(color_lbl);
        lbl_hipertrofica.setForeground(color_lbl);
        lbl_titulo_siete.setForeground(color_lbl);
        lbl_libre.setForeground(color_lbl);
        lbl_claudicante.setForeground(color_lbl);
        lbl_ayuda.setForeground(color_lbl);
        lbl_espastica.setForeground(color_lbl);
        lbl_ataxica.setForeground(color_lbl);
        lbl_otras.setForeground(color_lbl);
        lbl_titulo_ocho.setForeground(color_lbl);
        lbl_valInicial.setForeground(color_lbl);
        lbl_indpendiente.setForeground(color_lbl);
        lbl_sillaDeRuedas.setForeground(color_lbl);
        lbl_ayudas.setForeground(color_lbl);
        lbl_camilla.setForeground(color_lbl);
        lbl_valFinal.setForeground(color_lbl);
        lbl_independienteFinal.setForeground(color_lbl);
        lbl_sillaDeRuedasFinal.setForeground(color_lbl);
        lbl_ayudasFinal.setForeground(color_lbl);
        lbl_camillaFinal.setForeground(color_lbl);
        
        //creacion de los checkBox y el textField
        txt_sitio = new JTextField();
        txt_otras = new JTextField();
        ck_queloide = new JCheckBox();
        ck_retractil = new JCheckBox();
        ck_abierta = new JCheckBox();
        ck_adherencias = new JCheckBox();
        ck_hipertrofica= new JCheckBox();
        ck_libre = new JCheckBox();
        ck_claudicante = new JCheckBox();
        ck_ayuda = new JCheckBox();
        ck_espastica = new JCheckBox();
        ck_ataxica = new JCheckBox();
        ck_independiente = new JCheckBox();
        ck_sillaDeRuedas = new JCheckBox();
        ck_sillaDeRuedasFinal = new JCheckBox();
        ck_ayudas = new JCheckBox();
        ck_camilla = new JCheckBox();
        ck_independienteFinal = new JCheckBox();
        ck_ayudasFinal = new JCheckBox();
        ck_camillaFinal = new JCheckBox();

        //se aplica la fuente a los checkBox
        txt_sitio.setFont(Fuente_lbl);
        txt_otras.setFont(Fuente_lbl);
        ck_queloide.setFont(Fuente_lbl);
        ck_retractil.setFont(Fuente_lbl);
        ck_abierta.setFont(Fuente_lbl);
        ck_adherencias.setFont(Fuente_lbl);
        ck_hipertrofica.setFont(Fuente_lbl);
        ck_libre.setFont(Fuente_lbl);
        ck_claudicante.setFont(Fuente_lbl);
        ck_ayuda.setFont(Fuente_lbl);
        ck_espastica.setFont(Fuente_lbl);
        ck_ataxica.setFont(Fuente_lbl);
        ck_independiente.setFont(Fuente_lbl);
        ck_sillaDeRuedas.setFont(Fuente_lbl);
        ck_sillaDeRuedasFinal.setFont(Fuente_lbl);
        ck_ayudas.setFont(Fuente_lbl);
        ck_camilla.setFont(Fuente_lbl);
        ck_independienteFinal.setFont(Fuente_lbl);
        ck_ayudasFinal.setFont(Fuente_lbl);
        ck_camillaFinal.setFont(Fuente_lbl);

        //se aplica define el texto de los Check box
        ck_queloide.setText("SÍ O NO");
        ck_retractil.setText("SÍ O NO");
        ck_abierta.setText("SÍ O NO");
        ck_adherencias.setText("SÍ O NO");
        ck_hipertrofica.setText("SÍ O NO");
        ck_libre.setText("SÍ O NO");
        ck_claudicante.setText("SÍ O NO");
        ck_ayuda.setText("SÍ O NO");
        ck_espastica.setText("SÍ O NO");
        ck_ataxica.setText("SÍ O NO");
        ck_independiente.setText("SÍ O NO");
        ck_sillaDeRuedas.setText("SÍ O NO");
        ck_sillaDeRuedasFinal.setText("SÍ O NO");
        ck_ayudas.setText("SÍ O NO");
        ck_camilla.setText("SÍ O NO");
        ck_independienteFinal.setText("SÍ O NO");
        ck_ayudasFinal.setText("SÍ O NO");
        ck_camillaFinal.setText("SÍ O NO");

        //se aplica el color de fondo a los checkbox
        ck_queloide.setBackground(Color.white);
        ck_retractil.setBackground(Color.white);
        ck_abierta.setBackground(Color.white);
        ck_adherencias.setBackground(Color.white);
        ck_hipertrofica.setBackground(Color.white);
        ck_libre.setBackground(Color.white);
        ck_claudicante.setBackground(Color.white);
        ck_ayuda.setBackground(Color.white);
        ck_espastica.setBackground(Color.white);
        ck_ataxica.setBackground(Color.white);
        ck_independiente.setBackground(Color.white);
        ck_sillaDeRuedas.setBackground(Color.white);
        ck_sillaDeRuedasFinal.setBackground(Color.white);
        ck_ayudas.setBackground(Color.white);
        ck_camilla.setBackground(Color.white);
        ck_independienteFinal.setBackground(Color.white);
        ck_ayudasFinal.setBackground(Color.white);
        ck_camillaFinal.setBackground(Color.white);
        
        //creacion de los paneles
        panel_seis = new JPanel();
        panel_seis.setBackground(Color.white);
        panel_seis.setLayout(new GridBagLayout());
        panel_siete = new JPanel();
        panel_siete.setBackground(Color.white);
        panel_siete.setLayout(new GridBagLayout());
        panel_ocho = new JPanel();
        panel_ocho.setBackground(Color.white);
        panel_ocho.setLayout(new GridBagLayout());
        
        agregarComponentes();
        
        this.repaint();
        this.revalidate();
        this.repaint();
        this.revalidate();
        
    }
    
    public void agregarComponentes(){
   // espacio entre componentes = (arriba, izquierda, abajo, derecha);
        Insets insets = new Insets(0, 10, 10,10);
        int fill;
        //se coloca panel seis 
        fill = GridBagConstraints.BOTH;
        configurarComponentes(this, panel_seis, 0, 0, 3, 1, 1, 1, fill, insets, 10 ,10);
        //se coloca panel siete
        fill = GridBagConstraints.BOTH;
        configurarComponentes(this, panel_siete, 0, 1, 3, 1, 1, 1, fill, insets, 10, 10);
        //se coloca panel ocho 
        fill = GridBagConstraints.BOTH;
        configurarComponentes(this, panel_ocho, 0, 2, 3, 1, 1, 1, fill, insets, 10, 10);
        //se coloca titulo de panel seis 
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_titulo_seis, 0, 0, 6, 1, 1, 0.5, fill, insets, 10, 10);
        //se coloca la etiqtueta sitio
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_sitio, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, txt_sitio, 0, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_queloide, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, ck_queloide, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_retractil, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, ck_retractil, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_abierta, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, ck_abierta, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_adherencias, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, ck_adherencias, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_hipertrofica, 5, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_seis, ck_hipertrofica, 5, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_titulo_siete, 0, 0, 6, 1, 1, 0.5, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_libre, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, ck_libre, 0, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_claudicante, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, ck_claudicante, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_ayuda, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, ck_ayuda, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_espastica, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, ck_espastica, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_ataxica, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, ck_ataxica, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_otras, 5, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_siete, txt_otras, 5, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_titulo_ocho, 0, 0, 5, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_valInicial, 0, 1, 1, 2, 1, 1, fill, insets, 10, 10);
                      
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_valFinal, 0, 3, 1, 2, 1, 1, fill, insets, 10, 10);
       
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_indpendiente, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_independiente, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_independienteFinal, 1, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_independienteFinal, 1, 4, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_sillaDeRuedas, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_sillaDeRuedas, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);        
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_sillaDeRuedasFinal, 2, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_sillaDeRuedasFinal, 2, 4, 1, 1, 1, 1, fill, insets, 10, 10);
                
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_ayudas, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_ayudas, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_ayudasFinal, 3, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_ayudasFinal, 3, 4, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_camilla, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_camilla, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_camillaFinal, 4, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.HORIZONTAL;
        configurarComponentes(panel_ocho, ck_camillaFinal, 4, 4, 1, 1, 1, 1, fill, insets, 10, 10);
        
    }

   private boolean permitida(int tipo, char c){
        if(tipo == 1 && letra(c)){
            return true;
        }else if(tipo == 2 && digito(c)){
            return true;
        }else if(tipo == 4 && caracterEspecial(c)){
            return true;
        }else if(tipo == 3 || digito(c)){
            return true;
        }else if(tipo == 5 || caracterEspecial(c)){
            return true;
        }else if(tipo == 6 && digito(c) || caracterEspecial(c)){
            return true;
        }
        return false;
    }
    
    private void configurarComponentes(JComponent contenedor, JComponent componente,
            int gridX, int gridY,
            int gridWidth, int gridHeight,
            double weightX, double weightY,
            int fill, Insets inSets,
            int ipadX, int ipadY) {
        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.gridx = gridX;
        constraints.gridy = gridY;
        constraints.gridwidth = gridWidth;
        constraints.gridheight = gridHeight;
        constraints.weightx = weightX;
        constraints.weighty = weightY;
        constraints.fill = fill;
        constraints.insets = inSets;
        constraints.ipadx = ipadX;
        constraints.ipady = ipadY;
        
        contenedor.add(componente,constraints); 
    }

    private boolean letra(char c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean digito(char c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    private boolean caracterEspecial(char c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
