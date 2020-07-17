package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pasaporte")
public class Pasaporte implements Serializable {

    public Pasaporte() {

    }

    public Pasaporte(String numeroPasaporte, String autoridadEmision, Date fechaEmision, Date fechaVencimiento, Pais pais) {
        this.numeroPasaporte = numeroPasaporte;
        this.autoridadEmision = autoridadEmision;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.pais = pais;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPasaporte;

    @Column(name = "numero_pasaporte")
    private String numeroPasaporte;

    @Column(name = "autoridad_emision")
    private String autoridadEmision;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "fecha_emision")
    private Date fechaEmision;

    @Temporal(value = TemporalType.DATE)
    @Column(name = "fecha_vencimiento")
    private Date fechaVencimiento;

    @OneToOne(fetch = FetchType.LAZY)
    private Pais pais;

    public Long getIdPasaporte() {
        return idPasaporte;
    }

    public void setIdPasaporte(Long idPasaporte) {
        this.idPasaporte = idPasaporte;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getAutoridadEmision() {
        return autoridadEmision;
    }

    public void setAutoridadEmision(String autoridadEmision) {
        this.autoridadEmision = autoridadEmision;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
