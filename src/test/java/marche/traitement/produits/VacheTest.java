package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * VacheTest désigne le test unitaire effectué sur la classe Vache sur tous ces getter() crées
 * @version 1.0
 */
public class VacheTest {

    /**
     * Teste le prix de la vache
     */
    @Test
    public void getPrix()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.getPrix() == 150.0f);
    }

    /**
     * Teste la date de peremption de la vache
     */
    @Test
    public void getDatePeremption()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        LocalDate ld = LocalDate.of(2016, Month.NOVEMBER,28);
        assertTrue(vache.getDatePeremption().equals(ld));
    }

    /**
     * Teste la valeur de la qualité de la vache
     */
    @Test
    public void getQualite()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.getQualite() == (short) 55.0);
    }

    /**
     * Teste si la vache est commercialisable
     */
    @Test
    public void getIsCommercialise()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.isCommercialise() == true);
    }

    /**
     * Teste l'identifiant de la vache
     */
    @Test
    public void getIdVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.getIdVache() == 1200);
    }

    /**
     * Teste le nom de la vache
     */
    @Test
    public void getNomVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.getNomVache() == "vachetest");
    }

    /**
     * Teste le poids de la vache
     */
    @Test
    public void getPoidsVache()
    {
        Vache vache = new Vache(150.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1200,"vachetest",50.0f);
        assertTrue(vache.getPoidsVache() == 50.0f);
    }
}
