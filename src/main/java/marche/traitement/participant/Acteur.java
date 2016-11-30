package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;

/**
 * Interface générale désignant les acteurs
 */

public abstract class Acteur {

    protected double solde;

    /**
     * Empêchement d'instancier un acteur
     */
    protected Acteur() { }

    /**
     * Getter du solde de l'acteur courant
     * @return Solde de l'acteur
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Fonction d'ajout du solde de l'acteur courant. Utile lors du crédit après une vente d'une offre
     * @param montant Montant à ajouter au solde de l'acteur
     */
    public void ajouterSolde(double montant) {
        solde += montant;
    }

    /**
     * Fonction pour enlever du solde de l'acteur courant. Utile lors du débit après une vente d'une offre
     * @param montant Montant à retirer au solde de l'acteur
     */

    public void enleverSolde(double montant) throws SoldeNonDisponibleException {
        if (solde >= montant)
            solde -= montant;
        else
            throw new SoldeNonDisponibleException();
    }
}
