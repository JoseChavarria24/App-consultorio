
package modelo.vc;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Fecha;
import Repositorio.RepositorioCitas;
import modelo.vo.Citas;
import modelo.vo.Paciente;

public class ModeloCitasTabla extends AbstractTableModel{
    
    private List<Paciente> datosCitas= RepositorioCitas.getRepositorioCitas();
    private String titulosTCitas[]= {"Matricula","Paciente","Cita"};
    
    public ModeloCitasTabla(){
        
    }
    
    @Override
    public int getRowCount() {
           return datosCitas.size();
    }

    @Override
    public int getColumnCount() {
           return titulosTCitas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     Paciente p= datosCitas.get(rowIndex);
     if(p.getCita()!=""){
         switch(columnIndex){
         case 0:
             return p.getMatricula();
         case 1:
             return p.getNombre();
         case 2:
             return p.getCita();
        
         }
     }
     
      return null;
     
    }
   @Override
  public String getColumnName(int column) {
    return titulosTCitas[column];
}

    public Class<?> getCoulmnClass(int columnIndex){
        return getValueAt(0,columnIndex).getClass();
    }
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    @Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    Paciente pa = datosCitas.get(rowIndex);
   if(pa.getCita()!=""){
     switch (columnIndex) {
        case 0:
            pa.setNombre((String)aValue);
            break;
        case 1:
            pa.setMatricula((int) aValue);
            break;
        case 2:
            pa.setCita((String) aValue); 
            break;}
    fireTableCellUpdated(rowIndex, columnIndex);
   }
}
 
}
