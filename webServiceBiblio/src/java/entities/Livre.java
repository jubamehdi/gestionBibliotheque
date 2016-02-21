/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juba
 */
@Entity
@Table(name = "LIVRE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livre.findAll", query = "SELECT l FROM Livre l"),
    @NamedQuery(name = "Livre.findByTitreLvr", query = "SELECT l FROM Livre l WHERE l.titreLvr = :titreLvr"),
    @NamedQuery(name = "Livre.findByAnneeLvr", query = "SELECT l FROM Livre l WHERE l.anneeLvr = :anneeLvr"),
    @NamedQuery(name = "Livre.findByAuteurs", query = "SELECT l FROM Livre l WHERE l.auteurs = :auteurs"),
    @NamedQuery(name = "Livre.findByIsbn", query = "SELECT l FROM Livre l WHERE l.isbn = :isbn")})
public class Livre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "TITRE_LVR")
    private String titreLvr;
    @Column(name = "ANNEE_LVR")
    @Temporal(TemporalType.DATE)
    private Date anneeLvr;
    @Size(max = 150)
    @Column(name = "AUTEURS")
    private String auteurs;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ISBN")
    private String isbn;
    @JoinColumn(name = "NUM_ADH", referencedColumnName = "NUM_ADH")
    @ManyToOne
    private Adherant numAdh;

    public Livre() {
    }

    public Livre(String isbn) {
        this.isbn = isbn;
    }

    public String getTitreLvr() {
        return titreLvr;
    }

    public void setTitreLvr(String titreLvr) {
        this.titreLvr = titreLvr;
    }

    public Date getAnneeLvr() {
        return anneeLvr;
    }

    public void setAnneeLvr(Date anneeLvr) {
        this.anneeLvr = anneeLvr;
    }

    public String getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(String auteurs) {
        this.auteurs = auteurs;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Adherant getNumAdh() {
        return numAdh;
    }

    public void setNumAdh(Adherant numAdh) {
        this.numAdh = numAdh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livre)) {
            return false;
        }
        Livre other = (Livre) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ressourcesbiblio.Livre[ isbn=" + isbn + " ]";
    }
    
}
