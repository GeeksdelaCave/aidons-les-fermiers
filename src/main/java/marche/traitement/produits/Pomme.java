package marche.traitement.produits;

import marche.traitement.production.Verger;

import java.time.LocalDate;

/**
 *  Classe Pomme qui représentera en réalité une cagette de pommes
 *
 *  @author Romain COLONNA D'ISTRIA
 *  @author Tristan DIETZ
 *
 *  @version 1.7
 *  @author Thibaud CENENT
 */
public class Pomme extends ProduitFermier {

    /**
     * Identifiant d'une cagette de pomme.
     * Cette valeur est définie à la création d'une cagette de pomme en fonction de la valeur d'idCagetteGeneral, permettant d'obtenir
     * un identifiant unique.
     */
    private int idCagette;


    /**
     * Attribut général d'une cagette de pomme.
     * Cette valeur est incrémentée au fur et à mesure du code, permettant d'identifier les cagette de pomme de manière unique.
     */
    private static int idCagetteGeneral = 1000;

    /**
     * Le poids d'une cagette de pommes. Il n'est pas modifiable
     * @see Pomme#getPoidsCagette()
     */
    private float poidsCagette;

    /**
     * Le type de pomme dans la cagette. Il n'est pas modifiable
     * @see Pomme#getTypePomme()
     */
    private String typePomme;

    /**
     * Le nombre de pommes dans une cagette. Il est modifiable.
     */
    private int nbPommes;

    /**
     * Constructeur d'une cagette de pommes
     *
     * @param prix           désigne le prix du produit
     * @param datePeremption désigne la date de péremption du produit
     * @param qualite        désigne la qualité du produit sur une échelle de 1 à 100
     * @param poidsCagette   désigne le poids de la cagette de poids
     * @param typePomme      désigne le type des pommes de la cagette
     * @param nbPommes       désigne le nbre de pommes dans une cagette
     * @param verger         désigne le verger associé à la cagette de pommes
     *
     */
    public Pomme(float prix, LocalDate datePeremption, short qualite, float poidsCagette, String typePomme, int nbPommes, Verger verger) {
        this.prix = prix;
        this.datePeremption = datePeremption;
        this.qualite = qualite;
        this.idCagette = idCagetteGeneral;
        idCagetteGeneral += 100;
        this.poidsCagette = poidsCagette;
        this.typePomme = typePomme;
        this.nbPommes = nbPommes;
        this.uniteDeProduction = verger;
    }

    /** Retourne l'identifiant d'une cagette
     *
     * @return l'identifiant d'une cagette
     */
    public int getIdCagette() {

        return idCagette;
    }

    /** Retourne le poids d'une cagette
     *
     * @return le poids d'une cagette
     */
    public float getPoidsCagette() {

        return poidsCagette;
    }

    /** Retourne le type de pomme dans une cagette
     *
     * @return le type de pomme dans une cagette
     */
    public String getTypePomme() {

        return typePomme;
    }

    /** Retourne le nbre de pommes dans une cagette
     *
     * @return le nbre de pommes dans une cagette
     */
    public int getNbPommes() {

        return nbPommes;
    }

}