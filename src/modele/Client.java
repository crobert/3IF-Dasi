package modele;

import java.util.GregorianCalendar;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Données client
 * @author crobert
 */
@Entity
public class Client {

    @Id
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private GregorianCalendar dateNaissance; 
    private String telephone;
    private String signeAstrologique;
    @OneToMany(cascade=CascadeType.ALL)
    private ArrayList<Medium> mediums;
   
    /**
     * Constructeurs
     */
    public Client() {
        this.mediums = new ArrayList<Medium>();
    }
    
    public Client(String nom, String prenom, String adresse, String mail, GregorianCalendar dateNaissance, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        this.mediums = new ArrayList<Medium>();
    }
    
    /**
     * Getters
     */
    
    public String getAdresse() {
        return adresse;
    }

    public GregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    public String getMail() {
        return mail;
    }

    public ArrayList<Medium> getMediums() {
        return mediums;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSigneAstrologique() {
        return signeAstrologique;
    }

    public String getTelephone() {
        return telephone;
    }
    
   /**
     * Setters
     */

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }    

    public void setDateNaissance(GregorianCalendar dateNaissance) {
        this.dateNaissance = dateNaissance;
    }    

    public void setMail(String mail) {
        this.mail = mail;
    }    

    public void setMediums(ArrayList<Medium> mediums) {
        this.mediums = mediums;
    }    

    public void setNom(String nom) {
        this.nom = nom;
    }    

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }    

    public void setSigneAstrologique(String signeAstrologique) {
        this.signeAstrologique = signeAstrologique;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
   /**
     * Ajoute un medium à la ArrayListe des mediums de ce client
     * @param Medium
     * @return Boolean, true si succès
     */
    public Boolean ajouterMedium(Medium medium) {
        return this.mediums.add(medium) ;
    }
    
   /**
     * Supprime un medium à la ArrayListe des mediums de ce client
     * @param Medium
     * @return Boolean, true si succès
     */
    public Boolean supprimerMedium(Medium medium) {
        return this.mediums.remove(medium) ;
    }
    
    
}
