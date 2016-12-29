package marche.traitement.participant;

import marche.traitement.marche.Offre;
import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe Vendeur
 * @author Nicolas Guigou
 */
public class Vendeur extends Decorateur{

    /**
     * Constructeur
     * @param acteur
     */
    public Vendeur(Acteur acteur){
        super(acteur);
    }

    /**
     * Méthode permettant de proposer une offre
     * @param quantite
     * @param produit
     * @param prix
     */
    public void proposerOffreVente( int quantite, ProduitFermier produit, int prix){
        ArrayList<ProduitFermier> temp = new ArrayList<>();

        for(int i = 0; i < quantite; ++i){
            temp.add(produit);
        }

        Offre offre = new Offre(prix,temp);

        //TODO terminer la méthode
    }
}
