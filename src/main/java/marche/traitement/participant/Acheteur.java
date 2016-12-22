package marche.traitement.participant;

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
    public void proposerOffreAchat( int quantite, ProduitFermier produit){
        //TODO implémenter la méthode
    }
}
