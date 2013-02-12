/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package predictif;

import java.util.List;
import modele.Client;
import modele.Employe;
import modele.Medium;
import service.Service;
import util.Saisie;

/**
 *
 * @author Administrateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Création des données en base"); 
        Service s = new Service();
        s.RemplirBase();
        
        //Liste des clients
        /* 
        List<Client> lcall = s.FindAllClient();
        for (Client c : lcall) {
            System.out.println("Voici le client "+c.getNumClient());
            System.out.println(c.getDateNaissance().get(GregorianCalendar.MONTH));
            System.out.println(c.getDateNaissance().getTime());
        }
        */
        
        //Liste des prédictions
        /*
        List<Prediction> lcall = s.FindPredictionByGrade("Amour", 1);
        for (Prediction c : lcall) {
            System.out.println("Voici l'amour "+c.getContenu());
        }
        
        List<Prediction> ls = s.FindPredictionByGrade("Sante", 2);
        for (Prediction c : ls) {
            System.out.println("Voici la sante "+c.getContenu());
        }
        
        List<Prediction> lt = s.FindPredictionByGrade("Travail", 3);
        for (Prediction c : lt) {
            System.out.println("Voici le travail "+c.getContenu()+" "+c.getValeur());
        }
        */
        
        
        
        /*****************************************************/
        //Le vrai début du main
        /*****************************************************/
        System.out.println("Bienvenu sur le logiciel de voyance");
        Employe employeConnecte = null;
        do{
        String code = Saisie.lireChaine("Entrez votre code : ");
         employeConnecte = s.Connexion(code);
        } while (employeConnecte == null);
        
        List<Client> lc = employeConnecte.getClients();
        int i = 0;
        for (Client clientDeLemploye : lc) {
            i++;
            System.out.println(clientDeLemploye.getNumClient() +": "+clientDeLemploye.getNom()+" "+clientDeLemploye.getPrenom());
//            List<Medium> lm = clientDeLemploye.getMediums();
//            System.out.println("Liste des mediums du client");
//            for (Medium mediumDuClient : lm) {
//                System.out.println(mediumDuClient.getNom());
//            }
        }
        
        do{
        String numClient = Saisie.lireChaine("Choisissez un numéro de client : ");
            Client clientRecup = s.FindClientByNumClient(Integer.decode(numClient));
            System.out.println("Vous avez choisi : "+clientRecup.getNom()+" "+clientRecup.getPrenom());
            
            System.out.println("Voici la liste de ses mediums :");
            for (Medium mediumDuClient : clientRecup.getMediums()) {
                System.out.println(mediumDuClient.getNom());
            }
        } while (employeConnecte == null);
        
    }
    
        /*****************************************************/
        //La fin du main
        /*****************************************************/
}
