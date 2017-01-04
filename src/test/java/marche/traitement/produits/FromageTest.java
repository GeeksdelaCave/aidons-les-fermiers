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
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @see Fromage
 * @see Fromagerie
 *
 * @version 1.5
 */
public class FromageTest {

    Fromagerie fromagerie = new Fromagerie(150,"Alsace");
    Fromage fromageNonPerime = new Fromage(20.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55.0, "Fromagedechevre",3.0f, fromagerie);
    Fromage fromagePerime    = new Fromage(20.0f, LocalDate.of(2000, Month.NOVEMBER, 28), (short) 55.0, "Fromagedechevre",3.0f, fromagerie);

    /**
     * Test du nom d'un fromage
     */
    @Test
    public void testGetNomFromage() {
        assertTrue(fromageNonPerime.getNomFromage() == "Fromagedechevre");
    }

    /**
     * Test du poids d'un fromage
     */
    @Test
    public void testGetPoidsFromage() {
        assertTrue(fromageNonPerime.getPoidsFromage() == 3.0f);
    }

    /**
     * Test du prix du fromage
     */
    @Test
    public void testGetPrix() {
        assertTrue(fromageNonPerime.getPrix() == 20.0f);
    }

    /**
     * Test de la date de péremption du fromage
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), fromageNonPerime.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), fromagePerime.getDatePeremption());
    }

    /**
     * Test de la qualité du fromage
     */
    @Test
    public void testGetQualite() {
        assertEquals(55, fromageNonPerime.getQualite());
    }

    /**
     * Test de l'unité de production du fromage
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(fromagerie, fromageNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si le fromage est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(fromageNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(fromagePerime.isCommercialisable());
    }
}