package marche.traitement.marche;

import marche.traitement.produits.ProduitFermier;

import java.util.Collection;

/**
 * Classe abstraite marche
 */
public abstract class Marche {

    /**
     * Donnée membre offre qui permettra de récupérer une offre proposée
     */
    //TODO ajouter une donnée membre Offre offre
    /**
     * Donnée membre permettant d'identifier un marché
      */
    private String nomMarche;

    /**
     * Catalogue peremttant de répertorier les offres
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
