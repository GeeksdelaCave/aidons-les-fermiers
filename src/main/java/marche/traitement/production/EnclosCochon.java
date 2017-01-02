package marche.traitement.production;

import marche.traitement.produits.Cochon;

import java.time.LocalDate;

/**
 * Classe EnclosCochon désignant le lieu où vont être naître et être stockés les cochons nés
 * @version 1.0
 */
public class EnclosCochon extends Enclos {

    /** Constructeur de la classe EnclosCochon
     *
     * @param capaciteeProduction désigne la capacitée maximale de cochons à accueillir
     * @param regionCreationProduit désigne la région où est située l'enclos à cochon
     */
    public EnclosCochon (int capaciteeProduction, String regionCreationProduit)
    {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un cochon créé et l'ajoute à l'inventaire
     *
     * @param prixCochon désigne le prix d'un cochon
     * @param datePeremption désigne la date de péremption d'un cochon
     * @param qualite désigne la qualité d'un cochon
     * @param poidsCochon désigne le poids d'un cochon
     * @param typeCochon désigne le type de cochon
     * @return un cochon créé et l'ajoute à l'inventaire
     */
    public Cochon creerCochon(float prixCochon,LocalDate datePeremption,short qualite,float poidsCochon,String typeCochon)
    {
        Cochon cochonNee = new Cochon(prixCochon,datePeremption,qualite,poidsCochon,typeCochon,this);
        ajoutInventaire(cochonNee);
        return cochonNee;
    }


}
