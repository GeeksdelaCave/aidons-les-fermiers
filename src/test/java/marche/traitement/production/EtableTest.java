package marche.traitement.production;

import marche.traitement.produits.Vache;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Etable
 * @author Romain COLONNA D'ISTRIA
 */
public class EtableTest {

    @Test
    public void testCreerVache () {
        Etable etable = new Etable(100, "PACA");
        Vache vache = etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Jean-Luc", 245);

        assert (vache != null);
    }

    @Test
    public void testCreerVachee_IdvacheEgal3000 () {
        Etable etable = new Etable(100, "PACA");
        Vache vache = etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Roquefort", 245);

        assert (vache.getIdVache() == 3000);
    }

    @Test
    public void testCreerVache_IDsVachesDifferents () {
        Etable etable = new Etable(100, "PACA");
        Vache vache1 = etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Jean-Luc", 245);
        Vache vache2 = etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Robert", 300);

        assert (vache1.getIdVache() != vache2.getIdVache());
    }

    @Test
    public void testCreerVache_inventaireIsNotNull () {
        Etable etable = new Etable(100, "PACA");
        etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Jean-Luc", 245);

        assert (etable.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerVache_tailleInventaireEgal2 () {
        Etable etable = new Etable(100, "PACA");
        etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Jean-Luc", 245);
        etable.creerVache(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Robert", 300);

        assert (etable.getInventaireUniteDeProduction().size() == 2);
    }
}
