package marche.traitement.label;

/**
 * Création de la classe LabelRouge représentant le label attribué aux produits de qualité supérieure (supérieur à 75 sur 100)
 * @version 1.0
 */
public class LabelRouge extends Label {
    /**
     * Désigne le fait qu'un produit soit de qualité supérieure ou non. Il n'est pas modifiable.
     * @see LabelRouge#isQualiteSuperieureProduit()
     */
    boolean qualiteSuperieureProduit;

    /**
     * Constructeur de la classe LabelRouge
     *
     * @param idLabel désigne l'identifiant d'un label. Il n'est pas modifiable.
     * @param qualiteSuperieureProduit désigne si un produit est de qualité supérieure ou non. Elle n'est pas modifiable
     */
    public LabelRouge(int idLabel,boolean qualiteSuperieureProduit) {
        this.idLabel = idLabel;
        this.qualiteSuperieureProduit = qualiteSuperieureProduit;
    }

    /** Renvoie si le produit est de qualité supérieure ou non.
     *
     * @return si le produit est de qualité supérieure ou non
     */
    public boolean isQualiteSuperieureProduit() {
        return qualiteSuperieureProduit;
    }
}
