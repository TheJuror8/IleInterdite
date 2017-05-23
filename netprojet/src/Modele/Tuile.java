package Modele;

import Modele.Aventuriers.Aventurier;
import java.util.ArrayList;

public class Tuile {

	private ArrayList<Aventurier> joueursSurCase;
	private EtatTuile etatTuile;
	private final int posX;
	private final int posY;
	private String nom;

	/* Par défaut, une tuile est asséchée */
	public Tuile(String nom, int posX, int posY) {
		this.nom = nom;
		this.posX = posX;
		this.posY = posY;
		joueursSurCase = new ArrayList<>();
		etatTuile = EtatTuile.ASSECHEE;
	}

	/* Ajoute un aventurier à la tuile
	Et définit la tuile comme case active de l'aventurier
	*/
	public void addJoueurCase(Aventurier j) {
		joueursSurCase.add(j);
		j.setPosition(this);
	}

	/* Setters
	===========================================*/

	public void setEtat(EtatTuile e){
		this.etatTuile = e;
	}

	/* Getters
	===========================================*/

	public int getX() {
		return posX;
	}

	public int getY() {
		return posY;
	}

	public int[] getPosition() {
		int[] pos = new int[2];

		pos[0] = getX();
		pos[1] = getY();

		return pos;
	}

	public EtatTuile getEtat(){
		return this.etatTuile;
	}

}
