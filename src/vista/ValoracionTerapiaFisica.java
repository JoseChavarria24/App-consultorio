package vista;

import controlador.Coordinador;
import javax.swing.*;
import java.awt.*;
import Componentes.MyTextField;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Fecha;
import modelo.vo.Paciente;
import utilerias.WrapperMouse;
import Repositorio.RepositorioPacientes;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ValoracionTerapiaFisica extends JPanel {

    MouseEvent seleccion;
    RepositorioPacientes repoPac = new RepositorioPacientes();
    //Llamado de los dos primeros páneles:
    JPanel panel_uno;
    JPanel panel_dos;
    JPanel panel_botones;
    JLabel lbl_fecha;
    JLabel lbl_nombre;
    JLabel lbl_matricula;
    JLabel lbl_sexo;
    JLabel lbl_edad;
    JLabel lbl_sala;
    JLabel lbl_telefono;
    JLabel lbl_religion;
    JLabel lbl_ocupacion;
    JLabel lbl_estadoCivil;
    JLabel lbl_medicoTratante;

    // paneles número tres, cuatro y cinco:
    JPanel panel_tres;
    JPanel panel_cuatro;
    JPanel panel_cinco;

    JLabel lbl_3_Antecedentes_Patologicos;
    JLabel lbl_3_Diabetes;
    JLabel lbl_3_HTA;
    JLabel lbl_3_Cancer;
    JLabel lbl_3_EnfReumat;
    JLabel lbl_3_Cardiopatias;
    JLabel lbl_3_Cirugias;
    JLabel lbl_3_Alergias;
    JLabel lbl_3_Transfuciones;
    JLabel lbl_3_Accidentes;
    JLabel lbl_3_Encames;
    JLabel lbl_3_Fracturas;
    JLabel lbl_3_Signos_Vitales;
    JLabel lbl_3_TA;
    JLabel lbl_3_Temp;
    JLabel lbl_3_FC;
    JLabel lbl_3_FR;
    JLabel lbl_4_Diagnsotico_medico;
    JLabel lbl_4_Exploracion_neurologica;
    JLabel lbl_4_Reflejos;
    JLabel lbl_4_Sensibilidad;
    JLabel lbl_4_Lenguaje_orentiacion;
    JLabel lbl_4_Otros;
    JLabel lbl_5_Espamos;
    JLabel lbl_5_Sitio;

    MyTextField txt_3_TA;
    MyTextField txt_3_TEMP;
    MyTextField txt_3_FC;
    MyTextField txt_3_FR;
    MyTextField txt_4_Rfelejos;
    MyTextField txt_4_Sensibilidad;
    MyTextField txt_4_Lenguaje_Orientacion;
    MyTextField txt_4_Otros;
    MyTextField txt_5_Sitio;

    JCheckBox cb_3_Diabetes;
    JCheckBox cb_3_HTA;
    JCheckBox cb_3_Cancer;
    JCheckBox cb_3_EnfReumat;
    JCheckBox cb_3_Cardiopatias;
    JCheckBox cb_3_Cirugias;
    JCheckBox cb_3_Alergias;
    JCheckBox cb_3_Transfusiones;
    JCheckBox cb_3_Accidentes;
    JCheckBox cb_3_Encames;
    JCheckBox cb_3_Fracturas;

    //Declaración de vairables de panel 6,7,8
    //panel 6
    JPanel panel_seis;
    JLabel lbl_titulo_seis;
    JLabel lbl_sitio;
    MyTextField txt_sitio;
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

    //panel 7
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
    MyTextField txt_otras;

    //panel 8
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

    //Variables de panel 9
    JPanel p_nueve_final;
    JPanel panel_nueve;
    JPanel subtitulo;
    JLabel escalaWB;
    JPanel p_escalaWB;

    JPanel p_9_espacio1;
    JPanel p_9_espacio2;
    JPanel p_9_espacio3;
    JPanel p_9_espacio4;
    JPanel p_9_espacio5;
    JPanel p_9_espacio6;
    JPanel p_9_espacio7;
    JPanel p_9_espacio8;
    JPanel p_9_espacio9;
    JPanel p_9_espacio10;
    JPanel p_9_espacio11;
    JPanel p_9_espacio12;

    JLabel lbl_titulo9;
    JLabel lbl_dolorRPID;
    JLabel lbl_eva;
    JLabel lbl_noV;
    JLabel lbl_wB;
    JLabel lbl_9_inicial;
    JLabel lbl_9_final;

    MyTextField txt_campoDolor;

    JComboBox cb_escala;
    JComboBox cb_final;
    JComboBox cb_inicial;

    JPanel panel_Botones;
    JButton btn_guardar;
    JButton btn_limpiar;
    JButton btn_nuevoRegistro;

    JScrollPane sb_panel;

    public ValoracionTerapiaFisica() {
        agregarComponentes();
    }

    public void agregarComponentes() {
        Insets insets = new Insets(10, 10, 10, 10);
        int fill = GridBagConstraints.HORIZONTAL;
        Font Fuente_lbl = new Font("Arial", Font.BOLD, 15);
        Font Fuente_titulo = new Font("Arial", Font.BOLD, 20);
        Color color_lbl = new Color(0, 0, 0);
        Color color_fondo = new Color(224, 224, 224, 100);

        //Componentes del Panel 10 Botones (Falta modificar posiciones)
        btn_guardar = new JButton("GUARDAR");
        btn_limpiar = new JButton("LIMPIAR");
        btn_nuevoRegistro = new JButton("NUEVO REGISTRO");

        panel_uno = new JPanel(new GridBagLayout());
        panel_uno.setBackground(color_fondo);
        panel_dos = new JPanel(new GridBagLayout());
        panel_dos.setBackground(color_fondo);
        panel_Botones = new JPanel(new FlowLayout());

        panel_tres = new JPanel();
        panel_tres.setBackground(color_fondo);
        panel_cuatro = new JPanel();
        panel_cuatro.setBackground(color_fondo);
        panel_cinco = new JPanel();
        panel_cinco.setBackground(color_fondo);

        panel_seis = new JPanel();
        panel_seis.setBackground(color_fondo);
        panel_seis.setLayout(new GridBagLayout());
        panel_siete = new JPanel();
        panel_siete.setBackground(color_fondo);
        panel_siete.setLayout(new GridBagLayout());
        panel_ocho = new JPanel();
        panel_ocho.setBackground(color_fondo);
        panel_ocho.setLayout(new GridBagLayout());

        panel_nueve = new JPanel();
        panel_nueve.setBackground(color_fondo);
        subtitulo = new JPanel();
        subtitulo.setBackground(color_fondo);
        escalaWB = new JLabel();
        escalaWB.setBackground(color_fondo);
        p_nueve_final = new JPanel();
        p_nueve_final.setBackground(color_fondo);
        p_escalaWB = new JPanel();
        p_escalaWB.setBackground(color_fondo);

        p_9_espacio1 = new JPanel();
        p_9_espacio2 = new JPanel();
        p_9_espacio3 = new JPanel();
        p_9_espacio4 = new JPanel();
        p_9_espacio5 = new JPanel();
        p_9_espacio6 = new JPanel();
        p_9_espacio7 = new JPanel();
        p_9_espacio8 = new JPanel();
        p_9_espacio9 = new JPanel();
        p_9_espacio10 = new JPanel();
        p_9_espacio11 = new JPanel();
        p_9_espacio12 = new JPanel();

        p_9_espacio1.setBackground(color_fondo);
        p_9_espacio2.setBackground(color_fondo);
        p_9_espacio3.setBackground(color_fondo);
        p_9_espacio4.setBackground(color_fondo);
        p_9_espacio5.setBackground(color_fondo);
        p_9_espacio6.setBackground(color_fondo);
        p_9_espacio7.setBackground(color_fondo);
        p_9_espacio8.setBackground(color_fondo);
        p_9_espacio9.setBackground(color_fondo);
        p_9_espacio10.setBackground(color_fondo);
        p_9_espacio11.setBackground(color_fondo);
        p_9_espacio12.setBackground(color_fondo);

        // Componentes del panel uno
        lbl_fecha = new JLabel("Fecha:");
        lbl_nombre = new JLabel("Nombre:");
        lbl_matricula = new JLabel("Matrícula:");
        lbl_sexo = new JLabel("Sexo:");
        lbl_edad = new JLabel("Edad:");
        lbl_sala = new JLabel("Sala:");
        lbl_telefono = new JLabel("Teléfono:");
        lbl_religion = new JLabel("Religión:");
        lbl_ocupacion = new JLabel("Ocupación:");
        lbl_estadoCivil = new JLabel("Estado Civil:");
        lbl_medicoTratante = new JLabel("Médico Tratante:");

        lbl_fecha.setForeground(color_lbl);
        lbl_nombre.setForeground(color_lbl);
        lbl_matricula.setForeground(color_lbl);
        lbl_sexo.setForeground(color_lbl);
        lbl_edad.setForeground(color_lbl);
        lbl_sala.setForeground(color_lbl);
        lbl_telefono.setForeground(color_lbl);
        lbl_religion.setForeground(color_lbl);
        lbl_ocupacion.setForeground(color_lbl);
        lbl_estadoCivil.setForeground(color_lbl);
        lbl_medicoTratante.setForeground(color_lbl);

        MyTextField txt_fecha = new MyTextField();
        MyTextField txt_nombre = new MyTextField();
        MyTextField txt_matricula = new MyTextField();
        MyTextField txt_sexo = new MyTextField();
        MyTextField txt_edad = new MyTextField();
        MyTextField txt_sala = new MyTextField();
        MyTextField txt_telefono = new MyTextField();
        MyTextField txt_religion = new MyTextField();
        MyTextField txt_ocupacion = new MyTextField();
        MyTextField txt_estadoCivil = new MyTextField();
        MyTextField txt_medicoTratante = new MyTextField();

        //Componentes de panel dos
        JLabel lbl_origen = new JLabel("Origen:");
        JLabel lbl_radica = new JLabel("Radica:");
        JLabel lbl_eciv = new JLabel("Estado Civil:");
        JLabel lbl_ocup = new JLabel("Ocupación:");
        JLabel lbl_escolaridad = new JLabel("Escolaridad:");
        JLabel lbl_svsMunicipales = new JLabel("SVS Municipales:");
        JLabel lbl_religion2 = new JLabel("Religión:");
        JLabel lbl_habitacion = new JLabel("Habitación:");
        JCheckBox chk_tabaquismo = new JCheckBox("Tabaquismo");
        JCheckBox chk_etilismo = new JCheckBox("Etilismo");
        JLabel lbl_higienePnal = new JLabel("Higiene Pnal:");
        JLabel lbl_alimentacion = new JLabel("Alimentación:");
        JLabel lbl_pasatiempo = new JLabel("Pasatiempo:");
        JLabel lbl_otros = new JLabel("Otros:");
        JLabel lbl_dominio = new JLabel("Dominio:");
        JLabel lbl_hijos = new JLabel("Hijos:");

        lbl_origen.setForeground(color_lbl);
        lbl_radica.setForeground(color_lbl);
        lbl_eciv.setForeground(color_lbl);
        lbl_ocup.setForeground(color_lbl);
        lbl_escolaridad.setForeground(color_lbl);
        lbl_svsMunicipales.setForeground(color_lbl);
        lbl_religion2.setForeground(color_lbl);
        lbl_habitacion.setForeground(color_lbl);
        lbl_higienePnal.setForeground(color_lbl);
        lbl_alimentacion.setForeground(color_lbl);
        lbl_pasatiempo.setForeground(color_lbl);
        lbl_otros.setForeground(color_lbl);
        lbl_dominio.setForeground(color_lbl);
        lbl_hijos.setForeground(color_lbl);
        chk_tabaquismo.setForeground(color_lbl);
        chk_etilismo.setForeground(color_lbl);

        MyTextField txt_origen = new MyTextField();
        MyTextField txt_radica = new MyTextField();
        MyTextField txt_eciv = new MyTextField();
        MyTextField txt_ocup = new MyTextField();
        MyTextField txt_escolaridad = new MyTextField();
        MyTextField txt_svsMunicipales = new MyTextField();
        MyTextField txt_religion2 = new MyTextField();
        MyTextField txt_habitacion = new MyTextField();
        MyTextField txt_higienePnal = new MyTextField();
        MyTextField txt_alimentacion = new MyTextField();
        MyTextField txt_pasatiempo = new MyTextField();
        MyTextField txt_otros = new MyTextField();
        MyTextField txt_dominio = new MyTextField();
        MyTextField txt_hijos = new MyTextField();

        //componentes panel tres, cuatro y cinco
        lbl_3_Antecedentes_Patologicos = new JLabel();
        lbl_3_Diabetes = new JLabel();
        lbl_3_HTA = new JLabel();
        lbl_3_Cancer = new JLabel();
        lbl_3_EnfReumat = new JLabel();
        lbl_3_Cardiopatias = new JLabel();
        lbl_3_Cirugias = new JLabel();
        lbl_3_Alergias = new JLabel();
        lbl_3_Transfuciones = new JLabel();
        lbl_3_Accidentes = new JLabel();
        lbl_3_Encames = new JLabel();
        lbl_3_Fracturas = new JLabel();
        lbl_3_Signos_Vitales = new JLabel();

        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);
        lbl_3_Signos_Vitales.setForeground(color_lbl);

        lbl_3_TA = new JLabel("T/A: ");
        lbl_3_Temp = new JLabel("TEMP: ");
        lbl_3_FC = new JLabel("FC: ");
        lbl_3_FR = new JLabel("FR: ");
        lbl_4_Diagnsotico_medico = new JLabel("DIAGNOSTICO MEDICO EN REHABILITACION");
        lbl_4_Exploracion_neurologica = new JLabel("EXPLORACION NEUROLOGICA I");
        lbl_4_Reflejos = new JLabel("REFLEJOS: ");
        lbl_4_Sensibilidad = new JLabel("SENSIBILIDAD: ");
        lbl_4_Lenguaje_orentiacion = new JLabel("LENGUAJE Y ORIENTACION: ");
        lbl_4_Otros = new JLabel("OTROS: ");
        lbl_5_Espamos = new JLabel("ESPAMOS O CONTRACTURA MUSCULAR");
        lbl_5_Sitio = new JLabel("SITIO: ");

        lbl_3_TA.setForeground(color_lbl);
        lbl_3_Temp.setForeground(color_lbl);
        lbl_3_FC.setForeground(color_lbl);
        lbl_3_FR.setForeground(color_lbl);
        lbl_4_Diagnsotico_medico.setForeground(color_lbl);
        lbl_4_Exploracion_neurologica.setForeground(color_lbl);
        lbl_4_Reflejos.setForeground(color_lbl);
        lbl_4_Sensibilidad.setForeground(color_lbl);
        lbl_4_Lenguaje_orentiacion.setForeground(color_lbl);
        lbl_4_Otros.setForeground(color_lbl);
        lbl_5_Espamos.setForeground(color_lbl);
        lbl_5_Sitio.setForeground(color_lbl);

        txt_3_TA = new MyTextField();
        txt_3_TEMP = new MyTextField();
        txt_3_FC = new MyTextField();
        txt_3_FR = new MyTextField();
        txt_4_Rfelejos = new MyTextField();
        txt_4_Sensibilidad = new MyTextField();
        txt_4_Lenguaje_Orientacion = new MyTextField();
        txt_4_Otros = new MyTextField();
        txt_5_Sitio = new MyTextField();

        cb_3_Diabetes = new JCheckBox();
        cb_3_Diabetes.setBackground(color_fondo);
        cb_3_HTA = new JCheckBox();
        cb_3_HTA.setBackground(color_fondo);
        cb_3_Cancer = new JCheckBox();
        cb_3_Cancer.setBackground(color_fondo);
        cb_3_EnfReumat = new JCheckBox();
        cb_3_EnfReumat.setBackground(color_fondo);
        cb_3_Cardiopatias = new JCheckBox();
        cb_3_Cardiopatias.setBackground(color_fondo);
        cb_3_Cirugias = new JCheckBox();
        cb_3_Cirugias.setBackground(color_fondo);
        cb_3_Alergias = new JCheckBox();
        cb_3_Alergias.setBackground(color_fondo);
        cb_3_Transfusiones = new JCheckBox();
        cb_3_Transfusiones.setBackground(color_fondo);
        cb_3_Accidentes = new JCheckBox();
        cb_3_Accidentes.setBackground(color_fondo);
        cb_3_Encames = new JCheckBox();
        cb_3_Encames.setBackground(color_fondo);
        cb_3_Fracturas = new JCheckBox();
        cb_3_Fracturas.setBackground(color_fondo);

        cb_3_Diabetes.setText("DIABETES");
        cb_3_HTA.setText("HTA");
        cb_3_Cancer.setText("CANCER");
        cb_3_EnfReumat.setText("ENF.REUMAT.");
        cb_3_Cardiopatias.setText("CARDIOPATIAS");
        cb_3_Cirugias.setText("CIRUGIAS");
        cb_3_Alergias.setText("ALERGIAS");
        cb_3_Transfusiones.setText("TRANSFUSIONES");
        cb_3_Accidentes.setText("ACCIDENTES");
        cb_3_Encames.setText("ENCAMES");
        cb_3_Fracturas.setText("FRACTURAS");

        cb_3_Diabetes.setForeground(color_lbl);
        cb_3_HTA.setForeground(color_lbl);
        cb_3_Cancer.setForeground(color_lbl);
        cb_3_EnfReumat.setForeground(color_lbl);
        cb_3_Cardiopatias.setForeground(color_lbl);
        cb_3_Cirugias.setForeground(color_lbl);
        cb_3_Alergias.setForeground(color_lbl);
        cb_3_Transfusiones.setForeground(color_lbl);
        cb_3_Accidentes.setForeground(color_lbl);
        cb_3_Encames.setForeground(color_lbl);
        cb_3_Fracturas.setForeground(color_lbl);

        panel_tres.setLayout(new GridBagLayout());
        panel_cuatro.setLayout(new GridBagLayout());

        //declaracoin de etiquetas panel seis, siete y ocho
        lbl_titulo_seis = new JLabel("CICATRIZ QUIRURGICA");
        lbl_titulo_siete = new JLabel("MARCHA");
        lbl_titulo_ocho = new JLabel("TRASLADOS");
        lbl_sitio = new JLabel("SITIO");
        lbl_queloide = new JLabel();
        lbl_retractil = new JLabel();
        lbl_abierta = new JLabel();
        lbl_adherencias = new JLabel();
        lbl_hipertrofica = new JLabel();
        lbl_titulo_siete = new JLabel();
        lbl_libre = new JLabel();
        lbl_claudicante = new JLabel();
        lbl_ayuda = new JLabel();
        lbl_espastica = new JLabel();
        lbl_ataxica = new JLabel();
        lbl_otras = new JLabel();
        lbl_titulo_ocho = new JLabel("TRASLADOS");
        lbl_valInicial = new JLabel("VALORACION INICIAL");
        lbl_indpendiente = new JLabel();
        lbl_sillaDeRuedas = new JLabel();
        lbl_ayudas = new JLabel();
        lbl_camilla = new JLabel();
        lbl_valFinal = new JLabel("VALORACION FINAL");
        lbl_independienteFinal = new JLabel();
        lbl_sillaDeRuedasFinal = new JLabel();
        lbl_ayudasFinal = new JLabel();
        lbl_camillaFinal = new JLabel();

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
        txt_sitio = new MyTextField();
        txt_otras = new MyTextField();
        ck_queloide = new JCheckBox();
        ck_retractil = new JCheckBox();
        ck_abierta = new JCheckBox();
        ck_adherencias = new JCheckBox();
        ck_hipertrofica = new JCheckBox();
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
        ck_queloide.setText("QUELOIDE");
        ck_retractil.setText("RETRACTIL");
        ck_abierta.setText("ABIERTA");
        ck_adherencias.setText("CON ADHERENCIAS");
        ck_hipertrofica.setText("HIPERTROFICAS");
        ck_libre.setText("LIBRE");
        ck_claudicante.setText("CLAUDICANTE");
        ck_ayuda.setText("CON AYUDAS");
        ck_espastica.setText("ESPASTICA");
        ck_ataxica.setText("ATAXICA");
        ck_independiente.setText("INDEPENDIETE");
        ck_sillaDeRuedas.setText("EN SILLA DE RUEDAS");
        ck_sillaDeRuedasFinal.setText("EN SILLA DE RUEDAS");
        ck_ayudas.setText("CON AYUDAS");
        ck_camilla.setText("EN CAMILLA");
        ck_independienteFinal.setText("INDEPENDIENTE");
        ck_ayudasFinal.setText("CON AYUDAS");
        ck_camillaFinal.setText("EN CAMILLA");

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

        //se aplica el color de fondo a los checkbox
        ck_queloide.setBackground(color_fondo);
        ck_retractil.setBackground(color_fondo);
        ck_abierta.setBackground(color_fondo);
        ck_adherencias.setBackground(color_fondo);
        ck_hipertrofica.setBackground(color_fondo);
        ck_libre.setBackground(color_fondo);
        ck_claudicante.setBackground(color_fondo);
        ck_ayuda.setBackground(color_fondo);
        ck_espastica.setBackground(color_fondo);
        ck_ataxica.setBackground(color_fondo);
        ck_independiente.setBackground(color_fondo);
        ck_sillaDeRuedas.setBackground(color_fondo);
        ck_sillaDeRuedasFinal.setBackground(color_fondo);
        ck_ayudas.setBackground(color_fondo);
        ck_camilla.setBackground(color_fondo);
        ck_independienteFinal.setBackground(color_fondo);
        ck_ayudasFinal.setBackground(color_fondo);
        ck_camillaFinal.setBackground(color_fondo);

        cb_escala = new JComboBox();
        cb_final = new JComboBox();
        cb_inicial = new JComboBox();

        lbl_titulo9 = new JLabel("Dolor");
        lbl_dolorRPID = new JLabel("Dolor: región principal y la irradiación del dolor:");
        lbl_eva = new JLabel("Escala visual analógica: EVA; sin dolor es 0, pero dolor es posible 10");
        lbl_noV = new JLabel("No valorado:");
        lbl_wB = new JLabel("Escala dolor Wong-Baker (pediátrico):");
        lbl_9_inicial = new JLabel("Inicial:");
        lbl_9_final = new JLabel("Final:");

        lbl_9_inicial.setForeground(color_lbl);
        lbl_9_final.setForeground(color_lbl);
        lbl_9_inicial.setFont(Fuente_lbl);
        lbl_9_final.setFont(Fuente_lbl);

        p_nueve_final.setBackground(color_fondo);
        p_nueve_final.setLayout(new GridBagLayout());
        txt_campoDolor = new MyTextField();

        panel_nueve.setLayout(new GridBagLayout());
        panel_nueve.setBackground(color_fondo);

        p_9_espacio10.setBackground(color_fondo);
        p_9_espacio9.setBackground(color_fondo);
        p_9_espacio8.setBackground(color_fondo);
        p_9_espacio7.setBackground(color_fondo);
        p_9_espacio6.setBackground(color_fondo);
        p_9_espacio5.setBackground(color_fondo);
        p_9_espacio4.setBackground(color_fondo);
        p_9_espacio3.setBackground(color_fondo);
        p_9_espacio2.setBackground(color_fondo);
        p_9_espacio1.setBackground(color_fondo);

        p_9_espacio11.setBackground(color_fondo);
        p_9_espacio12.setBackground(color_fondo);

        subtitulo.setLayout(new BorderLayout());
        subtitulo.add(lbl_titulo9, BorderLayout.WEST);

        //declaracion de componentes panel 1
        agregarComponentes(panel_uno, lbl_fecha, 0, 0, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_fecha, 1, 0, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_nombre, 0, 2, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_nombre, 1, 2, 6, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_matricula, 7, 2, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_matricula, 8, 2, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_sexo, 0, 3, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_sexo, 1, 3, 1, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_edad, 2, 3, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_edad, 3, 3, 1, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_sala, 4, 3, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_sala, 5, 3, 1, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_telefono, 6, 3, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_telefono, 7, 3, 1, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_religion, 8, 3, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_religion, 9, 3, 1, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_ocupacion, 0, 4, 2, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_ocupacion, 1, 4, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_estadoCivil, 3, 4, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_estadoCivil, 4, 4, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, lbl_medicoTratante, 6, 4, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_uno, txt_medicoTratante, 7, 4, 3, 1, 1, 0, fill, insets, 10, 10);
        //declaracion de componentes panel dos
        agregarComponentes(panel_dos, lbl_origen, 0, 0, 2, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_origen, 0, 1, 2, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_radica, 2, 0, 2, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_radica, 2, 1, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_eciv, 6, 0, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_eciv, 6, 1, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_ocup, 8, 0, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_ocup, 8, 1, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_escolaridad, 0, 2, 3, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_escolaridad, 0, 3, 3, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_svsMunicipales, 3, 2, 3, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_svsMunicipales, 3, 3, 3, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_religion2, 6, 2, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_religion2, 6, 3, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_habitacion, 8, 2, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_habitacion, 8, 3, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, chk_tabaquismo, 0, 4, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, chk_etilismo, 1, 4, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_higienePnal, 2, 4, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_higienePnal, 3, 4, 7, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_alimentacion, 0, 6, 3, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_alimentacion, 1, 6, 9, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_pasatiempo, 0, 5, 1, 1, 0, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_pasatiempo, 1, 5, 9, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_otros, 0, 7, 3, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_otros, 0, 8, 3, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_dominio, 3, 7, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_dominio, 3, 8, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_hijos, 6, 7, 2, 1, 1, 0, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_hijos, 6, 8, 2, 1, 1, 0, fill, insets, 10, 10);

        //declaracion de componentes panel tres
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, lbl_3_Antecedentes_Patologicos, 0, 0, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Diabetes, 1, 1, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_HTA, 2, 1, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Cancer, 3, 1, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_EnfReumat, 5, 1, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_EnfReumat, 5, 1, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Cardiopatias, 7, 1, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Cirugias, 9, 1, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Diabetes, 1, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_HTA, 2, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Cancer, 3, 2, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_EnfReumat, 5, 2, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Cardiopatias, 7, 2, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Cirugias, 9, 2, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Alergias, 1, 3, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Transfuciones, 2, 3, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Accidentes, 3, 3, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Encames, 4, 3, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, lbl_3_Fracturas, 5, 3, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, lbl_3_Signos_Vitales, 7, 3, 8, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Alergias, 1, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Transfusiones, 2, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Accidentes, 3, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_tres, cb_3_Fracturas, 5, 4, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_TA, 7, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, txt_3_TA, 8, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_Temp, 9, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, txt_3_TEMP, 10, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_FC, 11, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, txt_3_FC, 12, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_tres, lbl_3_FR, 13, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_tres, txt_3_FR, 14, 4, 1, 1, 1.0, 1.0, fill, insets, 10, 10);

        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_cuatro, lbl_4_Exploracion_neurologica, 1, 5, 14, 4, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_cuatro, lbl_4_Diagnsotico_medico, 1, 7, 14, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_4_Reflejos, 1, 8, 4, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_4_Sensibilidad, 5, 8, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_4_Lenguaje_orentiacion, 7, 8, 4, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_4_Otros, 11, 8, 4, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, txt_4_Rfelejos, 1, 9, 4, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, txt_4_Sensibilidad, 5, 9, 2, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, txt_4_Lenguaje_Orientacion, 7, 9, 4, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, txt_4_Otros, 11, 9, 4, 1, 1.0, 1.0, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_5_Espamos, 1, 10, 14, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, lbl_5_Sitio, 1, 11, 14, 1, 1.0, 1.0, fill, insets, 10, 10);
        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_cuatro, txt_5_Sitio, 1, 12, 14, 1, 1.0, 1.0, fill, insets, 10, 10);

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

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_seis, ck_queloide, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_retractil, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_seis, ck_retractil, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_abierta, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_seis, ck_abierta, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_adherencias, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_seis, ck_adherencias, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_seis, lbl_hipertrofica, 5, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_seis, ck_hipertrofica, 5, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_titulo_siete, 0, 0, 6, 1, 1, 0.5, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_libre, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_siete, ck_libre, 0, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_claudicante, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_siete, ck_claudicante, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_ayuda, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_siete, ck_ayuda, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_espastica, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_siete, ck_espastica, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_siete, lbl_ataxica, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
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

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_independiente, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_independienteFinal, 1, 3, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_independienteFinal, 1, 4, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_sillaDeRuedas, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_sillaDeRuedas, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_sillaDeRuedasFinal, 2, 3, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_sillaDeRuedasFinal, 2, 4, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_ayudas, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_ayudas, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_ayudasFinal, 3, 3, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_ayudasFinal, 3, 4, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_camilla, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_camilla, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        configurarComponentes(panel_ocho, lbl_camillaFinal, 4, 3, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.CENTER;
        configurarComponentes(panel_ocho, ck_camillaFinal, 4, 4, 1, 1, 1, 1, fill, insets, 10, 10);

        fill = GridBagConstraints.BOTH;
        agregarComponentes(panel_nueve, subtitulo, 0, 0, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, lbl_dolorRPID, 0, 1, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, txt_campoDolor, 2, 1, 9, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio1, 0, 2, 9, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio2, 1, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio3, 2, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio4, 3, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio5, 4, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio6, 5, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio7, 6, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio8, 7, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio9, 8, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio10, 9, 2, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, lbl_eva, 0, 3, 6, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio11, 0, 4, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, lbl_noV, 0, 5, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, cb_escala, 1, 5, 9, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_9_espacio12, 0, 6, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, lbl_wB, 0, 7, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_escalaWB, 0, 8, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_nueve_final, 0, 9, 10, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(panel_nueve, p_nueve_final, 0, 9, 10, 1, 1.0, 1.0, fill, insets, 10, 10);

        agregarComponentes(p_nueve_final, lbl_9_inicial, 0, 0, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(p_nueve_final, cb_inicial, 1, 0, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(p_nueve_final, lbl_9_final, 2, 0, 1, 1, 1.0, 1.0, fill, insets, 10, 10);
        agregarComponentes(p_nueve_final, cb_final, 3, 0, 1, 1, 1.0, 1.0, fill, insets, 10, 10);

        panel_Botones.add(btn_limpiar);
        panel_Botones.add(btn_guardar);
        panel_Botones.add(btn_nuevoRegistro);

        GridBagConstraints gbcPanel = new GridBagConstraints();
        this.setLayout(new GridBagLayout());
        gbcPanel.fill = GridBagConstraints.BOTH;
        gbcPanel.weightx = 1;

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 0;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_uno, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 1;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_dos, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 2;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_tres, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 3;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_cuatro, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 4;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_cinco, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 5;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_seis, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 6;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_siete, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 7;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_ocho, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 8;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_nueve, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 9;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;

        this.add(panel_Botones, gbcPanel);

        btn_limpiar.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //panel 1
                txt_fecha.setText("");
                txt_nombre.setText("");
                txt_matricula.setText("");
                txt_sexo.setText("");
                txt_edad.setText("");
                txt_sala.setText("");
                txt_telefono.setText("");
                txt_religion.setText("");
                txt_ocupacion.setText("");
                txt_estadoCivil.setText("");
                txt_medicoTratante.setText("");
                //panel 2
                txt_origen.setText("");
                txt_radica.setText("");
                txt_eciv.setText("");
                txt_ocup.setText("");
                txt_escolaridad.setText("");
                txt_svsMunicipales.setText("");
                txt_religion2.setText("");
                txt_habitacion.setText("");
                chk_tabaquismo.setSelected(false);
                chk_etilismo.setSelected(false);
                txt_higienePnal.setText("");
                txt_alimentacion.setText("");
                txt_pasatiempo.setText("");
                txt_otros.setText("");
                txt_dominio.setText("");
                txt_hijos.setText("");
                //panel 3
                cb_3_Diabetes.setSelected(false);
                cb_3_HTA.setSelected(false);
                cb_3_Cancer.setSelected(false);
                cb_3_EnfReumat.setSelected(false);
                cb_3_Cardiopatias.setSelected(false);
                cb_3_Cirugias.setSelected(false);
                cb_3_Alergias.setSelected(false);
                cb_3_Transfusiones.setSelected(false);
                cb_3_Accidentes.setSelected(false);
                cb_3_Encames.setSelected(false);
                cb_3_Fracturas.setSelected(false);
                txt_3_TA.setText("");
                txt_3_TEMP.setText("");
                txt_3_FC.setText("");
                txt_3_FR.setText("");
                //panel 4
                txt_4_Rfelejos.setText("");
                txt_4_Sensibilidad.setText("");
                txt_4_Lenguaje_Orientacion.setText("");
                txt_4_Otros.setText("");

                //panel 5
                txt_5_Sitio.setText("");
                //panel 6
                txt_sitio.setText("");
                ck_queloide.setSelected(false);
                ck_retractil.setSelected(false);
                ck_abierta.setSelected(false);
                ck_adherencias.setSelected(false);
                ck_hipertrofica.setSelected(false);
                //panel 7
                ck_libre.setSelected(false);
                ck_claudicante.setSelected(false);
                ck_ayuda.setSelected(false);
                ck_espastica.setSelected(false);
                ck_ataxica.setSelected(false);
                txt_otras.setText("");
                //panel 8
                ck_independiente.setSelected(false);
                ck_sillaDeRuedas.setSelected(false);
                ck_ayudas.setSelected(false);
                ck_camilla.setSelected(false);
                ck_independienteFinal.setSelected(false);
                ck_sillaDeRuedasFinal.setSelected(false);
                ck_ayudasFinal.setSelected(false);
                ck_camillaFinal.setSelected(false);
                //panel 9
                txt_campoDolor.setText("");
                cb_escala.setSelectedIndex(0);
                cb_final.setSelectedIndex(0);
                cb_inicial.setSelectedIndex(0);
            }
        });

        btn_guardar.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nombre = txt_nombre.getText();
                String matriculaStr = txt_matricula.getText();
                String sexoStr = txt_sexo.getText();
                String edadStr = txt_edad.getText();
                String telefonoStr = txt_telefono.getText();
                String edoCivilStr = txt_estadoCivil.getText();
                String religion = txt_religion.getText();
                String ocupacion = txt_ocupacion.getText();
                String fechaCadena = txt_fecha.getText();

                try {
                    int matricula = Integer.parseInt(matriculaStr);
                    char sexo = sexoStr.charAt(0);
                    int edad = Integer.parseInt(edadStr);
                    int telefono = Integer.parseInt(telefonoStr);
                    int edoCivil = Integer.parseInt(edoCivilStr);

                    String[] fechaSeparada = fechaCadena.split("/");
                    if (fechaSeparada.length == 3) {
                        int dia = Integer.parseInt(fechaSeparada[0]);
                        int mes = Integer.parseInt(fechaSeparada[1]);
                        int anio = Integer.parseInt(fechaSeparada[2]);

                        // Crea una instancia de Fecha
                        Fecha fecha = new Fecha(dia, mes, anio);

                        Paciente pac = new Paciente(fecha, nombre, matricula, sexo, edad, telefono, edoCivil, religion, ocupacion);
                        repoPac.agregarPaciente(pac);

                        txt_nombre.setText("");
                        txt_matricula.setText("");
                        txt_sexo.setText("");
                        txt_edad.setText("");
                        txt_telefono.setText("");
                        txt_estadoCivil.setText("");
                        txt_religion.setText("");
                        txt_ocupacion.setText("");
                        txt_fecha.setText("");

                        System.out.println(" estoy hartop");
                        
                    } else {
                    }

                } catch (DiaInvalido | MesInvalido ex) {
                }
            }

            String medicoTratante = txt_medicoTratante.getText();
            //panel 2
            String origen = txt_origen.getText();
            String radica = txt_radica.getText();
            String escolaridad = txt_escolaridad.getText();
            String svsMunicipales = txt_svsMunicipales.getText();
            String habitacion = txt_habitacion.getText();
            boolean tabaquismo = chk_tabaquismo.isSelected();
            boolean etilismo = chk_etilismo.isSelected();
            String higienePnal = txt_higienePnal.getText();
            String alimentacion = txt_alimentacion.getText();
            String pasatiempo = txt_pasatiempo.getText();
            String otros = txt_otros.getText();
            String dominio = txt_dominio.getText();
            String hijos = txt_hijos.getText();
            //panel 3
            boolean diabetes = cb_3_Diabetes.isSelected();
            boolean HTA = cb_3_HTA.isSelected();
            boolean cancer = cb_3_Cancer.isSelected();
            boolean enfReumat = cb_3_EnfReumat.isSelected();
            boolean cardiopatias = cb_3_Cardiopatias.isSelected();
            boolean cirugias = cb_3_Cirugias.isSelected();
            boolean alergias = cb_3_Alergias.isSelected();
            boolean transfusiones = cb_3_Transfusiones.isSelected();
            boolean accidentes = cb_3_Accidentes.isSelected();
            boolean encames = cb_3_Encames.isSelected();
            boolean fracturas = cb_3_Fracturas.isSelected();
            String TA = txt_3_TA.getText();
            String TEMP = txt_3_TEMP.getText();
            String FC = txt_3_FC.getText();
            String FR = txt_3_FR.getText();
            //panel 4
            String Reflejos = txt_4_Rfelejos.getText();
            String Sensibilidad = txt_4_Sensibilidad.getText();
            String LenguajeOrientacion = txt_4_Lenguaje_Orientacion.getText();
            String otros_p_4 = txt_4_Otros.getText();

            //panel 5
            String sitio_p_5 = txt_5_Sitio.getText();
            //panel 6
            String sitio_p6 = txt_sitio.getText();
            boolean queloide = ck_queloide.isSelected();
            boolean retractil = ck_retractil.isSelected();
            boolean abierta = ck_abierta.isSelected();
            boolean adherencias = ck_adherencias.isSelected();
            boolean hipertroficca = ck_hipertrofica.isSelected();
            //panel 7
            boolean libre = ck_libre.isSelected();
            boolean claudicante = ck_claudicante.isSelected();
            boolean ayuda = ck_ayuda.isSelected();
            boolean espastica = ck_espastica.isSelected();
            boolean ataxica = ck_ataxica.isSelected();
            String otras_p_7 = txt_otras.getText();
            //panel 8
            boolean independienteInicial = ck_independiente.isSelected();
            boolean sillaDeRuedasInicial = ck_sillaDeRuedas.isSelected();
            boolean ayudasInicial = ck_ayudas.isSelected();
            boolean camillaInicial = ck_camilla.isSelected();
            boolean independienteFinal = ck_independienteFinal.isSelected();
            boolean sillaDeRuedasFinal = ck_sillaDeRuedasFinal.isSelected();
            boolean ayudasFianl = ck_ayudasFinal.isSelected();
            boolean camillaFinal = ck_camillaFinal.isSelected();
            //panel 9
            String campoDolor = txt_campoDolor.getText();

        });

    }

    //Método para acomodo de gridBag
    private void agregarComponentes(JPanel panel, Component componente, int columna, int fila, int ancho, int alto, double pesoX, double pesoY, int fill, Insets insets, int ipadx, int ipady) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = columna;
        gbc.gridy = fila;
        gbc.gridwidth = ancho;
        gbc.gridheight = alto;
        gbc.weightx = pesoX;
        gbc.weighty = pesoY;
        gbc.fill = fill;
        gbc.insets = insets;
        gbc.ipadx = ipadx;
        gbc.ipady = ipady;
        panel.add(componente, gbc);
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

        contenedor.add(componente, constraints);
    }

    private boolean permitida(int tipo, char c) {
        if (tipo == 1 && letra(c)) {
            return true;
        } else if (tipo == 2 && digito(c)) {
            return true;
        } else if (tipo == 4 && caracterEspecial(c)) {
            return true;
        } else if (tipo == 3 || digito(c)) {
            return true;
        } else if (tipo == 5 || caracterEspecial(c)) {
            return true;
        } else if (tipo == 6 && digito(c) || caracterEspecial(c)) {
            return true;
        }
        return false;
    }

    private void mayusculas(KeyEvent evt) {
        char letra = evt.getKeyChar();
        if (letra(letra)) {
            if (Character.isLowerCase(letra)) {
                String mayuscula = ("" + letra).toUpperCase();
                letra = mayuscula.charAt(0);
                evt.setKeyChar(letra);
            }
        }
    }

    private boolean digito(char caracter) {
        if (Character.isSpaceChar(caracter) || Character.isLetter(caracter)) {
            return true;
        }
        return false;
    }

    private boolean letra(char caracter) {
        if (Character.isSpaceChar(caracter) || Character.isLetter(caracter)) {
            return true;
        }
        return false;
    }

    private boolean caracterEspecial(char caracter) {
        char[] caracteres = {'|', '°', '¬', '!', '"', '$', '#', '%', '&',
            '/', '(', ')', '=', '?', '\'', '¡', '¿', '´', '*', '~', '+', '[', ']',
            '{', '}', '`', ';', ',', ':', '.', '-', '_', '>', '<', '@'};
        for (int i = 0; i < caracteres.length; i++) {
            if (caracter == caracteres[i]) {
                return true;
            }
        }
        return false;
    }

    Coordinador coordinador;

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }
}
