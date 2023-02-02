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
@Table(name = "valor")
@NamedQueries({
    @NamedQuery(name = "Valor.findAll", query = "SELECT v FROM Valor v"),
    @NamedQuery(name = "Valor.findByIdValor", query = "SELECT v FROM Valor v WHERE v.idValor = :idValor"),
    @NamedQuery(name = "Valor.findByValorEquipo", query = "SELECT v FROM Valor v WHERE v.valorEquipo = :valorEquipo")})
public class Valor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_valor")
    private Integer idValor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "valor_equipo")
    private String valorEquipo;

    public Valor() {
    }

    public Valor(Integer idValor) {
        this.idValor = idValor;
    }

    public Valor(Integer idValor, String valorEquipo) {
        this.idValor = idValor;
        this.valorEquipo = valorEquipo;
    }

    public Integer getIdValor() {
        return idValor;
    }

    public void setIdValor(Integer idValor) {
        this.idValor = idValor;
    }

    public String getValorEquipo() {
        return valorEquipo;
    }

    public void setValorEquipo(String valorEquipo) {
        this.valorEquipo = valorEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValor != null ? idValor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valor)) {
            return false;
        }
        Valor other = (Valor) object;
        if ((this.idValor == null && other.idValor != null) || (this.idValor != null && !this.idValor.equals(other.idValor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.com.gm.sga.domain.Valor[ idValor=" + idValor + " ]";
    }
    
}
