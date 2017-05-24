package Modele.Aventuriers;

import Modele.Grille;
import Modele.Tuile;
import java.util.ArrayList;

public class Explorateur extends Aventurier {
    Explorateur (Tuile caseDepart) {
      super(caseDepart);
    }
    
    public ArrayList<Tuile> getCasesPossible(Grille grille) {
        ArrayList<Tuile> collecCases = super.getCasesPossibles(grille) ;
        collecCases.addAll(grille.getCasesDiagonales(getPosition()));
        return collecCases;
    }
}


