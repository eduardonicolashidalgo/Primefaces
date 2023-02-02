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
@Table(name = "descripcion")
@NamedQueries({
    @NamedQuery(name = "Descripcion.findAll", query = "SELECT d FROM Descripcion d"),
    @NamedQuery(name = "Descripcion.findByIdDescripcion", query = "SELECT d FROM Descripcion d WHERE d.idDescripcion = :idDescripcion"),
    @NamedQuery(name = "Descripcion.findByIp", query = "SELECT d FROM Descripcion d WHERE d.ip = :ip"),
    @NamedQuery(name = "Descripcion.findByResponsable", query = "SELECT d FROM Descripcion d WHERE d.responsable = :responsable"),
    @NamedQuery(name = "Descripcion.findByDepartamento", query = "SELECT d FROM Descripcion d WHERE d.departamento = :departamento")})
public class Descripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_descripcion")
    private Integer idDescripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "responsable")
    private String responsable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "departamento")
    private String departamento;

    public Descripcion() {
    }

    public Descripcion(Integer idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public Descripcion(Integer idDescripcion, String ip, String responsable, String departamento) {
        this.idDescripcion = idDescripcion;
        this.ip = ip;
        this.responsable = responsable;
        this.departamento = departamento;
    }

    public Integer getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(Integer idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDescripcion != null ? idDescripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descripcion)) {
            return false;
        }
        Descripcion other = (Descripcion) object;
        if ((this.idDescripcion == null && other.idDescripcion != null) || (this.idDescripcion != null && !this.idDescripcion.equals(other.idDescripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.com.gm.sga.domain.Descripcion[ idDescripcion=" + idDescripcion + " ]";
    }
    
}
