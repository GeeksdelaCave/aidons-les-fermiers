package marche.traitement.produits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.label.LabelIGPTest;
import marche.traitement.production.Fromagerie;
import marche.traitement.production.Laiterie;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * LaitTest désigne le test unitaire effectué sur la classe Lait sur tous ces getter() crées
 * @version 1.4
 */
public class LaitTest {
    /**
     * Test de l'identifiant d'un pack de lait
     */
    @Test
    public void testGetIdPackLait() {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertTrue(lait.getIdPackLait() == 1100);
    }

    /**
     * Test du poids d'un pack de lait
     */
    @Test
    public void testGetPoidsPackLait() {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertTrue(lait.getPoidsPackLait() == 3.0f);
    }

    /**
     * Test du prix du pack de lait
     */
    @Test
    public void testGetPrix() {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertTrue(lait.getPrix() == 20.0f);
    }

    /**
     * Test de la date de péremption du pack de lait
     */
    @Test
    public void testGetDatePeremption() {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 30), lait.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), lait.getDatePeremption());
    }

    /**
     * Test de la qualité du pack de lait
     */
    @Test
    public void testGetQualite() {
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertEquals(55, lait.getQualite());
    }

    /**
     * Test de l'unité de production du pack de lait
     */
    @Test
    public void testGetUniteDeProduction() {
        Fromagerie fromagerie = new Fromagerie(150, "Alsace");
        Lait lait = new Lait(10.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1300,3.0f, new Laiterie(30,"Paris"));
        assertSame(fromagerie, lait.getUniteDeProduction());
    }
}