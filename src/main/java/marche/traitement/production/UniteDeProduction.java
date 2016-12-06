package marche.traitement.production;

import marche.traitement.produits.ProduitFermier;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Classe abstraite de l'unité de production représentant une idée d'une unitée de production
 * @version 1.2
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

    /**
     * Rangée de produits fermiers dans l'unité de production où chaque produit sera trié en fonction de sa qualité. Elle est modfiable tant qu'on est pas à la capacitée maximale
     * @see UniteDeProduction#ajoutInventaire(ProduitFermier)
     */
    protected PriorityQueue<ProduitFermier> inventaireUdp = new PriorityQueue<ProduitFermier>(new Comparator<ProduitFermier>() {
        public int compare(ProduitFermier o1, ProduitFermier o2) {
            return o2.getQualite() < o1.getQualite() ? -1 : 1;
        }
    });

    /**
     * Classe par défaut de Unité de Production
     */
    protected UniteDeProduction() {
    }


    /** Permet d'ajouter à l'inventaire Udp un produit fermier crée sauf si l'unité de production est pleine
     *
     * @param produitFermier désigne un produit fermier crée à partir de la methode creerProduitFermier()
     */
    public void ajoutInventaire (ProduitFermier produitFermier)
    {
        if(getCapaciteeProduction() != inventaireUdp.size())
            inventaireUdp.add(produitFermier);
        System.out.println("Ajout impossible, taille maximale atteinte");
        return;
    }

    /** Retourne la capacitée maximale de produit fermier à accueillir
     *
     * @return la capacitée maximale de produit fermier à accueillir
     */
    public int getCapaciteeProduction() {
        return capaciteeProduction;
    }

    /** Retourne la région où est implanté l'unité de production
     *
     * @return la région où est implanté l'unité de production
     */
    public String getRegionCreationProduit() {
        return regionCreationProduit;
    }
}
