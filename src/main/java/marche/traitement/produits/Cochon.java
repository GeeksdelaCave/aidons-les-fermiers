package marche.traitement.produits;

import marche.traitement.production.EnclosCochon;

import java.time.LocalDate;

/**
 * Classe Cochon représentant un cochon
 * @version 1.6
 */
public class Cochon extends ProduitFermier {

    /**
     * Attribut général des cochons.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les cochons de manière unique.
     *
     * @see Cochon#Cochon(float, LocalDate, short, float, String, EnclosCochon)
     * @see Cochon#IDCochon
     */
    private static int IDCochonGeneral = 2000;

    /**
     * Identifiant du cochon.
     * Cette valeur est définie à la création du cochon en fonction de la valeur d'IDCochonGeneral, permettant d'obtenir
     * un identifiant unique.
     *
     * @see Cochon#getIdCochon()
     * @see Cochon#Cochon(float, LocalDate, short, float, String, EnclosCochon)
     * @see Cochon#IDCochonGeneral
     */
    private int IDCochon;

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
     * Constructeur d'un cochon
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param poidsCochon    désigne le poids d'un cochon en kg
     * @param typeDeCochon   désigne le type d'un cochon
     * @param enclosCochon   désigne l'enclos pour cochon associé au cochon
     */
    public Cochon(float prix, LocalDate datePeremption, short qualite, float poidsCochon, String typeDeCochon, EnclosCochon enclosCochon) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.IDCochon = IDCochonGeneral;
        this.poidsCochon = poidsCochon;
        this.typeDeCochon = typeDeCochon;
        this.uniteDeProduction = enclosCochon;
    }

    /** Retourne l'identifiant d'un cochon
     *
     * @return l'identifiant d'un cochon
     */
    public int getIdCochon() {
        return IDCochon;
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