/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ClientDao;
import dao.EmployeDao;
import dao.JpaUtil;
import dao.MediumDao;
import dao.PredictionDao;
import dao.SigneAstralDao;
import java.util.GregorianCalendar;
import java.util.List;
import modele.Client;
import modele.Employe;
import modele.Horoscope;
import modele.Medium;
import modele.Prediction;
import modele.SigneAstral;

/**
 *
 * @author Administrateur
 */
public class Service {
    private EmployeDao employeDao;
    private ClientDao clientDao;
    private MediumDao mediumDao;
    private PredictionDao predictionDao;
    private SigneAstralDao signeAstralDao;
    
    public Service() {
        this.employeDao = new EmployeDao();
        this.clientDao = new ClientDao();
        this.mediumDao = new MediumDao();
        this.predictionDao = new PredictionDao();
        this.signeAstralDao = new SigneAstralDao();
    }
    
    public Boolean CreerEmploye(Employe e){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        employeDao.Create(e);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
    public Boolean UpdateEmploye (Employe e)
    {
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        employeDao.Update(e);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    } 
    
    public Boolean CreerClient(Client c){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        clientDao.Create(c);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
   public Client FindClientByNumClient(int num){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Client c = clientDao.getClientByNum(num);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return c;
    }
    
    public Boolean UpdateClient (Client c)
    {
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        clientDao.Update(c);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
    public Boolean CreerMedium(Medium m){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        mediumDao.Create(m);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
    public Boolean CreerPrediction(Prediction p){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        predictionDao.Create(p);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
    public Boolean CreerSigneAstral(SigneAstral sa){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        signeAstralDao.Create(sa);
        JpaUtil.validerTransaction();
        JpaUtil.fermerEntityManager();
        return true;
    }
    
    public Boolean RemplirBase(){
       //Création des prédictions
        CreerPrediction(new Prediction(1, "En ce moment ça ne va pas fort, mais ne vous laissez pas abatre", "Amour"));
        CreerPrediction(new Prediction(1, "Blah blah", "Amour" ));
        CreerPrediction(new Prediction(2, "Blah", "Amour"));
        CreerPrediction(new Prediction(2, "Blah", "Amour"));
        CreerPrediction(new Prediction(3, "Beaucoup d'amour aujourd'hui", "Amour"));
        CreerPrediction(new Prediction(3, "Ca va bien bien bien!!", "Travail"));
        CreerPrediction(new Prediction(2, "Ca va moyen", "Travail"));
        CreerPrediction(new Prediction(1, "Ca va pas super", "Travail"));
        CreerPrediction(new Prediction(1, "C'est nul", "Travail"));
        CreerPrediction(new Prediction(3, "Ca va bien bien bien!!", "Sante"));
        CreerPrediction(new Prediction(2, "Ca va moyen", "Sante"));
        CreerPrediction(new Prediction(1, "Ca va pas super", "Sante"));    
        
        //Création des signes astrologiques
        CreerSigneAstral(new SigneAstral("Verseau", "1"));
        CreerSigneAstral(new SigneAstral("Poisson", "2"));
        CreerSigneAstral(new SigneAstral("Belier", "3"));
        CreerSigneAstral(new SigneAstral("Taureau", "4"));
        CreerSigneAstral(new SigneAstral("Gemeaux", "5"));
        CreerSigneAstral(new SigneAstral("Cancer", "6"));
        CreerSigneAstral(new SigneAstral("Lion", "7"));
        CreerSigneAstral(new SigneAstral("Vierge", "8"));
        CreerSigneAstral(new SigneAstral("Balance", "9"));
        CreerSigneAstral(new SigneAstral("Scorpion", "10"));
        CreerSigneAstral(new SigneAstral("Sagittaire", "11"));
        CreerSigneAstral(new SigneAstral("Capricorne", "12"));
        
        //Création des mediums
        Medium MAlpha = new Medium("MAlpha");
        Medium MBravo = new Medium("MBravo");
        Medium MCharlie = new Medium("MCharlie");
        Medium MDelta = new Medium("MDelta");
        Medium MEcho = new Medium("MEcho");
        Medium MFoxtrot = new Medium("MFoxtrot");
                
        //Création des employés
        Employe EAlpha = new Employe("EAlpha");
        Employe EBravo = new Employe("EBravo");
        Employe ECharlie = new Employe("ECharlie");
        Employe EDelta = new Employe("EDelta");


        //Création des clients
        Client a = new Client("Janv", "Arianne", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client b = new Client("Fev", "Berenice", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client c = new Client("Mar", "Christelle", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client d = new Client("Avr", "Denise", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client e = new Client("Mai", "Emilie", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client f =  new Client("Juin", "Fabienne", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Client g =  new Client("Juil", "Gertrude", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        
        a.setReferant(EAlpha);
        EAlpha.ajouterClient(a);
        a.ajouterMedium(MEcho);
        a.ajouterMedium(MAlpha);
        a.ajouterMedium(MBravo);
        
        b.setReferant(EBravo);
        EBravo.ajouterClient(b);
        d.ajouterMedium(MCharlie);
        d.ajouterMedium(MDelta);
        
        c.setReferant(ECharlie);
        ECharlie.ajouterClient(c);
        d.ajouterMedium(MEcho);
        
        d.setReferant(EDelta);
        EDelta.ajouterClient(d);
        d.ajouterMedium(MEcho);
        d.ajouterMedium(MAlpha);
        
        e.setReferant(EAlpha);
        EAlpha.ajouterClient(e);
        d.ajouterMedium(MBravo);
        
        f.setReferant(EBravo);
        EBravo.ajouterClient(f);
        d.ajouterMedium(MCharlie);
        d.ajouterMedium(MDelta);
        
        g.setReferant(ECharlie);
        ECharlie.ajouterClient(g);
        d.ajouterMedium(MAlpha);
        d.ajouterMedium(MBravo);
        d.ajouterMedium(MCharlie);
        d.ajouterMedium(MDelta);
        d.ajouterMedium(MEcho);
        
        //Création des objets qui sont liés à d'autres
        CreerMedium(MAlpha);
        CreerMedium(MBravo);
        CreerMedium(MCharlie);
        CreerMedium(MDelta);
        CreerMedium(MEcho);
        CreerMedium(MFoxtrot);
        
        CreerEmploye(EAlpha);
        CreerEmploye(EBravo);
        CreerEmploye(ECharlie);
        CreerEmploye(EDelta);
        
        CreerClient(a);
        CreerClient(b);
        CreerClient(c);
        CreerClient(d);
        CreerClient(e);
        CreerClient(f);
        CreerClient(g);
        
        return true;
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
    
    public Client CreerClient(String nom, String prenom, String adresse, String mail, GregorianCalendar date, String telephone, List<Medium> mediums)
    {
        //Récupérer l'employe avec le minimum de Client
        Employe e = FindEmployeDisponible();
        String s = CalculAstro(date);
        //Créer le client 
        Client c = new Client (nom, prenom, adresse, mail, date, telephone, s, mediums, e);
        CreerClient(c);
        UpdateEmploye(e);
        return null;
    }
    
    public String CalculAstro(GregorianCalendar date )
    {
        return signeAstralDao.getSigne(date);
    }
    
    public Employe FindEmployeDisponible()
    {
        return employeDao.FindEmployeDispo();
    }
    
    public List<Medium> FindAllMedium()
    {
        return mediumDao.FindAllMedium();
    }
    
    
}
