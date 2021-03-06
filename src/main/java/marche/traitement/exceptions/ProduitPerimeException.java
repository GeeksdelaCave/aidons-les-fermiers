package marche.traitement.exceptions;

/**
 * Exception soulevée lorsqu'un produit est périmé
 *
 * @author Tristan DIETZ
 * @version 1.1
 */
public class ProduitPerimeException extends RuntimeException {

    /**
     * Texte d'erreur de dépassement de la date de péremption.
     * @return Le texte d'erreur
     */
    @Override
    public String toString() {
        return "Erreur : le produit est périmé.";
    }

    /**
     * Affichage du texte d'erreur de toString() dans la sortie standard.
     * @see ProduitPerimeException#toString()
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
