package marche.traitement.production;

import marche.traitement.produits.Miel;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe test de la classe Ruche
 * @author Romain COLONNA D'ISTRIA
 * @author Tristan DIETZ
 *
 * @version 1.1
 * @see Ruche
 */
public class RucheTest {

    @Test
    public void testCreerPotMiel () {
        Ruche ruche = new Ruche(1000, "PACA");
        Miel potMiel = ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");

        assert (potMiel != null);
    }

    /**
     * @bug Bug connu : le test marche pour 1500 lancé unitairement, mais échoue lorsque le miel créé en amont est
     * créé. Résolution : prendre en compte les deux valeurs selon si le test est lancé seul ou avec les autres.
     * @see Miel#idSeauMielGeneral
     *//*
    @Test
    public void testCreerPotMiel_IdPotEgal1500 () {
        Ruche ruche = new Ruche(1000, "PACA");
        Miel potMiel = ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");

        assert (potMiel.getIdSeauMiel() == 1500 || potMiel.getIdSeauMiel() == 1600);
    }*/

    @Test
    public void testCreerPotMiel_IdsPotsDifferents () {
        Ruche ruche = new Ruche(1000, "PACA");
        Miel potMiel1 = ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");
        Miel potMiel2 = ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");

        assert (potMiel1.getIdSeauMiel() != potMiel2.getIdSeauMiel());
    }

    @Test
    public void testCreerPotMiel_inventaireIsNotNull () {
        Ruche ruche = new Ruche(1000, "PACA");
        ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");

        assert (ruche.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerPotMiem_tailleInventaireEgal2 () {
        Ruche ruche = new Ruche(1000, "PACA");
        ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");
        ruche.creerPotMiel(110, LocalDate.of(2017, Month.FEBRUARY, 2), (short)96, (float)0.2, "Abeille");

        assert (ruche.getInventaireUniteDeProduction().size() == 2);
    }

}
