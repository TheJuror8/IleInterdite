package Modele.Aventuriers;

import Modele.EtatTuile;
import Modele.Grille;
import Modele.Tuile;
import java.util.ArrayList;
import java.util.HashSet;

public class Plongeur extends Aventurier {
    Plongeur (Tuile caseDepart) {
      super(caseDepart);
    }
    
    public ArrayList<Tuile> getCasesPossibles(Grille grille) {
        ArrayList<Tuile> collecCases = grille.getCasesAdjacentes(getPosition());
        for (Tuile tuile : collecCases) {
            EtatTuile etat = tuile.getEtat();
            if (etat == EtatTuile.COULEE || etat == EtatTuile.INONDEE) {
                for (Tuile tuile2 : grille.getCasesAdjacentes(tuile)) {
                    if (!collecCases.contains(tuile2)) {
                        collecCases.add(tuile2);
                    }
                }
                if (etat == EtatTuile.INONDEE) {
                    collecCases.add(tuile);
                }
            }
        }
        return collecCases;
    }
}       
        
        
        
        /* HashSet<Tuile> collecCases = new HashSet();
        collecCases.addAll(grille.getCasesAdjacentes(getPosition()));
        for (Tuile tuile : collecCases) {
            EtatTuile etat = tuile.getEtat();
            if (etat == EtatTuile.COULEE || etat == EtatTuile.INONDEE) {
                ArrayList<Tuile> casesAdj = grille.getCasesAdjacentes(tuile);
                collecCases.addAll(casesAdj);
                if (etat == EtatTuile.COULEE) {
                    collecCases.add(tuile);
                }
            }
        }
        ArrayList<Tuile> collecCasesPoss = new ArrayList();
        collecCasesPoss.addAll(collecCases);
        return collecCasesPoss; */


