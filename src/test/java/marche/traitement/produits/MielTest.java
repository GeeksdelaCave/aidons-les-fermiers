package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * MielTest désigne les tests unitaires effectués sur la classe Miel
 * @version 1.2
 */
public class MielTest {
    /**
     * Teste l'identifiant d'un seau de miel
     */
    @Test
    public void testGetIdMiel()
    {
        Miel miel = new Miel(15.0f,LocalDate.of(2016, Month.NOVEMBER,30),(short) 55.0, "Vosges", 1000,5.0f,"Mieldechataignier");
        assertTrue(miel.getIdSeauMiel() == 1000);
    }

    /**
     * Teste le poids d'un seau de miel
     */
    @Test
    public void testGetPoidsSeauMiel()
    {
        Miel miel = new Miel(15.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0, "Vosges", 1000,5.0f,"Mieldechataignier");
        assertTrue(miel.getPoidsSeauMiel() == 5.0f);
    }

    /**
     * Teste le type d'un seau de miel
     */
    @Test
    public void testGetTypeMiel()
    {
        Miel miel = new Miel(15.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0, "Vosges", 1000,5.0f,"Mieldechataignier");
        assertTrue(miel.getTypeDeMiel() == "Mieldechataignier");
    }
}
