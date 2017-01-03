package marche.traitement.participant;

import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe relative à un fermier gérant la production des fruits.
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @version 1.0
 */
public class Arboriculteur extends Fermier {

    /**
     * Constructeur par défaut de Arboriculteur
     */
    public Arboriculteur()
    {
        super();
    }

    /** Constructeur principal de Arboriculteur
     *
     * @param inventaire liste des produits fermiers à attribuer au fermier lors de sa création
     * @param uniteDeProductions unités de productions dont dispose un fermier à sa création
     * @param solde Gain dont dispose un fermier lors de sa création
     */
    public Arboriculteur(ArrayList<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, float solde){
        super(inventaire,uniteDeProductions,solde);
    }
}
