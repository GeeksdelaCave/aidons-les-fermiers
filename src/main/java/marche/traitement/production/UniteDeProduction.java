package marche.traitement.production;

import marche.traitement.produits.ProduitFermier;

/**
 * Classe abstraite de l'unité de production représentant une idée d'une unitée de production
 * @version 1.1
 */
public abstract class UniteDeProduction {

    /**
     *  Capacitée maximale qu'une unitée de production peut accueillir. Elle n'est pas modifiable
     */
   protected int capaciteeProduction;

    /**
     *  Région française où les unitées de production créent leurs produits. Elle n'est pas modifiable
     */
   protected String regionCreationProduit;

    /**
     * Classe par défaut de Unité de Production
     */
    protected UniteDeProduction() {
    }

    /** Retourne le produit fermier crée
     *
     * @return le produit fermier crée par une unité de production
     */
    public abstract ProduitFermier creerProduitFermier();
}
