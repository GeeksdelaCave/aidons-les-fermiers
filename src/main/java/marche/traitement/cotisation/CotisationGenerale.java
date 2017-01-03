package marche.traitement.cotisation;

import marche.traitement.participant.Arboriculteur;
import marche.traitement.participant.Horticulteur;
import marche.traitement.participant.ProducteurDeViande;
import marche.traitement.participant.ProducteurLaitier;

/**
 * Création d'une cotisation générale qui va gérer le calcul bien spécifique pour chaque type de fermier.
 * @author Thibaud CENENT
 * @version 1.0
 */
public class CotisationGenerale implements Cotisation {

    /**
     *
     * @param arboriculteur désigne un arboriculteur qui a utilisé le système
     * @return la somme à créditer au solde de l'arboriculteur
     */
    public double calculMontantCotisation(Arboriculteur arboriculteur) {
        return (arboriculteur.getSolde()) * 0.02;
    }

    /**
     *
     * @param horticulteur désigne un horticulteur qui a utilisé le système
     * @return la somme à créditer au solde de l'horticulteur
     */
    public double calculMontantCotisation(Horticulteur horticulteur) {
        return (horticulteur.getSolde()) * 0.02;
    }

    /**
     *
     * @param producteurDeViande désigne un producteur de viande qui a utilisé le système
     * @return la somme à créditer au solde du producteur de viande
     */
    public double calculMontantCotisation(ProducteurDeViande producteurDeViande) {
        return (producteurDeViande.getSolde()) * 0.02;
    }

    /**
     *
     * @param producteurLaitier désigne un producteur de lait qui a utilisé le système.
     * @return la somme à créditer au sole du producteur de lait
     */
    public double calculMontantCotisation(ProducteurLaitier producteurLaitier) {
        return (producteurLaitier.getSolde()) * 0.02;
    }
}
