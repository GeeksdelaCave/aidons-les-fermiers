package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 * @version 1.3
 */
public class VacheTest {

    /**
     * Teste le prix de la vache
     */
    @Test
    public void testGetPrix()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getPrix() == 150.0f);
    }

    /**
     * Teste la date de peremption de la vache
     */
    @Test
    public void testGetDatePeremption()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        LocalDate ld = LocalDate.of(2016, Month.NOVEMBER,28);
        assertTrue(vache.getDatePeremption().equals(ld));
    }

    /**
     * Teste la valeur de la qualité de la vache
     */
    @Test
    public void testGetQualite()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getQualite() == (short) 55.0);
    }

    /**
     * Teste si la vache est commercialisable
     */
    @Test
    public void testGetIsCommercialise()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.isCommercialisable() == true);

        Vache vache1 = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 20.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache1.isCommercialisable() == false);
    }

    /**
     * Teste le lieu de création de la vache
     */
    @Test
    public void testGetLieuCreation()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getLieuCreation().equals("Landes"));

    }
    /**
     * Teste l'identifiant de la vache
     */
    @Test
    public void testGetIdVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getIdVache() == 1200);
    }

    /**
     * Teste le nom de la vache
     */
    @Test
    public void testGetNomVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,"Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getNomVache() == "vachetest");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void testGetPoidsVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0, "Landes", 1200,"vachetest",50.0f);
        assertTrue(vache.getPoidsVache() == 50.0f);
    }
}
