/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import modele.Medium;

/**
 *
 * @author Administrateur
 */
public class MediumDao {

    public MediumDao() {
    }
    
    public Boolean Create (Medium medium)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(medium);
        return true;
    }
    
}
