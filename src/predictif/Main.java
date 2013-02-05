/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package predictif;

import java.lang.String;
import java.util.GregorianCalendar;
import java.util.List;
import modele.Client;
import modele.Employe;
import modele.Medium;
import modele.Prediction;
import modele.SigneAstral;
import service.Service;
import service.Voyance;
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
        Service sv = new Service();
        Voyance s = new Voyance();
        System.out.println("Création des prédictions");
        sv.CreerPrediction(new Prediction(1, "En ce moment ça ne va pas fort, mais ne vous laissez pas abatre", "Amour"));
        sv.CreerPrediction(new Prediction(1, "Blah blah", "Amour" ));
        sv.CreerPrediction(new Prediction(2, "Blah", "Amour"));
        sv.CreerPrediction(new Prediction(2, "Blah", "Amour"));
        sv.CreerPrediction(new Prediction(3, "Beaucoup d'amour aujourd'hui", "Amour"));
        sv.CreerPrediction(new Prediction(3, "Ca va bien bien bien!!", "Travail"));
        sv.CreerPrediction(new Prediction(2, "Ca va moyen", "Travail"));
        sv.CreerPrediction(new Prediction(1, "Ca va pas super", "Travail"));
        sv.CreerPrediction(new Prediction(1, "C'est nul", "Travail"));
        sv.CreerPrediction(new Prediction(3, "Ca va bien bien bien!!", "Sante"));
        sv.CreerPrediction(new Prediction(2, "Ca va moyen", "Sante"));
        sv.CreerPrediction(new Prediction(1, "Ca va pas super", "Sante"));    
        
        System.out.println("Création des signes astrologiques");
        sv.CreerSigneAstral (new SigneAstral("Belier", "Mars"));
        sv.CreerSigneAstral (new SigneAstral("Taureau", "Avril"));
        sv.CreerSigneAstral (new SigneAstral("Gemeaux", "Mai"));
        sv.CreerSigneAstral (new SigneAstral("Cancer", "Juin"));
        sv.CreerSigneAstral (new SigneAstral("Lion", "Juillet"));
        sv.CreerSigneAstral (new SigneAstral("Vierge", "Août"));
        sv.CreerSigneAstral (new SigneAstral("Balance", "Septembre"));
        sv.CreerSigneAstral (new SigneAstral("Scorpion", "Octobre"));
        sv.CreerSigneAstral (new SigneAstral("Sagittaire", "Novembre"));
        sv.CreerSigneAstral (new SigneAstral("Capricorne", "Decembre"));
        sv.CreerSigneAstral (new SigneAstral("Verseau", "Janvier"));
        sv.CreerSigneAstral (new SigneAstral("Poisson", "Fevrier"));

        
        
        System.out.println("Création des medium"); 
        Medium m = new Medium("DrT");
        Employe e = new Employe("zozo");
        Client c = new Client("ZAZA", "a", "rue", "mail@mail.fr", new GregorianCalendar(), "0600000000" );
        Medium m2 = new Medium("MagicSpirit");
        
        System.out.println("Ajout en base de ces fichiers"); 
        sv.CreerEmploye(e); 
        sv.CreerClient(c); 
        sv.CreerMedium(m); 
        
        System.out.println("Affectation d'un client sur un employé"); 
        c.setReferant(e);
        e.ajouterClient(c);         
        sv.UpdateClient(c);
        sv.UpdateEmploye(e);
        
        c.ajouterMedium(m);
        c.ajouterMedium(m2);
        sv.UpdateClient(c);
        
        System.out.println("Fin de la création des medium"); 
        
        
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
            System.out.println(clientDeLemploye.getId() +": "+clientDeLemploye.getNom()+" "+clientDeLemploye.getPrenom());
//            List<Medium> lm = clientDeLemploye.getMediums();
//            System.out.println("Liste des mediums du client");
//            for (Medium mediumDuClient : lm) {
//                System.out.println(mediumDuClient.getNom());
//            }
        }
        
        do{
        String numClient = Saisie.lireChaine("Choisissez un numéro de client : ");
            Client clientRecup = sv.FindClientById(Integer.decode(numClient));
            System.out.println("Vous avez choisi : "+clientRecup.getNom());
        
        } while (employeConnecte == null);
        
    }
    
    
}
