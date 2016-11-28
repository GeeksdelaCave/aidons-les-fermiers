package marche.traitement.participant;


public class Fermier {

    /**
     * Liste des produits fermiers possédé par le fermier
     */
    //TODO ajouter donnée membre inventaire

    /**
     * Argent possédé par le fermier
     */
    private double solde;


    //TODO ajouter donnée membre unitesDeProduction

    //TODO compléter constructeur par défault
    public Fermier () {
        solde = 0;
    }

    //TODO compléter constructeur
    public Fermier (double solde) {
        this.solde = solde;
    }
}
