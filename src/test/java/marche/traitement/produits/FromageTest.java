package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import marche.traitement.production.Fromagerie;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * FromageTest désigne les tests unitaires effectués sur la classe Fromage
 * @version 1.3
 */
public class FromageTest {
    /**
     * Teste l'identifiant d'un fromage
     */
    @Test
    public void testGetIdFromage()
    {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0, 1100,"Fromagedechevre",3.0f,new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getIdFromage() == 1100);
    }

    /**
     * Teste le nom d'un fromage
     */
    @Test
    public void testGetNomFromage()
    {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,  1100,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getNomFromage() == "Fromagedechevre");
    }

    /**
     * Teste le poids d'un fromage
     */
    @Test
    public void testGetPoidsFromage()
    {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0, 1100,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getPoidsFromage() == 3.0f);
    }
}
