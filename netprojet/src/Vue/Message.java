package Vue;

import java.util.Collection;

/**
 *
 * @author habib
 */
public class Message {

    /* Enuméré pour qualifier le type de message envoyé entre la vue et le contrôleur */
    public static enum TypeMessage {
        LISTE_CASES, // on envoie la liste des cases possibles de déplacement à l'IHM
        LISTE_ASSECHER, // on envoie la liste des cases que le joueur peut assécher à l'IHM
        DEPLACER,  // le joueur clique sur le bouton Aller
        ASSECHER,  // le joueur clique sur le bouton Assécher
        FINTOUR,   // le joueur clique sur le bouton de fin de tour
        ACTION_SPECIALE // message pour les actions spéciales
    }

    private TypeMessage type;
    private Collection liste_cases;

    public Message (TypeMessage type) {
        this.type = type;
    }

    public Message (TypeMessage type, Collection liste_cases) {
        this(type);
        this.liste_cases = liste_cases;
    }
}
