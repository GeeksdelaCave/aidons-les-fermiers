package marche.traitement.production;

import marche.traitement.produits.Oeuf;

import java.time.LocalDate;

/**
 * Classe Poulailler représentant un poulailler gérant le produit fermier Oeuf
 *
 * @author Thibaud CENENT
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.2
 */
public class Poulailler extends UniteDeProduction {

    /** Constructeur de la classe Poulailler
     *
     * @param capaciteeProduction qui désigne la capacitée maximale d'oeufs qu'un poulailler peut accueillir
     * @param regionCreationProduit qui désigne la région où est implanté le poulailler
     */
    public Poulailler(int capaciteeProduction, String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un oeuf créé et ajouté à l'inventaire
     *
     * @param prix désigne le prix d'un oeuf choisi par le fermier
     * @param datePeremption désigne la date de péremption de l'oeuf
     * @param qualite désigne la qualité d'un oeuf lorsqu'il est née
     * @return un oeuf qui est née et a été ajoutée à l'inventaire
     */
    public Oeuf creerPackOeuf(float prix, LocalDate datePeremption, short qualite) {
        Oeuf oeuf = new Oeuf(prix, datePeremption, qualite, this);
        ajoutInventaire(oeuf);
        return oeuf;
    }
}
