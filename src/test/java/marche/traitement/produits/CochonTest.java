package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.EnclosCochon;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

/**
 * CochonTest désigne les test unitaires effectués sur la classe Cochon
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.6
 * @see Cochon
 * @see EnclosCochon
 */
public class CochonTest {

    EnclosCochon encloCochon = new EnclosCochon(150,"Alsace");
    Cochon cochonNonPerime = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", encloCochon);
    Cochon cochonPerime    = new Cochon(150.0f, LocalDate.of(2000, Month.NOVEMBER, 28), (short) 55, 5.0f, "Cochondelait", encloCochon);

    /**
     * Teste le poids d'un cochon
     */
    @Test
    public void testGetPoidsCochon() {
        assertTrue(cochonNonPerime.getPoidsCochon() == 5.0f);
    }

    /**
     * Teste le type de cochon
     */
    @Test
    public void testGetTypeCochon() {
        assertEquals("Cochondelait", cochonNonPerime.getTypeDeCochon());
    }

    /**
     * Teste le prix du cochon
     */
    @Test
    public void testGetPrix() {
        assertTrue(cochonNonPerime.getPrix() == 150.0f);
    }

    /**
     * Teste la date de péremption du cochon
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), cochonNonPerime.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 30), cochonPerime.getDatePeremption());
    }

    /**
     * Teste la qualité du cochon
     */
    @Test
    public void testGetQualite() {
        assertEquals(55, cochonNonPerime.getQualite());
    }

    /**
     * Teste l'unité de production du cochon
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(encloCochon, cochonNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si le cochon est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(cochonNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(cochonPerime.isCommercialisable());
    }
}