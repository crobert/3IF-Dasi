/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author crobert
 */
public abstract class Prediction {

  
    
   protected int valeur;
   protected String contenu;
   
   public Prediction() {
   }
  
   public Prediction(int valeur, String contenu) {
        this.valeur = valeur;
        this.contenu = contenu;
   }



}