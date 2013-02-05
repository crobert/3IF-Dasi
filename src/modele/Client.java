package modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Données client
 * @author crobert
 */
@Entity
public class Client implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    @Temporal(TemporalType.DATE)
    private GregorianCalendar dateNaissance; 
    private String telephone;
    private String signeAstrologique;
    @ManyToMany(cascade=CascadeType.ALL)
    private List<Medium> mediums;
    @ManyToOne
    private Employe referant;
   
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
    public int getId() {
        return id;
    }

    public String getAdresse() {
        return adresse;
    }

    public GregorianCalendar getDateNaissance() {
        return dateNaissance;
    }

    public String getMail() {
        return mail;
    }

    public List<Medium> getMediums() {
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
    
    public Employe getReferant() {
        return referant;
    }

    public String getNumClient() {
        return numClient;
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

    public void setReferant(Employe referant) {
        this.referant = referant;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
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
