package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * CochonTest désigne les test unitaires effectués sur la classe Cochon
 * @version 1.0
 */

public class CochonTest {
    /**
     * Teste l'identifiant d'un cochon
     */
    @Test
    public void testGetIdCochon()
    {
        Cochon cochon = new Cochon(150.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,1200,5.0f,"Cochondelait");
        assertTrue(cochon.getIdCochon() == 1200);
    }

    /**
     * Teste le poids d'un cochon
     */
    @Test
    public void testGetPoidsCochon()
    {
        Cochon cochon = new Cochon(150.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,1200,5.0f,"Cochondelait");
        assertTrue(cochon.getPoidsCochon() == 5.0f);
    }

    /**
     * Teste le type de cochon
     */
    @Test
    public void testGetTypeCochon()
    {
        Cochon cochon = new Cochon(150.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,1200,5.0f,"Cochondelait");
        assertTrue(cochon.getTypeDeCochon() == "Cochondelait");
    }
}
