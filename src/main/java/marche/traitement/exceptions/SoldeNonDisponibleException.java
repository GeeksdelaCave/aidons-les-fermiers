package marche.traitement.exceptions;

public class SoldeNonDisponibleException extends Exception {
    @Override
    public String toString() {
        return "Erreur : le montant n'est pas disponible sur le compte de cet acteur.";
    }

    @Override
    public void printStackTrace() {
        System.out.println(toString());
    }
}
