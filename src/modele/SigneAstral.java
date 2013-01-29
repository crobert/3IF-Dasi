package modele;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Permet de symboliser les signes dans la base de donnée
 * @author crobert
 */
@Entity
public class SigneAstral {
    
    @Id
    private int id;
    private String nom;
    private String mois;
    
    /**
     * Constructeurs
     */
    public SigneAstral() {
    }

    public SigneAstral(String nom, String mois) {
        this.nom = nom;
        this.mois = mois;
    }
    
    /**
     * Getters
     */
    
    public String getMois() {
        return mois;
    }

    public String getNom() {
        return nom;
    }
    
    /**
     * Setters
     */
    
    public void setMois(String mois) {
        this.mois = mois;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
