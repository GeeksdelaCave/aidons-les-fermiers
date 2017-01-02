package marche.traitement.label;

/**
 * Création de la classe LabelIGP consistant à attribuer un label aux produits ayant été réalisé ou produit
 * sur un lieu portant le même nom que leur lieu de création
 * @version 1.0
 */
public class LabelIGP extends Label {
    /**
     * Désigne le lieu dans lequel a été conçu un produit. Elle n'est pas modifiable.
     * @see LabelIGP#getLieuGeographiqueProduit()
     */
    private String lieuGeographiqueProduit;

    /**
     * Constructeur de la classe LabelIGP
     *
     * @param lieuGeographiqueProduit désigne le lieu dans lequel a été conçu un produit. Elle n'est pas modifiable
     */
    public LabelIGP(String lieuGeographiqueProduit) {
        super();
        this.lieuGeographiqueProduit = lieuGeographiqueProduit;
    }

    /** Retourne le lieu de création d'un produit
     *
     * @return le lieu où a été créé un produit.
     */
    public String getLieuGeographiqueProduit() {
        return lieuGeographiqueProduit;
    }
}
