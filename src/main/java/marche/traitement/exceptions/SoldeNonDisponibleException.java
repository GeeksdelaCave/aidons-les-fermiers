package marche.traitement.exceptions;

/**
 * Exception soulevée lorsque le solde de l'acteur ne permet pas d'être débité du montant indique
 *
 * @author Tristan DIETZ
 * @version 1.1
 *
 * @see marche.traitement.participant.Acteur#enleverSolde(double)
 */
public class SoldeNonDisponibleException extends Exception {

    /**
     * Texte d'erreur de dépassement du montant sur le solde de l'acteur.
     * @return Le texte d'erreur
     */
    @Override
    public String toString() {
        return "Erreur : le montant n'est pas disponible sur le compte de cet acteur.";
    }

    /**
     * Affichage du texte d'erreur de toString() dans la sortie standard.
     * @see SoldeNonDisponibleException#toString()
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
