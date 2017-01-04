package marche.traitement.participant;

import marche.traitement.cotisation.CotisationGenerale;
import org.junit.Test;

/**
 * Tests unitaire de la classe ProducteurDeViande
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 *
 * @see ProducteurDeViande
 */
public class ProducteurDeViandeTest {

    /**
     * Test du nouveau solde du producteur de viande après prélévement de la cotisation
     */
    @Test
    public void testNewSoldeProducteurdeViande() {
        // TODO essayer de le prendre en considération avec enleverSolde() car renvoie pour ma part quand test AssertionError
        ProducteurDeViande producteurDeViande = new ProducteurDeViande(null,null,150.0);
        double cotisationAPayer = producteurDeViande.payerCotisation(new CotisationGenerale());
        assert (producteurDeViande.getSolde() - cotisationAPayer ) == 147.0;
    }
}
