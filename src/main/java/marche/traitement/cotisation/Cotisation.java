package marche.traitement.cotisation;

import marche.traitement.participant.Arboriculteur;
import marche.traitement.participant.Horticulteur;
import marche.traitement.participant.ProducteurDeViande;
import marche.traitement.participant.ProducteurLaitier;

/**
 * Visiteur Cotisation qui va gérer le payement de la cotisation du système en fonction du type d'acteur
 * @author Thibaud CENENT
 * @version 1.0
 */
public interface Cotisation {

    /**
     *
     * @param arboriculteur désigne un arboriculteur qui a utilisé le système
     * @return le montant de la cotisation que doit payer un arboriculteur.
     */
    public double calculMontantCotisation(Arboriculteur arboriculteur);

    /**
     *
     * @param horticulteur désigne un horticulteur qui a utilisé le système
     * @return le montant de la cotisation que doit payer un horticulteur
     */
    public double calculMontantCotisation(Horticulteur horticulteur);

    /**
     *
     * @param producteurDeViande désigne un producteur de viande qui a utilisé le système
     * @return le montant de la cotisation que doit payer un producteur de viande
     */
    public double calculMontantCotisation(ProducteurDeViande producteurDeViande);

    /**
     *
     * @param producteurLaitier désigne un producteur de lait qui a utilisé le système.
     * @return le montant de la cotisation que doit payer un producteur de lait
     */
    public double calculMontantCotisation(ProducteurLaitier producteurLaitier);
}
