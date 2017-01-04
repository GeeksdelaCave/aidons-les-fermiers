package marche.affichage;

/**
 * Création de l'interface observateur correspondant aux différentes fenêtres susceptibles d'être mis à jour.
 * @author Thibaud CENENT
 * @version 1.0
 */
public interface Observateur {

    /**
     *
     * @param observable désignant la fenêtre qui va prévenir d'un changement à la fenêtre modifiable.
     */
    public void actualiserFenetre(Observable observable);
}
