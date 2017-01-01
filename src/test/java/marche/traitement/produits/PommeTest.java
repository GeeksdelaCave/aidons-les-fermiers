package marche.traitement.produits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import marche.traitement.exceptions.ProduitPerimeException;

import marche.traitement.production.Verger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;


/**
 * PommeTest désigne le test unitaire effectué sur la classe Pomme sur tous ces getter() crées
 * @version 1.6
 */
public class PommeTest {

    /**
     * Teste l'identifiant de la cagette de pomme
     */
    @Test
    public void testGetIdCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getIdCagette() == 1000);
    }

    /**
     * Teste le poids de la cagette de pomme
     */
    @Test
    public void testGetPoidsCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getPoidsCagette() == 10);
    }

    /**
     * Teste le type de pomme
     */
    @Test
    public void testGetTypePomme()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10, "Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getTypePomme().equals("Reinette"));
    }

    /**
     * Teste le nombre de pommes dans une cagette
     */
    @Test
    public void testGetNbPommes()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10, "Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.getNbPommes() == 8);

    }

    /**
     * Test de la date de péremption d'une cagette de pomme
     */
    @Test
    public void testGetDatePeremption() {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, new Verger(50,"Normandie"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), pomme.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés à la date de péremption
     *
     * @see ProduitPerimeException
     */
    /*
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, new Verger(50,"Normandie"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), pomme.getDatePeremption());
    }
    */

    /**
     * Test de la qualité d'une cagette de pomme
     */
    @Test
    public void testGetQualite() {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, new Verger(50,"Normandie"));
        assertEquals(pomme.getQualite(), 55);
    }

    /**
     * Test de l'unité de production d'une cagette de pomme
     */
    @Test
    public void testGetUniteDeProduction() {
        Verger verger = new Verger(65000, "PACA");
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55,  10,"Reinette",8, verger);
        assertSame(verger, pomme.getUniteDeProduction());
    }

    /**
     * Teste si la cagette de pomme est commercialisable
     */
    @Test
    public void testGetIsCommercialise() throws ProduitPerimeException {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55,  10, "Reinette",8, new Verger(50,"Normandie"));
        assertTrue(pomme.isCommercialisable());
    }

}