/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Medium;

/**
 *
 * @author Administrateur
 */
public class MediumDao {

    public MediumDao() {
    }
    
public Boolean Create (Medium m)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(m);
        return true;
    }

  public List<Medium> FindAllMedium ()
   {
       EntityManager em = JpaUtil.obtenirEntityManager();
       Query query = em.createQuery("Select m from Medium m");
   
       return (List<Medium>) query.getResultList();
   }



}
