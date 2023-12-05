
package modelo.vo;

        
 public class Paciente {
    private Fecha fechaNacimiento;
    private String nombre;
    private int matricula;
    private String sexo;
    private int edad;
    private String telefono;
    private String religion;
    private String ocupacion;
    private String estadoCivil;
    private String originarioDe;
    private String radicaEn;
    private String escolaridad;
    private String higiene;
    private String pasatiempo;
    private String alimentacion;
    private String dominio;
    private String hijos;
    private boolean diabetes;
    private boolean HTA;
    private boolean cancer;
    private boolean enfReumat;
    private boolean cardiopatias;
    private boolean cirugias;
    private boolean alergias;
    private boolean transfusiones;
    private boolean accidentes;
    private boolean fracturas;
    private boolean etilismo;
    private boolean tabaquismo;
    private String TA;
    private String temp;
    private String FR;
    private String FC;
    private String reflejos;
    private String sensibilidad;
    private String lenguajeOrientacion;
    private String sitioEspasmo;
    private String sitioCicatriz;
    private boolean queloide;
    private boolean retractil;
    private boolean abierta;
    private boolean adherencias;
    private boolean hipertrifica;
    private boolean libre;
    private boolean claudicante;
    private boolean ayuda;
    private boolean espastica;
    private boolean ataxica;
    private boolean independiente;
    private boolean sillaDeRuedas;
    private boolean ayudas;
    private boolean camilla;
    private boolean independienteFinal;
    private boolean sillaDeRuedasFinal;
    private boolean ayudasFinal;
    private boolean camillaFinal;
    private String regionDolor;
    private String valInicial;
    private String valFinal;
    public String cita;

    public Paciente(Fecha fechaNacimiento, String nombre, int matricula, String sexo, 
            int edad, String telefono, String religion, String ocupacion,
            String estadoCivil, String originarioDe, String radicaEn, 
            String escolaridad, String higiene, String pasatimepo, String alimentacion,
            String dominio, String hijos, boolean diabetes, boolean HTA, boolean cancer, 
            boolean enfReumat, boolean cardiopatias, boolean cirugias, boolean tabaquismo,
            boolean alergias, boolean transfusiones, boolean accidentes, boolean fracturas,
            boolean etilismo, String TA, String Temp, String FR, String FC, String reflejos,
            String senisbilidad, String lenguajeOrientacion, String sitioEspasmo, String sitioCicatriz,
            boolean queloide, boolean retractil, boolean abierta, boolean adherencias, boolean hipertrofica, 
            boolean libre, boolean claudicante, boolean ayuda,boolean espastica, boolean ataxica, boolean independiente,
            boolean sillaDeRuedas, boolean ayudas, boolean camilla, boolean independienteFinal, boolean sillaDeRuedasFinal,
            boolean ayudasFinal, boolean camillaFinal, String regionDolor, String valInicial,  String valFinal){
        
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.matricula = matricula;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.religion = religion;
        this.estadoCivil = estadoCivil;
        this.originarioDe = originarioDe;
        this.radicaEn = radicaEn;
        this.escolaridad = escolaridad;
        this.higiene = higiene;
        this.pasatiempo = pasatiempo;
        this.alimentacion = alimentacion;
        this.dominio = dominio;
        this.hijos = hijos;
        this.diabetes = diabetes;
        this.HTA = HTA;
        this.cancer = cancer;
        this.enfReumat = enfReumat;
        this.cardiopatias = cardiopatias;
        this.cirugias = cirugias;
        this.tabaquismo = tabaquismo;
        this.alergias = alergias;
        this.transfusiones = transfusiones;
        this.accidentes = accidentes;
        this.fracturas = fracturas;
        this.etilismo = etilismo;
        this.TA = TA;
        this.temp = temp; 
        this.FR = FR;
        this.FC = FC;
        this.reflejos = reflejos;
        this.sensibilidad = sensibilidad;
        this.lenguajeOrientacion = lenguajeOrientacion;
        this.sitioEspasmo = sitioEspasmo;
        this.sitioCicatriz = sitioCicatriz;
        this.queloide = queloide;
        this.retractil = retractil;
        this.abierta = abierta;
        this.adherencias = adherencias;
        this.hipertrifica = hipertrofica;
        this.libre = libre;
        this.claudicante = claudicante;
        this.ayuda = ayuda;
        this.espastica = espastica;
        this.ataxica = ataxica;
        this.independiente = independiente;
        this.sillaDeRuedas = sillaDeRuedas;
        this.ayudas = ayudas;
        this.camilla = camilla;
        this.independienteFinal = independienteFinal;
        this.sillaDeRuedasFinal = sillaDeRuedasFinal;
        this.ayudasFinal = ayudasFinal;
        this.camillaFinal = camillaFinal;
        this.regionDolor = regionDolor;
        this.valInicial = valInicial;
        this.valFinal = valFinal;
        this.cita=""; 
    }

    public boolean isTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(boolean tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public String getOriginarioDe() {
        return originarioDe;
    }

    public void setOriginarioDe(String originarioDe) {
        this.originarioDe = originarioDe;
    }

    public String getRadicaEn() {
        return radicaEn;
    }

    public void setRadicaEn(String radicaEn) {
        this.radicaEn = radicaEn;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getHigiene() {
        return higiene;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    public String getPasatiempo() {
        return pasatiempo;
    }

    public void setPasatiempo(String pasatiempo) {
        this.pasatiempo = pasatiempo;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getHijos() {
        return hijos;
    }

    public void setHijos(String hijos) {
        this.hijos = hijos;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHTA() {
        return HTA;
    }

    public void setHTA(boolean HTA) {
        this.HTA = HTA;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    public boolean isEnfReumat() {
        return enfReumat;
    }

    public void setEnfReumat(boolean enfReumat) {
        this.enfReumat = enfReumat;
    }

    public boolean isCardiopatias() {
        return cardiopatias;
    }

    public void setCardiopatias(boolean cardiopatias) {
        this.cardiopatias = cardiopatias;
    }

    public boolean isCirugias() {
        return cirugias;
    }

    public void setCirugias(boolean cirugias) {
        this.cirugias = cirugias;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public boolean isTransfusiones() {
        return transfusiones;
    }

    public void setTransfusiones(boolean transfusiones) {
        this.transfusiones = transfusiones;
    }

    public boolean isAccidentes() {
        return accidentes;
    }

    public void setAccidentes(boolean accidentes) {
        this.accidentes = accidentes;
    }

    public boolean isFracturas() {
        return fracturas;
    }

    public void setFracturas(boolean fracturas) {
        this.fracturas = fracturas;
    }

    public boolean isEtilismo() {
        return etilismo;
    }

    public void setEtilismo(boolean etilismo) {
        this.etilismo = etilismo;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getFR() {
        return FR;
    }

    public void setFR(String FR) {
        this.FR = FR;
    }

    public String getFC() {
        return FC;
    }

    public void setFC(String FC) {
        this.FC = FC;
    }

    public String getReflejos() {
        return reflejos;
    }

    public void setReflejos(String reflejos) {
        this.reflejos = reflejos;
    }

    public String getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(String sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public String getLenguajeOrientacion() {
        return lenguajeOrientacion;
    }

    public void setLenguajeOrientacion(String lenguajeOrientacion) {
        this.lenguajeOrientacion = lenguajeOrientacion;
    }

    public String getSitioEspasmo() {
        return sitioEspasmo;
    }

    public void setSitioEspasmo(String sitioEspasmo) {
        this.sitioEspasmo = sitioEspasmo;
    }

    public String getSitioCicatriz() {
        return sitioCicatriz;
    }

    public void setSitioCicatriz(String sitioCicatriz) {
        this.sitioCicatriz = sitioCicatriz;
    }

    public boolean isQueloide() {
        return queloide;
    }

    public void setQueloide(boolean queloide) {
        this.queloide = queloide;
    }

    public boolean isRetractil() {
        return retractil;
    }

    public void setRetractil(boolean retractil) {
        this.retractil = retractil;
    }

    public boolean isAdherencias() {
        return adherencias;
    }

    public void setAdherencias(boolean adherencias) {
        this.adherencias = adherencias;
    }

    public boolean isHipertrifica() {
        return hipertrifica;
    }

    public void setHipertrifica(boolean hipertrifica) {
        this.hipertrifica = hipertrifica;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public boolean isCaludicante() {
        return claudicante;
    }

    public void setCaludicante(boolean claudicante) {
        this.claudicante = claudicante;
    }

    public boolean isAyuda() {
        return ayuda;
    }

    public void setAyuda(boolean ayuda) {
        this.ayuda = ayuda;
    }

    public boolean isEspastica() {
        return espastica;
    }

    public void setEspastica(boolean espastica) {
        this.espastica = espastica;
    }

    public boolean isAtaxica() {
        return ataxica;
    }

    public void setAtaxica(boolean ataxica) {
        this.ataxica = ataxica;
    }

    public boolean isIndependiente() {
        return independiente;
    }

    public void setIndependiente(boolean independiente) {
        this.independiente = independiente;
    }

    public boolean isSillaDeRuedas() {
        return sillaDeRuedas;
    }

    public void setSillaDeRuedas(boolean sillaDeRuedas) {
        this.sillaDeRuedas = sillaDeRuedas;
    }

    public boolean isAyudas() {
        return ayudas;
    }

    public void setAyudas(boolean ayudas) {
        this.ayudas = ayudas;
    }

    public boolean isCamilla() {
        return camilla;
    }

    public void setCamilla(boolean camilla) {
        this.camilla = camilla;
    }

    public boolean isIndependienteFinal() {
        return independienteFinal;
    }

    public void setIndependienteFinal(boolean independienteFinal) {
        this.independienteFinal = independienteFinal;
    }

    public boolean isSillaDeRuedasFinal() {
        return sillaDeRuedasFinal;
    }

    public void setSillaDeRuedasFinal(boolean sillaDeRuedasFinal) {
        this.sillaDeRuedasFinal = sillaDeRuedasFinal;
    }

    public boolean isAyudasfinal() {
        return ayudasFinal;
    }

    public void setAyudasfinal(boolean ayudasFinal) {
        this.ayudasFinal = ayudasFinal;
    }

    public boolean isCamillaFinal() {
        return camillaFinal;
    }

    public void setCamillaFinal(boolean camillaFinal) {
        this.camillaFinal = camillaFinal;
    }

    public String getRegionDolor() {
        return regionDolor;
    }

    public void setRegionDolor(String regionDolor) {
        this.regionDolor = regionDolor;
    }

    public String getValInicial() {
        return valInicial;
    }

    public void setValInicial(String valInicial) {
        this.valInicial = valInicial;
    }

    public String getValFinal() {
        return valFinal;
    }

    public void setValFinal(String valFinal) {
        this.valFinal = valFinal;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
                          
    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    
    
}
