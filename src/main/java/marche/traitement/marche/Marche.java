package marche.traitement.marche;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe abstraite marche
 * @author Nicolas Guigou
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

    /**
     * Permet de retirer une offre du catalogue
     * @param offre
     */
    public void enleverOffre(Offre offre){catalogue.remove(offre);}

    /**
     * Permet de récupérer le catalogue contenant les offres
     * @return catalogue
     */
    public ArrayList<Offre> getCatalogue(){return this.catalogue;}

    /**
     *  Permet de récupèrer un array de String contenant les offres au format String
     * @return listeOffre
     */
    public ArrayList<String> afficherCatalogue()
    {
        ArrayList<String> listeOffre = new ArrayList<String>();
        for(Offre offre : getCatalogue()){
            listeOffre.add(offre.toString() + '\n' + '\n');
        }
        return listeOffre;
    }
}

//
// On a un pb : le nom/prenom ne s'applique pas pour tous les acteurs (ex : centrale d'achat, grossiste...
// Go fb stp ;)
//