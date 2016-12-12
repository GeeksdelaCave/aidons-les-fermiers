package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Fermier;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe Offre
 *
 */
public class Offre {

    /**
     * Fermier qui propose l'offre
     */
    private Vendeur vendeur;

    /**
     * Acheteur
     */
    private Acheteur acheteur;

    /**
     *  Le prix de l'offre
     */
    private float prix;

    /**
     * Produits concernés par l'offre
     */
    private Collection<ProduitFermier> produits;

    /**
     * Constructeur de la classe
     */
    public Offre(Vendeur vendeur , Acheteur acheteur, float prix, Collection<ProduitFermier> produits ){
        this.vendeur = vendeur;
        this.acheteur = acheteur;
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
    public void acheter(){ // prend en paramètre : Acheteur acheteur

        //TODO ajouter le corps de la fonction
    }

    /**
     * Peremt de retourner la collection de produit
     * @return Collection<ProduitFermier> ProduitFermier produits
     */
    public Collection<ProduitFermier> getProduits(){
        return this.produits;
    }


}
