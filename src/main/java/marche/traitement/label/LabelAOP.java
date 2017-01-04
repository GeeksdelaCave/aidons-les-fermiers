package marche.traitement.label;

/**
 * Création de la classe LabelAOP désignant un label qui est attribué en fonction du nom de produit attribué
 *
 * @author Thibaud CENENT
 * @version 1.1
 */
public class LabelAOP extends Label {
    /**
     * Nom du lieu d'où provient le produit fermier associé. Il n'est pas modifiable.
     * @see LabelAOP#getNomLieuCreation()
     */
    private String nomLieuCreation;

    /**
     * Constructeur de la classe LabelAOP
     *
     * @param nomLieuCreation désigne le nom du lieu d'où provient le produit fermier associé. Il n'est pas modifiable
     */
    public LabelAOP(String nomLieuCreation) {
        super();
        this.nomLieuCreation = nomLieuCreation;

    }

    /** Retourne le nom du lieu d'où provient le produit fermier associé
     *
     * @return le nom du lieu d'où provient le produit fermier associé
     */
    public String getNomLieuCreation() {
        return nomLieuCreation;
    }
}
