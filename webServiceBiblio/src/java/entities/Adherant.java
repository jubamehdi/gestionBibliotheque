/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author juba
 */
@Entity
@Table(name = "ADHERANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adherant.findAll", query = "SELECT a FROM Adherant a"),
    @NamedQuery(name = "Adherant.findByNumAdh", query = "SELECT a FROM Adherant a WHERE a.numAdh = :numAdh"),
    @NamedQuery(name = "Adherant.findByNomAdh", query = "SELECT a FROM Adherant a WHERE a.nomAdh = :nomAdh"),
    @NamedQuery(name = "Adherant.findByPrenomAdh", query = "SELECT a FROM Adherant a WHERE a.prenomAdh = :prenomAdh"),
    @NamedQuery(name = "Adherant.findByAdresseAdh", query = "SELECT a FROM Adherant a WHERE a.adresseAdh = :adresseAdh")})
public class Adherant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NUM_ADH")
    private Integer numAdh;
    @Size(max = 30)
    @Column(name = "NOM_ADH")
    private String nomAdh;
    @Size(max = 30)
    @Column(name = "PRENOM_ADH")
    private String prenomAdh;
    @Size(max = 30)
    @Column(name = "ADRESSE_ADH")
    private String adresseAdh;
    @OneToMany(mappedBy = "numAdh")
    private Collection<Livre> livreCollection;

    public Adherant() {
    }

    public Adherant(Integer numAdh) {
        this.numAdh = numAdh;
    }

    public Integer getNumAdh() {
        return numAdh;
    }

    public void setNumAdh(Integer numAdh) {
        this.numAdh = numAdh;
    }

    public String getNomAdh() {
        return nomAdh;
    }

    public void setNomAdh(String nomAdh) {
        this.nomAdh = nomAdh;
    }

    public String getPrenomAdh() {
        return prenomAdh;
    }

    public void setPrenomAdh(String prenomAdh) {
        this.prenomAdh = prenomAdh;
    }

    public String getAdresseAdh() {
        return adresseAdh;
    }

    public void setAdresseAdh(String adresseAdh) {
        this.adresseAdh = adresseAdh;
    }

    @XmlTransient
    public Collection<Livre> getLivreCollection() {
        return livreCollection;
    }

    public void setLivreCollection(Collection<Livre> livreCollection) {
        this.livreCollection = livreCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAdh != null ? numAdh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adherant)) {
            return false;
        }
        Adherant other = (Adherant) object;
        if ((this.numAdh == null && other.numAdh != null) || (this.numAdh != null && !this.numAdh.equals(other.numAdh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ressourcesbiblio.Adherant[ numAdh=" + numAdh + " ]";
    }
    
}
