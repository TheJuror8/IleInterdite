package Vue;

import java.util.Collection;

/**
 *
 * @author habib
 */
public class Message {

    /* Enuméré pour qualifier le type de message envoyé entre la vue et le contrôleur */
    public static enum TypeMessage {
        OPT_CASES, // on envoie la liste des options de déplacement à l'IHM
        OPT_ASSECHER, // on envoie la liste des cases que le joueur peut assécher à l'IHM
        DEPLACER,  // le joueur a choisi une case vers laquelle se déplacer et a validé => msg contient la case destination
        ASSECHER,  // le joueur a choisi une case à assécher et a validé => msg contient la case à assécher
        FINTOUR,   // le joueur a cliqué sur le bouton de fin de tour
        ACTION_SPECIALE // message pour les actions spéciales => A FAIRE
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
