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
public class Livre implements Serializable {

    private static final long serialVersionUID = 1L;

    private String titreLvr;

    private Date anneeLvr;

    private String auteurs;

    private String isbn;

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
