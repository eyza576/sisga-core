package ilp.edu.sisgaedu.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
@Inheritance( strategy = InheritanceType.JOINED )
public class Persona {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona",length = 10)
    private Long idpersona;

    @Column(name = "nombre",length = 100,nullable = false)
    private String nombre;

    private  String apellido;
    private  int edad;
    private String dni;

    @Column(name = "fechanacimiento",length =50)
    private Date fechanacimiento;

    private String genero;

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public Persona() {
    }

    public Persona(Long idpersona, String nombre, String apellido, int edad, String dni, Date fechanacimiento, String genero) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechanacimiento = fechanacimiento;
        this.genero = genero;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
