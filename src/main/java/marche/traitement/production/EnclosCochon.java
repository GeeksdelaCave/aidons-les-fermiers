package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Cochon;

import java.time.LocalDate;

/**
 * Classe EnclosCochon désignant le lieu où vont être naître et être stockés les cochons nés
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.1
 */
public class EnclosCochon extends UniteDeProduction {

    /** Constructeur de la classe EnclosCochon
     *
     * @param capaciteeProduction désigne la capacitée maximale de cochons à accueillir
     * @param regionCreationProduit désigne la région où est située l'enclos à cochon
     */
    public EnclosCochon (int capaciteeProduction, String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un cochon créé et l'ajoute à l'inventaire avec la prise en compte de l'exception InventairePlein
     *
     * @param prixCochon désigne le prix d'un cochon
     * @param datePeremption désigne la date de péremption d'un cochon
     * @param qualite désigne la qualité d'un cochon
     * @param poidsCochon désigne le poids d'un cochon
     * @param typeCochon désigne le type de cochon
     * @return un cochon créé et l'ajoute à l'inventaire ou null si on retourne une exception
     */
    public Cochon creerCochon(float prixCochon, LocalDate datePeremption, short qualite, float poidsCochon, String typeCochon) {
        Cochon cochonNee = new Cochon(prixCochon, datePeremption, qualite, poidsCochon, typeCochon,this);
        ajoutInventaire(cochonNee);
        cochonNee.validerLabel();
        return cochonNee;
    }
}