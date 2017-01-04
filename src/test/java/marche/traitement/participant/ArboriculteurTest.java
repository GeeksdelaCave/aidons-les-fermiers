package marche.traitement.participant;

import marche.traitement.cotisation.CotisationGenerale;
import marche.traitement.exceptions.SoldeNonDisponibleException;
import org.junit.Test;

/**
 * Tests unitaire de la classe Arboriculteur
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 *
 * @see Arboriculteur
 */
public class ArboriculteurTest {

    /**
     * Test du nouveau solde de l'arboriculteur après prélévement de la cotisation
     */
    @Test
    public void testNewSoldeArboriculteur() throws SoldeNonDisponibleException {
        try {
            Arboriculteur arboriculteur = new Arboriculteur(null, null, 200.0);
            double cotisationAPayer = arboriculteur.payerCotisation(new CotisationGenerale());
            arboriculteur.enleverSolde(cotisationAPayer);
            assert arboriculteur.getSolde() == 190.0;
        }
        catch (SoldeNonDisponibleException snde){
            snde.printStackTrace();
        }
    }
}
