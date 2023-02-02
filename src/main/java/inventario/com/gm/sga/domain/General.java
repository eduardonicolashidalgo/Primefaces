/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nicko
 */
@Entity
@Table(name = "general")
@NamedQueries({
    @NamedQuery(name = "General.findAll", query = "SELECT g FROM General g"),
    @NamedQuery(name = "General.findByIdGeneral", query = "SELECT g FROM General g WHERE g.idGeneral = :idGeneral"),
    @NamedQuery(name = "General.findByNombreEquipo", query = "SELECT g FROM General g WHERE g.nombreEquipo = :nombreEquipo"),
    @NamedQuery(name = "General.findByNumeroActivoFijo", query = "SELECT g FROM General g WHERE g.numeroActivoFijo = :numeroActivoFijo"),
    @NamedQuery(name = "General.findByPantalla", query = "SELECT g FROM General g WHERE g.pantalla = :pantalla"),
    @NamedQuery(name = "General.findByMarca", query = "SELECT g FROM General g WHERE g.marca = :marca"),
    @NamedQuery(name = "General.findByModelo", query = "SELECT g FROM General g WHERE g.modelo = :modelo"),
    @NamedQuery(name = "General.findBySerie", query = "SELECT g FROM General g WHERE g.serie = :serie"),
    @NamedQuery(name = "General.findByProcesador", query = "SELECT g FROM General g WHERE g.procesador = :procesador"),
    @NamedQuery(name = "General.findByVelocidad", query = "SELECT g FROM General g WHERE g.velocidad = :velocidad"),
    @NamedQuery(name = "General.findByMemoria", query = "SELECT g FROM General g WHERE g.memoria = :memoria"),
    @NamedQuery(name = "General.findByHdd1", query = "SELECT g FROM General g WHERE g.hdd1 = :hdd1"),
    @NamedQuery(name = "General.findByHdd2", query = "SELECT g FROM General g WHERE g.hdd2 = :hdd2")})
public class General implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_general")
    private Integer idGeneral;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_equipo")
    private String nombreEquipo;
    @Size(max = 45)
    @Column(name = "numero_activo_fijo")
    private String numeroActivoFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pantalla")
    private String pantalla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "serie")
    private String serie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "procesador")
    private String procesador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "velocidad")
    private String velocidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "memoria")
    private String memoria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "hdd1")
    private String hdd1;
    @Size(max = 45)
    @Column(name = "hdd2")
    private String hdd2;

    public General() {
    }

    public General(Integer idGeneral) {
        this.idGeneral = idGeneral;
    }

    public General(Integer idGeneral, String nombreEquipo, String numeroActivoFijo, String pantalla, String marca, String modelo, String serie, String procesador, String velocidad, String memoria, String hdd1, String hdd2) {
        this.idGeneral = idGeneral;
        this.nombreEquipo = nombreEquipo;
        this.numeroActivoFijo = numeroActivoFijo;
        this.pantalla = pantalla;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.procesador = procesador;
        this.velocidad = velocidad;
        this.memoria = memoria;
        this.hdd1 = hdd1;
        this.hdd2 = hdd2;
    }

    public Integer getIdGeneral() {
        return idGeneral;
    }

    public void setIdGeneral(Integer idGeneral) {
        this.idGeneral = idGeneral;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNumeroActivoFijo() {
        return numeroActivoFijo;
    }

    public void setNumeroActivoFijo(String numeroActivoFijo) {
        this.numeroActivoFijo = numeroActivoFijo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHdd1() {
        return hdd1;
    }

    public void setHdd1(String hdd1) {
        this.hdd1 = hdd1;
    }

    public String getHdd2() {
        return hdd2;
    }

    public void setHdd2(String hdd2) {
        this.hdd2 = hdd2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGeneral != null ? idGeneral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof General)) {
            return false;
        }
        General other = (General) object;
        if ((this.idGeneral == null && other.idGeneral != null) || (this.idGeneral != null && !this.idGeneral.equals(other.idGeneral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.com.gm.sga.domain.General[ idGeneral=" + idGeneral + " ]";
    }
    
}
