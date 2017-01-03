package marche.traitement.participant;

/**
 * Classe des Grossistes
 *
 * @author Tristan DIETZ
 *
 * @version 1.1
 */
public class Grossiste extends Acteur {

    /**
     * Nom du grossiste
     *
     * @see Grossiste#getDenomination()
     */
    private String nomGrossiste;

    public Grossiste() {
        super();
    }

    /**
     * Retourne la dénomination complète du grossiste
     *
     * @return Nom du grossiste
     */
    public String getDenomination() {
        return nomGrossiste;
    }
}
