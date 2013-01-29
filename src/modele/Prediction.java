package modele;

/**
 * Classe abstraite des trois types de prédiction
 * @author crobert
 */
public abstract class Prediction {

    protected int valeur;
    protected String contenu;
   
    /**
     * Constructeurs
     */

    public Prediction() {
    }
  
    public Prediction(int valeur, String contenu) {
        this.valeur = valeur;
        this.contenu = contenu;
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