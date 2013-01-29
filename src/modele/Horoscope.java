package modele;

/**
 * Objet comprenant les prédictions réalisé par un medium pour un client
 * @author crobert
 */
public class Horoscope {
  
    private Medium signature;
    private Travail predictionTravail; 
    private Sante predictionSante; 
    private Amour predictionAmour; 
    private Client client;
    
    /**
     * Constructeurs
     */
    public Horoscope() {
    }
        
    public Horoscope(Medium signature, Travail predictionTravail, Sante predictionSante, Amour predictionAmour, Client client) {
        this.signature = signature;
        this.predictionTravail = predictionTravail;
        this.predictionSante = predictionSante;
        this.predictionAmour = predictionAmour;
        this.client = client;
    }
    
    /**
     * Getters
     */
    public Client getClient() {
        return client;
    }

    public Amour getPredictionAmour() {
        return predictionAmour;
    }

    public Sante getPredictionSante() {
        return predictionSante;
    }

    public Travail getPredictionTravail() {
        return predictionTravail;
    }

    public Medium getSignature() {
        return signature;
    }
    
    /**
     * Setters
     */
    
    public void setClient(Client client) {
        this.client = client;
    }

    public void setPredictionAmour(Amour predictionAmour) {
        this.predictionAmour = predictionAmour;
    }

    public void setPredictionSante(Sante predictionSante) {
        this.predictionSante = predictionSante;
    }

    public void setPredictionTravail(Travail predictionTravail) {
        this.predictionTravail = predictionTravail;
    }

    public void setSignature(Medium signature) {
        this.signature = signature;
    }
    
    
}
