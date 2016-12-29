package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Cochon;

import java.time.LocalDate;

/**
 * Classe EnclosCochon désignant le lieu où vont être naître et être stockés les cochons nés
 * @version 1.1
 * @author Thibaud CENENT
 */
public class EnclosCochon extends Enclos {

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
    public Cochon creerCochon(float prixCochon,LocalDate datePeremption,short qualite,float poidsCochon,String typeCochon) {
        //TODO popup pour l'interface graphique, arrêter la génération pour cette IUP tant que l'on n'a pas repris des items
        try {
            Cochon cochonNee = new Cochon(prixCochon, datePeremption, qualite, UniteDeProduction.idProduitFermiercree, poidsCochon, typeCochon, this);
            ++UniteDeProduction.idProduitFermiercree;
            ajoutInventaire(cochonNee);
            return cochonNee;
        }
        catch(InventairePleinException ipe) {
            ipe.printStackTrace();
            return null;
        }
    }


}
