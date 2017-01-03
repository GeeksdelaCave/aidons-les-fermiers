package marche.traitement.participant;

/**
 * classe Trader (étand la classe Acteur)
 * @author Romain COLONNA D'ISTRIA
 */
public class Trader extends Acteur {

    private String nom, prenom;

    public Trader() {
        super();
    }

    /**
     * Dénomination complète du Trader
     *
     * @return Le prénom et le nom du trader.
     */
    public String getDenomination() {
        return prenom + " " + nom;
    }
}
