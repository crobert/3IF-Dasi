package modele;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author crobert
 */
@Entity
public class Medium {
    
    @Id
    private int id;
    private String nom;
    
    /**
     * Constructeurs
     */
    public Medium() {
    }
    
    public Medium(String nom) {
        this.nom = nom;
    }
    
    /**
     * Getters
     */
    
    public String getNom() {
        return nom;
    }

    /**
     * Setters
     */
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
