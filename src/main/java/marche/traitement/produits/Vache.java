package marche.traitement.produits;

import java.util.Date;

/**
 * Created by Thibaud on 28/11/2016.
 */
public class Vache extends ProduitFermier {

    /**
     * L'identifiant d'une vache. Elle n'est pas modifiable
     * @see Vache#getIdvache()
     */
    private int idvache;
    private String nomvache;
    private float poidsvache;
    /**
     * Constructeur d'une Vache
     *
     * @param idvache identifiant d'une vache
     * @param nomvache Nom de la vache
     * @param poidsvache Poids d'une vach en kg
     * @param prix           désigne le prix du produit
     * @param dateperemption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     */
    public Vache(int idvache,String nomvache,float poidsvache,float prix, Date dateperemption, short qualite) {
        super(prix, dateperemption, qualite);
        this.idvache = idvache;
        this.nomvache = nomvache;
        this.poidsvache = poidsvache;

    }

    public int getIdvache() {
        return idvache;
    }

    public String getNomvache() {
        return nomvache;
    }

    public float getPoidsvache() {
        return poidsvache;
    }
}
