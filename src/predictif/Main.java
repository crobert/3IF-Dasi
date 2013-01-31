/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package predictif;

import modele.Medium;
import service.Voyance;


/**
 *
 * @author crobert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("hello");
        Medium medium = new Medium("Toto");
        Medium medium2 = new Medium("Dr T");
        System.out.println(medium.getNom());
        Voyance serviceVoyance = new Voyance();
        serviceVoyance.CreerMedium(medium);
        serviceVoyance.CreerMedium(medium2);
    }
}
