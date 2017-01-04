package marche.traitement.marche;

import marche.traitement.participant.Acheteur;
import marche.traitement.participant.Acteur;

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
public class Marche {

    private Collection<Acteur> listeDesActeursDuMarche;

    private static Marche marche;

    /**
     * Catalogue peremttant de répertorier les offre
     */
    protected ArrayList<Offre> catalogue;

    /**
     * Constructeur
     */
    private Marche() {
        this.catalogue = new ArrayList<Offre>();
        this.listeDesActeursDuMarche = new ArrayList<Acteur>();
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
    public ArrayList<Offre> getCatalogue(){
        return this.catalogue;
    }

    public void ajouterActeur(Acteur acteur) {
        listeDesActeursDuMarche.add(acteur);
    }

    public Collection<Acteur> getListeDesActeursDuMarche() {
        return listeDesActeursDuMarche;
    }

    public static Marche getMarcheInstance() {
        if (marche == null)
            marche = new Marche();
        return marche;
    }
}