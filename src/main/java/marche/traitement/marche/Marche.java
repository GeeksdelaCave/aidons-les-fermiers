package marche.traitement.marche;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe abstraite marche
 *
 * @author Nicolas Guigou
 * @author Tristan DIETZ
 *
 * @see Offre
 * @version 1.2
 */
public abstract class Marche {


    /**
     * Donnée membre permettant d'identifier un marché
      */
    protected String nomMarche;

    /**
     * Catalogue peremttant de répertorier les offre
     */
    protected ArrayList<Offre> catalogue;

    /**
     * Constructeur
     */
    protected Marche(String nom){
        this.nomMarche = nom;
        this.catalogue = new ArrayList<Offre>();
    }

    /**
     * Méthode permettant d'ajouter une offre au catalogue
     * @param offre
     */
    public void ajouterOffre(Offre offre) {
        catalogue.add(offre);
    }

    /**
     * Permet de retirer une offre du catalogue
     * @param offre
     */
    public void enleverOffre(Offre offre){
        catalogue.remove(offre);
    }

    /**
     * Permet de récupérer le catalogue contenant les offres
     * @return catalogue
     */
    public ArrayList<Offre> getCatalogue(){return this.catalogue;}
}