package ilp.edu.sisgaedu.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName ="idpersona")
public class Estudiante extends Persona {

    @Column(name ="codigo",length = 10,nullable = false)
    private String codigo;

    @Column(name = "serie",length = 10)
    private String serie;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Escuela escuela;


    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona, String nombre, String apellido, int edad, String dni, Date fechanacimiento, String genero, String codigo, String serie, Escuela escuela) {
        super(idpersona, nombre, apellido, edad, dni, fechanacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

}


