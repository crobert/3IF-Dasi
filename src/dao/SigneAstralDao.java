/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
    
    public String getSigne(GregorianCalendar date)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query q = em.createQuery("SELECT s.nom FROM SigneAstral s WHERE (:mois = s.mois)");
        q.setParameter("mois", date.MONTH);

        return (String) q.getSingleResult();
    }
        
        
}
