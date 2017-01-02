package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Fromagerie;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

/**
 * FromageTest désigne les tests unitaires effectués sur la classe Fromage
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.4
 */
public class FromageTest {
    /**
     * Test de l'identifiant d'un fromage
     */
    @Test
    public void testGetIdFromage()
    {
        Fromage fromage = new Fromage(20.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55.0, "Fromagedechevre",3.0f,new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getIdFromage() == 1000);
    }

    /**
     * Test du nom d'un fromage
     */
    @Test
    public void testGetNomFromage()
    {
        Fromage fromage = new Fromage(20.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55.0, "Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getNomFromage() == "Fromagedechevre");
    }

    /**
     * Test du poids d'un fromage
     */
    @Test
    public void testGetPoidsFromage()
    {
        Fromage fromage = new Fromage(20.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55.0, "Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getPoidsFromage() == 3.0f);
    }

    /**
     * Test du prix du fromage
     */
    @Test
    public void testGetPrix() {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertTrue(fromage.getPrix() == 20.0f);
    }

    /**
     * Test de la date de péremption du fromage
     */
    @Test
    public void testGetDatePeremption() {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2100, Month.NOVEMBER,30), (short) 55.0,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 30), fromage.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), fromage.getDatePeremption());
    }

    /**
     * Test de la qualité du fromage
     */
    @Test
    public void testGetQualite() {
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,"Fromagedechevre",3.0f, new Fromagerie(50,"Normandie"));
        assertEquals(55, fromage.getQualite());
    }

    /**
     * Test de l'unité de production du fromage
     */
    @Test
    public void testGetUniteDeProduction() {
        Fromagerie fromagerie = new Fromagerie(150,"Alsace");
        Fromage fromage = new Fromage(20.0f,LocalDate.of(2016, Month.NOVEMBER,30), (short) 55.0,"Fromagedechevre",3.0f, fromagerie);
        assertSame(fromagerie, fromage.getUniteDeProduction());
    }
}