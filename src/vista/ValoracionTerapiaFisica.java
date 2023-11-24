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

import modelo.vo.Calendario;

public final class ValoracionTerapiaFisica extends JPanel {
    Calendario cale;
    
    //RepositorioPacientes repoPac = new RepositorioPacientes();
    
    //llamado de los paneles
    JPanel panel_uno;//Titulo antecedentes personales no patologicos
    JPanel panel_dos;//antecedentes personales no patologicos
    JPanel panel_tres;//titulo antecedentes personales y heredofamiliares
    JPanel panel_cuatro;//antecedentes personales y heredofamiliares
    JPanel panel_cinco;//titulo diagnostico medico y subtitulo exploracion neurologica
    JPanel panel_seis;//exploracion neurologica
    JPanel panel_siete;//titulo espasmos o contractura muscular
    JPanel panel_ocho;// espasmos o contractura muscular
    JPanel panel_nueve;// titulo cicatriz quirurgica
    JPanel panel_diez;// info cicatriz quirurgica
    JPanel panel_once;// titulo marcha
    JPanel panel_doce;// info marcha
    JPanel panel_trece;// titulo traslados
    JPanel panel_catorce;// info traslados
    JPanel panel_quince;// titulo dolor 
    JPanel panel_diecisesis;// info dolor
    JPanel panel_Botones;
    
    //titulos y subtitulos (paneles impares uno, tres, cinco, siete, nueve, once, trece, quince)
    JLabel lbl_Antecedentes_No_Patologicos;
    JLabel lbl_Antecedentes_Patologicos;
    JLabel lbl_Diagnostico_Medico;
    JLabel lbl_Exploracion_Neurologica;
    JLabel lbl_titulo_Espasmos;
    JLabel lbl_titulo_Cicatriz;
    JLabel lbl_titulo_Marcha;
    JLabel lbl_titulo_Traslados;
    JLabel lbl_titulo_Dolor;
    
    //componentes panel dos
    JLabel lbl_fecha;
    MyTextField txt_fecha;
    JLabel lbl_nombre;
    MyTextField txt_nombre;
    JLabel lbl_matricula;
    MyTextField txt_matricula;
    JLabel lbl_sexo;
    JComboBox cb_sexo;
    JLabel lbl_edad;
    MyTextField txt_edad;
    JLabel lbl_telefono;
    MyTextField txt_telefono;
    JLabel lbl_religion;
    MyTextField txt_religion;
    JLabel lbl_ocupacion;
    MyTextField txt_ocupacion;
    JLabel lbl_estadoCivil;
    JComboBox cb_estadoCivil;
    JLabel lbl_origen;
    MyTextField txt_origen;
    JLabel lbl_radica;
    MyTextField txt_radica;
    JLabel lbl_escolaridad;
    JComboBox cb_escolaridad;
    JLabel lbl_higienePNAL;
    MyTextField txt_higienePNAL;
    JLabel lbl_pasatiempo;
    MyTextField txt_pasatiempo;
    JLabel lbl_alimentacion;
    MyTextField txt_alimentacion;
    JLabel lbl_dominio;
    JComboBox cb_dominio;
    JLabel lbl_hijos;
    JComboBox cb_hijos;

    //componentes panel cuatro
    JLabel lbl_Signos_Vitales;
    JLabel lbl_TA;
    MyTextField txt_TA;
    JLabel lbl_Temp;
    MyTextField txt_TEMP;
    JLabel lbl_FC;
    MyTextField txt_FC;
    JLabel lbl_FR;
    MyTextField txt_FR;
    
    JCheckBox ck_Diabetes;
    JCheckBox ck_HTA;
    JCheckBox ck_Cancer;
    JCheckBox ck_EnfReumat;
    JCheckBox ck_Cardiopatias;
    JCheckBox ck_Cirugias;
    JCheckBox ck_Alergias;
    JCheckBox ck_Transfusiones;
    JCheckBox ck_Accidentes;
    JCheckBox ck_Encames;
    JCheckBox ck_Fracturas;
    JCheckBox ck_Tabaquismo;
    JCheckBox ck_Etilismo;
    
    //componentes panel seis
    JLabel lbl_Reflejos;
    JLabel lbl_Sensibilidad;
    JLabel lbl_Lenguaje_orentiacion;
    MyTextField txt_Rfelejos;
    MyTextField txt_Sensibilidad;
    MyTextField txt_Lenguaje_Orientacion;
    
    //componentes panel ocho
    JLabel lbl_sitio_espasmos;
    MyTextField txt_sitio_espasmos;

    //componentes panel diez
    JLabel lbl_sitio_cicatriz;
    MyTextField txt_sitio_cicatriz;
    JCheckBox ck_queloide;
    JCheckBox ck_retractil;
    JCheckBox ck_abierta;
    JCheckBox ck_adherencias;
    JCheckBox ck_hipertrofica;

    //componentes panel doce
    JCheckBox ck_libre;
    JCheckBox ck_claudicante;
    JCheckBox ck_ayuda;
    JCheckBox ck_espastica;
    JCheckBox ck_ataxica;

    //componentes panel catorce
    JLabel lbl_valInicial;
    JCheckBox ck_independiente;
    JCheckBox ck_sillaDeRuedas;
    JCheckBox ck_ayudas;
    JCheckBox ck_camilla;
    JLabel lbl_valFinal;
    JCheckBox ck_independiente_Final;
    JCheckBox ck_sillaDeRuedas_Final;
    JCheckBox ck_ayudas_Final;
    JCheckBox ck_camilla_Final;

    //componentes panel dieciseis
    JLabel lbl_region_dolor;
    MyTextField txt_region_dolor;
    JLabel lbl_eva_inicial;
    JLabel lbl_eva_final;
    JComboBox cb_final;
    JComboBox cb_inicial;

    //componentes panel diecisiete (panel botones)
    JButton btn_guardar;
    JButton btn_limpiar;
    JButton btn_nuevoRegistro;

    JScrollPane sb_panel;
    
    public ValoracionTerapiaFisica(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes()  {
        Insets insets = new Insets(10, 10, 10, 10);
        int fill = GridBagConstraints.HORIZONTAL;
        Font Fuente_lbl = new Font("Arial", Font.BOLD, 15);
        Font Fuente_titulo = new Font("Arial", Font.BOLD, 20);
        Color color_lbl = new Color(0, 0, 0);
        Color color_fondo = new Color(224, 224, 224, 100);
        String[] sexo = {"Seleccionar","Masculino","Femenino"};
        String[] edoCiv = {"Seleccionar","Soltero","Casado","Divorciado"};
        String[] escolaridad = {"Seleccionar","Basico","Medio superior","Superior"};
        String[] dominio = {"Seleccionar","Diestro","Zurdo"};
        String[] hijos ={"Seleccionar","Ninguno","Uno","Dos","Tres o mas"};
        String[] escalaDolor ={"Seleccionar","0","1","2","3","4","5","6","7","8","9","10"};
        
        //objeto calendario
        cale = new Calendario();
        
        //declaracion de paneles
        panel_uno = new JPanel(new FlowLayout());
        panel_uno.setBackground(color_fondo);
        panel_dos = new JPanel(new GridBagLayout());
        panel_dos.setBackground(color_fondo);
        panel_tres = new JPanel(new FlowLayout());
        panel_tres.setBackground(color_fondo);
        panel_cuatro = new JPanel(new GridBagLayout());
        panel_cuatro.setBackground(color_fondo);
        panel_cinco = new JPanel(new GridBagLayout());
        panel_cinco.setBackground(color_fondo);
        panel_seis = new JPanel(new GridBagLayout());
        panel_seis.setBackground(color_fondo);
        panel_siete = new JPanel(new FlowLayout());
        panel_siete.setBackground(color_fondo);
        panel_ocho = new JPanel(new GridBagLayout());
        panel_ocho.setBackground(color_fondo);
        panel_nueve = new JPanel(new FlowLayout());
        panel_nueve.setBackground(color_fondo);
        panel_diez = new JPanel(new GridBagLayout());
        panel_diez.setBackground(color_fondo);
        panel_once = new JPanel(new FlowLayout());
        panel_once.setBackground(color_fondo);
        panel_doce = new JPanel(new GridBagLayout());
        panel_doce.setBackground(color_fondo);
        panel_trece = new JPanel(new FlowLayout());
        panel_trece.setBackground(color_fondo);
        panel_catorce = new JPanel(new GridBagLayout());
        panel_catorce.setBackground(color_fondo);
        panel_quince = new JPanel(new FlowLayout());
        panel_quince.setBackground(color_fondo);
        panel_diecisesis = new JPanel(new GridBagLayout());
        panel_diecisesis.setBackground(color_fondo);
        panel_Botones = new JPanel(new FlowLayout());
        panel_Botones.setBackground(color_fondo);
        
        //componentes del panel uno
        lbl_Antecedentes_No_Patologicos = new JLabel("ANTECEDENTES PERSONALES NO PATOLOGICOS");
        lbl_Antecedentes_No_Patologicos.setForeground(color_lbl);
        lbl_Antecedentes_No_Patologicos.setFont(Fuente_titulo);
        
        //componentes del panel dos
        lbl_fecha = new JLabel("Fecha:");
        txt_fecha = new MyTextField();
        lbl_nombre = new JLabel("Nombre:");
        txt_nombre = new MyTextField();
        lbl_matricula = new JLabel("Matricula:");
        txt_matricula = new MyTextField();
        lbl_sexo = new JLabel("Sexo:");
        lbl_edad = new JLabel("Edad:");
        txt_edad = new MyTextField();
        lbl_telefono = new JLabel("Telefono:");
        txt_telefono = new MyTextField();
        lbl_religion = new JLabel("Religion:");
        txt_religion = new MyTextField();
        lbl_ocupacion = new JLabel("Ocupacion:");
        txt_ocupacion = new MyTextField();
        lbl_estadoCivil = new JLabel("Estado civil:");
        lbl_origen = new JLabel("Originario de:");
        txt_origen = new MyTextField();
        lbl_radica = new JLabel("Radica en:");
        txt_radica = new MyTextField();
        lbl_escolaridad = new JLabel("Escolaridad:");
        lbl_higienePNAL = new JLabel("Higiene PNAL:");
        txt_higienePNAL = new MyTextField();
        lbl_pasatiempo = new JLabel("Pasatiempo:");
        txt_pasatiempo = new MyTextField();
        lbl_alimentacion = new JLabel("Alimentacion:");
        txt_alimentacion = new MyTextField();
        lbl_dominio = new JLabel("Dominio:");
        cb_dominio = new JComboBox(dominio);
        lbl_hijos = new JLabel("Hijos:");
        cb_hijos = new JComboBox(hijos);
        cb_sexo = new JComboBox(sexo);
        cb_escolaridad = new JComboBox(escolaridad);
        cb_estadoCivil = new JComboBox(edoCiv);
        
        txt_fecha.setText(cale.getComponenteFecha());
        
        lbl_fecha.setForeground(color_lbl);
        lbl_nombre.setForeground(color_lbl);
        lbl_matricula.setForeground(color_lbl);
        lbl_sexo.setForeground(color_lbl);
        lbl_edad.setForeground(color_lbl);
        lbl_telefono.setForeground(color_lbl);
        lbl_religion.setForeground(color_lbl);
        lbl_ocupacion.setForeground(color_lbl);
        lbl_estadoCivil.setForeground(color_lbl);
        lbl_origen.setForeground(color_lbl);
        lbl_radica.setForeground(color_lbl);
        lbl_escolaridad.setForeground(color_lbl);
        lbl_higienePNAL.setForeground(color_lbl);
        lbl_pasatiempo.setForeground(color_lbl);
        lbl_alimentacion.setForeground(color_lbl);
        lbl_dominio.setForeground(color_lbl);
        lbl_hijos.setForeground(color_lbl);

        lbl_fecha.setFont(Fuente_lbl);
        lbl_nombre.setFont(Fuente_lbl);
        lbl_matricula.setFont(Fuente_lbl);
        lbl_sexo.setFont(Fuente_lbl);
        lbl_edad.setFont(Fuente_lbl);
        lbl_telefono.setFont(Fuente_lbl);
        lbl_religion.setFont(Fuente_lbl);
        lbl_ocupacion.setFont(Fuente_lbl);
        lbl_estadoCivil.setFont(Fuente_lbl);
        lbl_origen.setFont(Fuente_lbl);
        lbl_radica.setFont(Fuente_lbl);
        lbl_escolaridad.setFont(Fuente_lbl);
        lbl_higienePNAL.setFont(Fuente_lbl);
        lbl_pasatiempo.setFont(Fuente_lbl);
        lbl_alimentacion.setFont(Fuente_lbl);
        lbl_dominio.setFont(Fuente_lbl);
        lbl_hijos.setFont(Fuente_lbl);
        
        //componentes panel tres
        lbl_Antecedentes_Patologicos = new JLabel("ANTECEDENTES PATOLOGICOS Y HEREDOFAMILIARES");
        lbl_Antecedentes_Patologicos.setForeground(color_lbl);
        lbl_Antecedentes_Patologicos.setFont(Fuente_titulo);
        
        //componentes panel cuatro
        lbl_Signos_Vitales = new JLabel("Signos vitales");
        lbl_TA = new JLabel("T/A:");
        txt_TA= new MyTextField();
        lbl_Temp = new JLabel("TEMPERATURA:");
        txt_TEMP= new MyTextField();
        lbl_FC = new JLabel("FC:");
        txt_FC= new MyTextField();
        lbl_FR = new JLabel("FR:");
        txt_FR= new MyTextField();

        lbl_Signos_Vitales.setForeground(color_lbl);
        lbl_TA.setForeground(color_lbl);
        lbl_Temp.setForeground(color_lbl);
        lbl_FC.setForeground(color_lbl);
        lbl_FR.setForeground(color_lbl);

        lbl_Signos_Vitales.setFont(Fuente_lbl);
        lbl_TA.setFont(Fuente_lbl);
        lbl_Temp.setFont(Fuente_lbl);
        lbl_FC.setFont(Fuente_lbl);
        lbl_FR.setFont(Fuente_lbl);
        
        ck_Diabetes = new JCheckBox();
        ck_HTA = new JCheckBox();
        ck_Cancer = new JCheckBox();
        ck_EnfReumat = new JCheckBox();
        ck_Cardiopatias = new JCheckBox();
        ck_Cirugias = new JCheckBox();
        ck_Alergias = new JCheckBox();
        ck_Transfusiones = new JCheckBox();
        ck_Accidentes = new JCheckBox();
        ck_Encames = new JCheckBox();
        ck_Fracturas = new JCheckBox();
        ck_Tabaquismo = new JCheckBox();
        ck_Etilismo = new JCheckBox();

        ck_Diabetes.setText("Diabetes");
        ck_HTA.setText("HTA");
        ck_Cancer.setText("Cancer");
        ck_EnfReumat.setText("Enf. Reumat.");
        ck_Cardiopatias.setText("Cardiopatias");
        ck_Cirugias.setText("Cirugias");
        ck_Alergias.setText("Alergias");
        ck_Transfusiones.setText("Transfusiones");
        ck_Accidentes.setText("Accidentes");
        ck_Encames.setText("Encames");
        ck_Fracturas.setText("Fracturas");
        ck_Tabaquismo.setText("Tabaquismo");
        ck_Etilismo.setText("Etilismo");

        ck_Diabetes.setFont(Fuente_lbl);
        ck_HTA.setFont(Fuente_lbl);
        ck_Cancer.setFont(Fuente_lbl);
        ck_EnfReumat.setFont(Fuente_lbl);
        ck_Cardiopatias.setFont(Fuente_lbl);
        ck_Cirugias.setFont(Fuente_lbl);
        ck_Alergias.setFont(Fuente_lbl);
        ck_Transfusiones.setFont(Fuente_lbl);
        ck_Accidentes.setFont(Fuente_lbl);
        ck_Encames.setFont(Fuente_lbl);
        ck_Fracturas.setFont(Fuente_lbl);
        ck_Tabaquismo.setFont(Fuente_lbl);
        ck_Etilismo.setFont(Fuente_lbl);

        ck_Diabetes.setForeground(color_lbl);
        ck_HTA.setForeground(color_lbl);
        ck_Cancer.setForeground(color_lbl);
        ck_EnfReumat.setForeground(color_lbl);
        ck_Cardiopatias.setForeground(color_lbl);
        ck_Cirugias.setForeground(color_lbl);
        ck_Alergias.setForeground(color_lbl);
        ck_Transfusiones.setForeground(color_lbl);
        ck_Accidentes.setForeground(color_lbl);
        ck_Encames.setForeground(color_lbl);
        ck_Fracturas.setForeground(color_lbl);
        ck_Tabaquismo.setForeground(color_lbl);
        ck_Etilismo.setForeground(color_lbl);

        ck_Diabetes.setBackground(color_fondo);
        ck_HTA.setBackground(color_fondo);
        ck_Cancer.setBackground(color_fondo);
        ck_EnfReumat.setBackground(color_fondo);
        ck_Cardiopatias.setBackground(color_fondo);
        ck_Cirugias.setBackground(color_fondo);
        ck_Alergias.setBackground(color_fondo);
        ck_Transfusiones.setBackground(color_fondo);
        ck_Accidentes.setBackground(color_fondo);
        ck_Encames.setBackground(color_fondo);
        ck_Fracturas.setBackground(color_fondo);
        ck_Tabaquismo.setBackground(color_fondo);
        ck_Etilismo.setBackground(color_fondo);
        
        //componentes panel cinco
        lbl_Diagnostico_Medico = new JLabel("DIAGNOSTICO MEDICO EN REAHBILITACION");
        lbl_Diagnostico_Medico.setForeground(color_lbl);
        lbl_Diagnostico_Medico.setFont(Fuente_titulo);        
        
        lbl_Exploracion_Neurologica = new JLabel("EXPLORACION NEUROLOGICA I");
        lbl_Exploracion_Neurologica.setForeground(color_lbl);
        lbl_Exploracion_Neurologica.setFont(Fuente_titulo);        
        
        //componentes panel seis 
        lbl_Reflejos = new JLabel("Reflejos:");
        lbl_Sensibilidad = new JLabel("Sensibilidad:");
        lbl_Lenguaje_orentiacion = new JLabel("Reflejos y orientacion:");
        
        lbl_Reflejos.setForeground(color_lbl);
        lbl_Sensibilidad.setForeground(color_lbl);
        lbl_Lenguaje_orentiacion.setForeground(color_lbl);
        
        lbl_Reflejos.setFont(Fuente_lbl);
        lbl_Sensibilidad.setFont(Fuente_lbl);
        lbl_Lenguaje_orentiacion.setFont(Fuente_lbl);
        
        txt_Rfelejos = new MyTextField();
        txt_Sensibilidad = new MyTextField();
        txt_Lenguaje_Orientacion = new MyTextField();
        
        //conponentes panel siete
        lbl_titulo_Espasmos = new JLabel("ESPASMOS O CONTRACTURA MUSCULAR");
        lbl_titulo_Espasmos.setForeground(color_lbl);
        lbl_titulo_Espasmos.setFont(Fuente_titulo);
        
        //componentes panel ocho
        lbl_sitio_espasmos = new JLabel("Sitio:");
        lbl_sitio_espasmos.setForeground(color_lbl);
        lbl_sitio_espasmos.setFont(Fuente_lbl);
        
        txt_sitio_espasmos = new MyTextField();
        
        //componentes panel nueve
        lbl_titulo_Cicatriz = new JLabel("CICATRIZ QUIRURGICA");
        lbl_titulo_Cicatriz.setForeground(color_lbl);
        lbl_titulo_Cicatriz.setFont(Fuente_titulo);
        
        //componentes panel diez
        lbl_sitio_cicatriz = new JLabel("Sitio:");
        lbl_sitio_cicatriz.setForeground(color_lbl);
        lbl_sitio_cicatriz.setFont(Fuente_lbl);
        
        txt_sitio_cicatriz = new MyTextField();
         
        ck_queloide = new JCheckBox();
        ck_retractil = new JCheckBox();
        ck_abierta = new JCheckBox();
        ck_adherencias = new JCheckBox();
        ck_hipertrofica = new JCheckBox();
        
        ck_queloide.setText("Queloide");
        ck_retractil.setText("Retractil");
        ck_abierta.setText("Abierta");
        ck_adherencias.setText("Con adherencias");
        ck_hipertrofica.setText("Hipertrofica");
        
        ck_queloide.setForeground(color_lbl);
        ck_retractil.setForeground(color_lbl);
        ck_abierta.setForeground(color_lbl);
        ck_adherencias.setForeground(color_lbl);
        ck_hipertrofica.setForeground(color_lbl);
        
        ck_queloide.setFont(Fuente_lbl);
        ck_retractil.setFont(Fuente_lbl);
        ck_abierta.setFont(Fuente_lbl);
        ck_adherencias.setFont(Fuente_lbl);
        ck_hipertrofica.setFont(Fuente_lbl);

        ck_queloide.setBackground(color_fondo);
        ck_retractil.setBackground(color_fondo);
        ck_abierta.setBackground(color_fondo);
        ck_adherencias.setBackground(color_fondo);
        ck_hipertrofica.setBackground(color_fondo);
        
        //componentes panel once
        lbl_titulo_Marcha = new JLabel("MARCHA");
        lbl_titulo_Marcha.setForeground(color_lbl);
        lbl_titulo_Marcha.setFont(Fuente_titulo);
        
        //componentes panel doce
        ck_libre = new JCheckBox();
        ck_claudicante = new JCheckBox();
        ck_ayuda = new JCheckBox();
        ck_espastica = new JCheckBox();
        ck_ataxica = new JCheckBox();
        
        ck_libre.setText("Libre");
        ck_claudicante.setText("Claudicante");
        ck_ayuda.setText("Con ayudas");
        ck_espastica.setText("Espastica");
        ck_ataxica.setText("Ataxica");
        
        ck_libre.setFont(Fuente_lbl);
        ck_claudicante.setFont(Fuente_lbl);
        ck_ayuda.setFont(Fuente_lbl);
        ck_espastica.setFont(Fuente_lbl);
        ck_ataxica.setFont(Fuente_lbl);
        
        ck_libre.setForeground(color_lbl);
        ck_claudicante.setForeground(color_lbl);
        ck_ayuda.setForeground(color_lbl);
        ck_espastica.setForeground(color_lbl);
        ck_ataxica.setForeground(color_lbl);

        ck_libre.setBackground(color_fondo);
        ck_claudicante.setBackground(color_fondo);
        ck_ayuda.setBackground(color_fondo);
        ck_espastica.setBackground(color_fondo);
        ck_ataxica.setBackground(color_fondo);

        //componentes panel trece
        lbl_titulo_Traslados = new JLabel("TRASLADOS");
        lbl_titulo_Traslados.setForeground(color_lbl);
        lbl_titulo_Traslados.setFont(Fuente_titulo);
        
        //componentes panel catorce
        lbl_valInicial= new JLabel("Val. Inicial.");
        lbl_valFinal= new JLabel("Val. Final.");
        
        lbl_valInicial.setForeground(color_lbl);
        lbl_valFinal.setForeground(color_lbl);
        
        lbl_valInicial.setFont(Fuente_lbl);
        lbl_valFinal.setFont(Fuente_lbl);
        
        ck_independiente = new JCheckBox();
        ck_sillaDeRuedas = new JCheckBox();
        ck_ayudas = new JCheckBox();
        ck_camilla = new JCheckBox();
        ck_independiente_Final = new JCheckBox();
        ck_sillaDeRuedas_Final = new JCheckBox();
        ck_ayudas_Final = new JCheckBox();
        ck_camilla_Final = new JCheckBox();
        
        ck_independiente.setText("Independiente");
        ck_sillaDeRuedas.setText("En silla de ruedas");
        ck_ayudas.setText("Con ayudas");
        ck_camilla.setText("En camilla");
        ck_independiente_Final.setText("Independiente");
        ck_sillaDeRuedas_Final.setText("En silla de ruedas");
        ck_ayudas_Final.setText("Con ayudas");
        ck_camilla_Final.setText("En camilla");
        
        ck_independiente.setFont(Fuente_lbl);
        ck_sillaDeRuedas.setFont(Fuente_lbl);
        ck_ayudas.setFont(Fuente_lbl);
        ck_camilla.setFont(Fuente_lbl);
        ck_independiente_Final.setFont(Fuente_lbl);
        ck_sillaDeRuedas_Final.setFont(Fuente_lbl);
        ck_ayudas_Final.setFont(Fuente_lbl);
        ck_camilla_Final.setFont(Fuente_lbl);
        
        ck_independiente.setForeground(color_lbl);
        ck_sillaDeRuedas.setForeground(color_lbl);
        ck_ayudas.setForeground(color_lbl);
        ck_camilla.setForeground(color_lbl);
        ck_independiente_Final.setForeground(color_lbl);
        ck_sillaDeRuedas_Final.setForeground(color_lbl);
        ck_ayudas_Final.setForeground(color_lbl);
        ck_camilla_Final.setForeground(color_lbl);
        
        ck_independiente.setBackground(color_fondo);
        ck_sillaDeRuedas.setBackground(color_fondo);
        ck_ayudas.setBackground(color_fondo);
        ck_camilla.setBackground(color_fondo);
        ck_independiente_Final.setBackground(color_fondo);
        ck_sillaDeRuedas_Final.setBackground(color_fondo);
        ck_ayudas_Final.setBackground(color_fondo);
        ck_camilla_Final.setBackground(color_fondo);
        
        //componentes panel quince
        lbl_titulo_Dolor = new JLabel("DOLOR");
        lbl_titulo_Dolor.setForeground(color_lbl);
        lbl_titulo_Dolor.setFont(Fuente_titulo);
        
        //componentes panel dieciseis
        lbl_region_dolor = new JLabel("Region principal y la irradiacion del dolor");
        lbl_eva_inicial = new JLabel("Inicial:");
        lbl_eva_final = new JLabel("Final:");

        lbl_region_dolor.setForeground(color_lbl);
        lbl_eva_inicial.setForeground(color_lbl);
        lbl_eva_final.setForeground(color_lbl);

        lbl_region_dolor.setFont(Fuente_lbl);
        lbl_eva_inicial.setFont(Fuente_lbl);
        lbl_eva_final.setFont(Fuente_lbl);
        
        txt_region_dolor = new MyTextField();
        
        cb_final = new JComboBox(escalaDolor);
        cb_inicial = new JComboBox(escalaDolor);
        
        //Componentes del Panel Botones
        btn_guardar = new JButton("GUARDAR");
        btn_limpiar = new JButton("LIMPIAR");
        btn_nuevoRegistro = new JButton("NUEVO REGISTRO");
        //colocacion de los paneles
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
        this.add(panel_diez, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 10;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_once, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 11;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_doce, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 12;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_trece, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 13;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_catorce, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 14;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_quince, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 15;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_diecisesis, gbcPanel);

        gbcPanel.gridx = 0;
        gbcPanel.gridy = 16;
        gbcPanel.gridwidth = 1;
        gbcPanel.gridheight = 1;
        this.add(panel_Botones, gbcPanel);        
        
        //colocacion de los componentes en sus respectivos paneles
        panel_uno.add(lbl_Antecedentes_No_Patologicos);
        
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_dos, lbl_fecha, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_fecha, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_nombre, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_nombre, 1, 1, 3, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_matricula, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_matricula, 5, 1, 3, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_sexo, 0, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, cb_sexo, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_edad, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_edad, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_telefono, 4, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_telefono, 5, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_religion, 6, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_religion, 7, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_ocupacion, 0, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_ocupacion, 1, 3, 3, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_estadoCivil, 4, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, cb_estadoCivil, 5, 3, 3, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_higienePNAL, 0, 4, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_higienePNAL, 1, 4, 7, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_pasatiempo, 0, 5, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_pasatiempo, 1, 5, 7, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_alimentacion, 0, 6, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, txt_alimentacion, 1, 6, 7, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_dominio, 0, 7, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, cb_dominio, 1, 7, 3, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, lbl_hijos, 4, 7, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_dos, cb_hijos, 5, 7, 3, 1, 1, 1, fill, insets, 10, 10);
        
        panel_tres.add(lbl_Antecedentes_Patologicos);
        
        agregarComponentes(panel_cuatro, ck_Diabetes, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_HTA, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Cancer, 2, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_EnfReumat, 3, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Cardiopatias, 4, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Cirugias, 5, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Encames, 6, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Tabaquismo, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Etilismo, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Alergias, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Transfusiones, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Accidentes, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, ck_Fracturas, 5, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_cuatro, lbl_Signos_Vitales, 0, 2, 8, 1, 1, 1, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_cuatro, lbl_TA, 0, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, txt_TA, 1, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, lbl_Temp, 2, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, txt_TEMP, 3, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, lbl_FR, 4, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, txt_FR, 5, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, lbl_FC, 6, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cuatro, txt_FC, 7, 3, 1, 1, 1, 1, fill, insets, 10, 10);
        
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_cinco, lbl_Diagnostico_Medico, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_cinco, lbl_Exploracion_Neurologica, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        agregarComponentes(panel_seis, lbl_Reflejos, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_seis, lbl_Sensibilidad, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_seis, lbl_Lenguaje_orentiacion, 2, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_seis, txt_Rfelejos, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_seis, txt_Sensibilidad, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_seis, txt_Lenguaje_Orientacion, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        panel_siete.add(lbl_titulo_Espasmos);
        
        fill = GridBagConstraints.RELATIVE;
        agregarComponentes(panel_ocho, lbl_sitio_espasmos, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_ocho, txt_sitio_espasmos, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        
        panel_nueve.add(lbl_titulo_Cicatriz);
        
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_diez, lbl_sitio_cicatriz, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, txt_sitio_cicatriz, 1, 0, 4, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, ck_queloide, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, ck_retractil, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, ck_abierta, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, ck_adherencias, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diez, ck_hipertrofica, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);
        
        panel_once.add(lbl_titulo_Marcha);
        
        agregarComponentes(panel_doce, ck_libre, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_doce, ck_claudicante, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_doce, ck_ayuda, 2, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_doce, ck_espastica, 3, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_doce, ck_ataxica, 4, 0, 1, 1, 1, 1, fill, insets, 10, 10);
        
        panel_trece.add(lbl_titulo_Traslados);
        
        agregarComponentes(panel_catorce, lbl_valInicial, 0, 0, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_independiente, 1, 0, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_sillaDeRuedas, 2, 0, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_ayudas, 3, 0, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_camilla, 4, 0, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, lbl_valFinal, 0, 1, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_independiente_Final, 1, 1, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_sillaDeRuedas_Final, 2, 1, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_ayudas_Final, 3, 1, 1, 1, 1, 1, fill, insets, 10, 10);       
        agregarComponentes(panel_catorce, ck_camilla_Final, 4, 1, 1, 1, 1, 1, fill, insets, 10, 10);       
        
        panel_quince.add(lbl_titulo_Dolor);
        
        fill = GridBagConstraints.CENTER;
        agregarComponentes(panel_diecisesis, lbl_region_dolor, 0, 0, 4, 1, 1, 1, fill, insets, 10, 10);
        fill = GridBagConstraints.HORIZONTAL;
        agregarComponentes(panel_diecisesis, txt_region_dolor, 0, 1, 4, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diecisesis, lbl_valInicial, 0, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diecisesis, cb_inicial, 1, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diecisesis, lbl_valFinal, 2, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        agregarComponentes(panel_diecisesis, cb_final, 3, 2, 1, 1, 1, 1, fill, insets, 10, 10);
        
        panel_Botones.add(btn_guardar);
        panel_Botones.add(btn_limpiar);
        panel_Botones.add(btn_nuevoRegistro);
        
        btn_limpiar.addMouseListener(new WrapperMouse() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //panel dos
                txt_fecha.setText(cale.getComponenteFecha());
                txt_nombre.setText("");
                txt_matricula.setText("");
                cb_sexo.setSelectedIndex(0);
                txt_edad.setText("");
                txt_telefono.setText("");
                txt_religion.setText("");
                txt_ocupacion.setText("");
                cb_estadoCivil.setSelectedIndex(0);
                txt_origen.setText("");
                txt_radica.setText("");
                cb_escolaridad.setSelectedIndex(0);
                txt_higienePNAL.setText("");
                txt_alimentacion.setText("");
                txt_pasatiempo.setText("");
                cb_dominio.setSelectedIndex(0);
                cb_hijos.setSelectedIndex(0);
                
                //panel cuatro
                ck_Tabaquismo.setSelected(false);
                ck_Etilismo.setSelected(false);
                ck_Diabetes.setSelected(false);
                ck_HTA.setSelected(false);
                ck_Cancer.setSelected(false);
                ck_EnfReumat.setSelected(false);
                ck_Cardiopatias.setSelected(false);
                ck_Cirugias.setSelected(false);
                ck_Alergias.setSelected(false);
                ck_Transfusiones.setSelected(false);
                ck_Accidentes.setSelected(false);
                ck_Encames.setSelected(false);
                ck_Fracturas.setSelected(false);
                txt_TA.setText("");
                txt_TEMP.setText("");
                txt_FC.setText("");
                txt_FR.setText("");
                
                //panel seis
                txt_Rfelejos.setText("");
                txt_Sensibilidad.setText("");
                txt_Lenguaje_Orientacion.setText("");

                //panel ocho
                txt_sitio_espasmos.setText("");
                
                //panel diez
                txt_sitio_cicatriz.setText("");
                ck_queloide.setSelected(false);
                ck_retractil.setSelected(false);
                ck_abierta.setSelected(false);
                ck_adherencias.setSelected(false);
                ck_hipertrofica.setSelected(false);
                
                //panel doce
                ck_libre.setSelected(false);
                ck_claudicante.setSelected(false);
                ck_ayuda.setSelected(false);
                ck_espastica.setSelected(false);
                ck_ataxica.setSelected(false);
             
                //panel catorce
                ck_independiente.setSelected(false);
                ck_sillaDeRuedas.setSelected(false);
                ck_ayudas.setSelected(false);
                ck_camilla.setSelected(false);
                ck_independiente_Final.setSelected(false);
                ck_sillaDeRuedas_Final.setSelected(false);
                ck_ayudas_Final.setSelected(false);
                ck_camilla_Final.setSelected(false);
                
                //panel catorce
                txt_region_dolor.setText("");
                cb_final.setSelectedIndex(0);
                cb_inicial.setSelectedIndex(0);
            }
        });
        
//        btn_guardar.addMouseListener(new WrapperMouse() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                String nombre = txt_nombre.getText();
//                String matriculaStr = txt_matricula.getText();
//                String sexoStr = (String) cb_sexo.getSelectedItem();
//                String edadStr = txt_edad.getText();
//                String telefonoStr = txt_telefono.getText();
//                String edoCivil = (String) cb_estadoCivil.getSelectedItem();
//                String religion = txt_religion.getText();
//                String ocupacion = txt_ocupacion.getText();
//                String fechaCadena = cale.getComponenteFecha();
//
//                try {
//                    int matricula = Integer.parseInt(matriculaStr);
//                    String sexo = sexoStr;
//                    int edad = Integer.parseInt(edadStr);
//                    int telefono = Integer.parseInt(telefonoStr);
//
//                    String[] fechaSeparada = fechaCadena.split("/");
//                    if (fechaSeparada.length == 3) {
//                        int dia = Integer.parseInt(fechaSeparada[0]);
//                        int mes = Integer.parseInt(fechaSeparada[1]);
//                        int anio = Integer.parseInt(fechaSeparada[2]);
//
//                        // Crea una instancia de Fecha
//                        Fecha fecha = new Fecha(dia, mes, anio);
//
//                        Paciente pac = new Paciente(fecha, nombre, matricula, sexo, edad, telefono, edoCivil, religion, ocupacion);
//                        RepositorioPacientes.CargaDatosPaciente();
//                        repoPac.agregarPaciente(pac);
//
//                        txt_nombre.setText("");
//                        txt_matricula.setText("");
//                        txt_sexo.setText("");
//                        txt_edad.setText("");
//                        txt_telefono.setText("");
//                        txt_estadoCivil.setText("");
//                        txt_religion.setText("");
//                        txt_ocupacion.setText("");
//                        txt_fecha.setText(cale.getComponenteFecha());
//
//                        System.out.println(" estoy hartop");
//                        
//                    } else {
//                    }
//
//                } catch (DiaInvalido | MesInvalido ex) {
//                }
//            }
//
//            String medicoTratante = txt_medicoTratante.getText();
//            //panel 2
//            String origen = txt_origen.getText();
//            String radica = txt_radica.getText();
//            String escolaridad = txt_escolaridad.getText();
//            String svsMunicipales = txt_svsMunicipales.getText();
//            String habitacion = txt_habitacion.getText();
//            boolean tabaquismo = chk_tabaquismo.isSelected();
//            boolean etilismo = chk_etilismo.isSelected();
//            String higienePnal = txt_higienePnal.getText();
//            String alimentacion = txt_alimentacion.getText();
//            String pasatiempo = txt_pasatiempo.getText();
//            String otros = txt_otros.getText();
//            String dominio = txt_dominio.getText();
//            String hijos = txt_hijos.getText();
//            //panel 3
//            boolean diabetes = cb_3_Diabetes.isSelected();
//            boolean HTA = cb_3_HTA.isSelected();
//            boolean cancer = cb_3_Cancer.isSelected();
//            boolean enfReumat = cb_3_EnfReumat.isSelected();
//            boolean cardiopatias = cb_3_Cardiopatias.isSelected();
//            boolean cirugias = cb_3_Cirugias.isSelected();
//            boolean alergias = cb_3_Alergias.isSelected();
//            boolean transfusiones = cb_3_Transfusiones.isSelected();
//            boolean accidentes = cb_3_Accidentes.isSelected();
//            boolean encames = cb_3_Encames.isSelected();
//            boolean fracturas = cb_3_Fracturas.isSelected();
//            String TA = txt_3_TA.getText();
//            String TEMP = txt_3_TEMP.getText();
//            String FC = txt_3_FC.getText();
//            String FR = txt_3_FR.getText();
//            //panel 4
//            String Reflejos = txt_4_Rfelejos.getText();
//            String Sensibilidad = txt_4_Sensibilidad.getText();
//            String LenguajeOrientacion = txt_4_Lenguaje_Orientacion.getText();
//            String otros_p_4 = txt_4_Otros.getText();
//
//            //panel 5
//            String sitio_p_5 = txt_5_Sitio.getText();
//            //panel 6
//            String sitio_p6 = txt_sitio.getText();
//            boolean queloide = ck_queloide.isSelected();
//            boolean retractil = ck_retractil.isSelected();
//            boolean abierta = ck_abierta.isSelected();
//            boolean adherencias = ck_adherencias.isSelected();
//            boolean hipertroficca = ck_hipertrofica.isSelected();
//            //panel 7
//            boolean libre = ck_libre.isSelected();
//            boolean claudicante = ck_claudicante.isSelected();
//            boolean ayuda = ck_ayuda.isSelected();
//            boolean espastica = ck_espastica.isSelected();
//            boolean ataxica = ck_ataxica.isSelected();
//            String otras_p_7 = txt_otras.getText();
//            //panel 8
//            boolean independienteInicial = ck_independiente.isSelected();
//            boolean sillaDeRuedasInicial = ck_sillaDeRuedas.isSelected();
//            boolean ayudasInicial = ck_ayudas.isSelected();
//            boolean camillaInicial = ck_camilla.isSelected();
//            boolean independienteFinal = ck_independienteFinal.isSelected();
//            boolean sillaDeRuedasFinal = ck_sillaDeRuedasFinal.isSelected();
//            boolean ayudasFianl = ck_ayudasFinal.isSelected();
//            boolean camillaFinal = ck_camillaFinal.isSelected();
//            //panel 9
//            String campoDolor = txt_campoDolor.getText();
//
//        });
    }

    private void agregarComponentes(JComponent contenedor, JComponent componente,
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
