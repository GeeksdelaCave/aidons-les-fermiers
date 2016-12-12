package marche.traitement.exceptions;

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
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
