package marche.traitement.production;

import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Oeuf;

import java.time.LocalDate;

/**
 * Classe Poulailler représentant un poulailler gérant le produit fermier Oeuf
 * @version 1.3
 * @author Thibaud CENENT
 */
public class Poulailler extends UniteDeProduction {

    /** Constructeur de la classe Poulailler
     *
     * @param capaciteeProduction qui désigne la capacitée maximale d'oeufs qu'un poulailler peut accueillir
     * @param regionCreationProduit qui désigne la région où est implanté le poulailler
     */
    public Poulailler(int capaciteeProduction,String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un oeuf créé et ajouté à l'inventaire avec la prise en compte de l'exception InventairePlein
     *
     * @param prix désigne le prix d'un oeuf choisi par le fermier
     * @param datePeremption désigne la date de péremption de l'oeuf
     * @param qualite désigne la qualité d'un oeuf lorsqu'il est née
     * @return un oeuf qui est née et a été ajoutée à l'inventaire ou null si on retourne une exception
     */
    public Oeuf creerPackOeuf(float prix, LocalDate datePeremption, short qualite) {
        try {
            Oeuf oeuf = new Oeuf(prix, datePeremption, qualite, UniteDeProduction.idProduitFermiercree, this);
            ++UniteDeProduction.idProduitFermiercree;
            ajoutInventaire(oeuf);
            return oeuf;
        }
        catch(InventairePleinException ipe){
            ipe.printStackTrace();
            return null;
        }
    }
}
