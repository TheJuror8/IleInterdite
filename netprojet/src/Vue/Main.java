/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Controleur.Controleur;
import Utils.Utils;

/**
 *
 * @author habib
 */
public class Main {

  
    public static void main(String [] args) {
        // Instanciation de la fenêtre 
        VueAventurier vueAventurier = new VueAventurier ("Manon", "Explorateur", Utils.Pion.ROUGE.getCouleur() );
        
        // Instanciation du contrôleur
        Controleur controleur  = new Controleur();
    }
    
}
