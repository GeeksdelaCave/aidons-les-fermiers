package marche.traitement.marche;

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
    protected Collection<Offre> catalogue;

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
}

//
// On a un pb : le nom/prenom ne s'applique pas pour tous les acteurs (ex : centrale d'achat, grossiste...
// Go fb stp ;)
//