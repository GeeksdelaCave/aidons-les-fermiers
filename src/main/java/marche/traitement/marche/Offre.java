package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe Offre
 */
public class Offre {

    /**
     *  Le prix de l'offre
     */
    private double prix;

    /**
     * Produits concernés par l'offre
     */
    private Collection<ProduitFermier> produits;

    /**
     * Constructeur de la classe
     */
    public Offre( double prix, Collection<ProduitFermier> produits ){
        this.prix = prix;
        this.produits = produits;
    }

    /**
     * Méthode valider
     */
    public boolean valider(){


        return true;// TODO modifer le return en fonction du corps
    }

    /**
     * Méthode acheter
     */
    public void acheter(Acheteur acheteur){

        //TODO implémenter la méthdoe

    }

    /**
     * Permet de retourner la collection de produit
     * @return la collection des produits fermiers
     */
    public Collection<ProduitFermier> getProduits(){
        return this.produits;
    }

    public double getPrix(){
        return this.prix;
    }


}
