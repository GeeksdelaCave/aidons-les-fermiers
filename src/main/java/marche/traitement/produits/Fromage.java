package marche.traitement.produits;

import java.time.LocalDate;

/**
 * Classe Fromage représentant un fromage
 * @version 1.2
 */
public class Fromage extends ProduitFermier {
    /**
     * L'identifiant d'un fromage. Il n'est pas modifiable
     * @see Fromage#getIdFromage()
     */
    private int idFromage;

    /**
     * Le nom d'un fromage. Il n'est pas modifiable
     * @see Fromage#getNomFromage()
     */
    private String nomFromage;

    /**
     * Le poids d'un fromage en kg. Il n'est pas modifiable
     * @see Fromage#getPoidsFromage()
     */
    private float poidsFromage;

    /**
     * Constructeur d'un fromage
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param idFromage      désigne l'identifiant d'un fromage
     * @param nomFromage     désigne le nom d'un fromage
     * @param poidsFromage   désigne le poids d'un fromage en kg
     */
    public Fromage(float prix, LocalDate datePeremption, short qualite, int idFromage, String nomFromage, float poidsFromage) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idFromage = idFromage;
        this.nomFromage = nomFromage;
        this.poidsFromage = poidsFromage;
    }

    /** Retourne l'identifiant du fromage
     *
     * @return l'identifiant d'un fromage
     */
    public int getIdFromage() {
        return idFromage;
    }

    /** Retourne le nom du fromage
     *
     * @return le nom du fromage
     */
    public String getNomFromage() {
        return nomFromage;
    }

    /** Retourne le poids du fromage
     *
     * @return le poids du fromage
     */
    public float getPoidsFromage() {
        return poidsFromage;
    }
}
