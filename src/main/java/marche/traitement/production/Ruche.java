package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Miel;

import java.time.LocalDate;

/**
 * Classe Ruche désignant une ruche nécessaire à la création de pots de miels
 *
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.2
 */
public class Ruche extends UniteDeProduction{

    /** Constructeur de la classe Ruche
     *
     * @param capaciteeProduction désigne la capacitée maximale de pots de miels à accueillir
     * @param regionCreationProduit désigne la région où la ruche est implantée
     */
    public Ruche(int capaciteeProduction, String regionCreationProduit) {
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
    public Miel creerPotMiel(float prixPot, LocalDate datePeremption, short qualite, float poidsPot, String typeMiel) {
        Miel potMiel = new Miel(prixPot, datePeremption, qualite, poidsPot, typeMiel, this);
        ajoutInventaire(potMiel);
        potMiel.validerLabel();
        return potMiel;
    }
}
