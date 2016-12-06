package marche.traitement.production;


import marche.traitement.produits.Lait;

import java.time.LocalDate;

/**
 * Classe Laiterie désignant le lieu de fabrication des packs de lait
 * @version 1.1
 */
public class Laiterie extends UniteDeProduction {

    /**
     * Identifiant statique d'un pack de lait crée qui s'incrémentera pour chaque création car identifiant unique.
     * @see Laiterie#creerPackLait(float, LocalDate, short, float)
     */
    private static int idPackLaitCree = 500;

    /** Constructeur de la classe Laiterie
     *
     * @param capaciteeProduction désigne la capacitée maximale de packs de lait à accueillir
     * @param regionCreationProduit désigne la région où est implantée la laiterie
     */
    public Laiterie(int capaciteeProduction,String regionCreationProduit)
    {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un pack de lait créée et ajoutée à l'inventaire
     *
     * @param prixPack désigne le prix d'un pack de lait
     * @param datePeremption désigne la date de péremption d'un pack de lait
     * @param qualite désigne la qualité d'un pack de lait
     * @param poidsPackLait désigne le poids d'un pack de lait
     * @return un pack de lait crée et ajouté à l'inventaire
     */
    public Lait creerPackLait(float prixPack,LocalDate datePeremption,short qualite,float poidsPackLait)
    {
        Lait packLait = new Lait(prixPack,datePeremption,qualite, idPackLaitCree,poidsPackLait);
        idPackLaitCree += 100;
        ajoutInventaire(packLait);
        return packLait;
    }


}
