package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import org.junit.Test;

/** Tests unitaire de la classe Trader
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Nicolas Guigou
 *
 * @see Decorateur
 *
 * @version 1.0
 */
public class TraderTest {

    /**
     * Test du solde du trader avec le bon type
     */
    @Test
    public void testDuSoldeDuTrader() {
        Acteur trader = new Trader();
        trader.ajouterSolde(50.0);

        assert trader.getSolde() == 50.0;
    }

    /**
     * Test du solde du trader avec un int (test du cast implicite)
     */
    @Test
    public void testDuSoldeDuTraderAvecInt() {
        Acteur tradeur = new Trader();
        tradeur.ajouterSolde(50);

        assert tradeur.getSolde() == 50.0;
    }

    /**
     * Test d'enlever du solde, supérieur à ce qui est possible
     */
    @Test(expected = SoldeNonDisponibleException.class)
    public void testEnleverSolde() throws SoldeNonDisponibleException {
        Acteur trader = new Trader();
        trader.ajouterSolde(30.0);
        trader.enleverSolde(50.0);
    }
}
