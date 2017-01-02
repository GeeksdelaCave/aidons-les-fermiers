package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Etable;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 *
 *
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.7
 */
public class VacheTest {

    Vache vache1 = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
    Vache vache2 = new Vache(150.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));

    /**
     * Teste le prix de la vache
     */
    @Test
    public void testGetPrix() {
        assertTrue(vache1.getPrix() == 150.0f);
    }

    /**
     * Teste la date de peremption de la vache
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption() {
        LocalDate ld = LocalDate.of(2000, Month.NOVEMBER,28);
        assertEquals(vache2.getDatePeremption(), ld);
    }

    /**
     * Teste la valeur de la qualité de la vache
     */
    @Test
    public void testGetQualite() {
        assertTrue(vache1.getQualite() == (short) 55.0);
    }

    /**
     * Teste si la vache est commercialisable et que l'exception est bien géré
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise() throws ProduitPerimeException {
        assertTrue(vache2.isCommercialisable());
    }


    /**
     * Teste l'identifiant de la vache
     */
    @Test
    public void testGetIdVache() {
        assertTrue(vache1.getIdVache() == 3000 || vache1.getIdVache() == 3800);
    }

    /**
     * Teste le nom de la vache
     */
    @Test
    public void testGetNomVache() {
        assertTrue(vache1.getNomVache() == "vachetest");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void testGetPoidsVache() {
        assertTrue(vache1.getPoidsVache() == 50.0f);
    }
}
