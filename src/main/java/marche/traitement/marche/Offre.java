package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Fermier;
import marche.traitement.participant.Vendeur;
import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe Offre
 * @author Nicolas Guigou
 *
 */
public class Offre {

    /**
     *  Le prix de l'offre
     */
    private double prix;

    /**
     * Vendeur qui propose l'offre
     */
    private Vendeur vendeur;

    /**
     * Produits concernés par l'offre
     */
    private Collection<ProduitFermier> produits;

    /**
     * Liste regroupant tous les acheteurs potentiels
     */
    private Collection<Acheteur> acheteursPotentiels;
    /**
     * Attribut peremettant d'identifier une offre
     */
    private static int IDOffre = 1;

    /**
     * Constructeur de la classe
     */
    public Offre( double prix, Collection<ProduitFermier> produits){

        this.prix = prix;
        this.produits = produits;
        ++this.IDOffre;
    }

    /**
     * Méthode permettant de récupérer l'id de l'offre
     * @return int IDOffre
     */
    public int getIDOffre(){
        return this.IDOffre;
    }

    /**
     * Méthode acheter
     */
    public void acheter(Acheteur acheteur) throws SoldeNonDisponibleException {
        Controleur.transfererBiens(acheteur,this.vendeur,this);
        Controleur.crediterSomme(acheteur,this.vendeur,this);
    }

    /**
     * Peremet de retourner la collection de produit
     * @return Collection<ProduitFermier> ProduitFermier produits
     */
    public Collection<ProduitFermier> getProduits(){
        return this.produits;
    }

    /**
     * Reourne le prix d'une offre
     * @return double prix
     */
    public double getPrix(){
        return this.prix;
    }

    /**
     * Permet d'ajouter un acheteur potentiel à l'offre
     * @param acheteur
     */
    public void ajouterAcheteur(Acheteur acheteur){
        this.acheteursPotentiels.add(acheteur);
    }

}
