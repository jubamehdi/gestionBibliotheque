/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressourcesbiblio;

import entities.Adherant;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.json.JsonObject;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import utils.Singleton;

/**
 * REST Web Service
 *
 * @author juba
 */
@Stateless
@LocalBean
@Path("gestionAdherant")
public class AdherantService {

    @Context
    private UriInfo context;
    private Connection conn = Singleton.getConnection();

    public AdherantService() {
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("newAdh")
    public String ajouterAdherant(@FormParam("nom") String nom, @FormParam("prenom") String prenom, @FormParam("adresse") String adresse) {
        try {
            Statement statement = conn.createStatement();
            
            statement.executeUpdate("insert into adherant(nom_adh,prenom_adh,adresse_adh) values ('" + nom + "','" + prenom + "','" + adresse + "')" ,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            String id = ""+rs.getInt(1);
            rs.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(AdherantService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "erreur";
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("getAdhById")
    public Adherant getAdherantById(@FormParam("id_adh") String id_adh) {
        ResultSet rs = null;
        try {
            Statement statement = conn.createStatement();
            rs = statement.executeQuery("select * from adherant where num_adh=" + id_adh);
        } catch (SQLException ex) {
            Logger.getLogger(AdherantService.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            Adherant adh = new Adherant();
            while (rs.next()) {
                adh.setNumAdh(rs.getInt("num_adh"));
                adh.setNomAdh(rs.getString("nom_adh"));
                adh.setPrenomAdh(rs.getString("prenom_adh"));
                adh.setAdresseAdh(rs.getString("adresse_adh"));
            }
            return adh;
        } catch (SQLException ex) {
            Logger.getLogger(AdherantService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("SuppAdherantById")
    public String SuppAdherantById(@FormParam("id_adh") String id) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("delete from adherant where num_adh=" + id);
            return "ok";
        } catch (SQLException ex) {
            Logger.getLogger(AdherantService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "erreur";
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("ModifierAdherant")
    public String ModifierAdherant(@FormParam("id_adh") String id, @FormParam("nom") String nom, @FormParam("prenom") String prenom, @FormParam("adresse") String adresse) {
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("update adherant set nom_adh='" + nom + "',prenom_adh='" + prenom + "',adresse_adh='" + adresse + "' where num_adh=" + id);
            return "ok";
        } catch (SQLException ex) {
            Logger.getLogger(AdherantService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "erreur";
    }

}
