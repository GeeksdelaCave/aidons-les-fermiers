package marche.affichage;

/**
 * Création de l'observable qui va gérer l'ensemble des observateurs et les notifier des changements
 * @author Thibaud CENENT
 * @version 1.0
 */
public interface Observable {

    /** Ajouter un observateur à l'Array correspondant en donnée membre.
     *
     * @param observateur désignant l'observateur à ajouter à l'array d'Observateur en donnée membre
     */
    public void ajouterObservateur(Observateur observateur);

    /** Supprimer un observateur associé à l'Array correspondant en donnée membre.
     *
     * @param observateur désignant l'observateur à supprimer.
     */
    public void enleverObservateur(Observateur observateur);

    /**
     *  Permet de notifier tous les observateurs d'un changement.
     */
    public void notifierObservateur();
}
