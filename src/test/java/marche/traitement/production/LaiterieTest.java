package marche.traitement.production;

import marche.traitement.produits.Lait;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Laiterie
 * @author Romain COLONNA D'ISTRIA
 */
public class LaiterieTest {

    @Test
    public void testCreerPackLait () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        assert (packLait != null);
    }

    @Test
    public void testCreerPackLait_IdPackEgal600 () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        System.out.println(packLait.getIdPackLait());

        assert (packLait.getIdPackLait() == 600);
    }

    @Test
    public void testCreerPackLait_IdsPacksDifferents () {
        Laiterie laiterie = new Laiterie(100, "PACA");
        Lait packLait1 = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);
        Lait packLait2 = laiterie.creerPackLait(110, LocalDate.of(2017, Month.JANUARY, 15), (short)96, 3);

        System.out.println(packLait1.getIdPackLait());
        System.out.println(packLait2.getIdPackLait());
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