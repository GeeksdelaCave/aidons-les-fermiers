package marche.traitement.participant;

import marche.traitement.marche.Offre;

/**
 * Classe Acheteur
 *
 * Un acheteur est un décorateur d'Acteur, qui permet d'implémenter la méthode proposerOffreAchat(...).
 *
 * @author Nicolas Guigou
 *
 * @version 1.1
 *
 * @see Acteur
 * @see Acheteur#proposerOffreAchat(Offre)
 */
public class Acheteur extends Decorateur {

    /**
     * Constructeur d'un acheteur.
     * @param acteur L'acteur qui va pouvoir proposer une offre d'achat.
     *
     * @see Acteur
     */
    public Acheteur(Acteur acteur){
        super(acteur);
    }

    /**
     * Permet de proposer une offre d'achat.
     * @param offre L'offre à acheter
     *
     * @see Offre
     */
    public void proposerOffreAchat(Offre offre){
        offre.ajouterAcheteur(this);
    }
}
