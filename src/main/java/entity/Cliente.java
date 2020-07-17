package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String email, String cuil, Date fechaNacimiento, Pasaporte pasaporte, Telefono telefono, PasajeroFrecuente pasajeroFrecuente, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.cuil = cuil;
        this.fechaNacimiento = fechaNacimiento;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.pasajeroFrecuente = pasajeroFrecuente;
        this.direccion = direccion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Long idCliente;

    private String nombre;

    private String apellido;

    private String email;

    private String cuil;

    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Pasaporte pasaporte;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Telefono telefono;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private PasajeroFrecuente pasajeroFrecuente;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Direccion direccion;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public PasajeroFrecuente getPasajeroFrecuente() {
        return pasajeroFrecuente;
    }

    public void setPasajeroFrecuente(PasajeroFrecuente pasajeroFrecuente) {
        this.pasajeroFrecuente = pasajeroFrecuente;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
