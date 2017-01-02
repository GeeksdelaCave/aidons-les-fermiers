package marche.traitement.produits;

import marche.traitement.production.Fromagerie;

import java.time.LocalDate;

/**
 * Classe Fromage représentant un fromage
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.7
 */
public class Fromage extends ProduitFermier {

    /**
     * Attribut général des cochons.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les cochons de manière unique.
     *
     * @see Fromage#Fromage(float, LocalDate, short, String, float, Fromagerie)
     * @see Fromage#idFromage
     */
    private static int idFromageGeneral = 250;

    /**
     * Identifiant du cochon.
     * Cette valeur est définie à la création du cochon en fonction de la valeur d'idFromageGeneral, permettant d'obtenir
     * un identifiant unique.
     *
     * @see Fromage#getIdFromage()
     * @see Fromage#Fromage(float, LocalDate, short, String, float, Fromagerie)
     * @see Fromage#idFromageGeneral
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
     * @param nomFromage     désigne le nom d'un fromage
     * @param poidsFromage   désigne le poids d'un fromage en kg
     * @param fromagerie     désigne une fromagerie associè à un fromage
     */
    public Fromage(float prix, LocalDate datePeremption, short qualite, String nomFromage, float poidsFromage, Fromagerie fromagerie) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idFromage = idFromageGeneral;
        idFromageGeneral += 100;
        this.nomFromage = nomFromage;
        this.poidsFromage = poidsFromage;
        this.uniteDeProduction = fromagerie;
    }

    /** Retourne l'identifiant du fromage
     *
     * @return l'identifiant d'un fromage
     */
    public int getIdFromage() {
      
        return this.idFromage;
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