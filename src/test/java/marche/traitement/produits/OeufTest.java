package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Poulailler;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

/**
 * Classe test de la classe Oeuf
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @see Oeuf
 * @see Poulailler
 *
 * @version 1.3
 */
public class OeufTest {


    Poulailler poulailler = new Poulailler(50,"Normandie");
    Oeuf oeufNonPerime = new Oeuf(20.0f, LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, poulailler);
    Oeuf oeufPerime    = new Oeuf(20.0f, LocalDate.of(2000, Month.NOVEMBER,28), (short) 55, poulailler);

    /**
     * Test du prix d'un pack d'oeuf
     */
    @Test
    public void testGetPrix() {
        assertTrue(oeufNonPerime.getPrix() == 20.0f);
    }

    /**
     * Test la date de péremption d'un pack d'oeuf
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER,28), oeufNonPerime.getDatePeremption());
    }

    /**
     * Test de l'exception ProduitPerimeException lors de l'accès a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() {
        assertEquals(LocalDate.of(2000, Month.NOVEMBER,28), oeufPerime.getDatePeremption());
    }

    /**
     * Test de la qualité d'unpack d'oeuf
     */
    @Test
    public void testGetQualite() {
        assertTrue(oeufNonPerime.getQualite() == (short) 55);
    }

    /**
     * Test l'unité de production d'un pack d'oeuf
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(poulailler, oeufNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si le pack d'oeuf est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(oeufNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(oeufPerime.isCommercialisable());
    }
}