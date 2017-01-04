package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;

/**
 * Interface générale désignant les acteurs
 *
 * @author Tristan DIETZ
 * @author Romain COLONNA D'ISTRIA
 *
 * @version 1.2
 */
public abstract class Acteur {

    /**
     * Argent possédé par l'acteur
     *
     * @see Acteur#ajouterSolde(double)
     * @see Acteur#enleverSolde(double)
     */
    protected double solde;

    /**
     * Liste des produits fermiers possédé par le fermier
     *
     * @see Acteur#ajoutProduit(ProduitFermier)
     * @see Acteur#getInventaire()
     *
     */
    protected ArrayList<ProduitFermier> inventaire;

    /**
     * Getter du solde de l'acteur courant
     * @return Solde de l'acteur
     *
     * @see Acteur#solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Getter de l'inventaire de l'acteur.
     * @return Inventaire de l'acteur.
     *
     * @see Acteur#inventaire
     */
    public ArrayList<ProduitFermier> getInventaire () {
        return inventaire;
    }

    /**
     * Fonction d'ajout du solde de l'acteur courant. Utile lors du crédit après une vente d'une offre.
     * @param montant Montant à ajouter au solde de l'acteur.
     *
     * @see Acteur#solde
     */
    public void ajouterSolde(double montant) {
        solde += montant;
    }

    /**
     * Fonction pour enlever du solde de l'acteur courant. Utile lors du débit après une vente d'une offre.
     * @param montant Montant à retirer au solde de l'acteur.
     *
     * @see Acteur#solde
     */
    public void enleverSolde(double montant) throws SoldeNonDisponibleException {
        if (solde >= montant)
            solde -= montant;
        else
            throw new SoldeNonDisponibleException();
    }


    /**

     * Méthode d'ajout de produit fermier dans l'inventaire.
     * @param produit Produit à ajouter a l'inventaire du fermier.
     *
     * @see Acteur#inventaire

     */
    public void ajoutProduit(ProduitFermier produit) {
        inventaire.add(produit);
    }

    /**
     * Méthode permettant d'envelever un produit de l'inventaire
     * @param produit Produit à enlever de l'inventaire de l'acteur
     */
    public void enleverProduit(ProduitFermier produit){inventaire.remove(produit);}
    /**
     * Méthode permettant de récupérer la dénomination d'un acteur, à implémenter dans les classes.
     * @return nom de l'acteur
     */
    public abstract String getDenomination();

    public abstract void setDenomination(String nom, String prenom);
}