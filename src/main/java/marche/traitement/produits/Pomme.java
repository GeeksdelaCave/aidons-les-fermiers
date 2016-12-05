package marche.traitement.produits;

import java.time.LocalDate;

/**
 *  Classe Pomme qui représentera en réalité une cagette de pommes
 *  @version 1.1
 */
public class Pomme extends ProduitFermier {
    /**
     * L'identifiant d'une cagette de pommes. Il n'est pas modifiable
     * @see Pomme#getIdCagette()
     */
    private int idCagette;

    /**
     * Le poids d'une cagette de pommes. Il n'est pas modifiable
     * @see Pomme#getPoidsCagette()
     */
    private float poidsCagette;

    /**
     * Le type de pomme dans la cagette. Il n'est pas modifiable
     * @see Pomme#getTypePomme()
     */
    private String typePomme;

    /**
     * Constructeur d'une cagette de pommes
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param lieuCreation désigne le lieu où a été crée un produit fermier
     * @param idCagette      désigne l'identifiant d'une cagette de pomme
     * @param poidsCagette   désigne le poids de la cagette de poids
     * @param typePomme      désigne le type des pommes de la cagette
     */
    public Pomme(float prix, LocalDate datePeremption, short qualite, String lieuCreation, int idCagette, float poidsCagette, String typePomme) {
        super(prix, datePeremption, qualite, lieuCreation);
        this.idCagette = idCagette;
        this.poidsCagette = poidsCagette;
        this.typePomme = typePomme;
    }

    /** Retourne l'identifiant d'une cagette
     *
     * @return l'identifiant d'une cagette
     */
    public int getIdCagette() {
        return idCagette;
    }

    /** Retourne le poids d'une cagette
     *
     * @return le poids d'une cagette
     */
    public float getPoidsCagette() {
        return poidsCagette;
    }

    /** Retourne le type de pomme dans une cagette
     *
     * @return le type de pomme dans une cagette
     */
    public String getTypePomme() {
        return typePomme;
    }
}
