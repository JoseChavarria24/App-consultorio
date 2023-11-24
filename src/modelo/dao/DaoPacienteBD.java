/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modelo.vo.Paciente;
import modelo.conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Fecha;


/**
 *
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
            qryInsert = "INSERT INTO pacientes(matricula,nombre,fechaNacimiento,sexo,)"
                    +"edad,telefono,estadoCivil,religion,ocupacion"; //Incompleto
                    
            //Modificar ps.getString() con campos que se guardan del registro de paciente
            ps = conexion.prepareStatement(qryInsert);
            ps.setString(1,String.valueOf(cte.getMatricula()));
            ps.setString(2,String.valueOf(cte.getNombre()));
            ps.setString(3,String.valueOf(cte.getFechaNacimiento()));
            ps.setString(4,String.valueOf(cte.getSexo()));
            ps.setString(5,String.valueOf(cte.getEdad()));
            ps.setString(6,String.valueOf(cte.getTelefono()));
            ps.setString(7,String.valueOf(cte.getEstadoCivil()));
            ps.setString(8,cte.getReligion());
            ps.setString(5,cte.getOcupacion());
            ps.executeUpdate();
        
        }catch (SQLException ex){
            return cte = null;
        }
        return cte;
    }
    
    public int modificarDAO(Paciente cte){
        int numRegistrosModificados;
        try{
            String qryUpdate;
            PreparedStatement ps;
            qryUpdate = "UPDATE pacientes SET"
                    + "nombre = ?"
                    + "fechaNacimiento = ?"
                    + "sexo = ?"
                    + "edad = ?"
                    + "telefono = ?"
                    + "estadoCivil = ?"
                    + "religion = ?"
                    + "ocupacion = ?"
                    + "WHERE ... = ?";
            ps = conexion.prepareStatement(qryUpdate);
            
            ps.setString(1,String.valueOf(cte.getMatricula()));
            ps.setString(2,String.valueOf(cte.getNombre()));
            ps.setString(3,String.valueOf(cte.getFechaNacimiento()));
            ps.setString(4,String.valueOf(cte.getSexo()));
            ps.setString(5,String.valueOf(cte.getEdad()));
            ps.setString(6,String.valueOf(cte.getTelefono()));
            ps.setString(7,String.valueOf(cte.getEstadoCivil()));
            ps.setString(8,cte.getReligion());
            ps.setString(5,cte.getOcupacion());
            numRegistrosModificados =ps.executeUpdate();
        }catch (SQLException ex){
            numRegistrosModificados = 0;
        }
        return numRegistrosModificados;
    }
    
    public int eliminarDAO(Paciente cte){
        int numRegistrosEliminados;
        try{
            String qryDelete;
            qryDelete = "DELETE FROM pacientes WHERE matricula = ?";
            
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
                String matricula = consulta.getString("matricula");
                nombre = consulta.getString("nombre");
                String fechaNacimiento = consulta.getString("fechaNacimiento");
                String sexo = consulta.getString("sexo");
                String edad = consulta.getString("edad");
                String telefono = consulta.getString("telefono");
                String estadoCivil = consulta.getString("estadoCivil");
                String religion = consulta.getString("religion");
                String ocupacion = consulta.getString("ocupacion");
                return new Paciente(fecha.sacarFechaCadena(fechaNacimiento),nombre, Integer.parseInt( matricula), (sexo+""), Integer.parseInt(edad),Integer.parseInt(telefono),Integer.parseInt( estadoCivil), religion, ocupacion);
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
                
                
                Paciente cte = new Paciente(fecha.sacarFechaCadena(fechaNacimiento),nombre, Integer.parseInt( matricula), sexo, Integer.parseInt(edad),Integer.parseInt(telefono),Integer.parseInt( estadoCivil), religion, ocupacion);
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
