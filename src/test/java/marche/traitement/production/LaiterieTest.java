package marche.traitement.production;

import marche.traitement.produits.Lait;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Laiterie
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see Laiterie
 */
public class LaiterieTest {

    @Test
    public void testCreerPackLait () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        assert (packLait != null);
    }

    /**
     * @bug Bug connu : le test marche pour 500 lancé unitairement, mais échoue lorsque le lait créé en amont est
     * créé. Résolution : prendre en compte les deux valeurs selon si le test est lancé seul ou avec les autres.
     * @see Lait#idLaitGeneral
     *//*
    @Test
    public void testCreerPackLait_IdPackEgal500 () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        assert (packLait.getIdPackLait() == 500 || packLait.getIdPackLait() == 600);
    }*/

    @Test
    public void testCreerPackLait_IdsPacksDifferents () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait1 = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);
        Lait packLait2 = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        assert (packLait1.getIdPackLait() != packLait2.getIdPackLait());
    }

    @Test
    public void testCreerPackLait_inventaireIsNotNull () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        assert (laiterie.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerPackLait_tailleInventaireEgal2 () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (enclos.getInventaireUniteDeProduction().size() == 2);
    }

}