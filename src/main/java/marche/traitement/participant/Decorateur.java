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

    /**
     * Permet d'ajouter un produit à l'inventaire de l'acteur
     * @param produit Produit à ajouter a l'inventaire du fermier.
     *
     */
    public void ajoutProduit(ProduitFermier produit){
        acteur.ajoutProduit(produit);
    }

    /**
     * Permet d'enlever un produit de l'inventaire de l'acteur
     * @param produit Produit à enlever de l'inventaire de l'acteur
     */
    public void enleverProduit(ProduitFermier produit){
        acteur.enleverProduit(produit);
    }

    /**
     * Permet de récupérer le nom de l'acteur
     * @return nomActeur
     */
    public String getNomActeur(){
       return acteur.getNomActeur();
    }

    /**
     * Permet de récupérer le prenom de l'acteur
     * @return prenomActeur
     */
    public String getPrenomActeur(){
        return acteur.getPrenomActeur();
    }
}
