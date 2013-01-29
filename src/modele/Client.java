package modele;

import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author crobert
 */
@Entity
public class Client {
    
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private GregorianCalendar dateNaissance; 
    private String telephone;
    private String numClient;
    private String signeAstrologique;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Medium> mediums;

    public Client() {
    }
    
    public Client(String nom, String prenom, String adresse, String mail, GregorianCalendar dateNaissance, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
    }
    
    
}
