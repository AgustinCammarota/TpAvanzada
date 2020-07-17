package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alianza")
@NamedQuery(name = "Pais.findAllAlianza", query = "SELECT a FROM Alianza a")
public class Alianza implements Serializable {

    public Alianza() {

    }

    public Alianza(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_alianza")
    private Long idAlianza;

    private String nombre;

    public Long getIdAlianza() {
        return idAlianza;
    }

    public void setIdAlianza(Long idAlianza) {
        this.idAlianza = idAlianza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
