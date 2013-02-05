package modele;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Employé gérant les horoscopes
 * @author crobert
 */
@Entity
public class Employe implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique=true, nullable=false)
    private String code;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Client> clients;

   /**
     * Constructeurs
     */
    
    public Employe() {
//        this.clients = new ArrayList<Client>();
    }
    
    public Employe(String code) {
        this.code = code;
//        this.clients = new ArrayList<Client>();
    }
    
    
   /**
     * Getters
     */
    
    public String getCode() {
        return code;
    }
    
    public List<Client> getClients() {
        return clients;
    }
    
   /**
     * Setters
     */
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setClients(List<Client> clients) {
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
