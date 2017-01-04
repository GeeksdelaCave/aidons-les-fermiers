package marche.traitement.cotisation;

/**
 * Interface permettant de gérer le payement de la cotisation d'un fermier.
 * @author Thibaud CENENT
 * @version 1.1
 */
public interface Visitable {

    /**
     *
     * @param cotisation désigne la cotisation que va devoir payer un fermier en fonction de ses caractéristiques.
     * @return le solde du fermier qui a été crédité de la cotisation.
     */
    public void payerCotisation(Cotisation cotisation);
}
