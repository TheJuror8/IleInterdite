package Modele;

public enum EtatTuile {
    ASSECHEE("Asséchée"), 
    INONDEE("Inondée"),
    COULEE("Coulée");

    String libelle ;

    EtatTuile(String libelle) {
        this.libelle = libelle ;
    }

    @Override
    public String toString() {
        return this.libelle;
    }
}