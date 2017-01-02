package marche.traitement.participant;

import marche.traitement.marche.Controleur;
import marche.traitement.marche.Marche;
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
    public void proposerOffreVente( int quantite, ProduitFermier produit, int prix, Marche marche){
        ArrayList<ProduitFermier> temp = new ArrayList<>();
        int cpt = 0;
        for(ProduitFermier p : this.getInventaire()){
            if(cpt == quantite) break;
            temp.add(p);
            ++cpt;
        }
        Offre offre = new Offre(prix,temp,this);

            if(Controleur.valider(offre)){
            Controleur.ajouterOffre(offre, marche);
        }
        else{
            //TODO gerer exception
        }

    }
}
