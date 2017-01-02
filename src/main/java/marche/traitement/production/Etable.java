package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.ProduitFermier;
import marche.traitement.produits.Vache;

import java.time.LocalDate;

/**
 * Classe Etable représentant le lieu où vont être stockés les vaches à naître
 * @version 1.1
 * @author Thibaud CENENT
 */
public class Etable extends Enclos {

    /**
     * Identifiant statique par défaut d'une vache quand elle naîtra puis qui s'incrémentera à chaque création d'une vache car identifiant unique
     * @see Etable#ajoutInventaire(ProduitFermier)
     */
    private static int idVacheNee = 3000;

    /** Constructeur de la classe Etable
     *
     * @param capaciteeProduction désigne la capacitée maximale de vaches à accueillir dans l'etable
     * @param regionCreationProduit désigne la région où est situé l'étable
     */
    public Etable(int capaciteeProduction,String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne une vache crée puis l'ajoute à l'inventaire avec la prise en compte de l'exception InventairePlein
     *
     * @param prixVache désigne le prix d'une vache
     * @param datePeremption désigne la date de peremption d'une vache
     * @param qualite désigne la qualité d'une vache
     * @param nomVache désigne le nom d'une vache
     * @param poidsVache désigne le poids d'une vache
     * @return une vache crée et l'ajoute à l'inventaire ou null si on retourne une exception
     */
    public Vache creerVache(float prixVache,LocalDate datePeremption,short qualite,String nomVache,float poidsVache) {
        //TODO popup pour l'interface graphique, arrêter la génération pour cette IUP tant que l'on n'a pas repris des items
        try {
            Vache vacheNee = new Vache(prixVache, datePeremption, qualite, idVacheNee, nomVache, poidsVache, this);
            idVacheNee += 100;
            ajoutInventaire(vacheNee);
            return vacheNee;
        }
        catch(InventairePleinException ipe){
            ipe.printStackTrace();
            return null;
        }
    }

}
