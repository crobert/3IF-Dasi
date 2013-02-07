/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
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
    
    public List<Prediction> getAllPrediction()
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("Select p from Prediction p Order By p.type");
        return (List<Prediction>)query.getResultList();
        
    }
    
    public List<Prediction> getPrediction(String type)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("Select p from Prediction p Where p.type = :type");
        query.setParameter("type", type);
        return (List<Prediction>)query.getResultList();
    }
       
    public List<Prediction> getPredictionByGrade(String type,int grade)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("Select p from Prediction p Where p.type = :type And p.valeur = :grade");
        query.setParameter("type", type);
        query.setParameter("grade", grade);
        return (List<Prediction>)query.getResultList();
    }
    
    
    
}
