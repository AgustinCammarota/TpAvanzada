package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "direccion")
public class Direccion implements Serializable {

    public Direccion() {

    }

    public Direccion(String calle, String altura, String ciudad, String cp, Provincia provincia, Pais pais) {
        this.calle = calle;
        this.altura = altura;
        this.ciudad = ciudad;
        this.cp = cp;
        this.provincia = provincia;
        this.pais = pais;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_direccion")
    private Long idDireccion;

    private String calle;

    private String altura;

    private String ciudad;

    @Column(name = "codigo_postal")
    private String cp;

    @OneToOne(fetch = FetchType.LAZY)
    private Provincia provincia;

    @OneToOne(fetch = FetchType.LAZY)
    private Pais pais;

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
