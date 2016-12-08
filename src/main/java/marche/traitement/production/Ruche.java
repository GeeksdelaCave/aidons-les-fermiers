package marche.traitement.production;

import marche.traitement.produits.Miel;

import java.time.LocalDate;

/**
 * Classe Ruche désignant une ruche nécessaire à la création de pots de miels
 * @version 1.1
 */
public class Ruche extends UniteDeProduction{

    /**
     * Identifiant d'un pot de miel statique lorsqu'il celui-ci est crée et incrémenté chaque pot de miel crée car identifiant unique.
     * @see Ruche#creerPotMiel(float, LocalDate, short, float, String)
     */
    private static int idPotMielCree = 1500;

    /** Constructeur de la classe Ruche
     *
     * @param capaciteeProduction désigne la capacitée maximale de pots de miels à accueillir
     * @param regionCreationProduit désigne la région où la ruche est implantée
     */
    public Ruche(int capaciteeProduction,String regionCreationProduit)
    {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un poids de miel créé et ajouté à l'inventaire
     *
     * @param prixPot désigne le pric d'un pot de miel
     * @param datePeremption désigne la date de péremption d'un pot de meil
     * @param qualite désigne la qualité d'un pot de miel
     * @param poidsPot désigne le poids d'un pot de miel
     * @param typeMiel désigne le type de miel crée
     * @return un poids de miel crée et ajouté à l'inventaire
     */
    public Miel creerPotMiel(float prixPot,LocalDate datePeremption,short qualite,float poidsPot,String typeMiel){
        Miel potMiel = new Miel(prixPot,datePeremption,qualite,idPotMielCree,poidsPot,typeMiel,this);
        idPotMielCree += 100;
        ajoutInventaire(potMiel);
        return potMiel;
    }
}
