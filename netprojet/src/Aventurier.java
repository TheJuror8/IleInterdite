
import java.util.ArrayList;

public abstract class Aventurier {

	private Tuile casePosition;

	/**
	 * Nathan Bolosse Lel
	 * @param grille
	 */
	public ArrayList<Tuile> getCasesPossibles(Grille grille) {
		// retourne les cases adjacentes à la position de l'aventurier, sans la position de l'aventurier elle meme
                ArrayList<Tuile> casesPossibles = new ArrayList<>;
                
	}
        
	public ArrayList<Tuile> getCasesPossibleAssechement(Grille grille) {
		// TODO - implement Aventurier.getCasesPossibleAssechement
		throw new UnsupportedOperationException();
	}

	public Tuile getPosition() {
		// TODO - implement Aventurier.getPosition
		throw new UnsupportedOperationException();
	}

        public Tuile getCasePosition() {
            return casePosition;
        }

        public void setCasePosition(Tuile casePosition) {
            this.casePosition = casePosition;
        }

        
}