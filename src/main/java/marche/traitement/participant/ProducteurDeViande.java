package marche.traitement.participant;

import marche.traitement.cotisation.Cotisation;
import marche.traitement.cotisation.Visitable;
import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe relative à un fermier gérant la production de viande bovine ou cochon
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @version 1.1
 */
public class ProducteurDeViande extends Fermier implements Visitable {

    /** Constructeur principal de ProducteurDeViande
     *
     * @param inventaire liste des produits fermiers à attribuer au fermier lors de sa création
     * @param uniteDeProductions unités de productions dont dispose un fermier à sa création
     * @param solde Gain dont dispose un fermier lors de sa création
     */
    public ProducteurDeViande(ArrayList<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, double solde){
        super(inventaire,uniteDeProductions,solde);
    }

    /**
     *
     * @param cotisation désigne la cotisation que va devoir payer un fermier en fonction de ses caractéristiques.
     * @return le nouveau solde du producteur de viande après la cotisation.
     */
    public void payerCotisation(Cotisation cotisation) {
        try {
            enleverSolde(cotisation.calculMontantCotisation(this));
        } catch (SoldeNonDisponibleException e) {
            e.printStackTrace();
        }
    }
}
