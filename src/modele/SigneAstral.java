package modele;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Permet de symboliser les signes dans la base de donnée
 * @author crobert
 */
@Entity
public class  SigneAstral implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    private int mois;
    
    /**
     * Constructeurs
     */
    public SigneAstral() {
    }

    public SigneAstral(String nom, int mois) {
        this.nom = nom;
        this.mois = mois;
    }
    
    /**
     * Getters
     */
    
    public int getMois() {
        return mois;
    }

    public String getNom() {
        return nom;
    }
    
    /**
     * Setters
     */
    
    public void setMois(int mois) {
        this.mois = mois;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
