package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Etable;
import org.junit.Test;

import java.security.PublicKey;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 *
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.8
 */
public class VacheTest {

    Etable etable = new Etable(30,"Aquitaine");
    Vache vacheNonPerime = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, "vachetest",50.0f, etable);
    Vache vachePerime    = new Vache(150.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55, "vachetest",50.0f, etable);

    /**
     * Teste le nom de la vache
     */
    @Test
    public void testGetNomVache() {
        assertTrue(vacheNonPerime.getNomVache() == "vachetest");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void testGetPoidsVache() {
        assertTrue(vacheNonPerime.getPoidsVache() == 50.0f);
    }

    /**
     * Teste le prix de la vache
     */
    @Test
    public void testGetPrix() {
        assertTrue(vacheNonPerime.getPrix() == 150.0f);
    }

    /**
     * Teste la date de peremption de la vache
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption() {
        LocalDate ld = LocalDate.of(2000, Month.NOVEMBER,28);
        assertEquals(vachePerime.getDatePeremption(), ld);
    }

    /**
     * Teste l'exception ProduitPerimeException lors de l'accès a la date de péremption
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() {
        assertEquals(LocalDate.of(2000, Month.NOVEMBER,28), vachePerime.getDatePeremption());
    }

    /**
     * Teste la valeur de la qualité de la vache.
     */
    @Test
    public void testGetQualite() {
        assertTrue(vacheNonPerime.getQualite() == (short) 55.0);
    }

    /**
     * Test l'unité de production d'une vache
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(etable, vacheNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si la vache est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(vacheNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(vachePerime.isCommercialisable());
    }
}