/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author alejb
 */
public class Expediente {

    //Antecedentes no patologicos
    private int salaDatosPersonales;
    private String medicoTratanteDatosPersonales;
    private String origenAntecedentesNoPat;
    private String radica;
    private String estadoCivilAntecedentesNoPat;
    private String ocupacionAntecedentesNoPat;
    private String escolaridad;
    private String svsMunicipales;
    private String religionAntecedentesNoPat;
    private int habitacion;
    private boolean tabaquismo;
    private boolean etilismo;
    private String higienePnal;
    private String pasatirmpo;
    private String alimenctacion;
    private String otrosAntecedentesNoPat;
    private String dominio;
    private String hijos;
    //Antecedentes patologicos y heredofamiliares
    private boolean diabetes;
    private boolean hta;
    private boolean cancer;
    private boolean enfReumat;
    private boolean cardiopatia;
    private boolean cirugia;
    private boolean alergias;
    private boolean transfusiones;
    private boolean accidentes;
    private boolean encames;
    private boolean fracturas;
    private String TA;
    private String FC;
    private String FR;
    //Diagnostico en rehabilitacion
    private String refelejos;
    private String sensibilidad;
    private String lenguajeOrientacion;
    private String otrosAntecedentesPat;
    private String sitioEspasmos;
    //Cicatriz quirurgica, marcha y traslados
    private String sitioCicatriz;
    private boolean queloideCizatriz;
    private boolean retractilCicatriz;
    private boolean abiertaCizatriz;
    private boolean conAdherenciaCicatriz;
    private boolean hipertroficaCicatriz;
    private boolean libreMarcha;
    private boolean claudicanteMarcha;
    private boolean conAyudasMarcha;
    private boolean espasticaMarcha;
    private boolean ataxicaMarcha;
    private String otraMarcha;
    private boolean indepTrasladosVInicial;
    private boolean enSillaTrasladosVInicial;
    private boolean conAyudasTrasladosVInicial;
    private boolean camillaTYrasladosVInicial;
    private boolean indepTrasladosVFinal;
    private boolean enSillaTrasladosVFinal;
    private boolean conAyudasTrasladosVFinal;
    private boolean camillaTYrasladosVFinal;
    private String regionDolor;
    private Object escalaDolor;
    private Object escalaDolorPediatricoInicial;
    private Object escalaDolorPediatricoFinal;

    public Expediente(int salaDatosPersonales, String medicoTratanteDatosPersonales, String origenAntecedentesNoPat, String radica, String estadoCivilAntecedentesNoPat, String ocupacionAntecedentesNoPat, String escolaridad, String svsMunicipales, String religionAntecedentesNoPat, int habitacion, boolean tabaquismo, boolean etilismo, String higienePnal, String pasatirmpo, String alimenctacion, String otrosAntecedentesNoPat, String dominio, String hijos, boolean diabetes, boolean hta, boolean cancer, boolean enfReumat, boolean cardiopatia, boolean cirugia, boolean alergias, boolean transfusiones, boolean accidentes, boolean encames, boolean fracturas, String TA, String FC, String FR, String refelejos, String sensibilidad, String lenguajeOrientacion, String otrosAntecedentesPat, String sitioEspasmos, String sitioCicatriz, boolean queloideCizatriz, boolean retractilCicatriz, boolean abiertaCizatriz, boolean conAdherenciaCicatriz, boolean hipertroficaCicatriz, boolean libreMarcha, boolean claudicanteMarcha, boolean conAyudasMarcha, boolean espasticaMarcha, boolean ataxicaMarcha, String otraMarcha, boolean indepTrasladosVInicial, boolean enSillaTrasladosVInicial, boolean conAyudasTrasladosVInicial, boolean camillaTYrasladosVInicial, boolean indepTrasladosVFinal, boolean enSillaTrasladosVFinal, boolean conAyudasTrasladosVFinal, boolean camillaTYrasladosVFinal, String regionDolor, Object escalaDolor, Object escalaDolorPediatricoInicial, Object escalaDolorPediatricoFinal) {
        this.salaDatosPersonales = salaDatosPersonales;
        this.medicoTratanteDatosPersonales = medicoTratanteDatosPersonales;
        this.origenAntecedentesNoPat = origenAntecedentesNoPat;
        this.radica = radica;
        this.estadoCivilAntecedentesNoPat = estadoCivilAntecedentesNoPat;
        this.ocupacionAntecedentesNoPat = ocupacionAntecedentesNoPat;
        this.escolaridad = escolaridad;
        this.svsMunicipales = svsMunicipales;
        this.religionAntecedentesNoPat = religionAntecedentesNoPat;
        this.habitacion = habitacion;
        this.tabaquismo = tabaquismo;
        this.etilismo = etilismo;
        this.higienePnal = higienePnal;
        this.pasatirmpo = pasatirmpo;
        this.alimenctacion = alimenctacion;
        this.otrosAntecedentesNoPat = otrosAntecedentesNoPat;
        this.dominio = dominio;
        this.hijos = hijos;
        this.diabetes = diabetes;
        this.hta = hta;
        this.cancer = cancer;
        this.enfReumat = enfReumat;
        this.cardiopatia = cardiopatia;
        this.cirugia = cirugia;
        this.alergias = alergias;
        this.transfusiones = transfusiones;
        this.accidentes = accidentes;
        this.encames = encames;
        this.fracturas = fracturas;
        this.TA = TA;
        this.FC = FC;
        this.FR = FR;
        this.refelejos = refelejos;
        this.sensibilidad = sensibilidad;
        this.lenguajeOrientacion = lenguajeOrientacion;
        this.otrosAntecedentesPat = otrosAntecedentesPat;
        this.sitioEspasmos = sitioEspasmos;
        this.sitioCicatriz = sitioCicatriz;
        this.queloideCizatriz = queloideCizatriz;
        this.retractilCicatriz = retractilCicatriz;
        this.abiertaCizatriz = abiertaCizatriz;
        this.conAdherenciaCicatriz = conAdherenciaCicatriz;
        this.hipertroficaCicatriz = hipertroficaCicatriz;
        this.libreMarcha = libreMarcha;
        this.claudicanteMarcha = claudicanteMarcha;
        this.conAyudasMarcha = conAyudasMarcha;
        this.espasticaMarcha = espasticaMarcha;
        this.ataxicaMarcha = ataxicaMarcha;
        this.otraMarcha = otraMarcha;
        this.indepTrasladosVInicial = indepTrasladosVInicial;
        this.enSillaTrasladosVInicial = enSillaTrasladosVInicial;
        this.conAyudasTrasladosVInicial = conAyudasTrasladosVInicial;
        this.camillaTYrasladosVInicial = camillaTYrasladosVInicial;
        this.indepTrasladosVFinal = indepTrasladosVFinal;
        this.enSillaTrasladosVFinal = enSillaTrasladosVFinal;
        this.conAyudasTrasladosVFinal = conAyudasTrasladosVFinal;
        this.camillaTYrasladosVFinal = camillaTYrasladosVFinal;
        this.regionDolor = regionDolor;
        this.escalaDolor = escalaDolor;
        this.escalaDolorPediatricoInicial = escalaDolorPediatricoInicial;
        this.escalaDolorPediatricoFinal = escalaDolorPediatricoFinal;
    }

    public int getSalaDatosPersonales() {
        return salaDatosPersonales;
    }

    public void setSalaDatosPersonales(int salaDatosPersonales) {
        this.salaDatosPersonales = salaDatosPersonales;
    }

    public String getMedicoTratanteDatosPersonales() {
        return medicoTratanteDatosPersonales;
    }

    public void setMedicoTratanteDatosPersonales(String medicoTratanteDatosPersonales) {
        this.medicoTratanteDatosPersonales = medicoTratanteDatosPersonales;
    }

    public String getOrigenAntecedentesNoPat() {
        return origenAntecedentesNoPat;
    }

    public void setOrigenAntecedentesNoPat(String origenAntecedentesNoPat) {
        this.origenAntecedentesNoPat = origenAntecedentesNoPat;
    }

    public String getRadica() {
        return radica;
    }

    public void setRadica(String radica) {
        this.radica = radica;
    }

    public String getEstadoCivilAntecedentesNoPat() {
        return estadoCivilAntecedentesNoPat;
    }

    public void setEstadoCivilAntecedentesNoPat(String estadoCivilAntecedentesNoPat) {
        this.estadoCivilAntecedentesNoPat = estadoCivilAntecedentesNoPat;
    }

    public String getOcupacionAntecedentesNoPat() {
        return ocupacionAntecedentesNoPat;
    }

    public void setOcupacionAntecedentesNoPat(String ocupacionAntecedentesNoPat) {
        this.ocupacionAntecedentesNoPat = ocupacionAntecedentesNoPat;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getSvsMunicipales() {
        return svsMunicipales;
    }

    public void setSvsMunicipales(String svsMunicipales) {
        this.svsMunicipales = svsMunicipales;
    }

    public String getReligionAntecedentesNoPat() {
        return religionAntecedentesNoPat;
    }

    public void setReligionAntecedentesNoPat(String religionAntecedentesNoPat) {
        this.religionAntecedentesNoPat = religionAntecedentesNoPat;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isTabaquismo() {
        return tabaquismo;
    }

    public void setTabaquismo(boolean tabaquismo) {
        this.tabaquismo = tabaquismo;
    }

    public boolean isEtilismo() {
        return etilismo;
    }

    public void setEtilismo(boolean etilismo) {
        this.etilismo = etilismo;
    }

    public String getHigienePnal() {
        return higienePnal;
    }

    public void setHigienePnal(String higienePnal) {
        this.higienePnal = higienePnal;
    }

    public String getPasatirmpo() {
        return pasatirmpo;
    }

    public void setPasatirmpo(String pasatirmpo) {
        this.pasatirmpo = pasatirmpo;
    }

    public String getAlimenctacion() {
        return alimenctacion;
    }

    public void setAlimenctacion(String alimenctacion) {
        this.alimenctacion = alimenctacion;
    }

    public String getOtrosAntecedentesNoPat() {
        return otrosAntecedentesNoPat;
    }

    public void setOtrosAntecedentesNoPat(String otrosAntecedentesNoPat) {
        this.otrosAntecedentesNoPat = otrosAntecedentesNoPat;
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

    public boolean isHta() {
        return hta;
    }

    public void setHta(boolean hta) {
        this.hta = hta;
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

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public boolean isCirugia() {
        return cirugia;
    }

    public void setCirugia(boolean cirugia) {
        this.cirugia = cirugia;
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

    public boolean isEncames() {
        return encames;
    }

    public void setEncames(boolean encames) {
        this.encames = encames;
    }

    public boolean isFracturas() {
        return fracturas;
    }

    public void setFracturas(boolean fracturas) {
        this.fracturas = fracturas;
    }

    public String getTA() {
        return TA;
    }

    public void setTA(String TA) {
        this.TA = TA;
    }

    public String getFC() {
        return FC;
    }

    public void setFC(String FC) {
        this.FC = FC;
    }

    public String getFR() {
        return FR;
    }

    public void setFR(String FR) {
        this.FR = FR;
    }

    public String getRefelejos() {
        return refelejos;
    }

    public void setRefelejos(String refelejos) {
        this.refelejos = refelejos;
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

    public String getOtrosAntecedentesPat() {
        return otrosAntecedentesPat;
    }

    public void setOtrosAntecedentesPat(String otrosAntecedentesPat) {
        this.otrosAntecedentesPat = otrosAntecedentesPat;
    }

    public String getSitioEspasmos() {
        return sitioEspasmos;
    }

    public void setSitioEspasmos(String sitioEspasmos) {
        this.sitioEspasmos = sitioEspasmos;
    }

    public String getSitioCicatriz() {
        return sitioCicatriz;
    }

    public void setSitioCicatriz(String sitioCicatriz) {
        this.sitioCicatriz = sitioCicatriz;
    }

    public boolean isQueloideCizatriz() {
        return queloideCizatriz;
    }

    public void setQueloideCizatriz(boolean queloideCizatriz) {
        this.queloideCizatriz = queloideCizatriz;
    }

    public boolean isRetractilCicatriz() {
        return retractilCicatriz;
    }

    public void setRetractilCicatriz(boolean retractilCicatriz) {
        this.retractilCicatriz = retractilCicatriz;
    }

    public boolean isAbiertaCizatriz() {
        return abiertaCizatriz;
    }

    public void setAbiertaCizatriz(boolean abiertaCizatriz) {
        this.abiertaCizatriz = abiertaCizatriz;
    }

    public boolean isConAdherenciaCicatriz() {
        return conAdherenciaCicatriz;
    }

    public void setConAdherenciaCicatriz(boolean conAdherenciaCicatriz) {
        this.conAdherenciaCicatriz = conAdherenciaCicatriz;
    }

    public boolean isHipertroficaCicatriz() {
        return hipertroficaCicatriz;
    }

    public void setHipertroficaCicatriz(boolean hipertroficaCicatriz) {
        this.hipertroficaCicatriz = hipertroficaCicatriz;
    }

    public boolean isLibreMarcha() {
        return libreMarcha;
    }

    public void setLibreMarcha(boolean libreMarcha) {
        this.libreMarcha = libreMarcha;
    }

    public boolean isClaudicanteMarcha() {
        return claudicanteMarcha;
    }

    public void setClaudicanteMarcha(boolean claudicanteMarcha) {
        this.claudicanteMarcha = claudicanteMarcha;
    }

    public boolean isConAyudasMarcha() {
        return conAyudasMarcha;
    }

    public void setConAyudasMarcha(boolean conAyudasMarcha) {
        this.conAyudasMarcha = conAyudasMarcha;
    }

    public boolean isEspasticaMarcha() {
        return espasticaMarcha;
    }

    public void setEspasticaMarcha(boolean espasticaMarcha) {
        this.espasticaMarcha = espasticaMarcha;
    }

    public boolean isAtaxicaMarcha() {
        return ataxicaMarcha;
    }

    public void setAtaxicaMarcha(boolean ataxicaMarcha) {
        this.ataxicaMarcha = ataxicaMarcha;
    }

    public String getOtraMarcha() {
        return otraMarcha;
    }

    public void setOtraMarcha(String otraMarcha) {
        this.otraMarcha = otraMarcha;
    }

    public boolean isIndepTrasladosVInicial() {
        return indepTrasladosVInicial;
    }

    public void setIndepTrasladosVInicial(boolean indepTrasladosVInicial) {
        this.indepTrasladosVInicial = indepTrasladosVInicial;
    }

    public boolean isEnSillaTrasladosVInicial() {
        return enSillaTrasladosVInicial;
    }

    public void setEnSillaTrasladosVInicial(boolean enSillaTrasladosVInicial) {
        this.enSillaTrasladosVInicial = enSillaTrasladosVInicial;
    }

    public boolean isConAyudasTrasladosVInicial() {
        return conAyudasTrasladosVInicial;
    }

    public void setConAyudasTrasladosVInicial(boolean conAyudasTrasladosVInicial) {
        this.conAyudasTrasladosVInicial = conAyudasTrasladosVInicial;
    }

    public boolean isCamillaTYrasladosVInicial() {
        return camillaTYrasladosVInicial;
    }

    public void setCamillaTYrasladosVInicial(boolean camillaTYrasladosVInicial) {
        this.camillaTYrasladosVInicial = camillaTYrasladosVInicial;
    }

    public boolean isIndepTrasladosVFinal() {
        return indepTrasladosVFinal;
    }

    public void setIndepTrasladosVFinal(boolean indepTrasladosVFinal) {
        this.indepTrasladosVFinal = indepTrasladosVFinal;
    }

    public boolean isEnSillaTrasladosVFinal() {
        return enSillaTrasladosVFinal;
    }

    public void setEnSillaTrasladosVFinal(boolean enSillaTrasladosVFinal) {
        this.enSillaTrasladosVFinal = enSillaTrasladosVFinal;
    }

    public boolean isConAyudasTrasladosVFinal() {
        return conAyudasTrasladosVFinal;
    }

    public void setConAyudasTrasladosVFinal(boolean conAyudasTrasladosVFinal) {
        this.conAyudasTrasladosVFinal = conAyudasTrasladosVFinal;
    }

    public boolean isCamillaTYrasladosVFinal() {
        return camillaTYrasladosVFinal;
    }

    public void setCamillaTYrasladosVFinal(boolean camillaTYrasladosVFinal) {
        this.camillaTYrasladosVFinal = camillaTYrasladosVFinal;
    }

    public String getRegionDolor() {
        return regionDolor;
    }

    public void setRegionDolor(String regionDolor) {
        this.regionDolor = regionDolor;
    }

    public Object getEscalaDolor() {
        return escalaDolor;
    }

    public void setEscalaDolor(Object escalaDolor) {
        this.escalaDolor = escalaDolor;
    }

    public Object getEscalaDolorPediatricoInicial() {
        return escalaDolorPediatricoInicial;
    }

    public void setEscalaDolorPediatricoInicial(Object escalaDolorPediatricoInicial) {
        this.escalaDolorPediatricoInicial = escalaDolorPediatricoInicial;
    }

    public Object getEscalaDolorPediatricoFinal() {
        return escalaDolorPediatricoFinal;
    }

    public void setEscalaDolorPediatricoFinal(Object escalaDolorPediatricoFinal) {
        this.escalaDolorPediatricoFinal = escalaDolorPediatricoFinal;
    }

}
