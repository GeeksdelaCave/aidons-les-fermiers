package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import org.junit.Test;

public class TraderTest {

    @Test
    /**
     * Test du solde du trader avec le bon type
     */
    public void testDuSoldeDuTrader() {
        Acteur trader = new Trader();
        trader.ajouterSolde(50.0);

        assert trader.getSolde() == 50.0;
    }

    @Test
    /**
     * Test du solde du trader avec un int (test du cast implicite)
     */
    public void testDuSoldeDuTraderAvecInt() {
        Acteur tradeur = new Trader();
        tradeur.ajouterSolde(50);

        assert tradeur.getSolde() == 50.0;
    }

    @Test(expected = SoldeNonDisponibleException.class)
    /**
     * Test d'enlever du solde, supérieur à ce qui est possible
     */
    public void testEnleverSolde() throws SoldeNonDisponibleException {
        Acteur trader = new Trader();
        trader.ajouterSolde(30.0);
        trader.enleverSolde(50.0);
    }
}
