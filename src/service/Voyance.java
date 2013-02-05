package service;

import dao.ClientDao;
import dao.JpaUtil;
import dao.EmployeDao;
import dao.MediumDao;
import modele.Employe;
import modele.Horoscope;



/**
 *
 * @author crobert
 */
public class Voyance {
    private EmployeDao employeDao;
    private ClientDao clientDao;
    private MediumDao mediumDao;
    
    public Voyance() {
        this.employeDao = new EmployeDao();
        this.clientDao = new ClientDao();
        this.mediumDao = new MediumDao();
    }

    public Employe Connexion(String code ){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Employe e = employeDao.FindEmployeFromCode(code);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return e;       
    }
   
    public boolean AfficherHoroscope(Horoscope horoscope){
        
        System.out.println( horoscope.getClient().getPrenom() + " " + horoscope.getClient().getNom());
        System.out.println( horoscope.getClient().getAdresse());
        System.out.println( horoscope.getClient().getTelephone());
        System.out.println( "Votre numéro client ; " + horoscope.getClient().getNumClient());
        System.out.println( "Voytre signe Astro : " + horoscope.getClient().getSigneAstrologique());
        //List<Medium> lm = clientDeLemploye.getMediums();
        //for (Medium mediumDuClient : lm) {
        //        System.out.println(mediumDuClient.getNom());
        //System.out.println( horoscope.getClient().getMediums()
        
        return true;
    }
    
}
