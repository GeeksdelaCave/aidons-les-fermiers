package marche.traitement.marche;

/**
 * Singleton Controleur représentant le système
 */
public class Controleur {
    private static Controleur ourInstance = new Controleur();

    public static Controleur getInstance() {
        return ourInstance;
    }

    private Controleur() {
    }
}
