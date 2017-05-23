package Controleur;

import Vue.Message;
import Modele.Aventuriers.Aventurier;
import Modele.Cartes.CarteInondation;
import Modele.Cartes.CarteTrésor;
import Modele.Grille;
import java.util.*;

public class Controleur {

	private Collection<CarteInondation> pileInondation;
	private Collection<CarteTrésor> pileTrésor;
	private Collection<Aventurier> joueur;
	private Grille grille;

	private int nbact; // nombre d'actions restant au joueur courant

	public Controleur() {
		this.nbact = 3;
		this.grille = new Grille();
	}

	/* Effectuer action traite les messages Vue => Contrôleur et appelle
	les méthodes correspondantes
	*/
	public void effectuerAction(Message msg) {

	}

	/* Actions de jeu */
	public void tourDeJeu() {

	}

	public void deplacement() {

	}

	public void assecher() {

	}

	/* Autres méthodes */

	/* Renvoie TRUE si le tour courant est fini
	=> replace le compteur d'actions à 3 si c'est le cas
	*/
	public boolean tourFini() {
		if (this.nbact==0) {
			setnbact (3);
			return true;
		}

		return false;
	}

	/* Getters\Setters */
	public Grille getGrille() {
		return this.grille;
	}

	public void setnbact (int nbact) {
		this.nbact = nbact;
	}

}
