package marche.traitement.participant;


public class Fermier extends Acteur{

    /**
     * Liste des produits fermiers possédé par le fermier
     */
    //TODO ajouter donnée membre inventaire

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
     * Constructeur du fermier avec caractéristiques
     * @param solde Solde à attribuer au fermier lors de sa création
     */
    public Fermier (float solde) {
        //TODO compléter constructeur
        this.solde = solde;
    }

    //TODO Ajouter méthode d'ajout de produit dans l'inventaire
}
