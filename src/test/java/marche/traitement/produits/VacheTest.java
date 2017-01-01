package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Etable;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 * @version 1.5
 */
public class VacheTest {

    /**
     * Teste l'identifiant de la vache
     */
    @Test
    public void testGetIdVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertTrue(vache.getIdVache() == 3000);
    }

    /**
     * Teste le nom de la vache
     */
    @Test
    public void testGetNomVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertEquals(vache.getNomVache(), "Catherine");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void testGetPoidsVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertTrue(vache.getPoidsVache() == 250);
    }

    /**
     * Teste le prix de la vache
     */
    @Test
    public void testGetPrix()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine", 250, new Etable(30,"Aquitaine"));
        assertTrue(vache.getPrix() == 150.0f);
    }

    /**
     * Test de la date de péremption d'une vache
     */
    @Test
    public void testGetDatePeremption() {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), vache.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés à la date de péremption
     *
     * @see ProduitPerimeException
     */
    /*
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  1200, new Etable(30,"Aquitaine"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), vache.getDatePeremption());
    }
    */

    /**
     * Test de la qualité d'une vache
     */
    @Test
    public void testGetQualite() {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertEquals(vache.getQualite(), 55);
    }

    /**
     * Test de l'unité de production d'une vache
     */
    @Test
    public void testGetUniteDeProduction() {
        Etable etable = new Etable(100, "PACA");
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, "Catherine",  250, etable);
        assertSame(etable, vache.getUniteDeProduction());
    }

    /**
     * Teste si la vache est commercialisable
     */
    @Test
    public void testGetIsCommercialise() throws ProduitPerimeException {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, "Catherine",  250, new Etable(30,"Aquitaine"));
        assertTrue(vache.isCommercialisable());
    }

}