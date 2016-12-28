package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Miel;

import java.time.LocalDate;

/**
 * Classe Ruche désignant une ruche nécessaire à la création de pots de miels
 * @version 1.1
 * @author Thibaud CENENT
 */
public class Ruche extends UniteDeProduction{

    /** Constructeur de la classe Ruche
     *
     * @param capaciteeProduction désigne la capacitée maximale de pots de miels à accueillir
     * @param regionCreationProduit désigne la région où la ruche est implantée
     */
    public Ruche(int capaciteeProduction,String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un poids de miel créé et ajouté à l'inventaire avec la prise en compte de l'exception InventairePlein
     *
     * @param prixPot désigne le pric d'un pot de miel
     * @param datePeremption désigne la date de péremption d'un pot de meil
     * @param qualite désigne la qualité d'un pot de miel
     * @param poidsPot désigne le poids d'un pot de miel
     * @param typeMiel désigne le type de miel crée
     * @return un poids de miel crée et ajouté à l'inventaire ou null si on retourne une exception
     */
    public Miel creerPotMiel(float prixPot,LocalDate datePeremption,short qualite,float poidsPot,String typeMiel){
        try {
            Miel potMiel = new Miel(prixPot, datePeremption, qualite, UniteDeProduction.idProduitFermiercree, poidsPot, typeMiel, this);
            ++UniteDeProduction.idProduitFermiercree;
            ajoutInventaire(potMiel);
            return potMiel;
        }
        catch(InventairePleinException ipe) {
            ipe.printStackTrace();
            return null;
        }
    }
}
