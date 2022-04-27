package ilp.edu.sisgaedu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "docente")
@PrimaryKeyJoinColumn(referencedColumnName = "idpersona")
public class Docente extends Persona {

    @Column(name = "coddocente",length = 10 )
    private  String coddocente;

    @Column(name = "horas-asignadas")
    private  Double horasasignadas;




    public Docente(Long idpersona, String coddocente, Double horasasignadas) {
        super(idpersona);
        this.coddocente = coddocente;
        this.horasasignadas = horasasignadas;
    }

    public Docente(String coddocente, Double horasasignadas) {
        this.coddocente = coddocente;
        this.horasasignadas = horasasignadas;
    }

    public Docente(Long idpersona, String nombre, String apellido, int edad, String dni, Date fechanacimiento, String genero, String coddocente, Double horasasignadas) {
        super(idpersona, nombre, apellido, edad, dni, fechanacimiento, genero);
        this.coddocente = coddocente;
        this.horasasignadas = horasasignadas;
    }

    public String getCoddocente() {
        return coddocente;
    }

    public void setCoddocente(String coddocente) {
        this.coddocente = coddocente;
    }

    public Double getHorasasignadas() {
        return horasasignadas;
    }

    public void setHorasasignadas(Double horasasignadas) {
        this.horasasignadas = horasasignadas;
    }
}





