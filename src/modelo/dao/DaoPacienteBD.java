/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import com.sun.jdi.connect.spi.Connection;
import modelo.conexion.ConexionBD;
import modelo.vo.Paciente;

/**
 *
 * @author alejb
 */
public class DaoPacienteBD {
    private final Connection conexion;
    
    public DaoPacienteBD(){
        this.conexion = ConexionBD.getConexionBD;
    }
    
    public Paciente agregarDAO(Paciente cte){
        try{
            String qryInsert;
            //Preparar comando
            PreparedStatement ps;
            qryInsert = "INSERT INTO pacientes()" //Incompleto
                    
            //Modificar ps.getString() con campos que se guardan del registro de paciente
            ps = conexion.prepareStatement(qryInsert);
            ps.setString(1,cte.getCosa1());
            ps.setString(2,cte.getCosa2());
            ps.setString(3,cte.getCosa3());
            ps.setString(4,cte.getCosa4());
            ps.setString(5,cte.getCosa5());
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
                    + "... = ?"
                    + "... = ?"
                    + "WHERE ... = ?";
            ps = conexion.prepareStatement(qryUpdate);
            
            ps.setString(1,cte.getCosa1());
            ps.setString(2,cte.getCosa2());
            ps.setString(3,cte.getCosa3());
            ps.setString(4,cte.getCosa4());
            ps.setString(5,cte.getCosa5());
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
            
            PreparedStatementn ps;
            ps = conexion.prepareStetement(qryDelete);
            ps.setString(1,cte.getMatricula());
            numRegistrosEliminados = ps.executeUpdate();
        }catch (SQLException ex){
            numRegistrosEliminados = 0;
        }
        return numRegistrosEliminados;
    }
    
    public Paciente consultarDAO(String matricula){
        String qrySelect;
        qrySelect = "SELECT * FROM pacientes WHERE matricula = ?";
        
        PreparedStatement ps;
        ResultSet consulta;
        
        try{
            ps = conexion.prepareStatement(qrySelect);
            ps.setString(1,matricula);
            consulta = ps.executeQuery();
            if(consulta.next()){
                String Cosa1 = consulta.getString("Cosa1");
                //Modificar los strings que devuelve y agregar el resto  faltantes
                return new Paciente(matricula,...,...);
            }else {
                return null;
            }
        }catch (SQLException e){
            return null;
        }
    }
    
    
}
