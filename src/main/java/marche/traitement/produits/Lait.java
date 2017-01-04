package marche.traitement.produits;

import marche.traitement.production.Laiterie;

import java.time.LocalDate;

/**
 * Classe Lait qui représentera en réalité un pack de lait
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.7
 */
public class Lait extends ProduitFermier {

    /**
     * Attribut général des packs de lait.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les packs de lait de manière
     * unique.
     *
     * @see Lait#Lait(float, LocalDate, short, float, Laiterie)
     * @see Lait#idLait
     */
    private static int idLaitGeneral = 1300;

    /**
     * Identifiant du pack de lait.
     * Cette valeur est définie à la création du pack de lait en fonction de la valeur d'idLaitGeneral, permettant
     * d'obtenir un identifiant unique.
     *
     * @see Lait#getIdPackLait()
     * @see Lait#Lait(float, LocalDate, short, float, Laiterie)
     * @see Lait#idLaitGeneral
     */
    private int idLait;

    /**
     * Le poids d'un pack de lait. Il n'est pas modifiable
     * @see Lait#getPoidsPackLait()
     */
    private float poidsPackLait;

    /**
     * Constructeur d'un pack de lait
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param poidsPackLait  désigne le poids d'un pack de lait
     * @param laiterie       désigne la laiterie associé avec un pack de lait
     */
    public Lait(float prix, LocalDate datePeremption, short qualite, float poidsPackLait, Laiterie laiterie) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idLait = idLaitGeneral;
        idLaitGeneral += 100;
        this.poidsPackLait = poidsPackLait;
        this.uniteDeProduction = laiterie;
    }

    /** Retourne l'identifiant d'un pack de lait
     *
     * @return l'identifiant d'un pack de lait
     */
    public int getIdPackLait() {
      
        return idLait;
    }

    /** Retourne le poids d'un pack de lait
     *
     * @return le poids d'un pack de lait
     */
    public float getPoidsPackLait() {

        return poidsPackLait;
    }
}