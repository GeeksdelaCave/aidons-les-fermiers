package marche.traitement.produits;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
/**
 * PommeTest désigne le test unitaire effectué sur la classe Pomme sur tous ces getter() crées
 * @version 1.0
 */
public class PommeTest {
    /**
     * Teste l'identifiant de la cagette
     */
    @Test
    public void getIdCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1500,6.0f,"Reinette",15);
        assertTrue(pomme.getIdCagette() == 1500);
    }

    /**
     * Teste le poids de la cagette
     */
    @Test
    public void getPoidsCagette()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1500,6.0f,"Reinette",15);
        assertTrue(pomme.getPoidsCagette() == 6.0f);
    }

    /**
     * Teste le type de pomme
     */
    @Test
    public void getTypePomme()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1500,6.0f,"Reinette",15);
        assertTrue(pomme.getTypePomme().equals("Reinette"));
    }

    /**
     * Teste le nbre de pommes dans la cagette
     */
    @Test
    public void getNbPommes()
    {
        Pomme pomme = new Pomme(20.0f,LocalDate.of(2016, Month.NOVEMBER,28), (short) 55.0,1500,6.0f,"Reinette",15);
        assertTrue(pomme.getNbPommes() == 15);
    }
}
