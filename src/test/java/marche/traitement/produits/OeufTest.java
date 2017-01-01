package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Poulailler;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class OeufTest {

    /**
     * Test de l'identifiant d'un pack d'oeuf
     */
    @Test
    public void testGetIdPackOeuf() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, new Poulailler(100, "PACA"));
        assertTrue(oeuf.getIdPackOeuf() == 100);
    }

    /**
     * Test du prix d'un pack d'oeuf
     */
    @Test
    public void testGetPrix() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, new Poulailler(100, "PACA"));
        assertTrue(oeuf.getPrix() == 3.8f);
    }

    /**
     * Test de la date de péremption d'un pack d'oeuf
     */
    @Test
    public void testGetDatePeremption() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2100, Month.DECEMBER, 28), (short) 50, new Poulailler(100, "PACA"));
        assertEquals(LocalDate.of(2100, Month.DECEMBER, 28), oeuf.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés à la date de péremption
     *
     * @see ProduitPerimeException
     */
    /*
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, new Poulailler(100, "PACA"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), oeuf.getDatePeremption());
    }
    */

    /**
     * Test de la qualité d'un pack d'oeuf
     */
    @Test
    public void testGetQualite() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, new Poulailler(100, "PACA"));
        assertEquals(50, oeuf.getQualite());
    }

    /**
     * Test de l'unité de production d'un pack d'oeuf
     */
    @Test
    public void testGetUniteDeProduction() {
        Poulailler poulailler = new Poulailler(65432, "PACA");
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, poulailler);
        assertSame(poulailler, oeuf.getUniteDeProduction());
    }

    /**
     * Teste si le pack d'oeuf est commercialisable
     */
    @Test
    public void testGetIsCommercialise() throws ProduitPerimeException {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2100, Month.DECEMBER, 31), (short) 50, new Poulailler(100, "PACA"));
        assertTrue(oeuf.isCommercialisable());
    }
}