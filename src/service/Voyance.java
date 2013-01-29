package service;

import modele.Employe;
import modele.Horoscope;
import modele.Prediction;


/**
 *
 * @author crobert
 */
public class Voyance {
    //private EmployeDao employeDao;
    

    public Boolean RemplirBase(){
        
        return false;
    }
    public Employe Connexion(code : String){
        
        return new Employe();       
    }
    public Prediction GetPredictionByGrade( type : String, grade : int){
    
        return new Prediction();  
    }
    public Horoscope CreerHoroscope(travail : Travail, sante : Sante, amour  : Amour){
        
        return new Horoscope();
    }

}
