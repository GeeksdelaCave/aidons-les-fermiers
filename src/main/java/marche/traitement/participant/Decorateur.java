package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;

/**
 * Classe Decorateur
 *
 * @author Nicolas GUIGOU
 * @author Tristan DIETZ
 *
 * @version 1.2
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
     * Définit la dénomination complète d'un Acteur.
     *
     * @return La dénomination de l'acteur.
     */
    public String getDenomination() {
        return acteur.getDenomination();
    }


    /** Setteur de modification du Nom et prenom
     *
     * @param nom Nom de l'acteur
     * @param prenom Prenom de l'acteur
     */
    public void setDenomination(String nom, String prenom) {
        acteur.setDenomination(nom, prenom);
    }
}