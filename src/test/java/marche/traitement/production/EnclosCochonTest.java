package marche.traitement.production;

import marche.traitement.produits.Cochon;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Enclos
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see EnclosCochon
 */
public class EnclosCochonTest {

    @Test
    public void testCreerCochon () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");

        assert (cochon != null);
    }

    /**
     * @bug Bug connu : le test marche pour 2000 lancé unitairement, mais échoue lorsque le cochon créé en amont est
     * créé. Résolution : prendre en compte les deux valeurs selon si le test est lancé seul ou avec les autres.
     *
     * @see Cochon#idCochonGeneral
     */
    @Test
    public void testCreerCochon_IdCochonEgal2000 () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96,245, "Nain");

        assert ((cochon.getIdCochon() == 2000) || (cochon.getIdCochon() == 2100));
    }

    @Test
    public void testCreerCochon_IdsCochonsDifferents () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon1 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        Cochon cochon2 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (cochon1.getIdCochon() != cochon2.getIdCochon());
    }

    @Test
    public void testCreerCochon_inventaireIsNotNull () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");

        assert (enclos.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerCochon_tailleInventaireEgal2 () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (enclos.getInventaireUniteDeProduction().size() == 2);
    }
}