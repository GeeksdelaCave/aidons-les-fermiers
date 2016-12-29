package marche.traitement.participant;

import marche.traitement.marche.Offre;
import marche.traitement.produits.ProduitFermier;

/**
 * Classe Acheteur
 * @author Nicolas Guigou
 */
public class Acheteur extends Decorateur {

    /**
     * Constructeur
     * @param acteur
     */
    public Acheteur(Acteur acteur){
        super(acteur);
    }

    /**
     * Permet de proposer une offre d'achat
     * @param offre
     */
    public void proposerOffreAchat( Offre offre){
        offre.ajouterAcheteur(this);
    }
}
