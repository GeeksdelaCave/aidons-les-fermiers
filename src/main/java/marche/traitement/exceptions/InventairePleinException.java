package marche.traitement.exceptions;

/**
 * Exception soulevée lorsque l'inventaire est plein.
 *
 * @author Tristan DIETZ
 * @version 1.1
 */
public class InventairePleinException extends RuntimeException {

    /**
     * Texte d'erreur de dépassement de l'inventaire de l'UDP.
     * @return Le texte d'erreur
     */
    @Override
    public String toString() {
        return "Erreur : l'inventaire de cette unité de production est plein.";
    }

    /**
     * Affichage du texte d'erreur de toString() dans la sortie standard.
     * @see InventairePleinException#toString()
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
