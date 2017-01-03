package marche.traitement.production;


import marche.traitement.produits.Oeuf;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Laiterie
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see Poulailler
 */
public class PoulaillerTest {

    @Test
    public void testCreerPackOeuf () {
        Poulailler poulailler = new Poulailler(1000, "PACA");
        Oeuf packOeuf = poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);

        assert (packOeuf != null);
    }

    @Test
    public void testCreerPackOeuf_IdsPacksDifferents () {
        Poulailler poulailler = new Poulailler(1000, "PACA");
        Oeuf packOeuf1 = poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);
        Oeuf packOeuf2 = poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);

        assert (packOeuf1.getIdPackOeuf() != packOeuf2.getIdPackOeuf());
    }

    @Test
    public void testCreerPackOeuf_inventaireIsNotNull () {
        Poulailler poulailler = new Poulailler(1000, "PACA");
        poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);

        assert (poulailler.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerPackOeuf_tailleInventaireEgal2 () {
        Poulailler poulailler = new Poulailler(1000, "PACA");
        poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);
        poulailler.creerPackOeuf(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96);

        assert (poulailler.getInventaireUniteDeProduction().size() == 2);
    }

}
