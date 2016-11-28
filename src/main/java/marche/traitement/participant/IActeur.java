package marche.traitement.participant;

/**
 * Interface générale désignant les acteurs
 */

public interface IActeur {

    /**
     * Getter du solde de l'acteur courant
     * @return Solde de l'acteur
     */
    double getSolde();

    /**
     * Fonction d'ajout du solde de l'acteur courant. Utile lors du crédit après une vente d'une offre
     * @param montant
     */
    void ajouterSolde(double montant);
}
