package marche.traitement.participant;


import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe fermier (étand la classe Acteur)
 * @author Romain COLONNA D'ISTRIA
 */
public abstract class Fermier extends Acteur {

    /**
     * Liste des unités de productions possédé par le fermier
     */
    private Collection<UniteDeProduction> uniteDeProductions;

    private String nom, prenom;

    /**
     * Constructeur du fermier avec caractéristiques
     * @param inventaire Liste de produis fermier à attribuer au fermier lors de sa création
     * @param uniteDeProductions Liste des unités de production attribuées au fermier lors de sa création
     * @param solde Solde à attribuer au fermier lors de sa création
     */
    protected Fermier (ArrayList<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, float solde) {
        this.inventaire = inventaire;
        this.uniteDeProductions = uniteDeProductions;
        this.solde = solde;
    }

    /**
     * Dénomination complète du Fermier
     *
     * @return Le prénom et le nom du fermier.
     */
    public String getDenomination() {
        return prenom + " " + nom;
    }

}
