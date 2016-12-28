package marche.traitement.production;

import marche.traitement.produits.Fromage;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Fromagerie
 * @author Romain COLONNA D'ISTRIA
 */
public class FromagerieTest {

    @Test
    public void testCreerfromage () {
        Fromagerie fromagerie = new Fromagerie(100, "PACA");
        Fromage fromage = fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Camember", 245);

        assert (fromage != null);
    }

    @Test
    public void testCreerfromage_IdFromageEgal250 () {
        Fromagerie fromagerie = new Fromagerie(100, "PACA");
        Fromage fromage = fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Roquefort", 245);

        assert (fromage.getIdFromage() == 250);
    }

    @Test
    public void testCreerfromage_IDsFromagesDifferents () {
        Fromagerie fromagerie = new Fromagerie(100, "PACA");
        Fromage fromage1 = fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Roquefort", 245);
        Fromage fromage2 = fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Emmentale", 300);

        assert (fromage1.getIdFromage() != fromage2.getIdFromage());
    }

    @Test
    public void testCreerfromage_inventaireIsNotNull () {
        Fromagerie fromagerie = new Fromagerie(100, "PACA");
        fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Roquefort", 245);

        assert (fromagerie.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerfromage_tailleInventaireEgal2 () {
        Fromagerie fromagerie = new Fromagerie(100, "PACA");
        fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Jean-Luc", 245);
        fromagerie.creerFromage(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, "Robert", 300);

        assert (fromagerie.getInventaireUniteDeProduction().size() == 2);
    }
}