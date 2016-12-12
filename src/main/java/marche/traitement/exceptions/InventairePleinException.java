package marche.traitement.exceptions;

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
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
