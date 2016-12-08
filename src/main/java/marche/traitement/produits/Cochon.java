package marche.traitement.produits;

import marche.traitement.production.UniteDeProduction;

import java.time.LocalDate;

/**
 * Classe Cochon représentant un cochon
 * @version 1.3
 */
public class Cochon extends ProduitFermier {

    /**
     *  L'identifiant d'un cochon. Il n'est pas modifiable
     *  @see Cochon#getIdCochon()
     */
    private int idCochon;

    /**
     *  Le poids d'un cochon en kg. Il n'est pas modifiable
     *  @see Cochon#getPoidsCochon()
     */
    private float poidsCochon;

    /**
     *  Le type de cochon. Il n'est pas modifiable.
     *  @see Cochon#getTypeDeCochon()
     */
    private String typeDeCochon;

    /**
     * Lieu de création du cochon
     */
    private UniteDeProduction encloCochon;

    /**
     * Constructeur d'un cochon
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param idCochon       désigne l'identifiant d'un cochon
     * @param poidsCochon    désigne le poids d'un cochon en kg
     * @param typeDeCochon   désigne le type d'un cochon
     */
    public Cochon(float prix, LocalDate datePeremption, short qualite, int idCochon, float poidsCochon, String typeDeCochon, UniteDeProduction encloCochon) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idCochon = idCochon;
        this.poidsCochon = poidsCochon;
        this.typeDeCochon = typeDeCochon;
        this.encloCochon = encloCochon;
    }

    /** Retourne l'identifiant d'un cochon
     *
     * @return l'identifiant d'un cochon
     */
    public int getIdCochon() {
        return idCochon;
    }

    /** Retourne le poids d'un cochon
     *
     * @return le poids d'un cochon
     */
    public float getPoidsCochon() {
        return poidsCochon;
    }

    /** Retourne le type de cochon
     *
     * @return le type d'un cochon
     */
    public String getTypeDeCochon() {
        return typeDeCochon;
    }
}
