package marche.traitement.exceptions;

public class InventairePleinException extends RuntimeException {
    @Override
    public String toString() {
        return "Erreur : l'inventaire de cette unité de production est plein.";
    }

    @Override
    public void printStackTrace() {
        System.out.println(toString());
    }
}
