package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable {

    public Telefono() {

    }

    public Telefono(String numeroPersonal, String numeroCelular, String numeroLaboral) {
        this.numeroPersonal = numeroPersonal;
        this.numeroCelular = numeroCelular;
        this.numeroLaboral = numeroLaboral;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_telefono")
    private Long idTelefono;

    @Column(name = "numero_personal")
    private String numeroPersonal;

    @Column(name = "numero_celular")
    private String numeroCelular;

    @Column(name = "numero_laboral")
    private String numeroLaboral;

    public Long getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Long idTelefono) {
        this.idTelefono = idTelefono;
    }

    public String getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(String numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroLaboral() {
        return numeroLaboral;
    }

    public void setNumeroLaboral(String numeroLaboral) {
        this.numeroLaboral = numeroLaboral;
    }
}
