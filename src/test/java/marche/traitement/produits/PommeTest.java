package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import marche.traitement.production.Verger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
/**
 * PommeTest désigne le test unitaire effectué sur la classe Pomme sur tous ces getter() crées
 * @version 1.5
 */
public class PommeTest {
    /**
     * Teste l'identifiant de la cagette
     */
    @Test
    public void testGetIdCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,  1500,6.0f,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getIdCagette() == 1500);
    }

    /**
     * Teste le poids de la cagette
     */
    @Test
    public void testGetPoidsCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,  1500,6.0f,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getPoidsCagette() == 6.0f);
    }

    /**
     * Teste le type de pomme
     */
    @Test
    public void testGetTypePomme()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,  1500,6.0f,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getTypePomme().equals("Reinette"));
    }

    /**
     * Teste le nbre de pommes dans une cagette
     */
    @Test
    public void testGetNbPommes()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,  1500,6.0f,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getNbPommes() == 8);

    }

}
