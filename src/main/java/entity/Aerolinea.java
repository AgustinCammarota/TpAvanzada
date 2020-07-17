package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "aerolinea")
public class Aerolinea implements Serializable {

    public Aerolinea() {

    }

    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_aerolinea")
    private Long idAerolinea;

    private String nombre;

    public Long getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(Long idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
