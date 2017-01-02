package marche.traitement.produits;

import marche.traitement.production.Etable;

import java.time.LocalDate;

/**
 * Classe Vache qui est une fille d'un produit fermier et qui représente une vache
 * @version 1.6
 * @author Thibaud CENENT
 */
public class Vache extends ProduitFermier {

    /**
     * L'identifiant d'une vache. Elle n'est pas modifiable
     * @see Vache#getIdVache()
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
     * @param idVache identifiant d'une vache
     * @param nomVache Nom de la vache
     * @param poidsVache Poids d'une vache en kg
     * @param etable     désigne l'étable associé à la vache
     */
    public Vache(float prix, LocalDate datePeremption, short qualite, int idVache, String nomVache, float poidsVache, Etable etable) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idVache = idVache;
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