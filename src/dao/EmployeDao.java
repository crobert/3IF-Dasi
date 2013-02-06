package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import modele.Employe;

/**
 *
 * @author Administrateur
 */
public class EmployeDao {

    public EmployeDao() {
    }
    
    public Boolean Create (Employe e)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.persist(e);
        return true;
    }
    
   public Boolean Update (Employe e)
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        em.merge(e);
        return true;
    }
   
   public Employe FindEmployeFromCode (String code)
   {
       EntityManager em = JpaUtil.obtenirEntityManager();
       Query query = em.createQuery("Select e from Employe e Where e.code = :code");
       query.setParameter("code", code);
       List<Employe> list = query.getResultList();
       if (list.isEmpty())
       {
           return null;
       }else {
           return (Employe)query.getSingleResult();
       }
   }
   
    public Employe FindEmployeDispo ()
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("Select e2, COUNT(e2.clients) FROM Employe e2");


        return null;
    }
   
    public List<Employe> FindAllEmploye()
    {
        EntityManager em = JpaUtil.obtenirEntityManager();
        Query query = em.createQuery("Select e from Employe e");

        return (List<Employe>)query.getResultList();
    }
}
