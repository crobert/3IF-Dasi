/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import modele.SigneAstral;

/**
 *
 * @author Administrateur
 */
public class SigneAstralDao {
        public Boolean Create (SigneAstral sa)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(sa);
        return true;
    }
}
