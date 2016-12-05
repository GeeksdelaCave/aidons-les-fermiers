package marche.traitement.produits;

import java.time.LocalDate;

/**
 * Classe Fromage représentant un fromage
 * @version 1.1
 */
public class Oeuf extends ProduitFermier {
    /**
     * L'identifiant d'un pack d'oeufs Il n'est pas modifiable
     */
    private int idPackOeuf;

    /**
     * Constructeur d'un Oeuf
     *
     * @param prix           correspond au pris du pack d'oeufs
     * @param datePeremption désigne la date de péremption des oeufs contenu dans le pack
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param lieuCreation   correspond au lieu de ponte des oeufs
     * @param idPackOeuf     correspond a l'identifiant du pack d'oeuf
     */
    public Oeuf(float prix, LocalDate datePeremption, short qualite, String lieuCreation, int idPackOeuf) {
        super(prix, datePeremption, qualite, lieuCreation);
        this.idPackOeuf = idPackOeuf;
    }
}
