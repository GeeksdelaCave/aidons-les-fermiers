package marche.traitement.produits;


import java.time.LocalDate;

/**
 *
 *Classe abstraite ProduitFermier représentant une idée d'un produit fermier
 *
 * @version 1.1
 */
public abstract class ProduitFermier {

    /**
     * le prix du produit.Il n'est pas modifiable
     *
     * @see ProduitFermier#getPrix()
     */
    private float prix;

    /**
     * La date de peremption du produit. Elle n'est pas modifiable
     *
     * @see ProduitFermier#getDatePeremption()
     */
    private LocalDate datePeremption;

    /**
     * La qualité du produit sur une échelle de 1 à 100.Elle n'est pas modifiable.
     *
     * @see ProduitFermier#getQualite()
     * @see ProduitFermier#isCommercialisable()
     */
    private short qualite;

    /**
     * Verifie si le produit peut être commercialisable. Il n'est pas modifiable.
     *
     * @see ProduitFermier#isCommercialisable()
     */
    private boolean commercialisable;

    /**
     * Lieu où a été crée un produit fermier. Il n'est pas modifiable.
     * @see ProduitFermier#getLieuCreation()
     */
    private String lieuCreation;

    /** Constructeur d'un Produit Fermier
     *
     * @param prix désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite désigne la qualité du produit sur une échelle de 1 à 100
     * @param lieuCreation désigne le lieu où a été crée un produit fermier
     */
    public ProduitFermier(float prix, LocalDate datePeremption, short qualite,String lieuCreation) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.lieuCreation = lieuCreation;
    }

    /** Retourne le prix du produit
     *
     * @return le prix du produit
     */
    public float getPrix()
    {
        return prix;
    }

    /** Retourne la date de peremption
     *
     * @return la date de peremption
     */
    public LocalDate getDatePeremption()
    {
        return datePeremption;
    }

    /** Retourne la qualité du produit
     *
     * @return la qualité du produit
     */
    public short getQualite()
    {
        return qualite;
    }

    /** Retourne si le produit est commercialisable ou pas
     *
     * @return si le produit est commercialisable ou pas
     */
    public boolean isCommercialisable()
    {
        if(getQualite() >= 30 && getQualite() <= 100)
            commercialisable = true;
        else
            commercialisable = false;

        return commercialisable;
    }

    /** Renvoie le lieu où a été crée un produit fermier
     *
     * @return le lieu où a été crée un produit fermier
     */
    public String getLieuCreation() {
        return lieuCreation;
    }
}
