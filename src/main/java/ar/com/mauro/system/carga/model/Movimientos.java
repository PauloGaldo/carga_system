package ar.com.mauro.system.carga.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "movimientos")
public class Movimientos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "ingreso_egreso")
    private Boolean ingresoEgreso;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "bancos")
    private String bancos;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    /**
     * Constructor
     */
    public Movimientos() {
    }

    /**
     * Constructor
     *
     * @param id
     * @param nombre
     * @param descripcion
     * @param ingresoEgreso
     * @param saldo
     * @param bancos
     * @param fecha
     */
    public Movimientos(Integer id, String nombre, String descripcion, Boolean ingresoEgreso, Double saldo, String bancos, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ingresoEgreso = ingresoEgreso;
        this.saldo = saldo;
        this.bancos = bancos;
        this.fecha = fecha;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the ingresoEgreso
     */
    public Boolean getIngresoEgreso() {
        return ingresoEgreso;
    }

    /**
     * @param ingresoEgreso the ingresoEgreso to set
     */
    public void setIngresoEgreso(Boolean ingresoEgreso) {
        this.ingresoEgreso = ingresoEgreso;
    }

    /**
     * @return the saldo
     */
    public Double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the bancos
     */
    public String getBancos() {
        return bancos;
    }

    /**
     * @param bancos the bancos to set
     */
    public void setBancos(String bancos) {
        this.bancos = bancos;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
