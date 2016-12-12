package marche.traitement.produits;

import marche.traitement.exceptions.ProduitPerimeException;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class OeufTest {

    @Test
    public void testConstructeurOeufAvecIdPackOeuf() {
        Oeuf oeuf = new Oeuf(3.8f, LocalDate.of(2017, Month.DECEMBER, 31), (short) 50, 34786543);
        assert oeuf.getIdPackOeuf() == 34786543;
    }

    @Test (expected = ProduitPerimeException.class)
    public void testDatePeremptionOeuf() throws ProduitPerimeException {
        Oeuf oeuf = new Oeuf(3.9f, LocalDate.of(2002, Month.AUGUST, 4), (short) 1, 5321);
        assert oeuf.getDatePeremption().isBefore(LocalDate.now());
    }
}
