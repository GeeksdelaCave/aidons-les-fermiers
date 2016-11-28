package marche.traitement.participant;


public class Fermier extends Acteur{

    /**
     * Liste des produits fermiers possédé par le fermier
     */
    //TODO ajouter donnée membre inventaire

    /**
     * Argent possédé par le fermier
     */
    private double solde;

    /**
     * Liste des unités de productions possédé par le fermier
     */
    //TODO ajouter donnée membre unitesDeProduction

    /**
     * Constructeur par défault de la classe
     */
    public Fermier () {
        //TODO compléter constructeur par défault
        solde = 0;
    }

    /**
     * Constructeur de la classe
     */
    public Fermier (double solde) {
        //TODO compléter constructeur
        this.solde = solde;
    }
}
