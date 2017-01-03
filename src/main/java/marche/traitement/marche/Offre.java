package marche.traitement.marche;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import marche.traitement.participant.Acheteur;

import marche.traitement.participant.Vendeur;

import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe Offre

 * @author Nicolas Guigou
 * @author Tristan DIETZ
 *
 * @version 1.2
 *
 * @see Vendeur
 * @see Acheteur
 * @see ProduitFermier

 */
public class Offre {

    /**
     *  Le prix de l'offre.
     *
     *  @see Offre#getPrix()
     */
    private double prix;

    /**
     * Vendeur qui propose l'offre.
     *
     * @see Vendeur
     */
    private Vendeur vendeur;

    /**
     * Produits concernés par l'offre.
     * Liste des produits qui composent l'offre.
     *
     * @see ProduitFermier
     * @see Offre#getProduits()
     */
    private ArrayList<ProduitFermier> produits;

    /**
     * Liste regroupant tous les acheteurs potentiels
     *
     * @see Acheteur
     */
    private ArrayList<Acheteur> acheteursPotentiels;

    /**
     * Attribut général des offres.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les offres de manière unique.
     *
     * @see Offre#Offre(double, ArrayList,Vendeur)
     * @see Offre#IDOffre
     */
    private static int IDOffreGeneral = 1;

    /**
     * Identifiant de l'offre.
     * Cette valeur est définie à la création de l'offre en fonction de la valeur d'IDOffreGeneral, permettant d'obtenir
     * un identifiant unique.
     *
     * @see Offre#getIDOffre()
     * @see Offre#Offre(double, ArrayList,Vendeur)
     * @see Offre#IDOffreGeneral
     */
    private int IDOffre;

    /**
     * Constructeur de la classe Offre.
     * @param prix Le prix demande par le vendeur au moment de la création de l'offre.
     * @param produits Les produits proposés à la vente par le vendeur.
     */
    public Offre( double prix, ArrayList<ProduitFermier> produits, Vendeur vendeur) {
        this.prix = prix;
        this.produits = produits;
        this.vendeur = vendeur;
        this.IDOffre = this.IDOffreGeneral;
        ++this.IDOffreGeneral;
    }

    /**
     * Méthode permettant de récupérer l'id de l'offre
     *
     * @return int IDOffre
     *
     * @see Offre#IDOffre
     */
    public int getIDOffre(){
        return this.IDOffre;
    }

    /**
     * Valide l'offre et effectue les transferts de biens et d'argent.
     *
     * @param acheteur Acheteur faisant partie de la liste des acheteurs potentiels dont l'offre d'achat est acceptée.
     *
     * @throws SoldeNonDisponibleException Si le solde n'est pas disponible sur le compte de l'acheteur pour cette offre.
     *
     * @see Vendeur
     * @see Acheteur
     * @see Offre#acheteursPotentiels
     * @see Offre#vendeur
     * @see Offre#produits
     * @see Offre#prix
     * @see Controleur#transfererBiens(Acheteur, Vendeur, Offre,Marche)
     * @see Controleur#crediterSomme(Acheteur, Vendeur, Offre)
     * @see SoldeNonDisponibleException
     */
    public void acheter(Acheteur acheteur, Marche marche) throws SoldeNonDisponibleException {
        Controleur.transfererBiens(acheteur,this.vendeur,this,marche);
        Controleur.crediterSomme(acheteur,this.vendeur,this);
    }

    /**
     * Permet de retourner la collection de produits
     * @return Les produits à vendre dans l'offre
     *
     * @see Offre#produits
     */
    public ArrayList<ProduitFermier> getProduits(){
        return this.produits;
    }

    /**
     * Reourne le prix d'une offre
     *
     * @return double prix
     *
     * @see Offre#prix
     */
    public double getPrix(){
        return this.prix;
    }

    /**
     * Permet d'ajouter un acheteur potentiel à l'offre
     *
     * @param acheteur L'acheteur qui achète les produits de cette offre.
     *
     * @see Acheteur
     * @see Offre#acheteursPotentiels
     */
    public void ajouterAcheteur(Acheteur acheteur){
        this.acheteursPotentiels.add(acheteur);
    }

    /**
     * Permet de récupérer les acheteurs potentiels d'une offre
     *
     * @return La liste des acheteurs potentiels
     *
     * @see Acheteur
     * @see Offre#acheteursPotentiels
     */
    public ArrayList<Acheteur> getAcheteursPotentiels(){
        return this.acheteursPotentiels;
    }

    /**
     * Permet de récupérer le prix d'une offre
     * @return Vendeur
     */
    public Vendeur getVendeur(){return this.vendeur;}

    /**
     * Permet de modifier le prix d'une offre
     * @param prix
     */
    public void setPrix(double prix){this.prix = prix;}

}
