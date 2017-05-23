package Modele.Aventuriers;

import Modele.Tuile;
import Modele.Grille;
import java.util.ArrayList;

public abstract class Aventurier {

	private Tuile casePosition;

	Aventurier(Tuile caseDepart) {
		this.casePosition = caseDepart;
	}

	/* Getters
	===========================================*/

	/* Renvoie la liste des cases non sombrées adjacentes	à la case position de l'aventurier */
	public ArrayList<Tuile> getCasesPossibles(Grille grille) {
		ArrayList<Tuile> casesPossibles = new ArrayList<>();

		return casesPossibles;
	}

	/* Renvoie la liste des cases non sombrées adjacentes	à la case position de l'aventurier,
	 plus la case active de l'aventurier */
	public ArrayList<Tuile> getCasesPossibleAssechement(Grille grille) {
		ArrayList<Tuile> casesPossibles = new ArrayList<>();

		return casesPossibles;
	}

	public Tuile getPosition() {
		return this.casePosition;
	}

	public Tuile getCasePosition() {
		return casePosition;
	}


	/* Setters
	===========================================*/

	public void setPosition(Tuile casePosition) {
		this.casePosition = casePosition;
	}
}
