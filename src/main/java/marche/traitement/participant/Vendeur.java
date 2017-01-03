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
     * @param NomProduit
     * @param prix
     */
    public void proposerOffreVente( int quantite, String NomProduit, int prix, Marche marche){
        ArrayList<ProduitFermier> temp = new ArrayList<ProduitFermier>();
        int cpt = 0;
        for(ProduitFermier p : this.getInventaire()){
            if(cpt == quantite) break;
            if(p.getClass().getCanonicalName() == NomProduit) {
                temp.add(p);
                ++cpt;
            }
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
