package marche.traitement.participant;

import marche.traitement.production.UniteDeProduction;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe relative à un fermier gérant la culture de jardins
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @version 1.0
 */
public class Horticulteur extends Fermier {

    /**
     * Constructeur par défaut de Horticulteur
     */
    public Horticulteur(){
        super();
    }

    /** Constructeur principal de Horticulteur
     *
     * @param inventaire liste des produits fermiers à attribuer au fermier lors de sa création
     * @param uniteDeProductions unités de productions dont dispose un fermier à sa création
     * @param solde Gain dont dispose un fermier lors de sa création
     */
    public Horticulteur(ArrayList<ProduitFermier> inventaire, Collection<UniteDeProduction> uniteDeProductions, float solde){
        super(inventaire,uniteDeProductions,solde);
    }
}
