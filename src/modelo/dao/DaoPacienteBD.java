package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.vo.Paciente;
import modelo.conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Fecha;
 

/**
 * @author alejb
 */

public class DaoPacienteBD {
    private final Connection conexion;
               private    Fecha fecha;

    public DaoPacienteBD(){
        this.conexion = (Connection) ConexionBD.getConexionBD();
    }
    
    public Paciente agregarDAO(Paciente cte){
        try{
            String qryInsert;
            //Preparar comando
            PreparedStatement ps;
            qryInsert = "INSERT INTO pacientes(idPacientes,Nombre,FechaRegistro,sexo,"
                    +"Edad,Telefono,Religion,Ocupacion, "
                    +"EdoCiv, OriginarioDe, RadicaEn, Escolaridad, "
                    +"HIgiene, Pasatiempo, Alimentacion, Dominio, "
                    +"Hijos, Diabetes, HTA, Cancer, "
                    +"EnfReumat, Cardiopatias, Cirugias, Tabaquismo, "
                    +"Alergias, Transfusiones, Accidentes, Fracturas,"
                    +"Etilismo, TA, Temperatura, FR,"
                    +"FC, Reflejos, LenguejeOrientacion, SitioEspasmo, "
                    +"SitioCicatriz, Queloide, Retractil, Abierta, "
                    +"Adherente, Hipertrofica, Libre, Claudicante, "
                    +"Ayuda, Espastica, Ataxica, Independiente, "
                    +"EnSillaDeRuedas, ConAyudas, EnCamilla, IndependienteFinal, "
                    +"EnSillaDeRuedasFinal, AyudasFinal, EnCamillaFinal, RegionDolor, "
                    +"ValoracionInicial, ValoracionFinal)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
            ps = conexion.prepareStatement(qryInsert, 
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,String.valueOf(cte.getMatricula()));
            ps.setString(2,String.valueOf(cte.getNombre()));
            ps.setString(3,String.valueOf(cte.getFechaNacimiento()));
            ps.setString(4,String.valueOf(cte.getSexo()));
            ps.setString(5,String.valueOf(cte.getEdad()));
            ps.setString(6,String.valueOf(cte.getTelefono()));
            ps.setString(7,String.valueOf(cte.getReligion()));                        
            ps.setString(8,String.valueOf(cte.getOcupacion()));
            ps.setString(9,String.valueOf(cte.getEstadoCivil()));
            ps.setString(10,String.valueOf(cte.getOriginarioDe()));
            ps.setString(11,String.valueOf(cte.getRadicaEn()));
            ps.setString(12,String.valueOf(cte.getEscolaridad()));
            ps.setString(13,String.valueOf(cte.getHigiene()));
            ps.setString(14,String.valueOf(cte.getPasatiempo()));
            ps.setString(15,String.valueOf(cte.getAlimentacion()));
            ps.setString(16,String.valueOf(cte.getDominio()));
            ps.setString(17,String.valueOf(cte.getHijos()));
            ps.setString(18,String.valueOf(cte.isDiabetes()));
            ps.setString(19,String.valueOf(cte.isHTA()));
            ps.setString(20,String.valueOf(cte.isCancer()));
            ps.setString(21,String.valueOf(cte.isEnfReumat()));
            ps.setString(22,String.valueOf(cte.isCardiopatias()));
            ps.setString(23,String.valueOf(cte.isCirugias()));
            ps.setString(24,String.valueOf(cte.isTabaquismo()));
            ps.setString(25,String.valueOf(cte.isAlergias()));
            ps.setString(26,String.valueOf(cte.isTransfusiones()));
            ps.setString(27,String.valueOf(cte.isAccidentes()));
            ps.setString(28,String.valueOf(cte.isFracturas()));
            ps.setString(29,String.valueOf(cte.isEtilismo()));
            ps.setString(30,String.valueOf(cte.getTA()));
            ps.setString(31,String.valueOf(cte.getTemp()));
            ps.setString(32,String.valueOf(cte.getFR()));
            ps.setString(33,String.valueOf(cte.getFC()));
            ps.setString(34,String.valueOf(cte.getReflejos()));
            ps.setString(35,String.valueOf(cte.getLenguajeOrientacion()));
            ps.setString(36,String.valueOf(cte.getSitioEspasmo()));
            ps.setString(37,String.valueOf(cte.getSitioCicatriz()));
            ps.setString(38,String.valueOf(cte.isQueloide()));
            ps.setString(39,String.valueOf(cte.isRetractil()));
            ps.setString(40,String.valueOf(cte.isAbierta()));
            ps.setString(41,String.valueOf(cte.isAdherencias()));
            ps.setString(42,String.valueOf(cte.isHipertrifica()));
            ps.setString(43,String.valueOf(cte.isLibre()));
            ps.setString(44,String.valueOf(cte.isCaludicante()));
            ps.setString(45,String.valueOf(cte.isAyuda()));
            ps.setString(46,String.valueOf(cte.isEspastica()));
            ps.setString(47,String.valueOf(cte.isAtaxica()));
            ps.setString(48,String.valueOf(cte.isIndependiente()));
            ps.setString(49,String.valueOf(cte.isSillaDeRuedas()));
            ps.setString(50,String.valueOf(cte.isAyudas()));
            ps.setString(51,String.valueOf(cte.isCamilla()));
            ps.setString(52,String.valueOf(cte.isIndependienteFinal()));
            ps.setString(53,String.valueOf(cte.isSillaDeRuedasFinal()));
            ps.setString(54,String.valueOf(cte.isAyudasfinal()));
            ps.setString(55,String.valueOf(cte.isCamillaFinal()));
            ps.setString(56,String.valueOf(cte.getRegionDolor()));
            ps.setString(57,String.valueOf(cte.getValInicial()));
            ps.setString(58,String.valueOf(cte.getValFinal()));
            int numeroRegistrosIns = ps.executeUpdate();
            
            ResultSet rs;
            if (numeroRegistrosIns == 0) {
                    throw new SQLException("No se pudo guardar");
            }else{
                rs = ps.getGeneratedKeys();  
                rs.next();  
                int id = rs.getInt(1);  
                cte.setMatricula(id);
            }
            return cte;
        
        }catch (SQLException ex){
            System.out.println("ERROR: " + ex.getMessage());
            return null;
        }
    }
    
    public int modificarDAO(Paciente cte){
        int numRegistrosModificados;
        try{
            String qryUpdate;
            PreparedStatement ps;
            qryUpdate = "UPDATE pacientes SET"
                    +"Nombre = ?"
                    +"FechaRegistro = ?"
                    +"sexo = ?"
                    +"Edad = ?"
                    +"Telefono=?"
                    +"Religion,Ocupacion = ?"
                    +"EdoCiv = ?"
                    +"OriginarioDe = ?"
                    +"RadicaEn = ?"
                    +"Escolaridad = ?"
                    +"HIgiene = ?"
                    +"Pasatiempo = ?"
                    +"Alimentacion = ?"
                    +"Dominio = ?"
                    +"Hijos = ?"
                    +"Diabetes = ?"
                    +"HTA = ? "
                    +"Cancer = ?"
                    +"EnfReumat = ? "
                    +"Cardiopatias = ?"
                    +"Cirugias = ?"
                    +"Tabaquismo = ?"
                    +"Alergias = ? "
                    +"Transfusiones = ?"
                    +"Accidentes = ?"
                    +"Fracturas = ?"
                    +"Etilismo = ?"
                    +"TA = ? "
                    +"Temperatura = ?"
                    +"FR = ?"
                    +"FC = ?"
                    +"Reflejos = ?"
                    +"LenguejeOrientacion = ?"
                    +"SitioEspasmo = ?"
                    +"SitioCicatriz = ?"
                    +"Queloide = ?"
                    +"Retractil = ?"
                    +"Abierta = ?"
                    +"Adherente = ?"
                    +"Hipertrofica = ?"
                    +"Libre = ?"
                    +"Claudicante = ?"
                    +"Ayuda = ?"
                    +"Espastica = ?"
                    +"Ataxica = ?"
                    +"Independiente = ?"
                    +"EnSillaDeRuedas = ?"
                    +"ConAyudas = ?"
                    +"EnCamilla = ?"
                    +"IndependienteFinal = ?"
                    +"EnSillaDeRuedasFinal = ?"
                    +"AyudasFinal = ?"
                    +"EnCamillaFinal = ?"
                    +"RegionDolor = ?"
                    +"ValoracionInicial = ?"
                    +"ValoracionFinal = ?"
                    +"WHERE idPacientes = ?";
            ps = conexion.prepareStatement(qryUpdate);
            
            ps.setString(1,String.valueOf(cte.getMatricula()));
            ps.setString(2,String.valueOf(cte.getNombre()));
            ps.setString(3,String.valueOf(cte.getFechaNacimiento()));
            ps.setString(4,String.valueOf(cte.getSexo()));
            ps.setString(5,String.valueOf(cte.getEdad()));
            ps.setString(6,String.valueOf(cte.getTelefono()));
            ps.setString(7,String.valueOf(cte.getReligion()));                        
            ps.setString(8,String.valueOf(cte.getOcupacion()));
            ps.setString(9,String.valueOf(cte.getEstadoCivil()));
            ps.setString(10,String.valueOf(cte.getOriginarioDe()));
            ps.setString(11,String.valueOf(cte.getRadicaEn()));
            ps.setString(12,String.valueOf(cte.getEscolaridad()));
            ps.setString(13,String.valueOf(cte.getHigiene()));
            ps.setString(14,String.valueOf(cte.getPasatiempo()));
            ps.setString(15,String.valueOf(cte.getAlimentacion()));
            ps.setString(16,String.valueOf(cte.getDominio()));
            ps.setString(17,String.valueOf(cte.getHijos()));
            ps.setString(18,String.valueOf(cte.isDiabetes()));
            ps.setString(19,String.valueOf(cte.isHTA()));
            ps.setString(20,String.valueOf(cte.isCancer()));
            ps.setString(21,String.valueOf(cte.isEnfReumat()));
            ps.setString(22,String.valueOf(cte.isCardiopatias()));
            ps.setString(23,String.valueOf(cte.isCirugias()));
            ps.setString(24,String.valueOf(cte.isTabaquismo()));
            ps.setString(25,String.valueOf(cte.isAlergias()));
            ps.setString(26,String.valueOf(cte.isTransfusiones()));
            ps.setString(27,String.valueOf(cte.isAccidentes()));
            ps.setString(28,String.valueOf(cte.isFracturas()));
            ps.setString(29,String.valueOf(cte.isEtilismo()));
            ps.setString(30,String.valueOf(cte.getTA()));
            ps.setString(31,String.valueOf(cte.getTemp()));
            ps.setString(32,String.valueOf(cte.getFR()));
            ps.setString(33,String.valueOf(cte.getFC()));
            ps.setString(34,String.valueOf(cte.getReflejos()));
            ps.setString(35,String.valueOf(cte.getLenguajeOrientacion()));
            ps.setString(36,String.valueOf(cte.getSitioEspasmo()));
            ps.setString(37,String.valueOf(cte.getSitioCicatriz()));
            ps.setString(38,String.valueOf(cte.isQueloide()));
            ps.setString(39,String.valueOf(cte.isRetractil()));
            ps.setString(40,String.valueOf(cte.isAbierta()));
            ps.setString(41,String.valueOf(cte.isAdherencias()));
            ps.setString(42,String.valueOf(cte.isHipertrifica()));
            ps.setString(43,String.valueOf(cte.isLibre()));
            ps.setString(44,String.valueOf(cte.isCaludicante()));
            ps.setString(45,String.valueOf(cte.isAyuda()));
            ps.setString(46,String.valueOf(cte.isEspastica()));
            ps.setString(47,String.valueOf(cte.isAtaxica()));
            ps.setString(48,String.valueOf(cte.isIndependiente()));
            ps.setString(49,String.valueOf(cte.isSillaDeRuedas()));
            ps.setString(50,String.valueOf(cte.isAyudas()));
            ps.setString(51,String.valueOf(cte.isCamilla()));
            ps.setString(52,String.valueOf(cte.isIndependienteFinal()));
            ps.setString(53,String.valueOf(cte.isSillaDeRuedasFinal()));
            ps.setString(54,String.valueOf(cte.isAyudasfinal()));
            ps.setString(55,String.valueOf(cte.isCamillaFinal()));
            ps.setString(56,String.valueOf(cte.getRegionDolor()));
            ps.setString(57,String.valueOf(cte.getValInicial()));
            ps.setString(58,String.valueOf(cte.getValFinal()));
            
            numRegistrosModificados =ps.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
            numRegistrosModificados = 0;
        }
        return numRegistrosModificados;
    }
    
    public int eliminarDAO(Paciente cte){
        int numRegistrosEliminados;
        try{
            String qryDelete;
            qryDelete = "DELETE FROM pacientes WHERE idPacientes = ?";
            
            PreparedStatement ps;
            ps = conexion.prepareStatement(qryDelete);
            ps.setString(1,String.valueOf(cte.getMatricula()));
            numRegistrosEliminados = ps.executeUpdate();
        }catch (SQLException ex){
            numRegistrosEliminados = 0;
        }
        return numRegistrosEliminados;
    }
    
    public Paciente consultarDAO(String nombre) throws DiaInvalido, MesInvalido{
        String qrySelect;
        qrySelect = "SELECT * FROM pacientes WHERE "
                +"nombre = ?";
        
        PreparedStatement ps;
        ResultSet consulta;
        
        try{
            ps = conexion.prepareStatement(qrySelect);
            ps.setString(1,nombre);
            consulta = ps.executeQuery();
            if(consulta.next()){
                String matricula = consulta.getString("idPacientes");
                nombre = consulta.getString("Nombre");
                String fechaNacimiento = consulta.getString("fechaRegistro");
                String sexo = consulta.getString("Sexo");
                String edad = consulta.getString("Edad");
                String telefono = consulta.getString("Telefono");
                String estadoCivil = consulta.getString("EdoCiv");
                String religion = consulta.getString("Religion");
                String ocupacion = consulta.getString("Ocupacion");
                return new Paciente(fecha.sacarFechaCadena(fechaNacimiento),nombre, Integer.parseInt( matricula), (sexo+""), Integer.parseInt(edad),Integer.parseInt(telefono),estadoCivil, religion, ocupacion);
            }else {
                return null;
            }
        }catch (SQLException e){
            return null;
        }
    }
    
    private List<Paciente> consultarPacientes(String ordenConsulta) throws DiaInvalido, MesInvalido{
        List<Paciente> pacientes = new ArrayList();
        String qrySelect;
        qrySelect = "SELECT * FROM pacientes " + ordenConsulta;
        
        PreparedStatement ps;
        ResultSet consulta;
        try{
            ps = conexion.prepareStatement(qrySelect);
            consulta = ps.executeQuery();
            while(consulta.next()){
                
                
                String matricula = consulta.getString("matricula");
                String nombre = consulta.getString("nombre");
                String fechaNacimiento = consulta.getString("fechaNacimiento");
                String sexo = consulta.getString("sexo");
                String edad = consulta.getString("edad");
                String telefono = consulta.getString("telefono");
                String estadoCivil = consulta.getString("estadoCivil");
                String religion = consulta.getString("religion");
                String ocupacion = consulta.getString("ocupacion");
                
                
                Paciente cte = new Paciente(fecha.sacarFechaCadena(fechaNacimiento),nombre, Integer.parseInt( matricula), sexo, Integer.parseInt(edad),Integer.parseInt(telefono),estadoCivil, religion, ocupacion);
                pacientes.add(cte);
                
            }
            return pacientes;
        }catch (SQLException e){
            return null;
        }
    }
    
    public List<Paciente> getListaClientes(String matricula) throws DiaInvalido, MesInvalido{
        List<Paciente> pacientes = consultarPacientes("ORDER by matricula ");
        return pacientes;
    }
    
    
}
