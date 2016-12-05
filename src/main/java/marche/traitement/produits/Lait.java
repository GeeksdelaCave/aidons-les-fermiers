package marche.traitement.produits;

import java.time.LocalDate;

/**
 * Classe Lait qui représentera en réalité un pack de lait
 * @version 1.1
 */
public class Lait extends ProduitFermier {
    /**
     * L'identifiant d'un pack de lait. Il n'est pas modifiable
     * @see Lait#getIdPackLait()
     */
    private int idPackLait;

    /**
     * Le poids d'un pack de lait. Il n'est pas modifiable
     * @see Lait#getPoidsPackLait()
     */
    private float poidsPackLait;

    /**
     * Constructeur d'un pack de lait
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param lieuCreation désigne le lieu où a été crée un produit fermier
     * @param idPackLait     désigne l'identifiant d'un pack de lait
     * @param poidsPackLait  désigne le poids d'un pack de lait
     */
    public Lait(float prix, LocalDate datePeremption, short qualite, String lieuCreation, int idPackLait, float poidsPackLait) {
        super(prix, datePeremption, qualite, lieuCreation);
        this.idPackLait = idPackLait;
        this.poidsPackLait = poidsPackLait;
    }

    /** Retourne l'identifiant d'un pack de lait
     *
     * @return l'identifiant d'un pack de lait
     */
    public int getIdPackLait() {
        return idPackLait;
    }

    /** Retourne le poids d'un pack de lait
     *
     * @return le poids d'un pack de lait
     */
    public float getPoidsPackLait() {
        return poidsPackLait;
    }
}
