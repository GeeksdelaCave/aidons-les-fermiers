package marche.traitement.produits;

import java.time.LocalDate;

/**
 * Classe Oeuf représentant un oeuf
 * @version 1.3
 */
public class Oeuf extends ProduitFermier {

    /**
     * L'identifiant d'un pack d'oeufs Il n'est pas modifiable
     */
    private int idPackOeuf;

    /**
     * Constructeur d'un Oeuf
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param idPackOeuf     correspond a l'identifiant du pack d'oeuf
     */
    public Oeuf(float prix, LocalDate datePeremption, short qualite, int idPackOeuf) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idPackOeuf = idPackOeuf;
    }

    public int getIdPackOeuf() {
        return idPackOeuf;
    }
}
