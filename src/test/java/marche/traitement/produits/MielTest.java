package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Ruche;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

/**
 * MielTest désigne les tests unitaires effectués sur la classe Miel
 * @version 1.4
 */
public class MielTest {

    /**
     * Test de l'identifiant d'un pot de miel
     */
    @Test
    public void testGetIdPotMiel() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER, 28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertTrue(potMiel.getIdSeauMiel() == 1500);
    }

    /**
     * Test du poids d'un pot de miel
     */
    @Test
    public void testGetPoidsPotMiel() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER, 28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertTrue(potMiel.getPoidsSeauMiel() == 0.2f);
    }

    /**
     * Test du type d'un pot de miel
     */
    @Test
    public void testGetTypeDeMiel() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER, 28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertEquals(potMiel.getTypeDeMiel(), "Abeille");
    }

    /**
     * Test du prix d'un pot de miel
     */
    @Test
    public void testGetPrix() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER, 28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertTrue(potMiel.getPrix() == 10.0f);
    }

    /**
     * Test de la date de péremption du pot de miel
     */
    @Test
    public void testGetDatePeremption() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2100, Month.NOVEMBER, 28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 28), potMiel.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés à la date de péremption
     *
     * @see ProduitPerimeException
     */
    /*
    @Test(expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER, 18), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertEquals(LocalDate.of(2016, Month.NOVEMBER, 30), potMiel.getDatePeremption());
    }
    */

    /**
     * Test de la qualité du pot de miel
     */
    @Test
    public void testGetQualite() {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertEquals(55, potMiel.getQualite());
    }

    /**
     * Test de l'unité de production du pot de miel
     */
    @Test
    public void testGetUniteDeProduction() {
        Ruche ruche = new Ruche(150, "Alsace");
        Miel potMiel = new Miel(10.0f, LocalDate.of(2016, Month.NOVEMBER,28), (short) 55, 0.2f, "Abeille", ruche );
        assertSame(ruche, potMiel.getUniteDeProduction());
    }

    /**
     * Teste si le pot de miel est commercialisable
     */
    @Test
    public void testGetIsCommercialise() throws ProduitPerimeException {
        Miel potMiel = new Miel(10.0f, LocalDate.of(2100, Month.NOVEMBER,28), (short) 55, 0.2f, "Abeille", new Ruche(30, "PACA"));
        assertTrue(potMiel.isCommercialisable());
    }
}
