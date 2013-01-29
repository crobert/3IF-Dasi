package modele;

import java.util.ArrayList;
import javax.persistence.*;

/**
 * Employé gérant les horoscopes
 * @author crobert
 */
@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    @OneToMany(cascade=CascadeType.ALL)
    private ArrayList<Client> clients;

   /**
     * Constructeurs
     */
    
    public Employe() {
        this.clients = new ArrayList<Client>();
    }
    
    public Employe(String code) {
        this.code = code;
        this.clients = new ArrayList<Client>();
    }
    
    
   /**
     * Getters
     */
    
    public String getCode() {
        return code;
    }
    
    public ArrayList<Client> getClients() {
        return clients;
    }
    
   /**
     * Setters
     */
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    
    /**
     * Ajoute un client à la liste des clients de cet employé
     * @param Client
     * @return Boolean, true si succès
     */
    public Boolean ajouterClient(Client client) {
        return this.clients.add(client) ;
    }
    
   /**
     * Supprime un client à la liste des clients de cet employé
     * @param Client
     * @return Boolean, true si succès
     */
    public Boolean supprimerClient(Client client) {
        return this.clients.remove(client) ;
    }
    
}
