package marche.traitement.produits;

import marche.traitement.production.Etable;

import java.time.LocalDate;

/**
 * Classe Vache qui est une fille d'un produit fermier et qui représente une vache
 *
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.7
 */
public class Vache extends ProduitFermier {

    /**
     * Attribut général d'une vache.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les vaches de manière unique.
     *
     * @see Vache#Vache(float, LocalDate, short, String, float, Etable)
     * @see Vache#idVacheGeneral
     */
    private static int idVacheGeneral = 3000;

    /**
     * Identifiant d'une vache.
     * Cette valeur est définie à la création d'une vache en fonction de la valeur d'idVacheGeneral, permettant d'obtenir
     * un identifiant unique.
     *
     * @see Vache#getIdVache()
     * @see Vache#Vache(float, LocalDate, short, String, float, Etable)
     * @see Vache#idVacheGeneral
     */
    private int idVache;

    /**
     * Le nom d'une vache. Il n'est pas modifiable
     * @see Vache#getNomVache()
     */
    private String nomVache;

    /**
     * Le poids d'une vache. Elle n'est pas modifiable
     * @see Vache#getPoidsVache()
     */
    private float poidsVache;
    /**
     * Constructeur d'une Vache
     *  @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param nomVache Nom de la vache
     * @param poidsVache Poids d'une vache en kg
     * @param etable     désigne l'étable associé à la vache
     */
    public Vache(float prix, LocalDate datePeremption, short qualite, String nomVache, float poidsVache, Etable etable) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idVache = idVacheGeneral;
        idVacheGeneral += 100;
        this.nomVache = nomVache;
        this.poidsVache = poidsVache;
        this.uniteDeProduction = etable;
    }

    /** Renvoie l'identifiant d'une vache
     *
     * @return l'identifiant de la vache
     */
    public int getIdVache() {

        return idVache;
    }

    /** Renvoie le nom d'une vache
     *
     * @return le nom d'une vache
     */
    public String getNomVache() {

        return nomVache;
    }

    /** Renvoie le poids d'une vache
     *
     * @return le poids d'une vache
     */
    public float getPoidsVache() {

        return poidsVache;
    }
}