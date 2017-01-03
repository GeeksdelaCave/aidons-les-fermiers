package marche.traitement.participant;

import marche.traitement.produits.ProduitFermier;

import java.util.ArrayList;

/**
 * Classe Decorateur
 * @author Nicolas Guigou
 */
public class Decorateur extends Acteur {
    /**
     * Donnée membre acteur
     */
    private Acteur acteur;

    public Decorateur(Acteur acteur){
        super();
        this.acteur = acteur;
    }

    /**
     * Permet de récupérer le solde de l'acteur
     * @return
     */
    public double getSolde(){
        return acteur.getSolde();
    }

    /**
     * Permet de récupérer l'inventaire d'un acteur
     */
    public ArrayList<ProduitFermier> getInventaire(){
        return acteur.getInventaire();
    }
}
