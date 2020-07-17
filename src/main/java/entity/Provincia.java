package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "provincia")
@NamedQuery(name = "Provincia.findAllProvincia", query = "SELECT p FROM Provincia p")
public class Provincia implements Serializable {

    public Provincia() {

    }

    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_provincia")
    private Long idProvincia;

    private String nombre;

    public Long getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Long idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
