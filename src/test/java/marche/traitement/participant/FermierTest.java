package marche.traitement.participant;

import marche.traitement.exceptions.SoldeNonDisponibleException;
import org.junit.Test;

public class FermierTest {

    @Test
    /**
     * Test du solde du trader avec le bon type
     */
    public void testDuSoldeDuFermier() {
        Acteur fermier = new Fermier();
        fermier.ajouterSolde(50.0);

        assert fermier.getSolde() == 50.0;
    }

    @Test
    /**
     * Test du solde du trader avec un int (test du cast implicite)
     */
    public void testDuSoldeDuFermierAvecInt() {
        Acteur fermier = new Fermier();
        fermier.ajouterSolde(50);

        assert fermier.getSolde() == 50.0;
    }

    @Test(expected = SoldeNonDisponibleException.class)
    /**
     * Test d'enlever du solde supérieur à ce qui est possible : soulève une exception SoldeNonDisponibleException
     */
    public void testEnleverSolde() throws SoldeNonDisponibleException {
        Acteur fermier = new Fermier();
        fermier.ajouterSolde(30.0);
        fermier.enleverSolde(50.0);
    }
}
