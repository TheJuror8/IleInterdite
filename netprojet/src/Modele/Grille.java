package Modele;

import java.util.*;

public class Grille {

	private Tuile[][] map_tuiles;

	public Grille() {
		this.map_tuiles = new Tuile[6][6];
		initialiser_grille();
	}

	/* Renvoie les cases adjacentes à la tuile passée en paramètre
	 => indifféremment de l'état des tuiles*/
	public ArrayList<Tuile> getCasesAdjacentes(Tuile tuile_pos) {
		/* Array utile pour donner les coordonnées des cases adjacentes
		à tuile_pos */
		int[][] filtre_adj = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

		/* On calcule les cases adjacentes à la case tuile_pos */
		ArrayList<Tuile> listeTuiles = calculCases(filtre_adj, tuile_pos.getPosition());

		return listeTuiles;
	}

	/* Renvoie les cases situées en diagonal par rapport à la tuile passée en paramètre
	 => indifféremment de l'état des tuiles*/
	public ArrayList<Tuile> getCasesDiagonales(Tuile tuile_pos) {
		/* Array utile pour donner les coordonnées des cases situées en diagonale
		par rapport à tuile_pos */
		int[][] filtre_adj = {{1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

		/* On calcule les cases adjacentes à la case tuile_pos */
		ArrayList<Tuile> listeTuiles = calculCases(filtre_adj, tuile_pos.getPosition());

		return listeTuiles;
	}

	/* Renvoie les cases correspondant au filtre donné par rapport à la position pos */
	private ArrayList<Tuile> calculCases(int[][] filtre, int[] pos) {

		/* On crée une ArrayList de tuiles vide */
		ArrayList<Tuile> listeTuiles = new ArrayList<>();

		/* On ajoute les cases si elles ne sont pas "null" */
		Tuile adj_case;

		for (int[] i : filtre) {
			adj_case = getTuile (pos[0]+i[0], pos[1]+i[1]);

			if (adj_case != null)
				listeTuiles.add(adj_case);
		}

		return listeTuiles;
	}

	/* Attribue à chaque tuile une carte tuile piochée au hasard
	et place la tuile créée dans map_tuiles
	=> Les positions correspondant à des tuiles vides seront donc à null */
	private void initialiser_grille() {
		for(int i=0; i<getmap().length; i++) {
			for(int j=0; j<getmap()[i].length; j++) {
				// A FAIRE => attribution aléatoire des noms de tuile
				// RMQ => Ici i correspond à y et j à x

				/* Si la position donnée par le parcours du tableau
				ne tombe pas dans les zones "vides" de la grille on crée une tuile */
				if (!( ( ((j==1)||(j==4)) && ((i==0)||(i==5)) )
						|| ( ((j==0)||(j==5)) && ((i<2)||(i>3)) ) )) {
					getmap()[i][j] = new Tuile ("Tuile"+j+"|"+i, j, i);
				}
			}
		}
	}

	/* Getters\Setters */
	private Tuile[][] getmap() {
		return this.map_tuiles;
	}

	/* Renvoie la tuile correspondant aux coordonnées passées en paramètres
	=> null si on sort de la taille de map_tuiles*/
	private Tuile getTuile (int x, int y) {
		return ((x<=5 && x>=0)&&(y<=5 && y>=0)) ? getmap()[y][x] : null;
	}

}
