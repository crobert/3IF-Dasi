package service;

import modele.Amour;
import modele.Employe;
import modele.Horoscope;
import modele.Prediction;
import modele.Sante;
import modele.Travail;


/**
 *
 * @author crobert
 */
public class Voyance {
    //private EmployeDao employeDao;
    

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
