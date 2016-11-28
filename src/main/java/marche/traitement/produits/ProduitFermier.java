package marche.traitement.produits;

import java.util.Date;

/**
 *
 *Classe abstraite ProduitFermier représentant une idée d'un produit fermier
 *
 * @version 1.0
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
    private Date datePeremption;

    /**
     * La qualité du produit sur une échelle de 1 à 100.Elle n'est pas modifiable.
     *
     * @see ProduitFermier#getQualite()
     * @see ProduitFermier#isCommercialise()
     */
    private short qualite;

    /**
     * Verifie si le produit peut être commercialisable. Il n'est pas modifiable.
     *
     * @see ProduitFermier#isCommercialise()
     */
    private boolean commercialise;

    /** Constructeur d'un Produit Fermier
     *
     * @param prix désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite désigne la qualité du produit sur une échelle de 1 à 100
     */
    public ProduitFermier(float prix, Date datePeremption, short qualite) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
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
    public Date getDatePeremption()
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
    public boolean isCommercialise()
    {
        if(getQualite() >= 30 && getQualite() <= 100)
            commercialise = true;
        else
            commercialise = false;

        return commercialise;
    }
}
