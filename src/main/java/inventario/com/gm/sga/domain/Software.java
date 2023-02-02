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
@Table(name = "software")
@NamedQueries({
    @NamedQuery(name = "Software.findAll", query = "SELECT s FROM Software s"),
    @NamedQuery(name = "Software.findByIdSoftware", query = "SELECT s FROM Software s WHERE s.idSoftware = :idSoftware"),
    @NamedQuery(name = "Software.findBySistemaOperativo", query = "SELECT s FROM Software s WHERE s.sistemaOperativo = :sistemaOperativo"),
    @NamedQuery(name = "Software.findBySoServicePack", query = "SELECT s FROM Software s WHERE s.soServicePack = :soServicePack"),
    @NamedQuery(name = "Software.findByOfimatica", query = "SELECT s FROM Software s WHERE s.ofimatica = :ofimatica")})
public class Software implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_software")
    private Integer idSoftware;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sistema_operativo")
    private String sistemaOperativo;
    @Size(max = 45)
    @Column(name = "so_service_pack")
    private String soServicePack;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ofimatica")
    private String ofimatica;

    public Software() {
    }

    public Software(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public Software(Integer idSoftware, String sistemaOperativo, String ofimatica) {
        this.idSoftware = idSoftware;
        this.sistemaOperativo = sistemaOperativo;
        this.ofimatica = ofimatica;
    }

    public Integer getIdSoftware() {
        return idSoftware;
    }

    public void setIdSoftware(Integer idSoftware) {
        this.idSoftware = idSoftware;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSoServicePack() {
        return soServicePack;
    }

    public void setSoServicePack(String soServicePack) {
        this.soServicePack = soServicePack;
    }

    public String getOfimatica() {
        return ofimatica;
    }

    public void setOfimatica(String ofimatica) {
        this.ofimatica = ofimatica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSoftware != null ? idSoftware.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Software)) {
            return false;
        }
        Software other = (Software) object;
        if ((this.idSoftware == null && other.idSoftware != null) || (this.idSoftware != null && !this.idSoftware.equals(other.idSoftware))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.com.gm.sga.domain.Software[ idSoftware=" + idSoftware + " ]";
    }
    
}
