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
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.5
 * @see Cochon
 * @see EnclosCochon
 */
public class CochonTest {

    /**
     * Teste l'identifiant d'un cochon
     */
    @Test
    public void testGetIdCochon() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f, "Cochondelait", new EnclosCochon(150, "Alsace"));
        assertEquals(2000, cochon.getIdCochon()); //car idCochonGeneral = 1 initialement
    }

    /**
     * Teste le poids d'un cochon
     */
    @Test
    public void testGetPoidsCochon() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f,"Cochondelait", new EnclosCochon(150,"Alsace"));
        assertTrue(cochon.getPoidsCochon() == 5.0f);
    }

    /**
     * Teste le type de cochon
     */
    @Test
    public void testGetTypeCochon() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f, "Cochondelait", new EnclosCochon(150,"Alsace"));
        assertEquals("Cochondelait", cochon.getTypeDeCochon());
    }

    /**
     * Teste le prix du cochon
     */
    @Test
    public void testGetPrix() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f, "Cochondelait", new EnclosCochon(150,"Alsace"));
        assertTrue(cochon.getPrix() == 150.0f);
    }

    /**
     * Teste la date de péremption du cochon
     */
    @Test
    public void testGetDatePeremption() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2100, Month.NOVEMBER, 30), (short) 55, 5.0f,"Cochondelait", new EnclosCochon(150,"Alsace"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 30), cochon.getDatePeremption());
    }

    /**
     * Teste de l'exception ProduitPerimeException lors de l'accés a la date de péremption
     *
     * @see ProduitPerimeException
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption_ProduitPerimeException() throws ProduitPerimeException {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2000, Month.NOVEMBER, 30), (short) 55, 5.0f,"Cochondelait", new EnclosCochon(150,"Alsace"));
        assertEquals(LocalDate.of(2100, Month.NOVEMBER, 30), cochon.getDatePeremption());
    }

    /**
     * Teste la qualité du cochon
     */
    @Test
    public void testGetQualite() {
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f,"Cochondelait", new EnclosCochon(150,"Alsace"));
        assertEquals(55, cochon.getQualite());
    }

    /**
     * Teste l'unité de production du cochon
     */
    @Test
    public void testGetUniteDeProduction() {
        EnclosCochon encloCochon = new EnclosCochon(150,"Alsace");
        Cochon cochon = new Cochon(150.0f, LocalDate.of(2016, Month.NOVEMBER, 30), (short) 55, 5.0f, "Cochondelait", encloCochon);
        assertSame(encloCochon, cochon.getUniteDeProduction());
    }
}