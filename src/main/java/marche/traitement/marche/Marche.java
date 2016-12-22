package marche.traitement.marche;

import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe abstraite marche
 * @author Nicolas Guigou
 */
public abstract class Marche {


    /**
     * Donnée membre permettant d'identifier un marché
      */
    private String nomMarche;

    /**
     * Catalogue peremttant de répertorier les offre
     */
    private Collection<Offre> catalogue;

    /**
     * Constructeur
     */
    public void Marche(String nom){
        this.nomMarche = nom;
        this.catalogue = null;
    }

    /**
     * Méthode permettant d'ajouter une offre au catalogue
     * @param offre
     */
    public void ajouterOffre(Offre offre){
        catalogue.add(offre);
    }
}
