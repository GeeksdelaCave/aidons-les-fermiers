package marche.traitement.produits;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class OeufTest {

    @Test
    public void testConstructeurOeufAvecIdPackOeuf() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, 34786543);
        assert (oeuf.getIdPackOeuf() == 34786543);
    }

}
