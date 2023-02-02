/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "accesorios")
@NamedQueries({
    @NamedQuery(name = "Accesorios.findAll", query = "SELECT a FROM Accesorios a"),
    @NamedQuery(name = "Accesorios.findByIdAccesorios", query = "SELECT a FROM Accesorios a WHERE a.idAccesorios = :idAccesorios"),
    @NamedQuery(name = "Accesorios.findByTipo", query = "SELECT a FROM Accesorios a WHERE a.tipo = :tipo"),
    @NamedQuery(name = "Accesorios.findByMarca", query = "SELECT a FROM Accesorios a WHERE a.marca = :marca"),
    @NamedQuery(name = "Accesorios.findByModelo", query = "SELECT a FROM Accesorios a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Accesorios.findBySerie", query = "SELECT a FROM Accesorios a WHERE a.serie = :serie")})
public class Accesorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_accesorios")
    private Integer idAccesorios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipo")
    private String tipo;
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
    @Size(max = 45)
    @Column(name = "serie")
    private String serie;

    public Accesorios() {
    }

    public Accesorios(Integer idAccesorios) {
        this.idAccesorios = idAccesorios;
    }

    public Accesorios(Integer idAccesorios, String tipo, String marca, String modelo) {
        this.idAccesorios = idAccesorios;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getIdAccesorios() {
        return idAccesorios;
    }

    public void setIdAccesorios(Integer idAccesorios) {
        this.idAccesorios = idAccesorios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccesorios != null ? idAccesorios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accesorios)) {
            return false;
        }
        Accesorios other = (Accesorios) object;
        if ((this.idAccesorios == null && other.idAccesorios != null) || (this.idAccesorios != null && !this.idAccesorios.equals(other.idAccesorios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.com.gm.sga.domain.Accesorios[ idAccesorios=" + idAccesorios + " ]";
    }
    
}
