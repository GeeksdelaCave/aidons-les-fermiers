package marche.traitement.exceptions;

public class ProduitPerimeException extends RuntimeException {

    @Override
    public String toString() {
        return "Erreur : le produit est périmé.";
    }

    @Override
    public void printStackTrace() {
        System.out.println(toString());
    }
}
