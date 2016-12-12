package marche.traitement.production;

import marche.traitement.produits.Pomme;

import java.time.LocalDate;

/**
 * Classe Verger désignant un verger où on gérera le remplissage des cagettes de pommes crées
 * @version 1.1
 */
public class Verger extends UniteDeProduction {

    /**
     * Identifiant d'une cagette de pommes qui s'incrémentera pour chaque cagette crée car identifiant unique.
     * @see Verger#creerCagette(float, LocalDate, short, float, String, int)
     */
    private static int idCagetteCree = 1000;

    /** Constructeur de la classe Verger
     *
     * @param capaciteeProduction désigne la capacitée maximale de cagette de pommes à stocker
     * @param regionCreationProduit désigne la région où sont implantés les vergers
     */
    public Verger(int capaciteeProduction,String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne une cagette de pommes créée et ajoutée à l'inventaire
     *
     * @param prix désigne le prix d'une cagette de pommes crée
     * @param datePeremption désigne la date de péremption d'une cagette
     * @param qualite désigne la qualité d'une cagette
     * @param poidsCagette désigne le poids d'une cagette
     * @param typePomme désigne le type de pomme crée dans la cagette
     * @param nbPommes désigne le nbre de pommes pour 1 cagette
     * @return une cagette de pomme crée et ajoutée à l'inventaire
     */
    public Pomme creerCagette(float prix, LocalDate datePeremption, short qualite,float poidsCagette,String typePomme,int nbPommes) {
        Pomme cagette = new Pomme(prix,datePeremption,qualite,idCagetteCree,poidsCagette,typePomme,nbPommes,this);
        inventaireUniteDeProduction.add(cagette);
        idCagetteCree += 100;
        return cagette;
    }

}
