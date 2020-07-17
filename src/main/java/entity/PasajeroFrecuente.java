package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "pasajero_frecuente")
@Table(name = "pasajero_frecuente")
public class PasajeroFrecuente implements Serializable {

    public PasajeroFrecuente() {

    }

    public PasajeroFrecuente(String numero, String categoria, Alianza alianza, Aerolinea aerolinea) {
        this.numero = numero;
        this.categoria = categoria;
        this.alianza = alianza;
        this.aerolinea = aerolinea;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pasajero_frecuente")
    private Long idPasajeroFrecuente;

    private String numero;

    private String categoria;

    @OneToOne(fetch = FetchType.LAZY)
    private Alianza alianza;

    @OneToOne(fetch = FetchType.LAZY)
    private Aerolinea aerolinea;

    public Long getIdPasajeroFrecuente() {
        return idPasajeroFrecuente;
    }

    public void setIdPasajeroFrecuente(Long idPasajeroFrecuente) {
        this.idPasajeroFrecuente = idPasajeroFrecuente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Alianza getAlianza() {
        return alianza;
    }

    public void setAlianza(Alianza alianza) {
        this.alianza = alianza;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}
