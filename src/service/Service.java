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
import modele.Client;
import modele.Employe;
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
    
   public Client FindClientById(int id){
        JpaUtil.creerEntityManager();
        JpaUtil.ouvrirTransaction();
        Client c = clientDao.getClientById(id);
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
        return false;
    }
}
