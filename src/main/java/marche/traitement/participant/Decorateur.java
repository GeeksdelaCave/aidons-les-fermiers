package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;

/**
 * Classe Decorateur
 * @author Nicolas Guigou
 */
public class Decorateur extends Acteur {
    /**
     * Donnée membre acteur
     */
    private Acteur acteur;

    public Decorateur(Acteur acteur){
        super();
        this.acteur = acteur;
    }

    /**
     * Permet de récupérer le solde de l'acteur
     * @return
     */
    public double getSolde(){
        return acteur.getSolde();
    }

    /**
     * Permet de récupérer l'inventaire d'un acteur
     */
    public ArrayList<ProduitFermier> getInventaire(){
        return acteur.getInventaire();
    }

    /**
     * Permet d'ajouter un montant au solde d'un acteur
     * @param montant Montant à ajouter au solde de l'acteur.
     *
     */
    public void ajouterSolde(double montant) {
        acteur.ajouterSolde(montant);
    }

    /**
     * Permet d'enlever un montant au solde de l'acteur
     * @param montant Montant à retirer au solde de l'acteur.
     *
     * @throws SoldeNonDisponibleException
     */
    public void enleverSolde(double montant) throws SoldeNonDisponibleException {
        acteur.enleverSolde(montant);
    }
}
