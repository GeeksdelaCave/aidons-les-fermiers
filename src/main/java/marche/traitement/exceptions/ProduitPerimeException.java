package marche.traitement.exceptions;

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
     */
    @Override
    public void printStackTrace() {
        System.out.println(this.toString());
    }
}
