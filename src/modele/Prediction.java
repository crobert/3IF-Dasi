package modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe abstraite des trois types de prédiction
 * @author crobert
 */
@Entity
public abstract class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int valeur;
    protected String contenu;
    protected String type;
   
    /**
     * Constructeurs
     */

    public Prediction() {
    }
  
    public Prediction(int valeur, String contenu, String type) {
        this.valeur = valeur;
        this.contenu = contenu;
        this.type = type;
    }

    /**
     * Getters
     */
    
    public String getContenu() {
        return contenu;
    }

    public int getValeur() {
        return valeur;
    }
    
    /**
     * Setters
     */
    
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    
    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
}