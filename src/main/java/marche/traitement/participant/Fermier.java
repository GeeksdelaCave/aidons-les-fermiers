package marche.traitement.participant;


import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

public class Fermier extends Acteur{

    /**
     * Liste des unités de productions possédé par le fermier
     */
    private Collection<UniteDeProduction> uniteDeProductions;

    /**
     * Constructeur par défault de la classe
     */
    public Fermier () {
        inventaire = new ArrayList<ProduitFermier>();
        uniteDeProductions = new ArrayList<UniteDeProduction>();
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
}
