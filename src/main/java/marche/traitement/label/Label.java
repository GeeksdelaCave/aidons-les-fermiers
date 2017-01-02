package marche.traitement.label;

/**
 * Creation de la classe abstraite Label représentant une idée de qu'on peut être représenté un label
 * @version 1.1
 */
public abstract class Label {
    /**
     * Identifiant d'un label. Il n'est pas modifiable.
     * @see Label#getIdLabel()
     */
    private int idLabel;

    /**
     * Identifiant statique qui va permettre d'initialiser en interne la donnée membre idLabel. S'incrémente pour différencier les labels entre eux
     * @see Label#Label()
     */
    private static int idLabelGeneral = 1;

    /** Constructeur de la classe abstraite Label
     *
     */
    protected Label() {
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
