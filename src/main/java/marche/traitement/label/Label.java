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

    /** Constructeur de la classe abstraite Label
     *
     * @param idLabel désigne l'identifiant d'un label. Il n'est pas modifiable.
     *
     */
    public Label(int idLabel) {
        this.idLabel = idLabel;

    }

    /** Retourne l'identifiant d'un label
     *
     * @return l'identifiant d'un label
     */
    public int getIdLabel() {
        return idLabel;
    }

}
