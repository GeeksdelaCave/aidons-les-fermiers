package marche.traitement.production;

import marche.affichage.ExceptionsPopups;
import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.ProduitFermier;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Classe abstraite de l'unité de production représentant une idée d'une unitée de production
 * @version 1.3
 * @author Thibaud CENENT
 */
public abstract class UniteDeProduction {


    /**
     *  Capacitée maximale de produits fermiers qu'une unitée de production peut accueillir. Elle n'est pas modifiable
     *  @see UniteDeProduction#getCapaciteeProduction()
     *
     */
   protected int capaciteeProduction;

    /**
     *  Région française où les unitées de production créent leurs produits. Elle n'est pas modifiable
     *  @see UniteDeProduction#getRegionCreationProduit()
     */
   protected String regionCreationProduit;

    public PriorityQueue<ProduitFermier> getInventaireUniteDeProduction() {
        return inventaireUniteDeProduction;
    }

    /**
     * Rangée de produits fermiers dans l'unité de production où chaque produit sera trié en fonction de sa qualité. Elle est modfiable tant qu'on est pas à la capacitée maximale
     * @see UniteDeProduction#ajoutInventaire(ProduitFermier)
     * @see UniteDeProduction#displayInventaire()
     */
    protected PriorityQueue<ProduitFermier> inventaireUniteDeProduction = new PriorityQueue<ProduitFermier>(new Comparator<ProduitFermier>() {
        public int compare(ProduitFermier o1, ProduitFermier o2) {
            return o1.getQualite() < o2.getQualite() ? -1 : 1;
        }
    });

    /**
     *  Permet d'afficher l'inventaire de produit fermier présent dans une unitée de production
     */
    public void displayInventaire() {
        for(ProduitFermier produitFermier : inventaireUniteDeProduction)
            System.out.println(produitFermier.toString());
    }

    /** Permet d'ajouter à l'inventaire de l'unité de production un produit fermier nouvellement crée sauf si l'unité de production est pleine. Le cas échéant, renvoit une InventairePleinException().
     * @param produitFermier désigne un produit fermier crée à partir de la methode creerProduitFermier()
     * @see InventairePleinException
     */
    public void ajoutInventaire (ProduitFermier produitFermier) throws InventairePleinException {
        if(inventaireUniteDeProduction.size() < getCapaciteeProduction())
            inventaireUniteDeProduction.add(produitFermier);
        else
            ExceptionsPopups.inventairePleinPopup();
    }

    /** Retourne la capacitée maximale de produit fermier à accueillir
     * @return la capacitée maximale de produit fermier à accueillir
     */
    public int getCapaciteeProduction() {
        return capaciteeProduction;
    }

    /** Retourne la région où est implanté l'unité de production
     * @return la région où est implanté l'unité de production
     */
    public String getRegionCreationProduit() {

        return regionCreationProduit;
    }
}
