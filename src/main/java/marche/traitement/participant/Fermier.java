package marche.traitement.participant;

import marche.traitement.produits.ProduitFermier;
import marche.traitement.produits.UniteDeProduction;

import java.util.ArrayList;
import java.util.Collection;

public class Fermier extends Acteur{

    /**
     * Liste des unités de productions possédé par le fermier
     */
    Collection<UniteDeProduction> unitesDeProductions;

    /**
     * Constructeur par défault de la classe
     */
    public Fermier () {
        inventaire = new ArrayList<ProduitFermier>();
        unitesDeProductions = new ArrayList<UniteDeProduction>();
        super.solde = 0;
    }

    /**
     * Constructeur du fermier avec caractéristiques
     * @param solde Solde à attribuer au fermier lors de sa création
     */
    public Fermier (Collection<ProduitFermier> inventaire, Collection<UniteDeProduction> unitesDeProductions, float solde) {
        this.inventaire = inventaire;
        this.unitesDeProductions = unitesDeProductions;
        super.solde = solde;
    }


}
