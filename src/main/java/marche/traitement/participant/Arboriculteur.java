package marche.traitement.participant;

import marche.affichage.ExceptionsPopups;
import marche.traitement.cotisation.Cotisation;
import marche.traitement.cotisation.Visitable;
import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe relative à un fermier gérant la production des fruits.
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.1
 */
public class Arboriculteur extends Fermier implements Visitable {

    /** Constructeur principal de Arboriculteur
     *
     * @param inventaire liste des produits fermiers à attribuer au fermier lors de sa création
     * @param uniteDeProductions unités de productions dont dispose un fermier à sa création
     * @param solde Gain dont dispose un fermier lors de sa création
     */
    public Arboriculteur(ArrayList<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, double solde){
        super(inventaire,uniteDeProductions,solde);
    }

    /**
     * Cotisation à payer
     * @param cotisation Désigne la cotisation que va devoir payer un fermier en fonction de sa spécialisation.
     */
    public void payerCotisation(Cotisation cotisation) {
        try {
            enleverSolde(cotisation.calculMontantCotisation(this));
        } catch (SoldeNonDisponibleException e) {
            ExceptionsPopups.soldeNonDispoPopup();
        }
    }
}
