package marche.traitement.production;

import marche.traitement.produits.Pomme;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Verger
 * @author Romain COLONNA D'ISTRIA
 */
public class VergerTest {

    @Test
    public void testCreerCagettePomme () {
        Verger verger = new Verger(1000, "PACA");
        Pomme cagettePomme = verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);

        assert (cagettePomme != null);
    }

    @Test
    public void testCreerCagettePomme_IdCagetteEgal1000 () {
        Verger verger = new Verger(1000, "PACA");
        Pomme cagettePomme = verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);

        assert (cagettePomme.getIdCagette() == 1000);
    }

    @Test
    public void testCreerCagettePomme_IdsCagettesDifferents () {
        Verger verger = new Verger(1000, "PACA");
        Pomme cagettePomme1 = verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);
        Pomme cagettePomme2 = verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);

        assert (cagettePomme1.getIdCagette() != cagettePomme2.getIdCagette());
    }

    @Test
    public void testCreerCagettePomme_inventaireIsNotNull () {
        Verger verger = new Verger(1000, "PACA");
        verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);

        assert (verger.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerCagettePomme_tailleInventaireEgal2 () {
        Verger verger = new Verger(1000, "PACA");
        verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);
        verger.creerCagette(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, 3, "Arianne", 20);

        assert (verger.getInventaireUniteDeProduction().size() == 2);
    }

}
