package marche.traitement.participant;


import marche.traitement.produits.ProduitFermier;
import marche.traitement.produits.UniteDeProduction;
import java.util.Collection;

public class Fermier extends Acteur{

    /**
     * Liste des produits fermiers possédé par le fermier
     */
    private Collection<ProduitFermier> inventaire;

    /**
     * Liste des unités de productions possédé par le fermier
     */
    private Collection<UniteDeProduction> uniteDeProductions;

    /**
     * Constructeur par défault de la classe
     */
    public Fermier () {
        inventaire = null;
        uniteDeProductions = null;
        solde = 0;
    }

    /**
     * Constructeur du fermier avec caractéristiques
     * @param inventaire Liste de produis fermier à attribuer au fermier lors de sa création
     * @param uniteDeProductions Liste des unités de production attribuées au fermier lors de sa création
     * @param solde Solde à attribuer au fermier lors de sa création
     */
    public Fermier (Collection<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, float solde) {
        this.inventaire = inventaire;
        this.uniteDeProductions = uniteDeProductions;
        this.solde = solde;
    }

    /**
     * Méthode d'ajout de produit fermier dans l'inventaire
     * @param produit Produit à ajouter a l'inventaire du fermier
     */
    public void ajoutProduitFermier(ProduitFermier produit) {
        inventaire.add(produit);
    }
}
