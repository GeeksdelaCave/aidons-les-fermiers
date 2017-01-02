package marche.traitement.production;


import marche.traitement.exceptions.InventairePleinException;
import marche.traitement.produits.Fromage;
import marche.traitement.produits.ProduitFermier;

import java.time.LocalDate;

/**
 * Classe Fromagerie désignant le lieu de fabrication de fromages fermiers
 * @version 1.1
 * @author Thibaud CENENT
 */
public class Fromagerie extends UniteDeProduction {

    /**
     * Identifiant statique d'un fromage fabriqué et qui s'incrémentera pour chaque nouvelle création car identifiant unique
     * @see Fromagerie#ajoutInventaire(ProduitFermier)
     */
    private static int idFromageFabriquee = 250;

    /** Constructeur de la classe Fromagerie
     *
     * @param capaciteeProduction désignant la capacitée maximale de fromages à accueillir
     * @param regionCreationProduit désignant la région où est implanté la fromagerie
     */
    public Fromagerie(int capaciteeProduction,String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un fromage créée et ajoutée à l'inventaire avec la prise en compte de l'exception InventairePlein
     *
     * @param prixFromage désigne le prix d'un fromage
     * @param datePeremption désigne la date de péremption d'un fromage
     * @param qualite désigne la qualité d'un fromage
     * @param nomFromage désigne le nom d'un fromage
     * @param poidsFromage désigne le poids d'un fromage
     * @return un fromage créé et ajouté à l'inventaire ou null si on retourne une exception
     */
    public Fromage creerFromage(float prixFromage,LocalDate datePeremption,short qualite,String nomFromage,float poidsFromage) {
        //TODO popup pour l'interface graphique, arrêter la génération pour cette IUP tant que l'on n'a pas repris des items
        try {
            Fromage fromageCree = new Fromage(prixFromage, datePeremption, qualite, idFromageFabriquee, nomFromage, poidsFromage, this);
            idFromageFabriquee += 100;
            ajoutInventaire(fromageCree);
            return fromageCree;
        }
        catch(InventairePleinException ipe)
        {
            ipe.printStackTrace();
            return null;
        }
    }


}
