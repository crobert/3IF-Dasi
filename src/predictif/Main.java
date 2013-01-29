/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package predictif;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modele.Client;

/**
 *
 * @author crobert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("$objectdb/db/points.odb");
        EntityManager em = emf.createEntityManager();
        
       em.getTransaction().begin();
  
        Client c = new Client();
        em.persist(c);

        em.getTransaction().commit();
        
        
    }
}
