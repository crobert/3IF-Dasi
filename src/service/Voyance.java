package service;

import dao.JpaUtil;
import dao.MediumDao;
import modele.Amour;
import modele.Employe;
import modele.Horoscope;
import modele.Medium;
import modele.Prediction;
import modele.Sante;
import modele.Travail;


/**
 *
 * @author crobert
 */
public class Voyance {
    //private EmployeDao employeDao;
    private MediumDao mediumDao;

    public Voyance() {
        this.mediumDao = new MediumDao();
    }

    public Boolean CreerMedium(Medium medium){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        mediumDao.Create(medium);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return false;
    }
    
    public Boolean RemplirBase(){
        
        return false;
    }
    public Employe Connexion(String code ){
        
        return new Employe();       
    }
    public Prediction GetPredictionByGrade( String type, int grade ){
    
        return new Travail();  
    }
    public Horoscope CreerHoroscope(Travail travail, Sante sante, Amour amour){
        
        return new Horoscope();
    }

}
