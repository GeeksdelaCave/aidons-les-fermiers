package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import marche.traitement.production.Etable;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertTrue;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 *
 * @author Thibaud CENENT
 * @author Tristan DIETZ
 *
 * @version 1.7
 */
public class VacheTest {

    /**
     * Teste le prix de la vache
     */
    @Test
    public void testGetPrix()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        assertTrue(vache.getPrix() == 150.0f);
    }

    /**
     * Teste la date de peremption de la vache
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetDatePeremption()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        LocalDate ld = LocalDate.of(2016, Month.NOVEMBER,28);
        assertTrue(vache.getDatePeremption().equals(ld));
    }

    /**
     * Teste la valeur de la qualité de la vache
     */
    @Test
    public void testGetQualite()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        assertTrue(vache.getQualite() == (short) 55.0);
    }

    /**
     * Teste si la vache est commercialisable et que l'exception est bien géré
     */
    @Test (expected = ProduitPerimeException.class)
    public void testGetIsCommercialise() throws ProduitPerimeException {
        Vache vache = new Vache(150.0f,LocalDate.of(2000, Month.NOVEMBER,28), (short) 55, "vachetest",50.0f, new Etable(1245, "PACA"));
        assertTrue(vache.isCommercialisable());
    }


    /**
     * Teste l'identifiant de la vache
     */
    @Test
    public void testGetIdVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        assertTrue(vache.getIdVache() == 3000 || vache.getIdVache() == 3005); //car idVacheGeneral = 3000;
    }

    /**
     * Teste le nom de la vache
     */
    @Test
    public void testGetNomVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        assertTrue(vache.getNomVache() == "vachetest");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void testGetPoidsVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2100, Month.NOVEMBER,28), (short) 55.0, "vachetest",50.0f, new Etable(30,"Aquitaine"));
        assertTrue(vache.getPoidsVache() == 50.0f);
    }
}
