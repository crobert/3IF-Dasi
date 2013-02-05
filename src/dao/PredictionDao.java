/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import modele.Prediction;

/**
 *
 * @author Administrateur
 */
public class PredictionDao {
    public Boolean Create (Prediction p)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(p);
        return true;
    }
}
