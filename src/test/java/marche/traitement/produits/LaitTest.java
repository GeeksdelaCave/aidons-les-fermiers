package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Fromagerie;
import marche.traitement.production.Laiterie;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

/**
 * LaitTest désigne le test unitaire effectué sur la classe Lait sur tous ces getter() crées
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.5
 */
public class LaitTest {

    Laiterie laiterie = new Laiterie(150, "Alsace");
    Lait laitNonPerime = new Lait(10.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0,3.0f, laiterie);
    Lait laitPerime    = new Lait(10.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55.0,3.0f, laiterie);

    /**
     * Test de l'identifiant d'un pack de lait.
     * La première condition sert pour quand le test est lancé seul, la seconde
     * pour quand tout les tests sont lancés ensembles.
     */
    @Test
    public void testGetIdPackLait() {
        assertTrue(laitNonPerime.getIdPackLait() == 1300 || laitNonPerime.getIdPackLait() == 2700); //Car 13 autres pack de lait instancié
    }

    /**
     * Test du poids d'un pack de lait
     */
    @Test
    public void testGetPoidsPackLait() {
        assertTrue(laitNonPerime.getPoidsPackLait() == 3.0f);
    }

    /**
     * Test du prix du pack de lait
     */
    @Test
    public void testGetPrix() {
        assertTrue(laitNonPerime.getPrix() == 10.0f);
    }

    /**
     * Test de la date de péremption du pack de lait
     */
    @Test
    public void testGetDatePeremption() {
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), laitNonPerime.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), laitPerime.getDatePeremption());
    }

    /**
     * Test de la qualité du pack de lait
     */
    @Test
    public void testGetQualite() {
        assertEquals(55, laitNonPerime.getQualite());
    }

    /**
     * Test de l'unité de production du pack de lait
     */
    @Test
    public void testGetUniteDeProduction() {
        assertSame(laiterie, laitNonPerime.getUniteDeProduction());
    }

    /**
     * Teste si le pack de lait est commercialisable
     */
    @Test
    public void testGetIsCommercialise() {
        assertTrue(laitNonPerime.isCommercialisable());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de la vérification pour la commercialisation
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise_ProduitPerimeException() throws ProduitPerimeException {
        assertTrue(laitPerime.isCommercialisable());
    }
}