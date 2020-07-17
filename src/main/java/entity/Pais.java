package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pais")
@NamedQuery(name = "Pais.findAllPais", query = "SELECT p FROM Pais p")
public class Pais implements Serializable {

    public Pais() {

    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pais")
    private Long idPais;

    private String nombre;

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
