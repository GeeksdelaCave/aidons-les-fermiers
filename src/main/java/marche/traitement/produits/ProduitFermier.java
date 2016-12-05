package marche.traitement.produits;


import java.time.LocalDate;

/**
 *
 *Classe abstraite ProduitFermier représentant une idée d'un produit fermier
 *
 * @version 1.3
 */
public abstract class ProduitFermier {

    /**
     * le prix du produit.Il n'est pas modifiable
     *
     * @see ProduitFermier#getPrix()
     */
    protected float prix;

    /**
     * La date de peremption du produit. Elle n'est pas modifiable
     *
     * @see ProduitFermier#getDatePeremption()
     */
    protected LocalDate datePeremption;

    /**
     * La qualité du produit sur une échelle de 1 à 100.Elle n'est pas modifiable.
     *
     * @see ProduitFermier#getQualite()
     * @see ProduitFermier#isCommercialisable()
     */
    protected short qualite;

    /**
     * Verifie si le produit peut être commercialisable. Il n'est pas modifiable.
     *
     * @see ProduitFermier#isCommercialisable()
     */
    protected boolean commercialisable;



    /** Constructeur par défaut d'un Produit Fermier
     *
     */

    protected ProduitFermier() {}

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


}
