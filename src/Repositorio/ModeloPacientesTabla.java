
package Repositorio;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.excepciones.DiaInvalido;
import modelo.excepciones.MesInvalido;
import modelo.vo.Fecha;
import modelo.vo.Paciente;
import Repositorio.RepositorioPacientes;


public class ModeloPacientesTabla extends AbstractTableModel{
    
    private List<Paciente> datosPacientes= RepositorioPacientes.getRepositorioPacientes();
    private String titulosTPacientes[]= {"Nacimiento","Nombre","Matricula","Sexo","Edad","Telefono","Estado Civil","Religión","Ocupacion"};
    
    public ModeloPacientesTabla(){
        
        
    }
    
    @Override
    public int getRowCount() {
           return datosPacientes.size();
    }

    @Override
    public int getColumnCount() {
           return titulosTPacientes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     Paciente p= datosPacientes.get(rowIndex);
     switch(columnIndex){
         case 0:
             return p.getFechaNacimiento();
         case 1:
             return p.getNombre();
         case 2:
             return p.getMatricula();
         case 3:
             return p.getSexo();
         case 4:
             return p.getEdad();
         case 5:
             return p.getTelefono();
         case 6:
             return p.getEstadoCivil();
         case 7:
             return p.getReligion();
         case 8:
             return p.getOcupacion();
     }
      return null;

    }
   @Override
  public String getColumnName(int column) {
    return titulosTPacientes[column];
}

    public Class<?> getCoulmnClass(int columnIndex){
        return getValueAt(0,columnIndex).getClass();
    }
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }
    @Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    Paciente pa = datosPacientes.get(rowIndex);
    switch (columnIndex) {
        case 0:
            // Tratar la fecha de nacimiento
            String fechaCadena = (String) aValue;
            String[] fechaSeparada = fechaCadena.split("/");
            if (fechaSeparada.length == 3) {
                int dia = Integer.parseInt(fechaSeparada[0]);
                int mes = Integer.parseInt(fechaSeparada[1]);
                int anio = Integer.parseInt(fechaSeparada[2]);
                try {
                    Fecha fecha = new Fecha(dia, mes, anio);
                    pa.setFechaNacimiento(fecha);
                } catch (DiaInvalido | MesInvalido e) {
                    // Manejar errores aquí, por ejemplo, mostrar un mensaje de error
                }
            }
            break;
        case 1:
            pa.setNombre((String) aValue);
            break;
        case 6:
            pa.setEstadoCivil((int) aValue); // Suponiendo que el estado civil es una cadena
            break;
        case 3:
            pa.setSexo(((String) aValue).charAt(0)); // Suponiendo que el sexo es un carácter
            break;
        case 7:
            pa.setReligion((String) aValue);
            break;
        case 5:
            pa.setTelefono((int) aValue); // Suponiendo que el teléfono es una cadena
            break;
        case 8:
            pa.setOcupacion((String) aValue);
            break;
        case 2:
            pa.setMatricula((int) aValue); // Suponiendo que la matrícula es una cadena
            break;
        case 4:
            pa.setEdad(Integer.parseInt((String) aValue)); // Suponiendo que la edad es un entero
            break;
    }
    fireTableCellUpdated(rowIndex, columnIndex);
}

   
}

