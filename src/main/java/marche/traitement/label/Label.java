package marche.traitement.label;

/**
 * Creation de la classe abstraite Label représentant une idée de qu'on peut être représenté un label
 * @version 1.0
 */
public abstract class Label {
    /**
     * Identifiant d'un label. Il n'est pas modifiable.
     * @see Label#getIdLabel()
     */
    private int idLabel;

    /**
     *
     * @see Label#Label()
     */
    private static int idLabelGeneral = 1;

    /** Constructeur de la classe abstraite Label
     *
     */
    public Label() {
        this.idLabel = idLabelGeneral;
        ++idLabelGeneral;

    }

    /** Retourne l'identifiant d'un label
     *
     * @return l'identifiant d'un label
     */
    public int getIdLabel() {
        return idLabel;
    }

}
