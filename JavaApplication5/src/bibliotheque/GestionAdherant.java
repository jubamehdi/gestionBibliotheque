/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import entities.Adherant;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Jersey REST client generated for REST resource:AdherantService
 * [gestionAdherant]<br>
 * USAGE:
 * <pre>
 *        NewJerseyClient client = new NewJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author juba
 */
public class GestionAdherant {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/webServiceBiblio/webresources";

    public GestionAdherant() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("gestionAdherant");
    }

    public String ajouterAdherant(String nom, String prenom, String adresse) throws ClientErrorException {
        Form form = new Form();
        form.param("nom", nom);
        form.param("prenom", prenom);
        form.param("adresse", adresse);
        return webTarget.path("newAdh").request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED), String.class);
    }

    public String SuppAdherantById(String id) throws ClientErrorException {
        Form form = new Form();
        form.param("id_adh", id);
        return webTarget.path("SuppAdherantById").request().post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED), String.class);
    }

    public Adherant getAdherantById(String id) throws ClientErrorException {
        Form form = new Form();
        form.param("id_adh", id);
        return webTarget.path("getAdhById").request().post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED), Adherant.class);
    }

    public String ModifierAdherant(String id, String nom, String prenom, String adresse) throws ClientErrorException {
        Form form = new Form();
        form.param("id_adh", id);
        form.param("nom", nom);
        form.param("prenom", prenom);
        form.param("adresse", adresse);
        return webTarget.path("ModifierAdherant").request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED), String.class);
    }

    public void close() {
        client.close();
    }

}
