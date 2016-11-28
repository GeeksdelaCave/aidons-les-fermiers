package marche.traitement.participant;

/**
 * Interface générale désignant les acteurs
 */

public abstract class Acteur {

    /**
     * Empêchement d'instancier un acteur
     */
    protected Acteur() { }

    /**
     * Getter du solde de l'acteur courant
     * @return Solde de l'acteur
     */
    abstract double getSolde();

    /**
     * Fonction d'ajout du solde de l'acteur courant. Utile lors du crédit après une vente d'une offre
     * @param montant
     */
    abstract void ajouterSolde(double montant);
}
