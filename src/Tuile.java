package ileinterdite;

import java.util.ArrayList;

public class Tuile {

	private ArrayList<Aventurier> joueursSurCase;
	private EtatTuile etatTuile;
	private int posX;
	private int posY;
        private String nom;
    
    public Tuile(String nom, int posX, int posY){
        this.nom = nom;
        this.posX = posX;
        this.posY = posY;
        joueursSurCase = new ArrayList();
        etatTuile = EtatTuile.Sèche;
    }

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


        
	public void addJoueurCase(Aventurier j) {
		joueursSurCase.add(j);
	}



}