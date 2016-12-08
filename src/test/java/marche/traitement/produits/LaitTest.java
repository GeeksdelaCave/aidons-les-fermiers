package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * LaitTest désigne le test unitaire effectué sur la classe Lait sur tous ces getter() crées
 * @version 1.3
 */
public class LaitTest {
    /**
     * Teste l'identifiant du pack de lait
     */
    @Test
    public void testGetIdLait()
    {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f);
        assertTrue(lait.getIdPackLait() == 1300);
    }

    /**
     * Teste le poids du pack de lait
     */
    @Test
    public void testGetPoidsPackLait()
    {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, 1300,3.0f);
        assertTrue(lait.getPoidsPackLait() == 3.0f);
    }

}
