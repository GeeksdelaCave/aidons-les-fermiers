package marche.traitement.produits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Ruche;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * MielTest désigne les tests unitaires effectués sur la classe Miel
 *
 * @author Romain COLONNA D'ISTRIA
 *
 * @see Miel
 * @see Ruche
 *
 * @version 1.5
 */
public class MielTest {

    Ruche ruche = new Ruche(20,"Loire");
    Miel mielNonPerime = new Miel(15.0f, LocalDate.of(2100, Month.NOVEMBER,28), (short) 75, 5.0f,"Mieldechataignier", ruche);
    Miel mielPerime    = new Miel(15.0f, LocalDate.of(2000, Month.NOVEMBER,28), (short) 75, 5.0f,"Mieldechataignier", ruche);

    /**
     * Teste le poids d'un seau de miel
     */
    @Test
    public void testGetPoidsSeauMiel() {
        assertTrue(mielNonPerime.getPoidsSeauMiel() == 5.0f);
    }

    /**
     * Test du type de miel
     */
    @Test
    public void testGetTypeMiel() {
        assertTrue(mielNonPerime.getTypeDeMiel() == "Mieldechataignier");
    }

    /**
     * Test du prix du seau de miel
     */
    @Test
    public void testGetPrixSeauMiel() {
        assertTrue(mielNonPerime.getPrix() == 15.0f);
    }

    /**
     * Test la date de péremption d'un seau de miel
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER,28), mielNonPerime.getDatePeremption());
    }

    /**
     * Test de l'exception ProduitPerimeException lors de l'accès a la date de péremption
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() {
        assertEquals(LocalDate.of(2000, Month.NOVEMBER,28), mielPerime.getDatePeremption());
    }

    /**
     * Test de la qualité d'un seau de miel
     */
    @Test
    public void testGetQualite() {
        assertTrue(mielNonPerime.getQualite() == (short) 75);
    }

    /**
     * Test l'unité de production d'une seau de miel
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(ruche, mielNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si le seau de miel est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(mielNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(mielPerime.isCommercialisable());
    }
}
