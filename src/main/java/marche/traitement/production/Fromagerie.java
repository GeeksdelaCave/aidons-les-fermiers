package marche.traitement.production;

import marche.traitement.produits.Fromage;

import java.time.LocalDate;

/**
 * Classe Fromagerie désignant le lieu de fabrication de fromages fermiers
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.1
 */
public class Fromagerie extends UniteDeProduction {

    /** Constructeur de la classe Fromagerie
     *
     * @param capaciteeProduction désignant la capacitée maximale de fromages à accueillir
     * @param regionCreationProduit désignant la région où est implanté la fromagerie
     */
    public Fromagerie(int capaciteeProduction, String regionCreationProduit) {
        this.capaciteeProduction = capaciteeProduction;
        this.regionCreationProduit = regionCreationProduit;
    }

    /** Retourne un fromage créée et ajoutée à l'inventaire
     *
     * @param prixFromage désigne le prix d'un fromage
     * @param datePeremption désigne la date de péremption d'un fromage
     * @param qualite désigne la qualité d'un fromage
     * @param nomFromage désigne le nom d'un fromage
     * @param poidsFromage désigne le poids d'un fromage
     * @return un fromage créé et ajouté à l'inventaire
     */
    public Fromage creerFromage(float prixFromage, LocalDate datePeremption, short qualite, String nomFromage, float poidsFromage) {
        Fromage fromageCree = new Fromage(prixFromage, datePeremption, qualite, nomFromage, poidsFromage, this);
        ajoutInventaire(fromageCree);
        return fromageCree;
    }


}
