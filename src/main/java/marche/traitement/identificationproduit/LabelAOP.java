package marche.traitement.identificationproduit;

/**
 * Création de la classe LabelAOP désignant un label qui est attribué en fonction du nom de produit attribué
 * @version 1.0
 */
public class LabelAOP extends Label {
    /**
     * Nom du lieu d'où provient le produit fermier associé. Il n'est pas modifiable.
     */
    private String nomLieuCreation;

    /**
     * Constructeur de la classe LabelAOP
     *
     * @param idLabel désigne l'identifiant d'un label. Il n'est pas modifiable.
     * @param nomLieuCreation désigne le nom du lieu d'où provient le produit fermier associé. Il n'est pas modifiable
     */
    public LabelAOP(int idLabel,String nomLieuCreation) {
        super(idLabel);
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
