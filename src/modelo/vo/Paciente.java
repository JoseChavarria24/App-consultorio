
package modelo.vo;

        
 public class Paciente {
    private Fecha fechaNacimiento;
    private String nombre;
    private int matricula;
    private String sexo;
    private int edad;
    private int telefono;
    private int estadoCivil;
    private String religion;
    private String ocupacion;
    public String cita;

    public Paciente(Fecha fechaNacimiento, String nombre, int matricula, String sexo, int edad, int telefono, int estadoCivil, String religion, String ocupacion) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.matricula = matricula;
        this.sexo = sexo;
        this.edad = edad;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.religion = religion;
        this.ocupacion = ocupacion;
        this.cita="";
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
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
