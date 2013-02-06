/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Client;

/**
 *
 * @author Administrateur
 */
public class ClientDao {
        public ClientDao() {
    }
    
    public Boolean Create (Client c)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(c);
        return true;
    }
    
    public Boolean Update (Client c)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.merge(c);
        return true;
    }
    
       public Client getClientByNum (int num)
   {
       EntityManager em = JpaUtil.obtenirEntityManager();
       Query query = em.createQuery("Select c from Client c Where c.num = :num");
       query.setParameter("num", num);
       return (Client)query.getSingleResult();
   }
    
}
